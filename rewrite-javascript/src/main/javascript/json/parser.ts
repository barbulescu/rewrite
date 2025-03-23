import {emptyMarkers, ExecutionContext, Parser, ParserSourceReader, randomId} from "../";
import {
    JsonDocument,
    emptySpace,
    Json,
    JsonArray,
    JsonKind,
    JsonObject,
    JsonRightPadded,
    JsonValue,
    Literal,
    Member,
    space
} from "./tree";
import {relative} from "path";

export class JsonParser extends Parser {

    parse(ctx: ExecutionContext, relativeTo?: string, ...sourcePaths: string[]): JsonDocument[] {
        return sourcePaths.map(sourcePath => {
            return new ParseJsonReader(sourcePath, ctx, relativeTo).parse();
        });
    }
}

class ParseJsonReader extends ParserSourceReader {
    private readonly relativeTo?: string;

    constructor(sourcePath: string, ctx: ExecutionContext, relativeTo?: string) {
        super(sourcePath, ctx);
        this.relativeTo = relativeTo;
    }

    private prefix() {
        return space(this.whitespace());
    }

    parse(): JsonDocument {
        return {
            kind: JsonKind.Document,
            id: randomId(),
            prefix: this.prefix(),
            markers: emptyMarkers,
            sourcePath: relative(this.relativeTo || "", this.sourcePath),
            value: this.json(JSON.parse(this.source)) as JsonValue,
            eof: space(this.source.slice(this.cursor))
        }
    }

    private json(parsed: any): Json {
        const base = {
            id: randomId(),
            prefix: this.prefix(),
            markers: emptyMarkers
        }
        if (Array.isArray(parsed)) {
            this.cursor++; // skip '['
            return {
                kind: JsonKind.Array,
                ...base,
                values: parsed.map(p => {
                    const value = {
                        kind: JsonKind.RightPadded,
                        element: this.json(p),
                        after: space(this.whitespace())
                    };
                    this.cursor++;
                    return value;
                })
            } as JsonArray;
        } else if (parsed !== null && typeof parsed === "object") {
            this.cursor++; // skip '{'
            return {
                kind: JsonKind.Object,
                ...base,
                members: Object.keys(parsed).map(key => {
                    const member = {
                        kind: JsonKind.RightPadded,
                        element: this.member(parsed, key),
                        after: space(this.whitespace())
                    } as JsonRightPadded<Member>;
                    this.cursor++;
                    return member;
                })
            } as JsonObject;
        } else if (typeof parsed === "string") {
            this.cursor += parsed.length + 2;
            return {
                kind: JsonKind.Literal,
                ...base,
                source: `"${parsed}"`,
                value: parsed
            } as Literal;
        } else if (typeof parsed === "number") {
            this.cursor += parsed.toString().length;
            return {
                kind: JsonKind.Literal,
                ...base,
                source: parsed.toString(),
                value: parsed.toString(),
            } as Literal;
        } else {
            throw new Error(`Unsupported JSON type: ${parsed}`);
        }
    }

    private member(parsed: any, key: string) {
        return {
            kind: JsonKind.Member,
            id: randomId(),
            prefix: emptySpace,
            markers: emptyMarkers,
            key: {
                kind: JsonKind.RightPadded,
                markers: emptyMarkers,
                element: this.json(key),
                after: space(this.sourceBefore(":")),
            },
            value: this.json(parsed[key])
        } as Member;
    }
}

