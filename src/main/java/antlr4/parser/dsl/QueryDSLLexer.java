// Generated from D:/java-project/antlr4-study/src/main/resources/g4\QueryDSL.g4 by ANTLR 4.10.1
package antlr4.parser.dsl;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QueryDSLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEPARATOR=1, EQ=2, LT=3, LE=4, GT=5, GE=6, SORT=7, LIKE=8, IN=9, PARAM=10, 
		WS=11, SHEBANG=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETTERS", "SEPARATOR", "EQ", "LT", "LE", "GT", "GE", "SORT", "LIKE", 
			"IN", "PARAM", "WS", "SHEBANG"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", null, null, null, null, null, "'=sort='", "'=like='", "'=in='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SEPARATOR", "EQ", "LT", "LE", "GT", "GE", "SORT", "LIKE", "IN", 
			"PARAM", "WS", "SHEBANG"
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


	public QueryDSLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "QueryDSL.g4"; }

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
		"\u0004\u0000\fn\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002&\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003-\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u00045\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005<\b"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006D\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0004\nZ\b\n\u000b\n\f\n[\u0001\u000b\u0004\u000b_\b\u000b\u000b\u000b"+
		"\f\u000b`\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005\fh\b\f"+
		"\n\f\f\fk\t\f\u0001\f\u0001\f\u0000\u0000\r\u0001\u0000\u0003\u0001\u0005"+
		"\u0002\u0007\u0003\t\u0004\u000b\u0005\r\u0006\u000f\u0007\u0011\b\u0013"+
		"\t\u0015\n\u0017\u000b\u0019\f\u0001\u0000\u0003\u0005\u0000(),,09AZa"+
		"z\u0003\u0000\t\n\f\r  \u0002\u0000\n\n\r\rt\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0001\u001b\u0001\u0000\u0000\u0000\u0003"+
		"\u001d\u0001\u0000\u0000\u0000\u0005%\u0001\u0000\u0000\u0000\u0007,\u0001"+
		"\u0000\u0000\u0000\t4\u0001\u0000\u0000\u0000\u000b;\u0001\u0000\u0000"+
		"\u0000\rC\u0001\u0000\u0000\u0000\u000fE\u0001\u0000\u0000\u0000\u0011"+
		"L\u0001\u0000\u0000\u0000\u0013S\u0001\u0000\u0000\u0000\u0015Y\u0001"+
		"\u0000\u0000\u0000\u0017^\u0001\u0000\u0000\u0000\u0019d\u0001\u0000\u0000"+
		"\u0000\u001b\u001c\u0007\u0000\u0000\u0000\u001c\u0002\u0001\u0000\u0000"+
		"\u0000\u001d\u001e\u0005;\u0000\u0000\u001e\u0004\u0001\u0000\u0000\u0000"+
		"\u001f \u0005=\u0000\u0000 !\u0005e\u0000\u0000!\"\u0005q\u0000\u0000"+
		"\"&\u0005=\u0000\u0000#$\u0005=\u0000\u0000$&\u0005=\u0000\u0000%\u001f"+
		"\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000&\u0006\u0001\u0000"+
		"\u0000\u0000\'(\u0005=\u0000\u0000()\u0005l\u0000\u0000)*\u0005t\u0000"+
		"\u0000*-\u0005=\u0000\u0000+-\u0005<\u0000\u0000,\'\u0001\u0000\u0000"+
		"\u0000,+\u0001\u0000\u0000\u0000-\b\u0001\u0000\u0000\u0000./\u0005=\u0000"+
		"\u0000/0\u0005l\u0000\u000001\u0005e\u0000\u000015\u0005=\u0000\u0000"+
		"23\u0005<\u0000\u000035\u0005=\u0000\u00004.\u0001\u0000\u0000\u00004"+
		"2\u0001\u0000\u0000\u00005\n\u0001\u0000\u0000\u000067\u0005=\u0000\u0000"+
		"78\u0005g\u0000\u000089\u0005t\u0000\u00009<\u0005=\u0000\u0000:<\u0005"+
		">\u0000\u0000;6\u0001\u0000\u0000\u0000;:\u0001\u0000\u0000\u0000<\f\u0001"+
		"\u0000\u0000\u0000=>\u0005=\u0000\u0000>?\u0005g\u0000\u0000?@\u0005e"+
		"\u0000\u0000@D\u0005=\u0000\u0000AB\u0005>\u0000\u0000BD\u0005=\u0000"+
		"\u0000C=\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000D\u000e\u0001"+
		"\u0000\u0000\u0000EF\u0005=\u0000\u0000FG\u0005s\u0000\u0000GH\u0005o"+
		"\u0000\u0000HI\u0005r\u0000\u0000IJ\u0005t\u0000\u0000JK\u0005=\u0000"+
		"\u0000K\u0010\u0001\u0000\u0000\u0000LM\u0005=\u0000\u0000MN\u0005l\u0000"+
		"\u0000NO\u0005i\u0000\u0000OP\u0005k\u0000\u0000PQ\u0005e\u0000\u0000"+
		"QR\u0005=\u0000\u0000R\u0012\u0001\u0000\u0000\u0000ST\u0005=\u0000\u0000"+
		"TU\u0005i\u0000\u0000UV\u0005n\u0000\u0000VW\u0005=\u0000\u0000W\u0014"+
		"\u0001\u0000\u0000\u0000XZ\u0003\u0001\u0000\u0000YX\u0001\u0000\u0000"+
		"\u0000Z[\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000"+
		"\u0000\u0000\\\u0016\u0001\u0000\u0000\u0000]_\u0007\u0001\u0000\u0000"+
		"^]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000"+
		"\u0000`a\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0006\u000b"+
		"\u0000\u0000c\u0018\u0001\u0000\u0000\u0000de\u0005#\u0000\u0000ei\u0005"+
		"!\u0000\u0000fh\b\u0002\u0000\u0000gf\u0001\u0000\u0000\u0000hk\u0001"+
		"\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000"+
		"jl\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000lm\u0006\f\u0001\u0000"+
		"m\u001a\u0001\u0000\u0000\u0000\t\u0000%,4;C[`i\u0002\u0006\u0000\u0000"+
		"\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}