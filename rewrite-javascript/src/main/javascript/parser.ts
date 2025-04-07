import {ExecutionContext} from "./execution";
import {SourceFile} from "./tree";
import {readFileSync} from "node:fs";
import {Volume} from "memfs/lib/volume";
import {relative} from "path";
import {InMemoryDataTableStore} from "./data-table";

export const PARSER_VOLUME = Symbol("PARSER_VOLUME");

export type SourcePath = string
export type ParserInput = SourcePath | { text: string, sourcePath: string }

export abstract class Parser<S extends SourceFile> {
    constructor(protected ctx: ExecutionContext = new ExecutionContext(),
                protected readonly relativeTo?: string) {
    }

    abstract parse(...sourcePaths: ParserInput[]): Promise<S[]>

    protected relativePath(sourcePath: ParserInput): string {
        if (typeof sourcePath === "string") {
            return relative(this.relativeTo || "", sourcePath);
        }
        return sourcePath.sourcePath;
    }
}

/**
 * A source reader that can be used by parsers to incrementally parse a source, keeping
 * track of the position of the parsing.
 */
export class ParserSourceReader {
    readonly source: string
    cursor: number = 0;

    constructor(public readonly sourcePath: ParserInput, ctx: ExecutionContext) {
        this.source = readSourceSync(ctx, sourcePath)
    }

    whitespace(): string {
        function isWhitespace(char: string): boolean {
            const code = char.charCodeAt(0);
            return code === 32 || (code >= 9 && code <= 13);
        }

        const start = this.cursor;
        while (this.cursor < this.source.length && isWhitespace(this.source[this.cursor])) {
            this.cursor++;
        }
        return this.source.slice(start, this.cursor);
    }

    sourceBefore(token: string): string {
        const start = this.cursor;
        // increment cursor until we find the token
        while (this.cursor < this.source.length && !this.source.startsWith(token, this.cursor++)) {
        }
        return this.source.slice(start, this.cursor - token.length)
    }

    /**
     * Used in debugging parsers during development to see where the
     * cursor is in the source.
     */
    // noinspection JSUnusedGlobalSymbols
    get afterCursor(): string {
        return this.source.slice(this.cursor);
    }
}

export function readSourceSync(ctx: ExecutionContext, sourcePath: ParserInput) {
    if (typeof sourcePath === "string") {
        const vol = ctx.messages[PARSER_VOLUME] as Volume | undefined;
        return (vol?.readFileSync(sourcePath) ?? readFileSync(sourcePath)).toString();
    }
    return sourcePath.text;
}
