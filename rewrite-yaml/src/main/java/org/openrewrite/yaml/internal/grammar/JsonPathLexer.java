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
// Generated from ~/git/rewrite/rewrite-yaml/src/main/antlr/JsonPathLexer.g4 by ANTLR 4.13.2
package org.openrewrite.yaml.internal.grammar;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class JsonPathLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, UTF_8_BOM=2, MATCHES_REGEX_OPEN=3, LBRACE=4, RBRACE=5, LBRACK=6,
		RBRACK=7, LPAREN=8, RPAREN=9, AT=10, DOT=11, DOT_DOT=12, ROOT=13, WILDCARD=14,
		COLON=15, QUESTION=16, CONTAINS=17, TRUE=18, FALSE=19, NULL=20, Identifier=21,
		StringLiteral=22, PositiveNumber=23, NegativeNumber=24, NumericLiteral=25,
		COMMA=26, TICK=27, QUOTE=28, MATCHES=29, LOGICAL_OPERATOR=30, AND=31,
		OR=32, EQUALITY_OPERATOR=33, EQ=34, NE=35, MATCHES_REGEX_CLOSE=36, S=37,
		REGEX=38;
	public static final int
		MATCHES_REGEX=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "MATCHES_REGEX"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "UTF_8_BOM", "MATCHES_REGEX_OPEN", "LBRACE", "RBRACE", "LBRACK",
			"RBRACK", "LPAREN", "RPAREN", "AT", "DOT", "DOT_DOT", "ROOT", "WILDCARD",
			"COLON", "QUESTION", "CONTAINS", "TRUE", "FALSE", "NULL", "Identifier",
			"StringLiteral", "PositiveNumber", "NegativeNumber", "NumericLiteral",
			"COMMA", "TICK", "QUOTE", "MATCHES", "LOGICAL_OPERATOR", "AND", "OR",
			"EQUALITY_OPERATOR", "EQ", "NE", "ESCAPE_SEQUENCE", "UNICODE", "HEX_DIGIT",
			"SAFE_CODE_POINT", "EXPONENT_PART", "MINUS", "MATCHES_REGEX_CLOSE", "S",
			"REGEX"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'\\uFEFF'", null, "'{'", "'}'", "'['", "']'", "'('", "')'",
			"'@'", "'.'", "'..'", "'$'", "'*'", "':'", "'?'", "'contains'", "'true'",
			"'false'", "'null'", null, null, null, null, null, "','", "'''", "'\"'",
			"'=~'", null, "'&&'", "'||'", null, "'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "UTF_8_BOM", "MATCHES_REGEX_OPEN", "LBRACE", "RBRACE", "LBRACK",
			"RBRACK", "LPAREN", "RPAREN", "AT", "DOT", "DOT_DOT", "ROOT", "WILDCARD",
			"COLON", "QUESTION", "CONTAINS", "TRUE", "FALSE", "NULL", "Identifier",
			"StringLiteral", "PositiveNumber", "NegativeNumber", "NumericLiteral",
			"COMMA", "TICK", "QUOTE", "MATCHES", "LOGICAL_OPERATOR", "AND", "OR",
			"EQUALITY_OPERATOR", "EQ", "NE", "MATCHES_REGEX_CLOSE", "S", "REGEX"
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


	public JsonPathLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JsonPathLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000&\u0125\u0006\uffff\uffff\u0006\uffff\uffff\u0002\u0000\u0007"+
		"\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007"+
		"\u0003\u0002\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007"+
		"\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n"+
		"\u0007\n\u0002\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002"+
		"\u000e\u0007\u000e\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002"+
		"\u0011\u0007\u0011\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002"+
		"\u0014\u0007\u0014\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002"+
		"\u0017\u0007\u0017\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002"+
		"\u001a\u0007\u001a\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002"+
		"\u001d\u0007\u001d\u0002\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002"+
		" \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002"+
		"%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002"+
		"*\u0007*\u0002+\u0007+\u0001\u0000\u0004\u0000\\\b\u0000\u000b\u0000\f"+
		"\u0000]\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0003\u0002h\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0005\u0014"+
		"\u00a4\b\u0014\n\u0014\f\u0014\u00a7\t\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0005\u0015\u00ac\b\u0015\n\u0015\f\u0015\u00af\t\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u00b6\b\u0015"+
		"\n\u0015\f\u0015\u00b9\t\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00bd"+
		"\b\u0015\u0001\u0016\u0004\u0016\u00c0\b\u0016\u000b\u0016\f\u0016\u00c1"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0003\u0018\u00c8\b\u0018"+
		"\u0001\u0018\u0001\u0018\u0003\u0018\u00cc\b\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0003\u001d"+
		"\u00db\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0003 \u00e5\b \u0001!\u0001!\u0001!\u0001"+
		"\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0003#\u00ff\b#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001"+
		"%\u0001&\u0001&\u0001\'\u0001\'\u0003\'\u010d\b\'\u0001\'\u0004\'\u0110"+
		"\b\'\u000b\'\f\'\u0111\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001"+
		"*\u0004*\u011b\b*\u000b*\f*\u011c\u0001*\u0001*\u0001+\u0004+\u0122\b"+
		"+\u000b+\f+\u0123\u0002\u00ad\u00b7\u0000,\u0002\u0001\u0004\u0002\u0006"+
		"\u0003\b\u0004\n\u0005\f\u0006\u000e\u0007\u0010\b\u0012\t\u0014\n\u0016"+
		"\u000b\u0018\f\u001a\r\u001c\u000e\u001e\u000f \u0010\"\u0011$\u0012&"+
		"\u0013(\u0014*\u0015,\u0016.\u00170\u00182\u00194\u001a6\u001b8\u001c"+
		":\u001d<\u001e>\u001f@ B!D\"F#H\u0000J\u0000L\u0000N\u0000P\u0000R\u0000"+
		"T$V%X&\u0002\u0000\u0001\u000b\u0003\u0000\t\n\f\r  \u0002\u0000\t\t "+
		" \u0003\u0000AZ__az\u0005\u0000--09AZ__az\u0001\u000009\u0005\u0000\""+
		"\"\\\\nnrrtt\u0003\u000009AFaf\u0003\u0000\u0000\u001f\"\"\\\\\u0002\u0000"+
		"EEee\u0002\u0000++--\u0001\u0000\'\'\u0130\u0000\u0002\u0001\u0000\u0000"+
		"\u0000\u0000\u0004\u0001\u0000\u0000\u0000\u0000\u0006\u0001\u0000\u0000"+
		"\u0000\u0000\b\u0001\u0000\u0000\u0000\u0000\n\u0001\u0000\u0000\u0000"+
		"\u0000\f\u0001\u0000\u0000\u0000\u0000\u000e\u0001\u0000\u0000\u0000\u0000"+
		"\u0010\u0001\u0000\u0000\u0000\u0000\u0012\u0001\u0000\u0000\u0000\u0000"+
		"\u0014\u0001\u0000\u0000\u0000\u0000\u0016\u0001\u0000\u0000\u0000\u0000"+
		"\u0018\u0001\u0000\u0000\u0000\u0000\u001a\u0001\u0000\u0000\u0000\u0000"+
		"\u001c\u0001\u0000\u0000\u0000\u0000\u001e\u0001\u0000\u0000\u0000\u0000"+
		" \u0001\u0000\u0000\u0000\u0000\"\u0001\u0000\u0000\u0000\u0000$\u0001"+
		"\u0000\u0000\u0000\u0000&\u0001\u0000\u0000\u0000\u0000(\u0001\u0000\u0000"+
		"\u0000\u0000*\u0001\u0000\u0000\u0000\u0000,\u0001\u0000\u0000\u0000\u0000"+
		".\u0001\u0000\u0000\u0000\u00000\u0001\u0000\u0000\u0000\u00002\u0001"+
		"\u0000\u0000\u0000\u00004\u0001\u0000\u0000\u0000\u00006\u0001\u0000\u0000"+
		"\u0000\u00008\u0001\u0000\u0000\u0000\u0000:\u0001\u0000\u0000\u0000\u0000"+
		"<\u0001\u0000\u0000\u0000\u0000>\u0001\u0000\u0000\u0000\u0000@\u0001"+
		"\u0000\u0000\u0000\u0000B\u0001\u0000\u0000\u0000\u0000D\u0001\u0000\u0000"+
		"\u0000\u0000F\u0001\u0000\u0000\u0000\u0001T\u0001\u0000\u0000\u0000\u0001"+
		"V\u0001\u0000\u0000\u0000\u0001X\u0001\u0000\u0000\u0000\u0002[\u0001"+
		"\u0000\u0000\u0000\u0004a\u0001\u0000\u0000\u0000\u0006e\u0001\u0000\u0000"+
		"\u0000\bm\u0001\u0000\u0000\u0000\no\u0001\u0000\u0000\u0000\fq\u0001"+
		"\u0000\u0000\u0000\u000es\u0001\u0000\u0000\u0000\u0010u\u0001\u0000\u0000"+
		"\u0000\u0012w\u0001\u0000\u0000\u0000\u0014y\u0001\u0000\u0000\u0000\u0016"+
		"{\u0001\u0000\u0000\u0000\u0018}\u0001\u0000\u0000\u0000\u001a\u0080\u0001"+
		"\u0000\u0000\u0000\u001c\u0082\u0001\u0000\u0000\u0000\u001e\u0084\u0001"+
		"\u0000\u0000\u0000 \u0086\u0001\u0000\u0000\u0000\"\u0088\u0001\u0000"+
		"\u0000\u0000$\u0091\u0001\u0000\u0000\u0000&\u0096\u0001\u0000\u0000\u0000"+
		"(\u009c\u0001\u0000\u0000\u0000*\u00a1\u0001\u0000\u0000\u0000,\u00bc"+
		"\u0001\u0000\u0000\u0000.\u00bf\u0001\u0000\u0000\u00000\u00c3\u0001\u0000"+
		"\u0000\u00002\u00c7\u0001\u0000\u0000\u00004\u00cd\u0001\u0000\u0000\u0000"+
		"6\u00d1\u0001\u0000\u0000\u00008\u00d3\u0001\u0000\u0000\u0000:\u00d5"+
		"\u0001\u0000\u0000\u0000<\u00da\u0001\u0000\u0000\u0000>\u00dc\u0001\u0000"+
		"\u0000\u0000@\u00df\u0001\u0000\u0000\u0000B\u00e4\u0001\u0000\u0000\u0000"+
		"D\u00e6\u0001\u0000\u0000\u0000F\u00e9\u0001\u0000\u0000\u0000H\u00fe"+
		"\u0001\u0000\u0000\u0000J\u0100\u0001\u0000\u0000\u0000L\u0106\u0001\u0000"+
		"\u0000\u0000N\u0108\u0001\u0000\u0000\u0000P\u010a\u0001\u0000\u0000\u0000"+
		"R\u0113\u0001\u0000\u0000\u0000T\u0115\u0001\u0000\u0000\u0000V\u011a"+
		"\u0001\u0000\u0000\u0000X\u0121\u0001\u0000\u0000\u0000Z\\\u0007\u0000"+
		"\u0000\u0000[Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000][\u0001"+
		"\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000"+
		"_`\u0006\u0000\u0000\u0000`\u0003\u0001\u0000\u0000\u0000ab\u0005\u8000"+
		"\ufeff\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0006\u0001\u0000\u0000"+
		"d\u0005\u0001\u0000\u0000\u0000eg\u0003:\u001c\u0000fh\u0007\u0001\u0000"+
		"\u0000gf\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0001\u0000"+
		"\u0000\u0000ij\u00036\u001a\u0000jk\u0001\u0000\u0000\u0000kl\u0006\u0002"+
		"\u0001\u0000l\u0007\u0001\u0000\u0000\u0000mn\u0005{\u0000\u0000n\t\u0001"+
		"\u0000\u0000\u0000op\u0005}\u0000\u0000p\u000b\u0001\u0000\u0000\u0000"+
		"qr\u0005[\u0000\u0000r\r\u0001\u0000\u0000\u0000st\u0005]\u0000\u0000"+
		"t\u000f\u0001\u0000\u0000\u0000uv\u0005(\u0000\u0000v\u0011\u0001\u0000"+
		"\u0000\u0000wx\u0005)\u0000\u0000x\u0013\u0001\u0000\u0000\u0000yz\u0005"+
		"@\u0000\u0000z\u0015\u0001\u0000\u0000\u0000{|\u0005.\u0000\u0000|\u0017"+
		"\u0001\u0000\u0000\u0000}~\u0005.\u0000\u0000~\u007f\u0005.\u0000\u0000"+
		"\u007f\u0019\u0001\u0000\u0000\u0000\u0080\u0081\u0005$\u0000\u0000\u0081"+
		"\u001b\u0001\u0000\u0000\u0000\u0082\u0083\u0005*\u0000\u0000\u0083\u001d"+
		"\u0001\u0000\u0000\u0000\u0084\u0085\u0005:\u0000\u0000\u0085\u001f\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0005?\u0000\u0000\u0087!\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0005c\u0000\u0000\u0089\u008a\u0005o\u0000\u0000\u008a"+
		"\u008b\u0005n\u0000\u0000\u008b\u008c\u0005t\u0000\u0000\u008c\u008d\u0005"+
		"a\u0000\u0000\u008d\u008e\u0005i\u0000\u0000\u008e\u008f\u0005n\u0000"+
		"\u0000\u008f\u0090\u0005s\u0000\u0000\u0090#\u0001\u0000\u0000\u0000\u0091"+
		"\u0092\u0005t\u0000\u0000\u0092\u0093\u0005r\u0000\u0000\u0093\u0094\u0005"+
		"u\u0000\u0000\u0094\u0095\u0005e\u0000\u0000\u0095%\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0005f\u0000\u0000\u0097\u0098\u0005a\u0000\u0000\u0098"+
		"\u0099\u0005l\u0000\u0000\u0099\u009a\u0005s\u0000\u0000\u009a\u009b\u0005"+
		"e\u0000\u0000\u009b\'\u0001\u0000\u0000\u0000\u009c\u009d\u0005n\u0000"+
		"\u0000\u009d\u009e\u0005u\u0000\u0000\u009e\u009f\u0005l\u0000\u0000\u009f"+
		"\u00a0\u0005l\u0000\u0000\u00a0)\u0001\u0000\u0000\u0000\u00a1\u00a5\u0007"+
		"\u0002\u0000\u0000\u00a2\u00a4\u0007\u0003\u0000\u0000\u00a3\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6+\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00ad\u00038\u001b"+
		"\u0000\u00a9\u00ac\u0003H#\u0000\u00aa\u00ac\u0003N&\u0000\u00ab\u00a9"+
		"\u0001\u0000\u0000\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ac\u00af"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ad\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ae\u00b0\u0001\u0000\u0000\u0000\u00af\u00ad"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b1\u00038\u001b\u0000\u00b1\u00bd\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b7\u00036\u001a\u0000\u00b3\u00b6\u0003H#"+
		"\u0000\u00b4\u00b6\u0003N&\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b9\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b8\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b8"+
		"\u00ba\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bb\u00036\u001a\u0000\u00bb\u00bd\u0001\u0000\u0000\u0000\u00bc\u00a8"+
		"\u0001\u0000\u0000\u0000\u00bc\u00b2\u0001\u0000\u0000\u0000\u00bd-\u0001"+
		"\u0000\u0000\u0000\u00be\u00c0\u0007\u0004\u0000\u0000\u00bf\u00be\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2/\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\u0003R(\u0000\u00c4\u00c5\u0003.\u0016\u0000"+
		"\u00c51\u0001\u0000\u0000\u0000\u00c6\u00c8\u0003R(\u0000\u00c7\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00c9"+
		"\u0001\u0000\u0000\u0000\u00c9\u00cb\u0003.\u0016\u0000\u00ca\u00cc\u0003"+
		"P\'\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000"+
		"\u0000\u0000\u00cc3\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005,\u0000\u0000"+
		"\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d0\u0006\u0019\u0000\u0000"+
		"\u00d05\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005\'\u0000\u0000\u00d2"+
		"7\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005\"\u0000\u0000\u00d49\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d6\u0005=\u0000\u0000\u00d6\u00d7\u0005~\u0000"+
		"\u0000\u00d7;\u0001\u0000\u0000\u0000\u00d8\u00db\u0003>\u001e\u0000\u00d9"+
		"\u00db\u0003@\u001f\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00da\u00d9"+
		"\u0001\u0000\u0000\u0000\u00db=\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005"+
		"&\u0000\u0000\u00dd\u00de\u0005&\u0000\u0000\u00de?\u0001\u0000\u0000"+
		"\u0000\u00df\u00e0\u0005|\u0000\u0000\u00e0\u00e1\u0005|\u0000\u0000\u00e1"+
		"A\u0001\u0000\u0000\u0000\u00e2\u00e5\u0003D!\u0000\u00e3\u00e5\u0003"+
		"F\"\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e5C\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005=\u0000\u0000"+
		"\u00e7\u00e8\u0005=\u0000\u0000\u00e8E\u0001\u0000\u0000\u0000\u00e9\u00ea"+
		"\u0005!\u0000\u0000\u00ea\u00eb\u0005=\u0000\u0000\u00ebG\u0001\u0000"+
		"\u0000\u0000\u00ec\u00ed\u0005\\\u0000\u0000\u00ed\u00ff\u0007\u0005\u0000"+
		"\u0000\u00ee\u00ef\u0005\\\u0000\u0000\u00ef\u00f0\u0003L%\u0000\u00f0"+
		"\u00f1\u0003L%\u0000\u00f1\u00f2\u0003L%\u0000\u00f2\u00f3\u0003L%\u0000"+
		"\u00f3\u00ff\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005\\\u0000\u0000\u00f5"+
		"\u00f6\u0003L%\u0000\u00f6\u00f7\u0003L%\u0000\u00f7\u00f8\u0003L%\u0000"+
		"\u00f8\u00f9\u0003L%\u0000\u00f9\u00fa\u0003L%\u0000\u00fa\u00fb\u0003"+
		"L%\u0000\u00fb\u00fc\u0003L%\u0000\u00fc\u00fd\u0003L%\u0000\u00fd\u00ff"+
		"\u0001\u0000\u0000\u0000\u00fe\u00ec\u0001\u0000\u0000\u0000\u00fe\u00ee"+
		"\u0001\u0000\u0000\u0000\u00fe\u00f4\u0001\u0000\u0000\u0000\u00ffI\u0001"+
		"\u0000\u0000\u0000\u0100\u0101\u0005u\u0000\u0000\u0101\u0102\u0003L%"+
		"\u0000\u0102\u0103\u0003L%\u0000\u0103\u0104\u0003L%\u0000\u0104\u0105"+
		"\u0003L%\u0000\u0105K\u0001\u0000\u0000\u0000\u0106\u0107\u0007\u0006"+
		"\u0000\u0000\u0107M\u0001\u0000\u0000\u0000\u0108\u0109\b\u0007\u0000"+
		"\u0000\u0109O\u0001\u0000\u0000\u0000\u010a\u010c\u0007\b\u0000\u0000"+
		"\u010b\u010d\u0007\t\u0000\u0000\u010c\u010b\u0001\u0000\u0000\u0000\u010c"+
		"\u010d\u0001\u0000\u0000\u0000\u010d\u010f\u0001\u0000\u0000\u0000\u010e"+
		"\u0110\u0007\u0004\u0000\u0000\u010f\u010e\u0001\u0000\u0000\u0000\u0110"+
		"\u0111\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0111"+
		"\u0112\u0001\u0000\u0000\u0000\u0112Q\u0001\u0000\u0000\u0000\u0113\u0114"+
		"\u0005-\u0000\u0000\u0114S\u0001\u0000\u0000\u0000\u0115\u0116\u00036"+
		"\u001a\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u0118\u0006)\u0002"+
		"\u0000\u0118U\u0001\u0000\u0000\u0000\u0119\u011b\u0007\u0001\u0000\u0000"+
		"\u011a\u0119\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000"+
		"\u011c\u011a\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000"+
		"\u011d\u011e\u0001\u0000\u0000\u0000\u011e\u011f\u0006*\u0000\u0000\u011f"+
		"W\u0001\u0000\u0000\u0000\u0120\u0122\b\n\u0000\u0000\u0121\u0120\u0001"+
		"\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0121\u0001"+
		"\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124Y\u0001\u0000"+
		"\u0000\u0000\u0014\u0000\u0001]g\u00a5\u00ab\u00ad\u00b5\u00b7\u00bc\u00c1"+
		"\u00c7\u00cb\u00da\u00e4\u00fe\u010c\u0111\u011c\u0123\u0003\u0006\u0000"+
		"\u0000\u0005\u0001\u0000\u0004\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
