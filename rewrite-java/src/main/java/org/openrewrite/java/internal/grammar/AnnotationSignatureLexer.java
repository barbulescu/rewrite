/*
 * Copyright 2024 the original author or authors.
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
// Generated from java-escape by ANTLR 4.11.1
package org.openrewrite.java.internal.grammar;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AnnotationSignatureLexer extends Lexer {
    static {
        RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            IntegerLiteral = 1, FloatingPointLiteral = 2, BooleanLiteral = 3, CharacterLiteral = 4,
            StringLiteral = 5, LPAREN = 6, RPAREN = 7, LBRACK = 8, RBRACK = 9, COMMA = 10, DOT = 11,
            ASSIGN = 12, COLON = 13, ADD = 14, SUB = 15, AND = 16, OR = 17, AT = 18, ELLIPSIS = 19,
            DOTDOT = 20, SPACE = 21, Identifier = 22;
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };

    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    private static String[] makeRuleNames() {
        return new String[]{
                "IntegerLiteral", "DecimalIntegerLiteral", "HexIntegerLiteral", "OctalIntegerLiteral",
                "BinaryIntegerLiteral", "IntegerTypeSuffix", "DecimalNumeral", "Digits",
                "Digit", "NonZeroDigit", "DigitOrUnderscore", "Underscores", "HexNumeral",
                "HexDigits", "HexDigit", "HexDigitOrUnderscore", "OctalNumeral", "OctalDigits",
                "OctalDigit", "OctalDigitOrUnderscore", "BinaryNumeral", "BinaryDigits",
                "BinaryDigit", "BinaryDigitOrUnderscore", "FloatingPointLiteral", "DecimalFloatingPointLiteral",
                "ExponentPart", "ExponentIndicator", "SignedInteger", "Sign", "FloatTypeSuffix",
                "HexadecimalFloatingPointLiteral", "HexSignificand", "BinaryExponent",
                "BinaryExponentIndicator", "BooleanLiteral", "CharacterLiteral", "SingleCharacter",
                "StringLiteral", "StringCharacters", "StringCharacter", "EscapeSequence",
                "OctalEscape", "UnicodeEscape", "ZeroToThree", "LPAREN", "RPAREN", "LBRACK",
                "RBRACK", "COMMA", "DOT", "ASSIGN", "COLON", "ADD", "SUB", "AND", "OR",
                "AT", "ELLIPSIS", "DOTDOT", "SPACE", "Identifier", "JavaLetter", "JavaLetterOrDigit"
        };
    }
    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[]{
                null, null, null, null, null, null, "'('", "')'", "'['", "']'", "','",
                "'.'", "'='", "':'", "'+'", "'-'", "'&&'", "'||'", "'@'", "'...'", "'..'",
                "' '"
        };
    }
    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, "IntegerLiteral", "FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral",
                "StringLiteral", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "COMMA", "DOT",
                "ASSIGN", "COLON", "ADD", "SUB", "AND", "OR", "AT", "ELLIPSIS", "DOTDOT",
                "SPACE", "Identifier"
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


    public AnnotationSignatureLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @Override
    public String getGrammarFileName() {
        return "AnnotationSignatureLexer.g4";
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
    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 62:
                return JavaLetter_sempred((RuleContext) _localctx, predIndex);
            case 63:
                return JavaLetterOrDigit_sempred((RuleContext) _localctx, predIndex);
        }
        return true;
    }

    private boolean JavaLetter_sempred(RuleContext _localctx, int predIndex) {
        switch (predIndex) {
            case 0:
                return Character.isJavaIdentifierStart(_input.LA(-1));
            case 1:
                return Character.isJavaIdentifierStart(Character.toCodePoint((char) _input.LA(-2), (char) _input.LA(-1)));
        }
        return true;
    }

    private boolean JavaLetterOrDigit_sempred(RuleContext _localctx, int predIndex) {
        switch (predIndex) {
            case 2:
                return Character.isJavaIdentifierPart(_input.LA(-1));
            case 3:
                return Character.isJavaIdentifierPart(Character.toCodePoint((char) _input.LA(-2), (char) _input.LA(-1)));
        }
        return true;
    }

    public static final String _serializedATN =
            "\u0004\u0000\u0016\u01c3\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002" +
                    "\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002" +
                    "\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002" +
                    "\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002" +
                    "\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e" +
                    "\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011" +
                    "\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014" +
                    "\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017" +
                    "\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a" +
                    "\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d" +
                    "\u0002\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!" +
                    "\u0007!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002" +
                    "&\u0007&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002" +
                    "+\u0007+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u0002" +
                    "0\u00070\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u0002" +
                    "5\u00075\u00026\u00076\u00027\u00077\u00028\u00078\u00029\u00079\u0002" +
                    ":\u0007:\u0002;\u0007;\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002" +
                    "?\u0007?\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u0086" +
                    "\b\u0000\u0001\u0001\u0001\u0001\u0003\u0001\u008a\b\u0001\u0001\u0002" +
                    "\u0001\u0002\u0003\u0002\u008e\b\u0002\u0001\u0003\u0001\u0003\u0003\u0003" +
                    "\u0092\b\u0003\u0001\u0004\u0001\u0004\u0003\u0004\u0096\b\u0004\u0001" +
                    "\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u009d" +
                    "\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00a2\b\u0006" +
                    "\u0003\u0006\u00a4\b\u0006\u0001\u0007\u0001\u0007\u0005\u0007\u00a8\b" +
                    "\u0007\n\u0007\f\u0007\u00ab\t\u0007\u0001\u0007\u0003\u0007\u00ae\b\u0007" +
                    "\u0001\b\u0001\b\u0003\b\u00b2\b\b\u0001\t\u0001\t\u0001\n\u0001\n\u0003" +
                    "\n\u00b8\b\n\u0001\u000b\u0004\u000b\u00bb\b\u000b\u000b\u000b\f\u000b" +
                    "\u00bc\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0005\r\u00c5\b" +
                    "\r\n\r\f\r\u00c8\t\r\u0001\r\u0003\r\u00cb\b\r\u0001\u000e\u0001\u000e" +
                    "\u0001\u000f\u0001\u000f\u0003\u000f\u00d1\b\u000f\u0001\u0010\u0001\u0010" +
                    "\u0003\u0010\u00d5\b\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011" +
                    "\u0005\u0011\u00db\b\u0011\n\u0011\f\u0011\u00de\t\u0011\u0001\u0011\u0003" +
                    "\u0011\u00e1\b\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0003" +
                    "\u0013\u00e7\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001" +
                    "\u0015\u0001\u0015\u0005\u0015\u00ef\b\u0015\n\u0015\f\u0015\u00f2\t\u0015" +
                    "\u0001\u0015\u0003\u0015\u00f5\b\u0015\u0001\u0016\u0001\u0016\u0001\u0017" +
                    "\u0001\u0017\u0003\u0017\u00fb\b\u0017\u0001\u0018\u0001\u0018\u0003\u0018" +
                    "\u00ff\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0104\b" +
                    "\u0019\u0001\u0019\u0003\u0019\u0107\b\u0019\u0001\u0019\u0003\u0019\u010a" +
                    "\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u010f\b\u0019" +
                    "\u0001\u0019\u0003\u0019\u0112\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019" +
                    "\u0003\u0019\u0117\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019" +
                    "\u011c\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b" +
                    "\u0001\u001c\u0003\u001c\u0124\b\u001c\u0001\u001c\u0001\u001c\u0001\u001d" +
                    "\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f" +
                    "\u0003\u001f\u012f\b\u001f\u0001 \u0001 \u0003 \u0133\b \u0001 \u0001" +
                    " \u0001 \u0003 \u0138\b \u0001 \u0001 \u0003 \u013c\b \u0001!\u0001!\u0001" +
                    "!\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001" +
                    "#\u0001#\u0003#\u014c\b#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001" +
                    "$\u0001$\u0003$\u0156\b$\u0001%\u0001%\u0001&\u0001&\u0003&\u015c\b&\u0001" +
                    "&\u0001&\u0001\'\u0004\'\u0161\b\'\u000b\'\f\'\u0162\u0001(\u0001(\u0003" +
                    "(\u0167\b(\u0001)\u0001)\u0001)\u0001)\u0003)\u016d\b)\u0001*\u0001*\u0001" +
                    "*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u017a" +
                    "\b*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001" +
                    "-\u0001-\u0001.\u0001.\u0001/\u0001/\u00010\u00010\u00011\u00011\u0001" +
                    "2\u00012\u00013\u00013\u00014\u00014\u00015\u00015\u00016\u00016\u0001" +
                    "7\u00017\u00017\u00018\u00018\u00018\u00019\u00019\u0001:\u0001:\u0001" +
                    ":\u0001:\u0001;\u0001;\u0001;\u0001<\u0001<\u0001=\u0001=\u0001=\u0005" +
                    "=\u01ad\b=\n=\f=\u01b0\t=\u0003=\u01b2\b=\u0001>\u0001>\u0001>\u0001>" +
                    "\u0001>\u0001>\u0003>\u01ba\b>\u0001?\u0001?\u0001?\u0001?\u0001?\u0001" +
                    "?\u0003?\u01c2\b?\u0000\u0000@\u0001\u0001\u0003\u0000\u0005\u0000\u0007" +
                    "\u0000\t\u0000\u000b\u0000\r\u0000\u000f\u0000\u0011\u0000\u0013\u0000" +
                    "\u0015\u0000\u0017\u0000\u0019\u0000\u001b\u0000\u001d\u0000\u001f\u0000" +
                    "!\u0000#\u0000%\u0000\'\u0000)\u0000+\u0000-\u0000/\u00001\u00023\u0000" +
                    "5\u00007\u00009\u0000;\u0000=\u0000?\u0000A\u0000C\u0000E\u0000G\u0003" +
                    "I\u0004K\u0000M\u0005O\u0000Q\u0000S\u0000U\u0000W\u0000Y\u0000[\u0006" +
                    "]\u0007_\ba\tc\ne\u000bg\fi\rk\u000em\u000fo\u0010q\u0011s\u0012u\u0013" +
                    "w\u0014y\u0015{\u0016}\u0000\u007f\u0000\u0001\u0000\u0014\u0002\u0000" +
                    "LLll\u0001\u000019\u0002\u0000XXxx\u0003\u000009AFaf\u0001\u000007\u0002" +
                    "\u0000BBbb\u0001\u000001\u0002\u0000EEee\u0002\u0000++--\u0004\u0000D" +
                    "DFFddff\u0002\u0000PPpp\u0002\u0000\'\'\\\\\u0002\u0000\"\"\\\\\b\u0000" +
                    "\"\"\'\'\\\\bbffnnrrtt\u0001\u000003\u0004\u0000$$AZ__az\u0002\u0000\u0000" +
                    "\u007f\u8000\ud800\u8000\udbff\u0001\u0000\u8000\ud800\u8000\udbff\u0001" +
                    "\u0000\u8000\udc00\u8000\udfff\u0006\u0000$$**09AZ__az\u01cf\u0000\u0001" +
                    "\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000G\u0001\u0000" +
                    "\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000" +
                    "\u0000[\u0001\u0000\u0000\u0000\u0000]\u0001\u0000\u0000\u0000\u0000_" +
                    "\u0001\u0000\u0000\u0000\u0000a\u0001\u0000\u0000\u0000\u0000c\u0001\u0000" +
                    "\u0000\u0000\u0000e\u0001\u0000\u0000\u0000\u0000g\u0001\u0000\u0000\u0000" +
                    "\u0000i\u0001\u0000\u0000\u0000\u0000k\u0001\u0000\u0000\u0000\u0000m" +
                    "\u0001\u0000\u0000\u0000\u0000o\u0001\u0000\u0000\u0000\u0000q\u0001\u0000" +
                    "\u0000\u0000\u0000s\u0001\u0000\u0000\u0000\u0000u\u0001\u0000\u0000\u0000" +
                    "\u0000w\u0001\u0000\u0000\u0000\u0000y\u0001\u0000\u0000\u0000\u0000{" +
                    "\u0001\u0000\u0000\u0000\u0001\u0085\u0001\u0000\u0000\u0000\u0003\u0087" +
                    "\u0001\u0000\u0000\u0000\u0005\u008b\u0001\u0000\u0000\u0000\u0007\u008f" +
                    "\u0001\u0000\u0000\u0000\t\u0093\u0001\u0000\u0000\u0000\u000b\u0097\u0001" +
                    "\u0000\u0000\u0000\r\u00a3\u0001\u0000\u0000\u0000\u000f\u00a5\u0001\u0000" +
                    "\u0000\u0000\u0011\u00b1\u0001\u0000\u0000\u0000\u0013\u00b3\u0001\u0000" +
                    "\u0000\u0000\u0015\u00b7\u0001\u0000\u0000\u0000\u0017\u00ba\u0001\u0000" +
                    "\u0000\u0000\u0019\u00be\u0001\u0000\u0000\u0000\u001b\u00c2\u0001\u0000" +
                    "\u0000\u0000\u001d\u00cc\u0001\u0000\u0000\u0000\u001f\u00d0\u0001\u0000" +
                    "\u0000\u0000!\u00d2\u0001\u0000\u0000\u0000#\u00d8\u0001\u0000\u0000\u0000" +
                    "%\u00e2\u0001\u0000\u0000\u0000\'\u00e6\u0001\u0000\u0000\u0000)\u00e8" +
                    "\u0001\u0000\u0000\u0000+\u00ec\u0001\u0000\u0000\u0000-\u00f6\u0001\u0000" +
                    "\u0000\u0000/\u00fa\u0001\u0000\u0000\u00001\u00fe\u0001\u0000\u0000\u0000" +
                    "3\u011b\u0001\u0000\u0000\u00005\u011d\u0001\u0000\u0000\u00007\u0120" +
                    "\u0001\u0000\u0000\u00009\u0123\u0001\u0000\u0000\u0000;\u0127\u0001\u0000" +
                    "\u0000\u0000=\u0129\u0001\u0000\u0000\u0000?\u012b\u0001\u0000\u0000\u0000" +
                    "A\u013b\u0001\u0000\u0000\u0000C\u013d\u0001\u0000\u0000\u0000E\u0140" +
                    "\u0001\u0000\u0000\u0000G\u014b\u0001\u0000\u0000\u0000I\u0155\u0001\u0000" +
                    "\u0000\u0000K\u0157\u0001\u0000\u0000\u0000M\u0159\u0001\u0000\u0000\u0000" +
                    "O\u0160\u0001\u0000\u0000\u0000Q\u0166\u0001\u0000\u0000\u0000S\u016c" +
                    "\u0001\u0000\u0000\u0000U\u0179\u0001\u0000\u0000\u0000W\u017b\u0001\u0000" +
                    "\u0000\u0000Y\u0182\u0001\u0000\u0000\u0000[\u0184\u0001\u0000\u0000\u0000" +
                    "]\u0186\u0001\u0000\u0000\u0000_\u0188\u0001\u0000\u0000\u0000a\u018a" +
                    "\u0001\u0000\u0000\u0000c\u018c\u0001\u0000\u0000\u0000e\u018e\u0001\u0000" +
                    "\u0000\u0000g\u0190\u0001\u0000\u0000\u0000i\u0192\u0001\u0000\u0000\u0000" +
                    "k\u0194\u0001\u0000\u0000\u0000m\u0196\u0001\u0000\u0000\u0000o\u0198" +
                    "\u0001\u0000\u0000\u0000q\u019b\u0001\u0000\u0000\u0000s\u019e\u0001\u0000" +
                    "\u0000\u0000u\u01a0\u0001\u0000\u0000\u0000w\u01a4\u0001\u0000\u0000\u0000" +
                    "y\u01a7\u0001\u0000\u0000\u0000{\u01b1\u0001\u0000\u0000\u0000}\u01b9" +
                    "\u0001\u0000\u0000\u0000\u007f\u01c1\u0001\u0000\u0000\u0000\u0081\u0086" +
                    "\u0003\u0003\u0001\u0000\u0082\u0086\u0003\u0005\u0002\u0000\u0083\u0086" +
                    "\u0003\u0007\u0003\u0000\u0084\u0086\u0003\t\u0004\u0000\u0085\u0081\u0001" +
                    "\u0000\u0000\u0000\u0085\u0082\u0001\u0000\u0000\u0000\u0085\u0083\u0001" +
                    "\u0000\u0000\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0086\u0002\u0001" +
                    "\u0000\u0000\u0000\u0087\u0089\u0003\r\u0006\u0000\u0088\u008a\u0003\u000b" +
                    "\u0005\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000" +
                    "\u0000\u0000\u008a\u0004\u0001\u0000\u0000\u0000\u008b\u008d\u0003\u0019" +
                    "\f\u0000\u008c\u008e\u0003\u000b\u0005\u0000\u008d\u008c\u0001\u0000\u0000" +
                    "\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0006\u0001\u0000\u0000" +
                    "\u0000\u008f\u0091\u0003!\u0010\u0000\u0090\u0092\u0003\u000b\u0005\u0000" +
                    "\u0091\u0090\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000" +
                    "\u0092\b\u0001\u0000\u0000\u0000\u0093\u0095\u0003)\u0014\u0000\u0094" +
                    "\u0096\u0003\u000b\u0005\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0095" +
                    "\u0096\u0001\u0000\u0000\u0000\u0096\n\u0001\u0000\u0000\u0000\u0097\u0098" +
                    "\u0007\u0000\u0000\u0000\u0098\f\u0001\u0000\u0000\u0000\u0099\u00a4\u0005" +
                    "0\u0000\u0000\u009a\u00a1\u0003\u0013\t\u0000\u009b\u009d\u0003\u000f" +
                    "\u0007\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000" +
                    "\u0000\u0000\u009d\u00a2\u0001\u0000\u0000\u0000\u009e\u009f\u0003\u0017" +
                    "\u000b\u0000\u009f\u00a0\u0003\u000f\u0007\u0000\u00a0\u00a2\u0001\u0000" +
                    "\u0000\u0000\u00a1\u009c\u0001\u0000\u0000\u0000\u00a1\u009e\u0001\u0000" +
                    "\u0000\u0000\u00a2\u00a4\u0001\u0000\u0000\u0000\u00a3\u0099\u0001\u0000" +
                    "\u0000\u0000\u00a3\u009a\u0001\u0000\u0000\u0000\u00a4\u000e\u0001\u0000" +
                    "\u0000\u0000\u00a5\u00ad\u0003\u0011\b\u0000\u00a6\u00a8\u0003\u0015\n" +
                    "\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001\u0000\u0000" +
                    "\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000" +
                    "\u0000\u00aa\u00ac\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000" +
                    "\u0000\u00ac\u00ae\u0003\u0011\b\u0000\u00ad\u00a9\u0001\u0000\u0000\u0000" +
                    "\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u0010\u0001\u0000\u0000\u0000" +
                    "\u00af\u00b2\u00050\u0000\u0000\u00b0\u00b2\u0003\u0013\t\u0000\u00b1" +
                    "\u00af\u0001\u0000\u0000\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b2" +
                    "\u0012\u0001\u0000\u0000\u0000\u00b3\u00b4\u0007\u0001\u0000\u0000\u00b4" +
                    "\u0014\u0001\u0000\u0000\u0000\u00b5\u00b8\u0003\u0011\b\u0000\u00b6\u00b8" +
                    "\u0005_\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b6\u0001" +
                    "\u0000\u0000\u0000\u00b8\u0016\u0001\u0000\u0000\u0000\u00b9\u00bb\u0005" +
                    "_\u0000\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000" +
                    "\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000" +
                    "\u0000\u0000\u00bd\u0018\u0001\u0000\u0000\u0000\u00be\u00bf\u00050\u0000" +
                    "\u0000\u00bf\u00c0\u0007\u0002\u0000\u0000\u00c0\u00c1\u0003\u001b\r\u0000" +
                    "\u00c1\u001a\u0001\u0000\u0000\u0000\u00c2\u00ca\u0003\u001d\u000e\u0000" +
                    "\u00c3\u00c5\u0003\u001f\u000f\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000" +
                    "\u00c5\u00c8\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000" +
                    "\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c9\u0001\u0000\u0000\u0000" +
                    "\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c9\u00cb\u0003\u001d\u000e\u0000" +
                    "\u00ca\u00c6\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000" +
                    "\u00cb\u001c\u0001\u0000\u0000\u0000\u00cc\u00cd\u0007\u0003\u0000\u0000" +
                    "\u00cd\u001e\u0001\u0000\u0000\u0000\u00ce\u00d1\u0003\u001d\u000e\u0000" +
                    "\u00cf\u00d1\u0005_\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0" +
                    "\u00cf\u0001\u0000\u0000\u0000\u00d1 \u0001\u0000\u0000\u0000\u00d2\u00d4" +
                    "\u00050\u0000\u0000\u00d3\u00d5\u0003\u0017\u000b\u0000\u00d4\u00d3\u0001" +
                    "\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001" +
                    "\u0000\u0000\u0000\u00d6\u00d7\u0003#\u0011\u0000\u00d7\"\u0001\u0000" +
                    "\u0000\u0000\u00d8\u00e0\u0003%\u0012\u0000\u00d9\u00db\u0003\'\u0013" +
                    "\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00db\u00de\u0001\u0000\u0000" +
                    "\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000" +
                    "\u0000\u00dd\u00df\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000" +
                    "\u0000\u00df\u00e1\u0003%\u0012\u0000\u00e0\u00dc\u0001\u0000\u0000\u0000" +
                    "\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1$\u0001\u0000\u0000\u0000\u00e2" +
                    "\u00e3\u0007\u0004\u0000\u0000\u00e3&\u0001\u0000\u0000\u0000\u00e4\u00e7" +
                    "\u0003%\u0012\u0000\u00e5\u00e7\u0005_\u0000\u0000\u00e6\u00e4\u0001\u0000" +
                    "\u0000\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e7(\u0001\u0000\u0000" +
                    "\u0000\u00e8\u00e9\u00050\u0000\u0000\u00e9\u00ea\u0007\u0005\u0000\u0000" +
                    "\u00ea\u00eb\u0003+\u0015\u0000\u00eb*\u0001\u0000\u0000\u0000\u00ec\u00f4" +
                    "\u0003-\u0016\u0000\u00ed\u00ef\u0003/\u0017\u0000\u00ee\u00ed\u0001\u0000" +
                    "\u0000\u0000\u00ef\u00f2\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000" +
                    "\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f3\u0001\u0000" +
                    "\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f3\u00f5\u0003-\u0016" +
                    "\u0000\u00f4\u00f0\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000" +
                    "\u0000\u00f5,\u0001\u0000\u0000\u0000\u00f6\u00f7\u0007\u0006\u0000\u0000" +
                    "\u00f7.\u0001\u0000\u0000\u0000\u00f8\u00fb\u0003-\u0016\u0000\u00f9\u00fb" +
                    "\u0005_\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa\u00f9\u0001" +
                    "\u0000\u0000\u0000\u00fb0\u0001\u0000\u0000\u0000\u00fc\u00ff\u00033\u0019" +
                    "\u0000\u00fd\u00ff\u0003?\u001f\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000" +
                    "\u00fe\u00fd\u0001\u0000\u0000\u0000\u00ff2\u0001\u0000\u0000\u0000\u0100" +
                    "\u0101\u0003\u000f\u0007\u0000\u0101\u0103\u0005.\u0000\u0000\u0102\u0104" +
                    "\u0003\u000f\u0007\u0000\u0103\u0102\u0001\u0000\u0000\u0000\u0103\u0104" +
                    "\u0001\u0000\u0000\u0000\u0104\u0106\u0001\u0000\u0000\u0000\u0105\u0107" +
                    "\u00035\u001a\u0000\u0106\u0105\u0001\u0000\u0000\u0000\u0106\u0107\u0001" +
                    "\u0000\u0000\u0000\u0107\u0109\u0001\u0000\u0000\u0000\u0108\u010a\u0003" +
                    "=\u001e\u0000\u0109\u0108\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000" +
                    "\u0000\u0000\u010a\u011c\u0001\u0000\u0000\u0000\u010b\u010c\u0005.\u0000" +
                    "\u0000\u010c\u010e\u0003\u000f\u0007\u0000\u010d\u010f\u00035\u001a\u0000" +
                    "\u010e\u010d\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000" +
                    "\u010f\u0111\u0001\u0000\u0000\u0000\u0110\u0112\u0003=\u001e\u0000\u0111" +
                    "\u0110\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112" +
                    "\u011c\u0001\u0000\u0000\u0000\u0113\u0114\u0003\u000f\u0007\u0000\u0114" +
                    "\u0116\u00035\u001a\u0000\u0115\u0117\u0003=\u001e\u0000\u0116\u0115\u0001" +
                    "\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u011c\u0001" +
                    "\u0000\u0000\u0000\u0118\u0119\u0003\u000f\u0007\u0000\u0119\u011a\u0003" +
                    "=\u001e\u0000\u011a\u011c\u0001\u0000\u0000\u0000\u011b\u0100\u0001\u0000" +
                    "\u0000\u0000\u011b\u010b\u0001\u0000\u0000\u0000\u011b\u0113\u0001\u0000" +
                    "\u0000\u0000\u011b\u0118\u0001\u0000\u0000\u0000\u011c4\u0001\u0000\u0000" +
                    "\u0000\u011d\u011e\u00037\u001b\u0000\u011e\u011f\u00039\u001c\u0000\u011f" +
                    "6\u0001\u0000\u0000\u0000\u0120\u0121\u0007\u0007\u0000\u0000\u01218\u0001" +
                    "\u0000\u0000\u0000\u0122\u0124\u0003;\u001d\u0000\u0123\u0122\u0001\u0000" +
                    "\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000" +
                    "\u0000\u0000\u0125\u0126\u0003\u000f\u0007\u0000\u0126:\u0001\u0000\u0000" +
                    "\u0000\u0127\u0128\u0007\b\u0000\u0000\u0128<\u0001\u0000\u0000\u0000" +
                    "\u0129\u012a\u0007\t\u0000\u0000\u012a>\u0001\u0000\u0000\u0000\u012b" +
                    "\u012c\u0003A \u0000\u012c\u012e\u0003C!\u0000\u012d\u012f\u0003=\u001e" +
                    "\u0000\u012e\u012d\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000" +
                    "\u0000\u012f@\u0001\u0000\u0000\u0000\u0130\u0132\u0003\u0019\f\u0000" +
                    "\u0131\u0133\u0005.\u0000\u0000\u0132\u0131\u0001\u0000\u0000\u0000\u0132" +
                    "\u0133\u0001\u0000\u0000\u0000\u0133\u013c\u0001\u0000\u0000\u0000\u0134" +
                    "\u0135\u00050\u0000\u0000\u0135\u0137\u0007\u0002\u0000\u0000\u0136\u0138" +
                    "\u0003\u001b\r\u0000\u0137\u0136\u0001\u0000\u0000\u0000\u0137\u0138\u0001" +
                    "\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139\u013a\u0005" +
                    ".\u0000\u0000\u013a\u013c\u0003\u001b\r\u0000\u013b\u0130\u0001\u0000" +
                    "\u0000\u0000\u013b\u0134\u0001\u0000\u0000\u0000\u013cB\u0001\u0000\u0000" +
                    "\u0000\u013d\u013e\u0003E\"\u0000\u013e\u013f\u00039\u001c\u0000\u013f" +
                    "D\u0001\u0000\u0000\u0000\u0140\u0141\u0007\n\u0000\u0000\u0141F\u0001" +
                    "\u0000\u0000\u0000\u0142\u0143\u0005t\u0000\u0000\u0143\u0144\u0005r\u0000" +
                    "\u0000\u0144\u0145\u0005u\u0000\u0000\u0145\u014c\u0005e\u0000\u0000\u0146" +
                    "\u0147\u0005f\u0000\u0000\u0147\u0148\u0005a\u0000\u0000\u0148\u0149\u0005" +
                    "l\u0000\u0000\u0149\u014a\u0005s\u0000\u0000\u014a\u014c\u0005e\u0000" +
                    "\u0000\u014b\u0142\u0001\u0000\u0000\u0000\u014b\u0146\u0001\u0000\u0000" +
                    "\u0000\u014cH\u0001\u0000\u0000\u0000\u014d\u014e\u0005\'\u0000\u0000" +
                    "\u014e\u014f\u0003K%\u0000\u014f\u0150\u0005\'\u0000\u0000\u0150\u0156" +
                    "\u0001\u0000\u0000\u0000\u0151\u0152\u0005\'\u0000\u0000\u0152\u0153\u0003" +
                    "S)\u0000\u0153\u0154\u0005\'\u0000\u0000\u0154\u0156\u0001\u0000\u0000" +
                    "\u0000\u0155\u014d\u0001\u0000\u0000\u0000\u0155\u0151\u0001\u0000\u0000" +
                    "\u0000\u0156J\u0001\u0000\u0000\u0000\u0157\u0158\b\u000b\u0000\u0000" +
                    "\u0158L\u0001\u0000\u0000\u0000\u0159\u015b\u0005\"\u0000\u0000\u015a" +
                    "\u015c\u0003O\'\u0000\u015b\u015a\u0001\u0000\u0000\u0000\u015b\u015c" +
                    "\u0001\u0000\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d\u015e" +
                    "\u0005\"\u0000\u0000\u015eN\u0001\u0000\u0000\u0000\u015f\u0161\u0003" +
                    "Q(\u0000\u0160\u015f\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000" +
                    "\u0000\u0162\u0160\u0001\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000" +
                    "\u0000\u0163P\u0001\u0000\u0000\u0000\u0164\u0167\b\f\u0000\u0000\u0165" +
                    "\u0167\u0003S)\u0000\u0166\u0164\u0001\u0000\u0000\u0000\u0166\u0165\u0001" +
                    "\u0000\u0000\u0000\u0167R\u0001\u0000\u0000\u0000\u0168\u0169\u0005\\" +
                    "\u0000\u0000\u0169\u016d\u0007\r\u0000\u0000\u016a\u016d\u0003U*\u0000" +
                    "\u016b\u016d\u0003W+\u0000\u016c\u0168\u0001\u0000\u0000\u0000\u016c\u016a" +
                    "\u0001\u0000\u0000\u0000\u016c\u016b\u0001\u0000\u0000\u0000\u016dT\u0001" +
                    "\u0000\u0000\u0000\u016e\u016f\u0005\\\u0000\u0000\u016f\u017a\u0003%" +
                    "\u0012\u0000\u0170\u0171\u0005\\\u0000\u0000\u0171\u0172\u0003%\u0012" +
                    "\u0000\u0172\u0173\u0003%\u0012\u0000\u0173\u017a\u0001\u0000\u0000\u0000" +
                    "\u0174\u0175\u0005\\\u0000\u0000\u0175\u0176\u0003Y,\u0000\u0176\u0177" +
                    "\u0003%\u0012\u0000\u0177\u0178\u0003%\u0012\u0000\u0178\u017a\u0001\u0000" +
                    "\u0000\u0000\u0179\u016e\u0001\u0000\u0000\u0000\u0179\u0170\u0001\u0000" +
                    "\u0000\u0000\u0179\u0174\u0001\u0000\u0000\u0000\u017aV\u0001\u0000\u0000" +
                    "\u0000\u017b\u017c\u0005\\\u0000\u0000\u017c\u017d\u0005u\u0000\u0000" +
                    "\u017d\u017e\u0003\u001d\u000e\u0000\u017e\u017f\u0003\u001d\u000e\u0000" +
                    "\u017f\u0180\u0003\u001d\u000e\u0000\u0180\u0181\u0003\u001d\u000e\u0000" +
                    "\u0181X\u0001\u0000\u0000\u0000\u0182\u0183\u0007\u000e\u0000\u0000\u0183" +
                    "Z\u0001\u0000\u0000\u0000\u0184\u0185\u0005(\u0000\u0000\u0185\\\u0001" +
                    "\u0000\u0000\u0000\u0186\u0187\u0005)\u0000\u0000\u0187^\u0001\u0000\u0000" +
                    "\u0000\u0188\u0189\u0005[\u0000\u0000\u0189`\u0001\u0000\u0000\u0000\u018a" +
                    "\u018b\u0005]\u0000\u0000\u018bb\u0001\u0000\u0000\u0000\u018c\u018d\u0005" +
                    ",\u0000\u0000\u018dd\u0001\u0000\u0000\u0000\u018e\u018f\u0005.\u0000" +
                    "\u0000\u018ff\u0001\u0000\u0000\u0000\u0190\u0191\u0005=\u0000\u0000\u0191" +
                    "h\u0001\u0000\u0000\u0000\u0192\u0193\u0005:\u0000\u0000\u0193j\u0001" +
                    "\u0000\u0000\u0000\u0194\u0195\u0005+\u0000\u0000\u0195l\u0001\u0000\u0000" +
                    "\u0000\u0196\u0197\u0005-\u0000\u0000\u0197n\u0001\u0000\u0000\u0000\u0198" +
                    "\u0199\u0005&\u0000\u0000\u0199\u019a\u0005&\u0000\u0000\u019ap\u0001" +
                    "\u0000\u0000\u0000\u019b\u019c\u0005|\u0000\u0000\u019c\u019d\u0005|\u0000" +
                    "\u0000\u019dr\u0001\u0000\u0000\u0000\u019e\u019f\u0005@\u0000\u0000\u019f" +
                    "t\u0001\u0000\u0000\u0000\u01a0\u01a1\u0005.\u0000\u0000\u01a1\u01a2\u0005" +
                    ".\u0000\u0000\u01a2\u01a3\u0005.\u0000\u0000\u01a3v\u0001\u0000\u0000" +
                    "\u0000\u01a4\u01a5\u0005.\u0000\u0000\u01a5\u01a6\u0005.\u0000\u0000\u01a6" +
                    "x\u0001\u0000\u0000\u0000\u01a7\u01a8\u0005 \u0000\u0000\u01a8z\u0001" +
                    "\u0000\u0000\u0000\u01a9\u01b2\u0005*\u0000\u0000\u01aa\u01ae\u0003}>" +
                    "\u0000\u01ab\u01ad\u0003\u007f?\u0000\u01ac\u01ab\u0001\u0000\u0000\u0000" +
                    "\u01ad\u01b0\u0001\u0000\u0000\u0000\u01ae\u01ac\u0001\u0000\u0000\u0000" +
                    "\u01ae\u01af\u0001\u0000\u0000\u0000\u01af\u01b2\u0001\u0000\u0000\u0000" +
                    "\u01b0\u01ae\u0001\u0000\u0000\u0000\u01b1\u01a9\u0001\u0000\u0000\u0000" +
                    "\u01b1\u01aa\u0001\u0000\u0000\u0000\u01b2|\u0001\u0000\u0000\u0000\u01b3" +
                    "\u01ba\u0007\u000f\u0000\u0000\u01b4\u01b5\b\u0010\u0000\u0000\u01b5\u01ba" +
                    "\u0004>\u0000\u0000\u01b6\u01b7\u0007\u0011\u0000\u0000\u01b7\u01b8\u0007" +
                    "\u0012\u0000\u0000\u01b8\u01ba\u0004>\u0001\u0000\u01b9\u01b3\u0001\u0000" +
                    "\u0000\u0000\u01b9\u01b4\u0001\u0000\u0000\u0000\u01b9\u01b6\u0001\u0000" +
                    "\u0000\u0000\u01ba~\u0001\u0000\u0000\u0000\u01bb\u01c2\u0007\u0013\u0000" +
                    "\u0000\u01bc\u01bd\b\u0010\u0000\u0000\u01bd\u01c2\u0004?\u0002\u0000" +
                    "\u01be\u01bf\u0007\u0011\u0000\u0000\u01bf\u01c0\u0007\u0012\u0000\u0000" +
                    "\u01c0\u01c2\u0004?\u0003\u0000\u01c1\u01bb\u0001\u0000\u0000\u0000\u01c1" +
                    "\u01bc\u0001\u0000\u0000\u0000\u01c1\u01be\u0001\u0000\u0000\u0000\u01c2" +
                    "\u0080\u0001\u0000\u0000\u00000\u0000\u0085\u0089\u008d\u0091\u0095\u009c" +
                    "\u00a1\u00a3\u00a9\u00ad\u00b1\u00b7\u00bc\u00c6\u00ca\u00d0\u00d4\u00dc" +
                    "\u00e0\u00e6\u00f0\u00f4\u00fa\u00fe\u0103\u0106\u0109\u010e\u0111\u0116" +
                    "\u011b\u0123\u012e\u0132\u0137\u013b\u014b\u0155\u015b\u0162\u0166\u016c" +
                    "\u0179\u01ae\u01b1\u01b9\u01c1\u0000";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}
