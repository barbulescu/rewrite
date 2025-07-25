/*
 * Copyright 2025 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * https://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated from ~/git/rewrite/rewrite-hcl/src/main/antlr/HCLLexer.g4 by ANTLR 4.13.2
package org.openrewrite.hcl.internal.grammar;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

import java.util.Stack;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class HCLLexer extends Lexer {
    static {
        RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            FOR_BRACE = 1, FOR_BRACK = 2, IF = 3, IN = 4, BooleanLiteral = 5, NULL = 6, LBRACE = 7,
            RBRACE = 8, ASSIGN = 9, Identifier = 10, WS = 11, COMMENT = 12, LINE_COMMENT = 13,
            NEWLINE = 14, NumericLiteral = 15, QUOTE = 16, HEREDOC_START = 17, PLUS = 18, AND = 19,
            EQ = 20, LT = 21, COLON = 22, LBRACK = 23, LPAREN = 24, MINUS = 25, OR = 26, NEQ = 27,
            GT = 28, QUESTION = 29, RBRACK = 30, RPAREN = 31, MUL = 32, NOT = 33, LEQ = 34, DOT = 35,
            DIV = 36, GEQ = 37, ARROW = 38, COMMA = 39, MOD = 40, ELLIPSIS = 41, TILDE = 42, TEMPLATE_INTERPOLATION_START = 43,
            TemplateStringLiteral = 44, TemplateStringLiteralChar = 45, HTemplateLiteral = 46,
            HTemplateLiteralChar = 47;
    public static final int
            TEMPLATE = 1, HEREDOC_PREAMBLE = 2, HEREDOC = 3;
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };

    public static String[] modeNames = {
            "DEFAULT_MODE", "TEMPLATE", "HEREDOC_PREAMBLE", "HEREDOC"
    };

    private static String[] makeRuleNames() {
        return new String[]{
                "FOR_BRACE", "FOR_BRACK", "IF", "IN", "BooleanLiteral", "NULL", "LBRACE",
                "RBRACE", "ASSIGN", "StringLiteralChar", "Identifier", "WS", "COMMENT",
                "LINE_COMMENT", "NEWLINE", "LetterOrDigit", "Letter", "EscapeSequence",
                "HexDigit", "NumericLiteral", "ExponentPart", "QUOTE", "HEREDOC_START",
                "PLUS", "AND", "EQ", "LT", "COLON", "LBRACK", "LPAREN", "MINUS", "OR",
                "NEQ", "GT", "QUESTION", "RBRACK", "RPAREN", "MUL", "NOT", "LEQ", "DOT",
                "DIV", "GEQ", "ARROW", "COMMA", "MOD", "ELLIPSIS", "TILDE", "TEMPLATE_INTERPOLATION_START",
                "TemplateStringLiteral", "TemplateStringLiteralChar", "END_QUOTE", "HP_NEWLINE",
                "HPIdentifier", "H_NEWLINE", "H_TEMPLATE_INTERPOLATION_START", "HTemplateLiteral",
                "HTemplateLiteralChar"
        };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[]{
                null, null, null, "'if'", "'in'", null, "'null'", "'{'", "'}'", "'='",
                null, null, null, null, null, null, null, null, "'+'", "'&&'", "'=='",
                "'<'", "':'", "'['", "'('", "'-'", "'||'", "'!='", "'>'", "'?'", "']'",
                "')'", "'*'", "'!'", "'<='", "'.'", "'/'", "'>='", "'=>'", "','", "'%'",
                "'...'", "'~'"
        };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, "FOR_BRACE", "FOR_BRACK", "IF", "IN", "BooleanLiteral", "NULL",
                "LBRACE", "RBRACE", "ASSIGN", "Identifier", "WS", "COMMENT", "LINE_COMMENT",
                "NEWLINE", "NumericLiteral", "QUOTE", "HEREDOC_START", "PLUS", "AND",
                "EQ", "LT", "COLON", "LBRACK", "LPAREN", "MINUS", "OR", "NEQ", "GT",
                "QUESTION", "RBRACK", "RPAREN", "MUL", "NOT", "LEQ", "DOT", "DIV", "GEQ",
                "ARROW", "COMMA", "MOD", "ELLIPSIS", "TILDE", "TEMPLATE_INTERPOLATION_START",
                "TemplateStringLiteral", "TemplateStringLiteralChar", "HTemplateLiteral",
                "HTemplateLiteralChar"
        };
    }

    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;

    static {
        tokenNames = new String[_SYMBOLIC_NAMES.length];
        for (int i = 0; i < tokenNames.length; i++) {
            tokenNames[i] = VOCABULARY.getLiteralName(i);
            if (tokenNames[i] == null) {
                tokenNames[i] = VOCABULARY.getSymbolicName(i);
            }

            if (tokenNames[i] == null) {
                tokenNames[i] = "<INVALID>";
            }
        }
    }

    @Override
    @Deprecated
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override

    public Vocabulary getVocabulary() {
        return VOCABULARY;
    }


    private enum CurlyType {
        INTERPOLATION,
        OBJECT
    }

    private Stack<CurlyType> leftCurlyStack = new Stack<>();
    private Stack<String> heredocIdentifier = new Stack<>();


    public HCLLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @Override
    public String getGrammarFileName() {
        return "HCLLexer.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public String[] getChannelNames() {
        return channelNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    @Override
    public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
        switch (ruleIndex) {
            case 6:
                LBRACE_action((RuleContext) _localctx, actionIndex);
                break;
            case 7:
                RBRACE_action((RuleContext) _localctx, actionIndex);
                break;
            case 48:
                TEMPLATE_INTERPOLATION_START_action((RuleContext) _localctx, actionIndex);
                break;
            case 53:
                HPIdentifier_action((RuleContext) _localctx, actionIndex);
                break;
            case 55:
                H_TEMPLATE_INTERPOLATION_START_action((RuleContext) _localctx, actionIndex);
                break;
            case 56:
                HTemplateLiteral_action((RuleContext) _localctx, actionIndex);
                break;
        }
    }

    private void LBRACE_action(RuleContext _localctx, int actionIndex) {
        switch (actionIndex) {
            case 0:

                leftCurlyStack.push(CurlyType.OBJECT);

                break;
        }
    }

    private void RBRACE_action(RuleContext _localctx, int actionIndex) {
        switch (actionIndex) {
            case 1:

                if (!leftCurlyStack.isEmpty()) {
                    if (leftCurlyStack.pop() == CurlyType.INTERPOLATION) {
                        popMode();
                    } else {
                        // closing an object, stay in the default mode
                    }
                }

                break;
        }
    }

    private void TEMPLATE_INTERPOLATION_START_action(RuleContext _localctx, int actionIndex) {
        switch (actionIndex) {
            case 2:
                leftCurlyStack.push(CurlyType.INTERPOLATION);
                break;
        }
    }

    private void HPIdentifier_action(RuleContext _localctx, int actionIndex) {
        switch (actionIndex) {
            case 3:

                heredocIdentifier.push(getText());

                break;
        }
    }

    private void H_TEMPLATE_INTERPOLATION_START_action(RuleContext _localctx, int actionIndex) {
        switch (actionIndex) {
            case 4:
                leftCurlyStack.push(CurlyType.INTERPOLATION);
                break;
        }
    }

    private void HTemplateLiteral_action(RuleContext _localctx, int actionIndex) {
        switch (actionIndex) {
            case 5:

                if (!heredocIdentifier.isEmpty() && getText().endsWith(heredocIdentifier.peek())) {
                    setType(Identifier);
                    heredocIdentifier.pop();
                    popMode();
                }

                break;
        }
    }

    @Override
    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 50:
                return TemplateStringLiteralChar_sempred((RuleContext) _localctx, predIndex);
        }
        return true;
    }

    private boolean TemplateStringLiteralChar_sempred(RuleContext _localctx, int predIndex) {
        switch (predIndex) {
            case 0:
                return _input.LA(1) != '{';
            case 1:
                return _input.LA(1) != '{';
        }
        return true;
    }

    public static final String _serializedATN =
            "\u0004\u0000/\u01c2\u0006\uffff\uffff\u0006\uffff\uffff\u0006\uffff\uffff" +
                    "\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002" +
                    "\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002" +
                    "\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002" +
                    "\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002" +
                    "\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f" +
                    "\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012" +
                    "\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015" +
                    "\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018" +
                    "\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b" +
                    "\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e" +
                    "\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002" +
                    "#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002" +
                    "(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002" +
                    "-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002" +
                    "2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002" +
                    "7\u00077\u00028\u00078\u00029\u00079\u0001\u0000\u0001\u0000\u0001\u0000" +
                    "\u0001\u0000\u0001\u0000\u0005\u0000~\b\u0000\n\u0000\f\u0000\u0081\t" +
                    "\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001" +
                    "\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005" +
                    "\u0001\u008e\b\u0001\n\u0001\f\u0001\u0091\t\u0001\u0001\u0001\u0001\u0001" +
                    "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002" +
                    "\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004" +
                    "\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004" +
                    "\u0001\u0004\u0003\u0004\u00a8\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005" +
                    "\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007" +
                    "\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0003\t\u00b9" +
                    "\b\t\u0001\n\u0001\n\u0001\n\u0005\n\u00be\b\n\n\n\f\n\u00c1\t\n\u0001" +
                    "\u000b\u0004\u000b\u00c4\b\u000b\u000b\u000b\f\u000b\u00c5\u0001\u000b" +
                    "\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00ce\b\f\n\f\f\f" +
                    "\u00d1\t\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001" +
                    "\r\u0003\r\u00db\b\r\u0001\r\u0005\r\u00de\b\r\n\r\f\r\u00e1\t\r\u0001" +
                    "\r\u0003\r\u00e4\b\r\u0001\r\u0003\r\u00e7\b\r\u0001\r\u0001\r\u0001\u000e" +
                    "\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0003\u000f" +
                    "\u00f1\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010" +
                    "\u00f7\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011" +
                    "\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011" +
                    "\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011" +
                    "\u0001\u0011\u0003\u0011\u010b\b\u0011\u0001\u0012\u0001\u0012\u0001\u0013" +
                    "\u0004\u0013\u0110\b\u0013\u000b\u0013\f\u0013\u0111\u0001\u0013\u0001" +
                    "\u0013\u0004\u0013\u0116\b\u0013\u000b\u0013\f\u0013\u0117\u0001\u0013" +
                    "\u0003\u0013\u011b\b\u0013\u0001\u0013\u0004\u0013\u011e\b\u0013\u000b" +
                    "\u0013\f\u0013\u011f\u0001\u0013\u0001\u0013\u0004\u0013\u0124\b\u0013" +
                    "\u000b\u0013\f\u0013\u0125\u0003\u0013\u0128\b\u0013\u0001\u0014\u0001" +
                    "\u0014\u0003\u0014\u012c\b\u0014\u0001\u0014\u0004\u0014\u012f\b\u0014" +
                    "\u000b\u0014\f\u0014\u0130\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015" +
                    "\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u013b\b\u0016" +
                    "\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018" +
                    "\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a" +
                    "\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d" +
                    "\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001" +
                    " \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001" +
                    "%\u0001%\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001" +
                    ")\u0001*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001,\u0001,\u0001-\u0001" +
                    "-\u0001.\u0001.\u0001.\u0001.\u0001/\u0001/\u00010\u00010\u00010\u0001" +
                    "0\u00010\u00010\u00010\u00011\u00041\u0182\b1\u000b1\f1\u0183\u00012\u0001" +
                    "2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00032\u0190" +
                    "\b2\u00013\u00013\u00013\u00013\u00013\u00014\u00014\u00014\u00014\u0001" +
                    "4\u00015\u00015\u00015\u00055\u019f\b5\n5\f5\u01a2\t5\u00015\u00015\u0001" +
                    "5\u00015\u00016\u00016\u00016\u00016\u00017\u00017\u00017\u00017\u0001" +
                    "7\u00017\u00017\u00017\u00018\u00048\u01b5\b8\u000b8\f8\u01b6\u00018\u0001" +
                    "8\u00019\u00019\u00019\u00019\u00019\u00019\u00039\u01c1\b9\u0001\u00cf" +
                    "\u0000:\u0004\u0001\u0006\u0002\b\u0003\n\u0004\f\u0005\u000e\u0006\u0010" +
                    "\u0007\u0012\b\u0014\t\u0016\u0000\u0018\n\u001a\u000b\u001c\f\u001e\r" +
                    " \u000e\"\u0000$\u0000&\u0000(\u0000*\u000f,\u0000.\u00100\u00112\u0012" +
                    "4\u00136\u00148\u0015:\u0016<\u0017>\u0018@\u0019B\u001aD\u001bF\u001c" +
                    "H\u001dJ\u001eL\u001fN P!R\"T#V$X%Z&\\\'^(`)b*d+f,h-j\u0000l\u0000n\u0000" +
                    "p\u0000r\u0000t.v/\u0004\u0000\u0001\u0002\u0003\u000f\u0004\u0000\n\n" +
                    "\r\r\"\"$%\u0003\u0000\t\t\f\r  \u0002\u0000\n\n\r\r\u0001\u0001\n\n\u0001" +
                    "\u000009\u0004\u0000$$AZ__az\u0002\u0000\u0000\u007f\u8000\ud800\u8000" +
                    "\udbff\u0001\u0000\u8000\ud800\u8000\udbff\u0001\u0000\u8000\udc00\u8000" +
                    "\udfff\u0005\u0000\"\"\\\\nnrrtt\u0003\u000009AFaf\u0002\u0000EEee\u0002" +
                    "\u0000++--\u0003\u0000\n\n\r\r$%\u0001\u0000{{\u01e4\u0000\u0004\u0001" +
                    "\u0000\u0000\u0000\u0000\u0006\u0001\u0000\u0000\u0000\u0000\b\u0001\u0000" +
                    "\u0000\u0000\u0000\n\u0001\u0000\u0000\u0000\u0000\f\u0001\u0000\u0000" +
                    "\u0000\u0000\u000e\u0001\u0000\u0000\u0000\u0000\u0010\u0001\u0000\u0000" +
                    "\u0000\u0000\u0012\u0001\u0000\u0000\u0000\u0000\u0014\u0001\u0000\u0000" +
                    "\u0000\u0000\u0018\u0001\u0000\u0000\u0000\u0000\u001a\u0001\u0000\u0000" +
                    "\u0000\u0000\u001c\u0001\u0000\u0000\u0000\u0000\u001e\u0001\u0000\u0000" +
                    "\u0000\u0000 \u0001\u0000\u0000\u0000\u0000*\u0001\u0000\u0000\u0000\u0000" +
                    ".\u0001\u0000\u0000\u0000\u00000\u0001\u0000\u0000\u0000\u00002\u0001" +
                    "\u0000\u0000\u0000\u00004\u0001\u0000\u0000\u0000\u00006\u0001\u0000\u0000" +
                    "\u0000\u00008\u0001\u0000\u0000\u0000\u0000:\u0001\u0000\u0000\u0000\u0000" +
                    "<\u0001\u0000\u0000\u0000\u0000>\u0001\u0000\u0000\u0000\u0000@\u0001" +
                    "\u0000\u0000\u0000\u0000B\u0001\u0000\u0000\u0000\u0000D\u0001\u0000\u0000" +
                    "\u0000\u0000F\u0001\u0000\u0000\u0000\u0000H\u0001\u0000\u0000\u0000\u0000" +
                    "J\u0001\u0000\u0000\u0000\u0000L\u0001\u0000\u0000\u0000\u0000N\u0001" +
                    "\u0000\u0000\u0000\u0000P\u0001\u0000\u0000\u0000\u0000R\u0001\u0000\u0000" +
                    "\u0000\u0000T\u0001\u0000\u0000\u0000\u0000V\u0001\u0000\u0000\u0000\u0000" +
                    "X\u0001\u0000\u0000\u0000\u0000Z\u0001\u0000\u0000\u0000\u0000\\\u0001" +
                    "\u0000\u0000\u0000\u0000^\u0001\u0000\u0000\u0000\u0000`\u0001\u0000\u0000" +
                    "\u0000\u0000b\u0001\u0000\u0000\u0000\u0001d\u0001\u0000\u0000\u0000\u0001" +
                    "f\u0001\u0000\u0000\u0000\u0001h\u0001\u0000\u0000\u0000\u0001j\u0001" +
                    "\u0000\u0000\u0000\u0002l\u0001\u0000\u0000\u0000\u0002n\u0001\u0000\u0000" +
                    "\u0000\u0003p\u0001\u0000\u0000\u0000\u0003r\u0001\u0000\u0000\u0000\u0003" +
                    "t\u0001\u0000\u0000\u0000\u0003v\u0001\u0000\u0000\u0000\u0004x\u0001" +
                    "\u0000\u0000\u0000\u0006\u0088\u0001\u0000\u0000\u0000\b\u0098\u0001\u0000" +
                    "\u0000\u0000\n\u009b\u0001\u0000\u0000\u0000\f\u00a7\u0001\u0000\u0000" +
                    "\u0000\u000e\u00a9\u0001\u0000\u0000\u0000\u0010\u00ae\u0001\u0000\u0000" +
                    "\u0000\u0012\u00b1\u0001\u0000\u0000\u0000\u0014\u00b4\u0001\u0000\u0000" +
                    "\u0000\u0016\u00b8\u0001\u0000\u0000\u0000\u0018\u00ba\u0001\u0000\u0000" +
                    "\u0000\u001a\u00c3\u0001\u0000\u0000\u0000\u001c\u00c9\u0001\u0000\u0000" +
                    "\u0000\u001e\u00da\u0001\u0000\u0000\u0000 \u00ea\u0001\u0000\u0000\u0000" +
                    "\"\u00f0\u0001\u0000\u0000\u0000$\u00f6\u0001\u0000\u0000\u0000&\u010a" +
                    "\u0001\u0000\u0000\u0000(\u010c\u0001\u0000\u0000\u0000*\u0127\u0001\u0000" +
                    "\u0000\u0000,\u0129\u0001\u0000\u0000\u0000.\u0132\u0001\u0000\u0000\u0000" +
                    "0\u0136\u0001\u0000\u0000\u00002\u013e\u0001\u0000\u0000\u00004\u0140" +
                    "\u0001\u0000\u0000\u00006\u0143\u0001\u0000\u0000\u00008\u0146\u0001\u0000" +
                    "\u0000\u0000:\u0148\u0001\u0000\u0000\u0000<\u014a\u0001\u0000\u0000\u0000" +
                    ">\u014c\u0001\u0000\u0000\u0000@\u014e\u0001\u0000\u0000\u0000B\u0150" +
                    "\u0001\u0000\u0000\u0000D\u0153\u0001\u0000\u0000\u0000F\u0156\u0001\u0000" +
                    "\u0000\u0000H\u0158\u0001\u0000\u0000\u0000J\u015a\u0001\u0000\u0000\u0000" +
                    "L\u015c\u0001\u0000\u0000\u0000N\u015e\u0001\u0000\u0000\u0000P\u0160" +
                    "\u0001\u0000\u0000\u0000R\u0162\u0001\u0000\u0000\u0000T\u0165\u0001\u0000" +
                    "\u0000\u0000V\u0167\u0001\u0000\u0000\u0000X\u0169\u0001\u0000\u0000\u0000" +
                    "Z\u016c\u0001\u0000\u0000\u0000\\\u016f\u0001\u0000\u0000\u0000^\u0171" +
                    "\u0001\u0000\u0000\u0000`\u0173\u0001\u0000\u0000\u0000b\u0177\u0001\u0000" +
                    "\u0000\u0000d\u0179\u0001\u0000\u0000\u0000f\u0181\u0001\u0000\u0000\u0000" +
                    "h\u018f\u0001\u0000\u0000\u0000j\u0191\u0001\u0000\u0000\u0000l\u0196" +
                    "\u0001\u0000\u0000\u0000n\u019b\u0001\u0000\u0000\u0000p\u01a7\u0001\u0000" +
                    "\u0000\u0000r\u01ab\u0001\u0000\u0000\u0000t\u01b4\u0001\u0000\u0000\u0000" +
                    "v\u01c0\u0001\u0000\u0000\u0000x\u007f\u0005{\u0000\u0000y~\u0003\u001a" +
                    "\u000b\u0000z~\u0003 \u000e\u0000{~\u0003\u001c\f\u0000|~\u0003\u001e" +
                    "\r\u0000}y\u0001\u0000\u0000\u0000}z\u0001\u0000\u0000\u0000}{\u0001\u0000" +
                    "\u0000\u0000}|\u0001\u0000\u0000\u0000~\u0081\u0001\u0000\u0000\u0000" +
                    "\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080" +
                    "\u0082\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082" +
                    "\u0083\u0005f\u0000\u0000\u0083\u0084\u0005o\u0000\u0000\u0084\u0085\u0005" +
                    "r\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0087\u0003\u001a" +
                    "\u000b\u0000\u0087\u0005\u0001\u0000\u0000\u0000\u0088\u008f\u0005[\u0000" +
                    "\u0000\u0089\u008e\u0003\u001a\u000b\u0000\u008a\u008e\u0003 \u000e\u0000" +
                    "\u008b\u008e\u0003\u001c\f\u0000\u008c\u008e\u0003\u001e\r\u0000\u008d" +
                    "\u0089\u0001\u0000\u0000\u0000\u008d\u008a\u0001\u0000\u0000\u0000\u008d" +
                    "\u008b\u0001\u0000\u0000\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e" +
                    "\u0091\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f" +
                    "\u0090\u0001\u0000\u0000\u0000\u0090\u0092\u0001\u0000\u0000\u0000\u0091" +
                    "\u008f\u0001\u0000\u0000\u0000\u0092\u0093\u0005f\u0000\u0000\u0093\u0094" +
                    "\u0005o\u0000\u0000\u0094\u0095\u0005r\u0000\u0000\u0095\u0096\u0001\u0000" +
                    "\u0000\u0000\u0096\u0097\u0003\u001a\u000b\u0000\u0097\u0007\u0001\u0000" +
                    "\u0000\u0000\u0098\u0099\u0005i\u0000\u0000\u0099\u009a\u0005f\u0000\u0000" +
                    "\u009a\t\u0001\u0000\u0000\u0000\u009b\u009c\u0005i\u0000\u0000\u009c" +
                    "\u009d\u0005n\u0000\u0000\u009d\u000b\u0001\u0000\u0000\u0000\u009e\u009f" +
                    "\u0005t\u0000\u0000\u009f\u00a0\u0005r\u0000\u0000\u00a0\u00a1\u0005u" +
                    "\u0000\u0000\u00a1\u00a8\u0005e\u0000\u0000\u00a2\u00a3\u0005f\u0000\u0000" +
                    "\u00a3\u00a4\u0005a\u0000\u0000\u00a4\u00a5\u0005l\u0000\u0000\u00a5\u00a6" +
                    "\u0005s\u0000\u0000\u00a6\u00a8\u0005e\u0000\u0000\u00a7\u009e\u0001\u0000" +
                    "\u0000\u0000\u00a7\u00a2\u0001\u0000\u0000\u0000\u00a8\r\u0001\u0000\u0000" +
                    "\u0000\u00a9\u00aa\u0005n\u0000\u0000\u00aa\u00ab\u0005u\u0000\u0000\u00ab" +
                    "\u00ac\u0005l\u0000\u0000\u00ac\u00ad\u0005l\u0000\u0000\u00ad\u000f\u0001" +
                    "\u0000\u0000\u0000\u00ae\u00af\u0005{\u0000\u0000\u00af\u00b0\u0006\u0006" +
                    "\u0000\u0000\u00b0\u0011\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005}\u0000" +
                    "\u0000\u00b2\u00b3\u0006\u0007\u0001\u0000\u00b3\u0013\u0001\u0000\u0000" +
                    "\u0000\u00b4\u00b5\u0005=\u0000\u0000\u00b5\u0015\u0001\u0000\u0000\u0000" +
                    "\u00b6\u00b9\b\u0000\u0000\u0000\u00b7\u00b9\u0003&\u0011\u0000\u00b8" +
                    "\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9" +
                    "\u0017\u0001\u0000\u0000\u0000\u00ba\u00bf\u0003$\u0010\u0000\u00bb\u00be" +
                    "\u0003\"\u000f\u0000\u00bc\u00be\u0005-\u0000\u0000\u00bd\u00bb\u0001" +
                    "\u0000\u0000\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00be\u00c1\u0001" +
                    "\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001" +
                    "\u0000\u0000\u0000\u00c0\u0019\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001" +
                    "\u0000\u0000\u0000\u00c2\u00c4\u0007\u0001\u0000\u0000\u00c3\u00c2\u0001" +
                    "\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001" +
                    "\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001" +
                    "\u0000\u0000\u0000\u00c7\u00c8\u0006\u000b\u0002\u0000\u00c8\u001b\u0001" +
                    "\u0000\u0000\u0000\u00c9\u00ca\u0005/\u0000\u0000\u00ca\u00cb\u0005*\u0000" +
                    "\u0000\u00cb\u00cf\u0001\u0000\u0000\u0000\u00cc\u00ce\t\u0000\u0000\u0000" +
                    "\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce\u00d1\u0001\u0000\u0000\u0000" +
                    "\u00cf\u00d0\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000" +
                    "\u00d0\u00d2\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000" +
                    "\u00d2\u00d3\u0005*\u0000\u0000\u00d3\u00d4\u0005/\u0000\u0000\u00d4\u00d5" +
                    "\u0001\u0000\u0000\u0000\u00d5\u00d6\u0006\f\u0002\u0000\u00d6\u001d\u0001" +
                    "\u0000\u0000\u0000\u00d7\u00d8\u0005/\u0000\u0000\u00d8\u00db\u0005/\u0000" +
                    "\u0000\u00d9\u00db\u0005#\u0000\u0000\u00da\u00d7\u0001\u0000\u0000\u0000" +
                    "\u00da\u00d9\u0001\u0000\u0000\u0000\u00db\u00df\u0001\u0000\u0000\u0000" +
                    "\u00dc\u00de\b\u0002\u0000\u0000\u00dd\u00dc\u0001\u0000\u0000\u0000\u00de" +
                    "\u00e1\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df" +
                    "\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e3\u0001\u0000\u0000\u0000\u00e1" +
                    "\u00df\u0001\u0000\u0000\u0000\u00e2\u00e4\u0005\r\u0000\u0000\u00e3\u00e2" +
                    "\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e6" +
                    "\u0001\u0000\u0000\u0000\u00e5\u00e7\u0007\u0003\u0000\u0000\u00e6\u00e5" +
                    "\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00e9" +
                    "\u0006\r\u0002\u0000\u00e9\u001f\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005" +
                    "\n\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ed\u0006\u000e" +
                    "\u0002\u0000\u00ed!\u0001\u0000\u0000\u0000\u00ee\u00f1\u0003$\u0010\u0000" +
                    "\u00ef\u00f1\u0007\u0004\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000" +
                    "\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f1#\u0001\u0000\u0000\u0000\u00f2" +
                    "\u00f7\u0007\u0005\u0000\u0000\u00f3\u00f7\b\u0006\u0000\u0000\u00f4\u00f5" +
                    "\u0007\u0007\u0000\u0000\u00f5\u00f7\u0007\b\u0000\u0000\u00f6\u00f2\u0001" +
                    "\u0000\u0000\u0000\u00f6\u00f3\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001" +
                    "\u0000\u0000\u0000\u00f7%\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005\\" +
                    "\u0000\u0000\u00f9\u010b\u0007\t\u0000\u0000\u00fa\u00fb\u0005\\\u0000" +
                    "\u0000\u00fb\u00fc\u0003(\u0012\u0000\u00fc\u00fd\u0003(\u0012\u0000\u00fd" +
                    "\u00fe\u0003(\u0012\u0000\u00fe\u00ff\u0003(\u0012\u0000\u00ff\u010b\u0001" +
                    "\u0000\u0000\u0000\u0100\u0101\u0005\\\u0000\u0000\u0101\u0102\u0003(" +
                    "\u0012\u0000\u0102\u0103\u0003(\u0012\u0000\u0103\u0104\u0003(\u0012\u0000" +
                    "\u0104\u0105\u0003(\u0012\u0000\u0105\u0106\u0003(\u0012\u0000\u0106\u0107" +
                    "\u0003(\u0012\u0000\u0107\u0108\u0003(\u0012\u0000\u0108\u0109\u0003(" +
                    "\u0012\u0000\u0109\u010b\u0001\u0000\u0000\u0000\u010a\u00f8\u0001\u0000" +
                    "\u0000\u0000\u010a\u00fa\u0001\u0000\u0000\u0000\u010a\u0100\u0001\u0000" +
                    "\u0000\u0000\u010b\'\u0001\u0000\u0000\u0000\u010c\u010d\u0007\n\u0000" +
                    "\u0000\u010d)\u0001\u0000\u0000\u0000\u010e\u0110\u0007\u0004\u0000\u0000" +
                    "\u010f\u010e\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000" +
                    "\u0111\u010f\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000" +
                    "\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0115\u0005.\u0000\u0000\u0114" +
                    "\u0116\u0007\u0004\u0000\u0000\u0115\u0114\u0001\u0000\u0000\u0000\u0116" +
                    "\u0117\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0117" +
                    "\u0118\u0001\u0000\u0000\u0000\u0118\u011a\u0001\u0000\u0000\u0000\u0119" +
                    "\u011b\u0003,\u0014\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011a\u011b" +
                    "\u0001\u0000\u0000\u0000\u011b\u0128\u0001\u0000\u0000\u0000\u011c\u011e" +
                    "\u0007\u0004\u0000\u0000\u011d\u011c\u0001\u0000\u0000\u0000\u011e\u011f" +
                    "\u0001\u0000\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u011f\u0120" +
                    "\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0128" +
                    "\u0003,\u0014\u0000\u0122\u0124\u0007\u0004\u0000\u0000\u0123\u0122\u0001" +
                    "\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0123\u0001" +
                    "\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u0128\u0001" +
                    "\u0000\u0000\u0000\u0127\u010f\u0001\u0000\u0000\u0000\u0127\u011d\u0001" +
                    "\u0000\u0000\u0000\u0127\u0123\u0001\u0000\u0000\u0000\u0128+\u0001\u0000" +
                    "\u0000\u0000\u0129\u012b\u0007\u000b\u0000\u0000\u012a\u012c\u0007\f\u0000" +
                    "\u0000\u012b\u012a\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000" +
                    "\u0000\u012c\u012e\u0001\u0000\u0000\u0000\u012d\u012f\u0007\u0004\u0000" +
                    "\u0000\u012e\u012d\u0001\u0000\u0000\u0000\u012f\u0130\u0001\u0000\u0000" +
                    "\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000" +
                    "\u0000\u0131-\u0001\u0000\u0000\u0000\u0132\u0133\u0005\"\u0000\u0000" +
                    "\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0135\u0006\u0015\u0003\u0000" +
                    "\u0135/\u0001\u0000\u0000\u0000\u0136\u0137\u0005<\u0000\u0000\u0137\u0138" +
                    "\u0005<\u0000\u0000\u0138\u013a\u0001\u0000\u0000\u0000\u0139\u013b\u0005" +
                    "-\u0000\u0000\u013a\u0139\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000" +
                    "\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u013d\u0006\u0016" +
                    "\u0004\u0000\u013d1\u0001\u0000\u0000\u0000\u013e\u013f\u0005+\u0000\u0000" +
                    "\u013f3\u0001\u0000\u0000\u0000\u0140\u0141\u0005&\u0000\u0000\u0141\u0142" +
                    "\u0005&\u0000\u0000\u01425\u0001\u0000\u0000\u0000\u0143\u0144\u0005=" +
                    "\u0000\u0000\u0144\u0145\u0005=\u0000\u0000\u01457\u0001\u0000\u0000\u0000" +
                    "\u0146\u0147\u0005<\u0000\u0000\u01479\u0001\u0000\u0000\u0000\u0148\u0149" +
                    "\u0005:\u0000\u0000\u0149;\u0001\u0000\u0000\u0000\u014a\u014b\u0005[" +
                    "\u0000\u0000\u014b=\u0001\u0000\u0000\u0000\u014c\u014d\u0005(\u0000\u0000" +
                    "\u014d?\u0001\u0000\u0000\u0000\u014e\u014f\u0005-\u0000\u0000\u014fA" +
                    "\u0001\u0000\u0000\u0000\u0150\u0151\u0005|\u0000\u0000\u0151\u0152\u0005" +
                    "|\u0000\u0000\u0152C\u0001\u0000\u0000\u0000\u0153\u0154\u0005!\u0000" +
                    "\u0000\u0154\u0155\u0005=\u0000\u0000\u0155E\u0001\u0000\u0000\u0000\u0156" +
                    "\u0157\u0005>\u0000\u0000\u0157G\u0001\u0000\u0000\u0000\u0158\u0159\u0005" +
                    "?\u0000\u0000\u0159I\u0001\u0000\u0000\u0000\u015a\u015b\u0005]\u0000" +
                    "\u0000\u015bK\u0001\u0000\u0000\u0000\u015c\u015d\u0005)\u0000\u0000\u015d" +
                    "M\u0001\u0000\u0000\u0000\u015e\u015f\u0005*\u0000\u0000\u015fO\u0001" +
                    "\u0000\u0000\u0000\u0160\u0161\u0005!\u0000\u0000\u0161Q\u0001\u0000\u0000" +
                    "\u0000\u0162\u0163\u0005<\u0000\u0000\u0163\u0164\u0005=\u0000\u0000\u0164" +
                    "S\u0001\u0000\u0000\u0000\u0165\u0166\u0005.\u0000\u0000\u0166U\u0001" +
                    "\u0000\u0000\u0000\u0167\u0168\u0005/\u0000\u0000\u0168W\u0001\u0000\u0000" +
                    "\u0000\u0169\u016a\u0005>\u0000\u0000\u016a\u016b\u0005=\u0000\u0000\u016b" +
                    "Y\u0001\u0000\u0000\u0000\u016c\u016d\u0005=\u0000\u0000\u016d\u016e\u0005" +
                    ">\u0000\u0000\u016e[\u0001\u0000\u0000\u0000\u016f\u0170\u0005,\u0000" +
                    "\u0000\u0170]\u0001\u0000\u0000\u0000\u0171\u0172\u0005%\u0000\u0000\u0172" +
                    "_\u0001\u0000\u0000\u0000\u0173\u0174\u0005.\u0000\u0000\u0174\u0175\u0005" +
                    ".\u0000\u0000\u0175\u0176\u0005.\u0000\u0000\u0176a\u0001\u0000\u0000" +
                    "\u0000\u0177\u0178\u0005~\u0000\u0000\u0178c\u0001\u0000\u0000\u0000\u0179" +
                    "\u017a\u0005$\u0000\u0000\u017a\u017b\u0005{\u0000\u0000\u017b\u017c\u0001" +
                    "\u0000\u0000\u0000\u017c\u017d\u00060\u0005\u0000\u017d\u017e\u0001\u0000" +
                    "\u0000\u0000\u017e\u017f\u00060\u0006\u0000\u017fe\u0001\u0000\u0000\u0000" +
                    "\u0180\u0182\u0003h2\u0000\u0181\u0180\u0001\u0000\u0000\u0000\u0182\u0183" +
                    "\u0001\u0000\u0000\u0000\u0183\u0181\u0001\u0000\u0000\u0000\u0183\u0184" +
                    "\u0001\u0000\u0000\u0000\u0184g\u0001\u0000\u0000\u0000\u0185\u0190\b" +
                    "\u0000\u0000\u0000\u0186\u0187\u0005$\u0000\u0000\u0187\u0190\u0005$\u0000" +
                    "\u0000\u0188\u0189\u0005$\u0000\u0000\u0189\u0190\u00042\u0000\u0000\u018a" +
                    "\u018b\u0005%\u0000\u0000\u018b\u0190\u0005%\u0000\u0000\u018c\u018d\u0005" +
                    "%\u0000\u0000\u018d\u0190\u00042\u0001\u0000\u018e\u0190\u0003&\u0011" +
                    "\u0000\u018f\u0185\u0001\u0000\u0000\u0000\u018f\u0186\u0001\u0000\u0000" +
                    "\u0000\u018f\u0188\u0001\u0000\u0000\u0000\u018f\u018a\u0001\u0000\u0000" +
                    "\u0000\u018f\u018c\u0001\u0000\u0000\u0000\u018f\u018e\u0001\u0000\u0000" +
                    "\u0000\u0190i\u0001\u0000\u0000\u0000\u0191\u0192\u0005\"\u0000\u0000" +
                    "\u0192\u0193\u0001\u0000\u0000\u0000\u0193\u0194\u00063\u0007\u0000\u0194" +
                    "\u0195\u00063\b\u0000\u0195k\u0001\u0000\u0000\u0000\u0196\u0197\u0005" +
                    "\n\u0000\u0000\u0197\u0198\u0001\u0000\u0000\u0000\u0198\u0199\u00064" +
                    "\t\u0000\u0199\u019a\u00064\n\u0000\u019am\u0001\u0000\u0000\u0000\u019b" +
                    "\u01a0\u0003$\u0010\u0000\u019c\u019f\u0003\"\u000f\u0000\u019d\u019f" +
                    "\u0005-\u0000\u0000\u019e\u019c\u0001\u0000\u0000\u0000\u019e\u019d\u0001" +
                    "\u0000\u0000\u0000\u019f\u01a2\u0001\u0000\u0000\u0000\u01a0\u019e\u0001" +
                    "\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1\u01a3\u0001" +
                    "\u0000\u0000\u0000\u01a2\u01a0\u0001\u0000\u0000\u0000\u01a3\u01a4\u0006" +
                    "5\u000b\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5\u01a6\u00065\f" +
                    "\u0000\u01a6o\u0001\u0000\u0000\u0000\u01a7\u01a8\u0005\n\u0000\u0000" +
                    "\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9\u01aa\u00066\t\u0000\u01aa" +
                    "q\u0001\u0000\u0000\u0000\u01ab\u01ac\u0005$\u0000\u0000\u01ac\u01ad\u0005" +
                    "{\u0000\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000\u01ae\u01af\u00067\r" +
                    "\u0000\u01af\u01b0\u0001\u0000\u0000\u0000\u01b0\u01b1\u00067\u000e\u0000" +
                    "\u01b1\u01b2\u00067\u0006\u0000\u01b2s\u0001\u0000\u0000\u0000\u01b3\u01b5" +
                    "\u0003v9\u0000\u01b4\u01b3\u0001\u0000\u0000\u0000\u01b5\u01b6\u0001\u0000" +
                    "\u0000\u0000\u01b6\u01b4\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000" +
                    "\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8\u01b9\u00068\u000f" +
                    "\u0000\u01b9u\u0001\u0000\u0000\u0000\u01ba\u01c1\b\r\u0000\u0000\u01bb" +
                    "\u01bc\u0005$\u0000\u0000\u01bc\u01c1\b\u000e\u0000\u0000\u01bd\u01be" +
                    "\u0005%\u0000\u0000\u01be\u01c1\b\u000e\u0000\u0000\u01bf\u01c1\u0003" +
                    "&\u0011\u0000\u01c0\u01ba\u0001\u0000\u0000\u0000\u01c0\u01bb\u0001\u0000" +
                    "\u0000\u0000\u01c0\u01bd\u0001\u0000\u0000\u0000\u01c0\u01bf\u0001\u0000" +
                    "\u0000\u0000\u01c1w\u0001\u0000\u0000\u0000$\u0000\u0001\u0002\u0003}" +
                    "\u007f\u008d\u008f\u00a7\u00b8\u00bd\u00bf\u00c5\u00cf\u00da\u00df\u00e3" +
                    "\u00e6\u00f0\u00f6\u010a\u0111\u0117\u011a\u011f\u0125\u0127\u012b\u0130" +
                    "\u013a\u0183\u018f\u019e\u01a0\u01b6\u01c0\u0010\u0001\u0006\u0000\u0001" +
                    "\u0007\u0001\u0000\u0001\u0000\u0005\u0001\u0000\u0005\u0002\u0000\u0001" +
                    "0\u0002\u0005\u0000\u0000\u0007\u0010\u0000\u0004\u0000\u0000\u0007\u000e" +
                    "\u0000\u0002\u0003\u0000\u00015\u0003\u0007\n\u0000\u00017\u0004\u0007" +
                    "+\u0000\u00018\u0005";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}
