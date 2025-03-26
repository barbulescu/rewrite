import * as rpc from "vscode-jsonrpc/node";
import {MessageConnection} from "vscode-jsonrpc/node";
import {Cursor, isSourceFile, isTree, rootCursor, SourceFile, Tree} from "../tree";
import {Recipe, RecipeDescriptor} from "../recipe";
import {SnowflakeId} from "@akashrajpurohit/snowflake-id";
import {
    Generate,
    GetObject,
    GetRecipes,
    PrepareRecipe,
    PrepareRecipeResponse,
    Print,
    Visit,
    VisitResponse
} from "./request";
import {RpcObjectData, RpcObjectState, RpcReceiveQueue} from "./queue";
import {RpcCodecs} from "./codec";
import {RpcRecipe} from "./recipe";

export class RewriteRpc {
    private readonly snowflake = SnowflakeId();

    readonly localObjects: Map<string, any> = new Map();
    /* A reverse map of the objects back to their IDs */
    private readonly localObjectIds = new IdentityMap()

    private readonly remoteObjects: Map<string, any> = new Map();
    private readonly remoteRefs: Map<number, any> = new Map();

    constructor(private readonly connection: MessageConnection = rpc.createMessageConnection(
        new rpc.StreamMessageReader(process.stdin),
        new rpc.StreamMessageWriter(process.stdout)
    ), batchSize: number = 10) {
        const preparedRecipes: Map<String, Recipe> = new Map();
        const recipeCursors: WeakMap<Recipe, Cursor> = new WeakMap()

        // Need this indirection, otherwise `this` will be undefined when executed in the handlers.
        const getObject = (id: string) => this.getObject(id);
        const getCursor = (cursorIds: string[] | undefined) => this.getCursor(cursorIds);

        Visit.handle(this.connection, this.localObjects, preparedRecipes, recipeCursors, getObject, getCursor);
        Generate.handle(this.connection, this.localObjects, preparedRecipes, recipeCursors, getObject);
        GetObject.handle(this.connection, this.remoteObjects, this.localObjects, batchSize);
        GetRecipes.handle(this.connection);
        PrepareRecipe.handle(this.connection, preparedRecipes);
        Print.handle(this.connection, getObject, getCursor);

        this.connection.listen();
    }

    end(): RewriteRpc {
        this.connection.end();
        return this;
    }

    async getObject<P>(id: string): Promise<P> {
        const q = new RpcReceiveQueue(this.remoteRefs, () => {
            return this.connection.sendRequest(
                new rpc.RequestType<GetObject, RpcObjectData[], Error>("GetObject"),
                new GetObject(id)
            );
        });

        let remoteObject = await q.receive<P>(this.localObjects.get(id), (before: any) => {
            return RpcCodecs.forInstance(before)?.rpcReceive(before, q) ?? before;
        });

        if ((await q.take()).state !== RpcObjectState.END_OF_OBJECT) {
            throw new Error("Expected END_OF_OBJECT");
        }

        this.remoteObjects.set(id, remoteObject);
        this.localObjects.set(id, remoteObject);

        return remoteObject;
    }

    async getCursor(cursorIds: string[] | undefined): Promise<Cursor> {
        let cursor = rootCursor();
        if (cursorIds) {
            for (let i = cursorIds.length - 1; i >= 0; i--) {
                const cursorObject = await this.getObject(cursorIds[i]);
                this.remoteObjects.set(cursorIds[i], cursorObject);
                cursor = new Cursor(cursorObject, cursor);
            }
        }
        return cursor;
    }

    async print(tree: SourceFile): Promise<string>;
    async print<T extends Tree>(tree: T, cursor?: Cursor): Promise<string> {
        if (!cursor && !isSourceFile(tree)) {
            throw new Error("Cursor is required for non-SourceFile trees");
        }
        this.localObjects.set(tree.id.toString(), tree);
        return await this.connection.sendRequest(
            new rpc.RequestType<Print, string, Error>("Print"),
            new Print(tree.id, this.getCursorIds(cursor))
        );
    }

    async recipes(): Promise<({ name: string } & RecipeDescriptor)[]> {
        return await this.connection.sendRequest(
            new rpc.RequestType<{}, ({ name: string } & RecipeDescriptor)[], Error>("GetRecipes"),
            {}
        );
    }

    async prepareRecipe(id: string, options?: any): Promise<Recipe> {
        const response = await this.connection.sendRequest(
            new rpc.RequestType<PrepareRecipe, PrepareRecipeResponse, Error>("PrepareRecipe"),
            new PrepareRecipe(id, options)
        );
        return new RpcRecipe(this, response.id, response.descriptor, response.editVisitor,
            response.scanVisitor);
    }

    async visit(tree: Tree, visitorName: string, p: any, cursor?: Cursor): Promise<Tree> {
        let response = await this.scan(tree, visitorName, p, cursor);
        if (response.modified) {
            return this.getObject(tree.id.toString());
        }
        return tree;
    }

    scan(tree: Tree, visitorName: string, p: any, cursor: Cursor | undefined): Promise<VisitResponse> {
        this.localObjects.set(tree.id.toString(), tree);
        const pId = this.localObject(p);
        const cursorIds = this.getCursorIds(cursor);
        return this.connection.sendRequest(
            new rpc.RequestType<Visit, VisitResponse, Error>("Visit"),
            new Visit(visitorName, undefined, tree.id.toString(), pId, cursorIds)
        );
    }

    private localObject<P>(obj: P): string {
        let id = this.localObjectIds.get(obj);
        if (!id) {
            id = this.snowflake.generate();
            this.localObjects.set(id, obj);
            this.localObjectIds.set(obj, id);
        }
        return id
    }

    getCursorIds(cursor: Cursor | undefined): string[] | undefined {
        if (cursor) {
            const cursorIds = [];
            for (const c of cursor.asArray()) {
                let id: string;
                if (isTree(c)) {
                    id = (c as Tree).id.toString();
                    this.localObjects.set(id, c);
                } else {
                    id = this.localObject(c);
                }
                cursorIds.push(id);
            }
            return cursorIds
        }
    }
}

class IdentityMap {
    constructor(private readonly objectMap = new WeakMap<any, string>(),
                private readonly primitiveMap = new Map<any, string>()) {
    }

    set(key: any, value: any): void {
        if (typeof key === 'object' && key !== null) {
            this.objectMap.set(key, value);
        } else {
            this.primitiveMap.set(key, value);
        }
    }

    get(key: any): string | undefined {
        if (typeof key === 'object' && key !== null) {
            return this.objectMap.get(key);
        } else {
            return this.primitiveMap.get(key);
        }
    }

    has(key: any): boolean {
        if (typeof key === 'object' && key !== null) {
            return this.objectMap.has(key);
        } else {
            return this.primitiveMap.has(key);
        }
    }
}
