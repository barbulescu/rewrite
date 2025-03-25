import * as rpc from "vscode-jsonrpc/node";
import {Recipe} from "../../recipe";
import {Cursor, SourceFile} from "../../tree";

export class Generate {
    constructor(private readonly id: String, private readonly p: String) {
    }

    static handle(connection: rpc.MessageConnection,
                  localObjects: Map<string, any>,
                  preparedRecipes: Map<String, Recipe>,
                  recipeCursors: WeakMap<Recipe, Cursor>,
                  getObject: (id: string) => any): void {
        connection.onRequest(new rpc.RequestType<Generate, SourceFile[], Error>("Generate"), (request) => {
            const recipe = preparedRecipes.get(request.id);
            // TODO when scanning recipes are supported implement me
            return []
        });
    }
}
