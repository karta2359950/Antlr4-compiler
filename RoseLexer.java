// Generated from Rose.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RoseLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, CONST=2, WHITESPACE=3, COMMENT=4, BEGIN=5, DECLARE=6, ELSE=7, END=8, 
		EXIT=9, FOR=10, IF=11, IN=12, INTEGER=13, IS=14, LOOP=15, PROCEDURE=16, 
		READ=17, THEN=18, WRITE=19, COL=20, TPR=21, TCOL=22, ADD=23, SUBTRACT=24, 
		MULTIPLY=25, DIVIDE=26, PERCENT=27, EQ=28, GT=29, LT=30, AND=31, DOUBLELINE=32, 
		EXCLAMATION=33, COLEQUAL=34, UPPAREN=35, DOWNPAREN=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ID", "CONST", "WHITESPACE", "COMMENT", "BEGIN", "DECLARE", "ELSE", "END", 
			"EXIT", "FOR", "IF", "IN", "INTEGER", "IS", "LOOP", "PROCEDURE", "READ", 
			"THEN", "WRITE", "COL", "TPR", "TCOL", "ADD", "SUBTRACT", "MULTIPLY", 
			"DIVIDE", "PERCENT", "EQ", "GT", "LT", "AND", "DOUBLELINE", "EXCLAMATION", 
			"COLEQUAL", "UPPAREN", "DOWNPAREN"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'begin'", "'declare'", "'else'", "'end'", 
			"'exit'", "'for'", "'if'", "'in'", "'integer'", "'is'", "'loop'", "'procedure'", 
			"'read'", "'then'", "'write'", "':'", "'..'", "';'", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'='", "'>'", "'<'", "'&&'", "'||'", "'!'", "':='", "'('", 
			"')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ID", "CONST", "WHITESPACE", "COMMENT", "BEGIN", "DECLARE", "ELSE", 
			"END", "EXIT", "FOR", "IF", "IN", "INTEGER", "IS", "LOOP", "PROCEDURE", 
			"READ", "THEN", "WRITE", "COL", "TPR", "TCOL", "ADD", "SUBTRACT", "MULTIPLY", 
			"DIVIDE", "PERCENT", "EQ", "GT", "LT", "AND", "DOUBLELINE", "EXCLAMATION", 
			"COLEQUAL", "UPPAREN", "DOWNPAREN"
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


	public RoseLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Rose.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u00f0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\5\2M\n\2\3\2\7\2P\n\2\f\2\16\2S\13\2"+
		"\3\3\6\3V\n\3\r\3\16\3W\3\3\3\3\7\3\\\n\3\f\3\16\3_\13\3\5\3a\n\3\3\4"+
		"\6\4d\n\4\r\4\16\4e\3\4\5\4i\n\4\3\4\5\4l\n\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\7\5t\n\5\f\5\16\5w\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3"+
		"\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3"+
		"\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3%\3"+
		"%\2\2&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\"C#E$G%I&\3\2\b\4\2C\\aa\5\2\62;C\\aa\3\2\63;\3\2\62;\4"+
		"\2\13\13\"\"\4\2\f\f\17\17\2\u00f7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3L\3\2\2\2\5`\3\2\2\2\7"+
		"k\3\2\2\2\to\3\2\2\2\13z\3\2\2\2\r\u0080\3\2\2\2\17\u0088\3\2\2\2\21\u008d"+
		"\3\2\2\2\23\u0091\3\2\2\2\25\u0096\3\2\2\2\27\u009a\3\2\2\2\31\u009d\3"+
		"\2\2\2\33\u00a0\3\2\2\2\35\u00a8\3\2\2\2\37\u00ab\3\2\2\2!\u00b0\3\2\2"+
		"\2#\u00ba\3\2\2\2%\u00bf\3\2\2\2\'\u00c4\3\2\2\2)\u00ca\3\2\2\2+\u00cc"+
		"\3\2\2\2-\u00cf\3\2\2\2/\u00d1\3\2\2\2\61\u00d3\3\2\2\2\63\u00d5\3\2\2"+
		"\2\65\u00d7\3\2\2\2\67\u00d9\3\2\2\29\u00db\3\2\2\2;\u00dd\3\2\2\2=\u00df"+
		"\3\2\2\2?\u00e1\3\2\2\2A\u00e4\3\2\2\2C\u00e7\3\2\2\2E\u00e9\3\2\2\2G"+
		"\u00ec\3\2\2\2I\u00ee\3\2\2\2KM\t\2\2\2LK\3\2\2\2MQ\3\2\2\2NP\t\3\2\2"+
		"ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\4\3\2\2\2SQ\3\2\2\2TV\7\62\2"+
		"\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2Xa\3\2\2\2Y]\t\4\2\2Z\\\t\5"+
		"\2\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^a\3\2\2\2_]\3\2\2\2`U\3"+
		"\2\2\2`Y\3\2\2\2a\6\3\2\2\2bd\t\6\2\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2ef"+
		"\3\2\2\2fl\3\2\2\2gi\7\17\2\2hg\3\2\2\2hi\3\2\2\2ij\3\2\2\2jl\7\f\2\2"+
		"kc\3\2\2\2kh\3\2\2\2lm\3\2\2\2mn\b\4\2\2n\b\3\2\2\2op\7\61\2\2pq\7\61"+
		"\2\2qu\3\2\2\2rt\n\7\2\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2"+
		"\2\2wu\3\2\2\2xy\b\5\2\2y\n\3\2\2\2z{\7d\2\2{|\7g\2\2|}\7i\2\2}~\7k\2"+
		"\2~\177\7p\2\2\177\f\3\2\2\2\u0080\u0081\7f\2\2\u0081\u0082\7g\2\2\u0082"+
		"\u0083\7e\2\2\u0083\u0084\7n\2\2\u0084\u0085\7c\2\2\u0085\u0086\7t\2\2"+
		"\u0086\u0087\7g\2\2\u0087\16\3\2\2\2\u0088\u0089\7g\2\2\u0089\u008a\7"+
		"n\2\2\u008a\u008b\7u\2\2\u008b\u008c\7g\2\2\u008c\20\3\2\2\2\u008d\u008e"+
		"\7g\2\2\u008e\u008f\7p\2\2\u008f\u0090\7f\2\2\u0090\22\3\2\2\2\u0091\u0092"+
		"\7g\2\2\u0092\u0093\7z\2\2\u0093\u0094\7k\2\2\u0094\u0095\7v\2\2\u0095"+
		"\24\3\2\2\2\u0096\u0097\7h\2\2\u0097\u0098\7q\2\2\u0098\u0099\7t\2\2\u0099"+
		"\26\3\2\2\2\u009a\u009b\7k\2\2\u009b\u009c\7h\2\2\u009c\30\3\2\2\2\u009d"+
		"\u009e\7k\2\2\u009e\u009f\7p\2\2\u009f\32\3\2\2\2\u00a0\u00a1\7k\2\2\u00a1"+
		"\u00a2\7p\2\2\u00a2\u00a3\7v\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7i\2\2"+
		"\u00a5\u00a6\7g\2\2\u00a6\u00a7\7t\2\2\u00a7\34\3\2\2\2\u00a8\u00a9\7"+
		"k\2\2\u00a9\u00aa\7u\2\2\u00aa\36\3\2\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ad"+
		"\7q\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af\7r\2\2\u00af \3\2\2\2\u00b0\u00b1"+
		"\7r\2\2\u00b1\u00b2\7t\2\2\u00b2\u00b3\7q\2\2\u00b3\u00b4\7e\2\2\u00b4"+
		"\u00b5\7g\2\2\u00b5\u00b6\7f\2\2\u00b6\u00b7\7w\2\2\u00b7\u00b8\7t\2\2"+
		"\u00b8\u00b9\7g\2\2\u00b9\"\3\2\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7g"+
		"\2\2\u00bc\u00bd\7c\2\2\u00bd\u00be\7f\2\2\u00be$\3\2\2\2\u00bf\u00c0"+
		"\7v\2\2\u00c0\u00c1\7j\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7p\2\2\u00c3"+
		"&\3\2\2\2\u00c4\u00c5\7y\2\2\u00c5\u00c6\7t\2\2\u00c6\u00c7\7k\2\2\u00c7"+
		"\u00c8\7v\2\2\u00c8\u00c9\7g\2\2\u00c9(\3\2\2\2\u00ca\u00cb\7<\2\2\u00cb"+
		"*\3\2\2\2\u00cc\u00cd\7\60\2\2\u00cd\u00ce\7\60\2\2\u00ce,\3\2\2\2\u00cf"+
		"\u00d0\7=\2\2\u00d0.\3\2\2\2\u00d1\u00d2\7-\2\2\u00d2\60\3\2\2\2\u00d3"+
		"\u00d4\7/\2\2\u00d4\62\3\2\2\2\u00d5\u00d6\7,\2\2\u00d6\64\3\2\2\2\u00d7"+
		"\u00d8\7\61\2\2\u00d8\66\3\2\2\2\u00d9\u00da\7\'\2\2\u00da8\3\2\2\2\u00db"+
		"\u00dc\7?\2\2\u00dc:\3\2\2\2\u00dd\u00de\7@\2\2\u00de<\3\2\2\2\u00df\u00e0"+
		"\7>\2\2\u00e0>\3\2\2\2\u00e1\u00e2\7(\2\2\u00e2\u00e3\7(\2\2\u00e3@\3"+
		"\2\2\2\u00e4\u00e5\7~\2\2\u00e5\u00e6\7~\2\2\u00e6B\3\2\2\2\u00e7\u00e8"+
		"\7#\2\2\u00e8D\3\2\2\2\u00e9\u00ea\7<\2\2\u00ea\u00eb\7?\2\2\u00ebF\3"+
		"\2\2\2\u00ec\u00ed\7*\2\2\u00edH\3\2\2\2\u00ee\u00ef\7+\2\2\u00efJ\3\2"+
		"\2\2\r\2LOQW]`ehku\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}