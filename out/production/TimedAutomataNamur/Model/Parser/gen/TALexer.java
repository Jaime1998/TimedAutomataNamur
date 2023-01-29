// Generated from C:/Users/Jaime/OneDrive - correounivalle.edu.co/Documentos/Github/TimedAutomataNamur/out/production/TimedAutomataNamur/Model/Parser\TALexer.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TALexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, COMMENT_LINE=2, WS=3, LET=4, PRINT=5, NUM=6, FUNCTION=7, RETURNS=8, 
		RETURN=9, AUTOMATON=10, LOCATION=11, INIT=12, CLOCK=13, ACTIONS=14, ACTION=15, 
		EDGES=16, SOURCE=17, TARGET=18, INVARIANT=19, RATES=20, GUARD=21, RESET=22, 
		L_C_BRACKET=23, R_C_BRACKET=24, L_PARENTHESIS=25, R_PARENTHESIS=26, EQUAL=27, 
		COLON=28, MUL=29, DIV=30, ADD=31, SUB=32, LESS_EQ=33, GREATER_EQ=34, TRUE=35, 
		FALSE=36, AND=37, AND_SYMBOL=38, OR=39, OR_SYMBOL=40, NEQ_MARK=41, NEQ_LOG=42, 
		DERIVATE=43, IDENTIFIER=44, DOUBLE=45, COMMA=46;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMMENT", "COMMENT_LINE", "WS", "LET", "PRINT", "NUM", "FUNCTION", "RETURNS", 
			"RETURN", "AUTOMATON", "LOCATION", "INIT", "CLOCK", "ACTIONS", "ACTION", 
			"EDGES", "SOURCE", "TARGET", "INVARIANT", "RATES", "GUARD", "RESET", 
			"L_C_BRACKET", "R_C_BRACKET", "L_PARENTHESIS", "R_PARENTHESIS", "EQUAL", 
			"COLON", "MUL", "DIV", "ADD", "SUB", "LESS_EQ", "GREATER_EQ", "TRUE", 
			"FALSE", "AND", "AND_SYMBOL", "OR", "OR_SYMBOL", "NEQ_MARK", "NEQ_LOG", 
			"DERIVATE", "IDENTIFIER", "DIGIT", "DOUBLE", "COMMA"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'let'", "'print'", "'num'", "'function'", "'returns'", 
			"'return'", "'automaton'", "'locations'", "'init'", "'clocks'", "'actions'", 
			"'action'", "'edges'", "'source'", "'target'", "'invariant'", "'rates'", 
			"'guard'", "'reset'", "'{'", "'}'", "'('", "')'", "'='", "':'", "'*'", 
			"'/'", "'+'", "'-'", "'<='", "'>='", "'true'", "'false'", "'and'", "'&&'", 
			"'or'", "'||'", "'!'", "'not'", "'''", null, null, "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "COMMENT_LINE", "WS", "LET", "PRINT", "NUM", "FUNCTION", 
			"RETURNS", "RETURN", "AUTOMATON", "LOCATION", "INIT", "CLOCK", "ACTIONS", 
			"ACTION", "EDGES", "SOURCE", "TARGET", "INVARIANT", "RATES", "GUARD", 
			"RESET", "L_C_BRACKET", "R_C_BRACKET", "L_PARENTHESIS", "R_PARENTHESIS", 
			"EQUAL", "COLON", "MUL", "DIV", "ADD", "SUB", "LESS_EQ", "GREATER_EQ", 
			"TRUE", "FALSE", "AND", "AND_SYMBOL", "OR", "OR_SYMBOL", "NEQ_MARK", 
			"NEQ_LOG", "DERIVATE", "IDENTIFIER", "DOUBLE", "COMMA"
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


	public TALexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TALexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u0168\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\2\7\2f\n\2\f\2\16\2"+
		"i\13\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3t\n\3\f\3\16\3w\13\3\3\3"+
		"\5\3z\n\3\3\3\3\3\3\3\3\3\3\4\6\4\u0081\n\4\r\4\16\4\u0082\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3"+
		"\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3"+
		"!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3"+
		"\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3+\3+\3+\3+\3,\3,\3-\3-\7-\u0148\n"+
		"-\f-\16-\u014b\13-\3.\3.\3/\6/\u0150\n/\r/\16/\u0151\3/\6/\u0155\n/\r"+
		"/\16/\u0156\3/\3/\6/\u015b\n/\r/\16/\u015c\3/\3/\6/\u0161\n/\r/\16/\u0162"+
		"\5/\u0165\n/\3\60\3\60\4gu\2\61\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[\2]/"+
		"_\60\3\2\6\5\2\13\f\17\17\"\"\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\2\u0171"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3a\3\2\2\2\5o\3"+
		"\2\2\2\7\u0080\3\2\2\2\t\u0086\3\2\2\2\13\u008a\3\2\2\2\r\u0090\3\2\2"+
		"\2\17\u0094\3\2\2\2\21\u009d\3\2\2\2\23\u00a5\3\2\2\2\25\u00ac\3\2\2\2"+
		"\27\u00b6\3\2\2\2\31\u00c0\3\2\2\2\33\u00c5\3\2\2\2\35\u00cc\3\2\2\2\37"+
		"\u00d4\3\2\2\2!\u00db\3\2\2\2#\u00e1\3\2\2\2%\u00e8\3\2\2\2\'\u00ef\3"+
		"\2\2\2)\u00f9\3\2\2\2+\u00ff\3\2\2\2-\u0105\3\2\2\2/\u010b\3\2\2\2\61"+
		"\u010d\3\2\2\2\63\u010f\3\2\2\2\65\u0111\3\2\2\2\67\u0113\3\2\2\29\u0115"+
		"\3\2\2\2;\u0117\3\2\2\2=\u0119\3\2\2\2?\u011b\3\2\2\2A\u011d\3\2\2\2C"+
		"\u011f\3\2\2\2E\u0122\3\2\2\2G\u0125\3\2\2\2I\u012a\3\2\2\2K\u0130\3\2"+
		"\2\2M\u0134\3\2\2\2O\u0137\3\2\2\2Q\u013a\3\2\2\2S\u013d\3\2\2\2U\u013f"+
		"\3\2\2\2W\u0143\3\2\2\2Y\u0145\3\2\2\2[\u014c\3\2\2\2]\u0164\3\2\2\2_"+
		"\u0166\3\2\2\2ab\7\61\2\2bc\7,\2\2cg\3\2\2\2df\13\2\2\2ed\3\2\2\2fi\3"+
		"\2\2\2gh\3\2\2\2ge\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\7,\2\2kl\7\61\2\2lm\3"+
		"\2\2\2mn\b\2\2\2n\4\3\2\2\2op\7\61\2\2pq\7\61\2\2qu\3\2\2\2rt\13\2\2\2"+
		"sr\3\2\2\2tw\3\2\2\2uv\3\2\2\2us\3\2\2\2vy\3\2\2\2wu\3\2\2\2xz\7\17\2"+
		"\2yx\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\7\f\2\2|}\3\2\2\2}~\b\3\2\2~\6\3\2"+
		"\2\2\177\u0081\t\2\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\b\4\2\2\u0085"+
		"\b\3\2\2\2\u0086\u0087\7n\2\2\u0087\u0088\7g\2\2\u0088\u0089\7v\2\2\u0089"+
		"\n\3\2\2\2\u008a\u008b\7r\2\2\u008b\u008c\7t\2\2\u008c\u008d\7k\2\2\u008d"+
		"\u008e\7p\2\2\u008e\u008f\7v\2\2\u008f\f\3\2\2\2\u0090\u0091\7p\2\2\u0091"+
		"\u0092\7w\2\2\u0092\u0093\7o\2\2\u0093\16\3\2\2\2\u0094\u0095\7h\2\2\u0095"+
		"\u0096\7w\2\2\u0096\u0097\7p\2\2\u0097\u0098\7e\2\2\u0098\u0099\7v\2\2"+
		"\u0099\u009a\7k\2\2\u009a\u009b\7q\2\2\u009b\u009c\7p\2\2\u009c\20\3\2"+
		"\2\2\u009d\u009e\7t\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7v\2\2\u00a0\u00a1"+
		"\7w\2\2\u00a1\u00a2\7t\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a4\7u\2\2\u00a4"+
		"\22\3\2\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7v\2\2\u00a8"+
		"\u00a9\7w\2\2\u00a9\u00aa\7t\2\2\u00aa\u00ab\7p\2\2\u00ab\24\3\2\2\2\u00ac"+
		"\u00ad\7c\2\2\u00ad\u00ae\7w\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7q\2\2"+
		"\u00b0\u00b1\7o\2\2\u00b1\u00b2\7c\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b4"+
		"\7q\2\2\u00b4\u00b5\7p\2\2\u00b5\26\3\2\2\2\u00b6\u00b7\7n\2\2\u00b7\u00b8"+
		"\7q\2\2\u00b8\u00b9\7e\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7v\2\2\u00bb"+
		"\u00bc\7k\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7p\2\2\u00be\u00bf\7u\2\2"+
		"\u00bf\30\3\2\2\2\u00c0\u00c1\7k\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3\7"+
		"k\2\2\u00c3\u00c4\7v\2\2\u00c4\32\3\2\2\2\u00c5\u00c6\7e\2\2\u00c6\u00c7"+
		"\7n\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9\7e\2\2\u00c9\u00ca\7m\2\2\u00ca"+
		"\u00cb\7u\2\2\u00cb\34\3\2\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce\7e\2\2\u00ce"+
		"\u00cf\7v\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1\7q\2\2\u00d1\u00d2\7p\2\2"+
		"\u00d2\u00d3\7u\2\2\u00d3\36\3\2\2\2\u00d4\u00d5\7c\2\2\u00d5\u00d6\7"+
		"e\2\2\u00d6\u00d7\7v\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9\7q\2\2\u00d9\u00da"+
		"\7p\2\2\u00da \3\2\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd\7f\2\2\u00dd\u00de"+
		"\7i\2\2\u00de\u00df\7g\2\2\u00df\u00e0\7u\2\2\u00e0\"\3\2\2\2\u00e1\u00e2"+
		"\7u\2\2\u00e2\u00e3\7q\2\2\u00e3\u00e4\7w\2\2\u00e4\u00e5\7t\2\2\u00e5"+
		"\u00e6\7e\2\2\u00e6\u00e7\7g\2\2\u00e7$\3\2\2\2\u00e8\u00e9\7v\2\2\u00e9"+
		"\u00ea\7c\2\2\u00ea\u00eb\7t\2\2\u00eb\u00ec\7i\2\2\u00ec\u00ed\7g\2\2"+
		"\u00ed\u00ee\7v\2\2\u00ee&\3\2\2\2\u00ef\u00f0\7k\2\2\u00f0\u00f1\7p\2"+
		"\2\u00f1\u00f2\7x\2\2\u00f2\u00f3\7c\2\2\u00f3\u00f4\7t\2\2\u00f4\u00f5"+
		"\7k\2\2\u00f5\u00f6\7c\2\2\u00f6\u00f7\7p\2\2\u00f7\u00f8\7v\2\2\u00f8"+
		"(\3\2\2\2\u00f9\u00fa\7t\2\2\u00fa\u00fb\7c\2\2\u00fb\u00fc\7v\2\2\u00fc"+
		"\u00fd\7g\2\2\u00fd\u00fe\7u\2\2\u00fe*\3\2\2\2\u00ff\u0100\7i\2\2\u0100"+
		"\u0101\7w\2\2\u0101\u0102\7c\2\2\u0102\u0103\7t\2\2\u0103\u0104\7f\2\2"+
		"\u0104,\3\2\2\2\u0105\u0106\7t\2\2\u0106\u0107\7g\2\2\u0107\u0108\7u\2"+
		"\2\u0108\u0109\7g\2\2\u0109\u010a\7v\2\2\u010a.\3\2\2\2\u010b\u010c\7"+
		"}\2\2\u010c\60\3\2\2\2\u010d\u010e\7\177\2\2\u010e\62\3\2\2\2\u010f\u0110"+
		"\7*\2\2\u0110\64\3\2\2\2\u0111\u0112\7+\2\2\u0112\66\3\2\2\2\u0113\u0114"+
		"\7?\2\2\u01148\3\2\2\2\u0115\u0116\7<\2\2\u0116:\3\2\2\2\u0117\u0118\7"+
		",\2\2\u0118<\3\2\2\2\u0119\u011a\7\61\2\2\u011a>\3\2\2\2\u011b\u011c\7"+
		"-\2\2\u011c@\3\2\2\2\u011d\u011e\7/\2\2\u011eB\3\2\2\2\u011f\u0120\7>"+
		"\2\2\u0120\u0121\7?\2\2\u0121D\3\2\2\2\u0122\u0123\7@\2\2\u0123\u0124"+
		"\7?\2\2\u0124F\3\2\2\2\u0125\u0126\7v\2\2\u0126\u0127\7t\2\2\u0127\u0128"+
		"\7w\2\2\u0128\u0129\7g\2\2\u0129H\3\2\2\2\u012a\u012b\7h\2\2\u012b\u012c"+
		"\7c\2\2\u012c\u012d\7n\2\2\u012d\u012e\7u\2\2\u012e\u012f\7g\2\2\u012f"+
		"J\3\2\2\2\u0130\u0131\7c\2\2\u0131\u0132\7p\2\2\u0132\u0133\7f\2\2\u0133"+
		"L\3\2\2\2\u0134\u0135\7(\2\2\u0135\u0136\7(\2\2\u0136N\3\2\2\2\u0137\u0138"+
		"\7q\2\2\u0138\u0139\7t\2\2\u0139P\3\2\2\2\u013a\u013b\7~\2\2\u013b\u013c"+
		"\7~\2\2\u013cR\3\2\2\2\u013d\u013e\7#\2\2\u013eT\3\2\2\2\u013f\u0140\7"+
		"p\2\2\u0140\u0141\7q\2\2\u0141\u0142\7v\2\2\u0142V\3\2\2\2\u0143\u0144"+
		"\7)\2\2\u0144X\3\2\2\2\u0145\u0149\t\3\2\2\u0146\u0148\t\4\2\2\u0147\u0146"+
		"\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"Z\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014d\t\5\2\2\u014d\\\3\2\2\2\u014e"+
		"\u0150\5[.\2\u014f\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u014f\3\2\2"+
		"\2\u0151\u0152\3\2\2\2\u0152\u0165\3\2\2\2\u0153\u0155\5[.\2\u0154\u0153"+
		"\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157"+
		"\u0158\3\2\2\2\u0158\u015a\7\60\2\2\u0159\u015b\5[.\2\u015a\u0159\3\2"+
		"\2\2\u015b\u015c\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"\u0165\3\2\2\2\u015e\u0160\7\60\2\2\u015f\u0161\5[.\2\u0160\u015f\3\2"+
		"\2\2\u0161\u0162\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		"\u0165\3\2\2\2\u0164\u014f\3\2\2\2\u0164\u0154\3\2\2\2\u0164\u015e\3\2"+
		"\2\2\u0165^\3\2\2\2\u0166\u0167\7.\2\2\u0167`\3\2\2\2\r\2guy\u0082\u0149"+
		"\u0151\u0156\u015c\u0162\u0164\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}