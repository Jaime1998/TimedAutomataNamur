// Generated from C:/Users/57310/OneDrive - correounivalle.edu.co/Documentos/Github/TimedAutomataNamur/src/Model/Parser\TALexer.g4 by ANTLR 4.9.1
package Model.Parser;
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
		IDENTIFIER=43, DOUBLE=44, COMMA=45;
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
			"IDENTIFIER", "DIGIT", "DOUBLE", "COMMA"
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
			"'or'", "'||'", "'!'", "'not'", null, null, "','"
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
			"NEQ_LOG", "IDENTIFIER", "DOUBLE", "COMMA"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u0164\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\2\3\2\7\2d\n\2\f\2\16\2g\13\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3r\n\3\f\3\16\3u\13\3\3\3\5\3x\n\3\3\3"+
		"\3\3\3\3\3\3\3\4\6\4\177\n\4\r\4\16\4\u0080\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\""+
		"\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3("+
		"\3(\3(\3)\3)\3)\3*\3*\3+\3+\3+\3+\3,\3,\7,\u0144\n,\f,\16,\u0147\13,\3"+
		"-\3-\3.\6.\u014c\n.\r.\16.\u014d\3.\6.\u0151\n.\r.\16.\u0152\3.\3.\6."+
		"\u0157\n.\r.\16.\u0158\3.\3.\6.\u015d\n.\r.\16.\u015e\5.\u0161\n.\3/\3"+
		"/\4es\2\60\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y\2[.]/\3\2\6\5\2\13\f\17\17"+
		"\"\"\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\2\u016d\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\3_\3\2\2\2\5m\3\2\2\2\7~\3\2\2\2\t\u0084\3\2\2\2\13"+
		"\u0088\3\2\2\2\r\u008e\3\2\2\2\17\u0092\3\2\2\2\21\u009b\3\2\2\2\23\u00a3"+
		"\3\2\2\2\25\u00aa\3\2\2\2\27\u00b4\3\2\2\2\31\u00be\3\2\2\2\33\u00c3\3"+
		"\2\2\2\35\u00ca\3\2\2\2\37\u00d2\3\2\2\2!\u00d9\3\2\2\2#\u00df\3\2\2\2"+
		"%\u00e6\3\2\2\2\'\u00ed\3\2\2\2)\u00f7\3\2\2\2+\u00fd\3\2\2\2-\u0103\3"+
		"\2\2\2/\u0109\3\2\2\2\61\u010b\3\2\2\2\63\u010d\3\2\2\2\65\u010f\3\2\2"+
		"\2\67\u0111\3\2\2\29\u0113\3\2\2\2;\u0115\3\2\2\2=\u0117\3\2\2\2?\u0119"+
		"\3\2\2\2A\u011b\3\2\2\2C\u011d\3\2\2\2E\u0120\3\2\2\2G\u0123\3\2\2\2I"+
		"\u0128\3\2\2\2K\u012e\3\2\2\2M\u0132\3\2\2\2O\u0135\3\2\2\2Q\u0138\3\2"+
		"\2\2S\u013b\3\2\2\2U\u013d\3\2\2\2W\u0141\3\2\2\2Y\u0148\3\2\2\2[\u0160"+
		"\3\2\2\2]\u0162\3\2\2\2_`\7\61\2\2`a\7,\2\2ae\3\2\2\2bd\13\2\2\2cb\3\2"+
		"\2\2dg\3\2\2\2ef\3\2\2\2ec\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\7,\2\2ij\7\61"+
		"\2\2jk\3\2\2\2kl\b\2\2\2l\4\3\2\2\2mn\7\61\2\2no\7\61\2\2os\3\2\2\2pr"+
		"\13\2\2\2qp\3\2\2\2ru\3\2\2\2st\3\2\2\2sq\3\2\2\2tw\3\2\2\2us\3\2\2\2"+
		"vx\7\17\2\2wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\7\f\2\2z{\3\2\2\2{|\b\3\2"+
		"\2|\6\3\2\2\2}\177\t\2\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2"+
		"\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\b\4\2\2\u0083\b\3"+
		"\2\2\2\u0084\u0085\7n\2\2\u0085\u0086\7g\2\2\u0086\u0087\7v\2\2\u0087"+
		"\n\3\2\2\2\u0088\u0089\7r\2\2\u0089\u008a\7t\2\2\u008a\u008b\7k\2\2\u008b"+
		"\u008c\7p\2\2\u008c\u008d\7v\2\2\u008d\f\3\2\2\2\u008e\u008f\7p\2\2\u008f"+
		"\u0090\7w\2\2\u0090\u0091\7o\2\2\u0091\16\3\2\2\2\u0092\u0093\7h\2\2\u0093"+
		"\u0094\7w\2\2\u0094\u0095\7p\2\2\u0095\u0096\7e\2\2\u0096\u0097\7v\2\2"+
		"\u0097\u0098\7k\2\2\u0098\u0099\7q\2\2\u0099\u009a\7p\2\2\u009a\20\3\2"+
		"\2\2\u009b\u009c\7t\2\2\u009c\u009d\7g\2\2\u009d\u009e\7v\2\2\u009e\u009f"+
		"\7w\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7p\2\2\u00a1\u00a2\7u\2\2\u00a2"+
		"\22\3\2\2\2\u00a3\u00a4\7t\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7v\2\2\u00a6"+
		"\u00a7\7w\2\2\u00a7\u00a8\7t\2\2\u00a8\u00a9\7p\2\2\u00a9\24\3\2\2\2\u00aa"+
		"\u00ab\7c\2\2\u00ab\u00ac\7w\2\2\u00ac\u00ad\7v\2\2\u00ad\u00ae\7q\2\2"+
		"\u00ae\u00af\7o\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2"+
		"\7q\2\2\u00b2\u00b3\7p\2\2\u00b3\26\3\2\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6"+
		"\7q\2\2\u00b6\u00b7\7e\2\2\u00b7\u00b8\7c\2\2\u00b8\u00b9\7v\2\2\u00b9"+
		"\u00ba\7k\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bc\7p\2\2\u00bc\u00bd\7u\2\2"+
		"\u00bd\30\3\2\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7p\2\2\u00c0\u00c1\7"+
		"k\2\2\u00c1\u00c2\7v\2\2\u00c2\32\3\2\2\2\u00c3\u00c4\7e\2\2\u00c4\u00c5"+
		"\7n\2\2\u00c5\u00c6\7q\2\2\u00c6\u00c7\7e\2\2\u00c7\u00c8\7m\2\2\u00c8"+
		"\u00c9\7u\2\2\u00c9\34\3\2\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc\7e\2\2\u00cc"+
		"\u00cd\7v\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7q\2\2\u00cf\u00d0\7p\2\2"+
		"\u00d0\u00d1\7u\2\2\u00d1\36\3\2\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4\7"+
		"e\2\2\u00d4\u00d5\7v\2\2\u00d5\u00d6\7k\2\2\u00d6\u00d7\7q\2\2\u00d7\u00d8"+
		"\7p\2\2\u00d8 \3\2\2\2\u00d9\u00da\7g\2\2\u00da\u00db\7f\2\2\u00db\u00dc"+
		"\7i\2\2\u00dc\u00dd\7g\2\2\u00dd\u00de\7u\2\2\u00de\"\3\2\2\2\u00df\u00e0"+
		"\7u\2\2\u00e0\u00e1\7q\2\2\u00e1\u00e2\7w\2\2\u00e2\u00e3\7t\2\2\u00e3"+
		"\u00e4\7e\2\2\u00e4\u00e5\7g\2\2\u00e5$\3\2\2\2\u00e6\u00e7\7v\2\2\u00e7"+
		"\u00e8\7c\2\2\u00e8\u00e9\7t\2\2\u00e9\u00ea\7i\2\2\u00ea\u00eb\7g\2\2"+
		"\u00eb\u00ec\7v\2\2\u00ec&\3\2\2\2\u00ed\u00ee\7k\2\2\u00ee\u00ef\7p\2"+
		"\2\u00ef\u00f0\7x\2\2\u00f0\u00f1\7c\2\2\u00f1\u00f2\7t\2\2\u00f2\u00f3"+
		"\7k\2\2\u00f3\u00f4\7c\2\2\u00f4\u00f5\7p\2\2\u00f5\u00f6\7v\2\2\u00f6"+
		"(\3\2\2\2\u00f7\u00f8\7t\2\2\u00f8\u00f9\7c\2\2\u00f9\u00fa\7v\2\2\u00fa"+
		"\u00fb\7g\2\2\u00fb\u00fc\7u\2\2\u00fc*\3\2\2\2\u00fd\u00fe\7i\2\2\u00fe"+
		"\u00ff\7w\2\2\u00ff\u0100\7c\2\2\u0100\u0101\7t\2\2\u0101\u0102\7f\2\2"+
		"\u0102,\3\2\2\2\u0103\u0104\7t\2\2\u0104\u0105\7g\2\2\u0105\u0106\7u\2"+
		"\2\u0106\u0107\7g\2\2\u0107\u0108\7v\2\2\u0108.\3\2\2\2\u0109\u010a\7"+
		"}\2\2\u010a\60\3\2\2\2\u010b\u010c\7\177\2\2\u010c\62\3\2\2\2\u010d\u010e"+
		"\7*\2\2\u010e\64\3\2\2\2\u010f\u0110\7+\2\2\u0110\66\3\2\2\2\u0111\u0112"+
		"\7?\2\2\u01128\3\2\2\2\u0113\u0114\7<\2\2\u0114:\3\2\2\2\u0115\u0116\7"+
		",\2\2\u0116<\3\2\2\2\u0117\u0118\7\61\2\2\u0118>\3\2\2\2\u0119\u011a\7"+
		"-\2\2\u011a@\3\2\2\2\u011b\u011c\7/\2\2\u011cB\3\2\2\2\u011d\u011e\7>"+
		"\2\2\u011e\u011f\7?\2\2\u011fD\3\2\2\2\u0120\u0121\7@\2\2\u0121\u0122"+
		"\7?\2\2\u0122F\3\2\2\2\u0123\u0124\7v\2\2\u0124\u0125\7t\2\2\u0125\u0126"+
		"\7w\2\2\u0126\u0127\7g\2\2\u0127H\3\2\2\2\u0128\u0129\7h\2\2\u0129\u012a"+
		"\7c\2\2\u012a\u012b\7n\2\2\u012b\u012c\7u\2\2\u012c\u012d\7g\2\2\u012d"+
		"J\3\2\2\2\u012e\u012f\7c\2\2\u012f\u0130\7p\2\2\u0130\u0131\7f\2\2\u0131"+
		"L\3\2\2\2\u0132\u0133\7(\2\2\u0133\u0134\7(\2\2\u0134N\3\2\2\2\u0135\u0136"+
		"\7q\2\2\u0136\u0137\7t\2\2\u0137P\3\2\2\2\u0138\u0139\7~\2\2\u0139\u013a"+
		"\7~\2\2\u013aR\3\2\2\2\u013b\u013c\7#\2\2\u013cT\3\2\2\2\u013d\u013e\7"+
		"p\2\2\u013e\u013f\7q\2\2\u013f\u0140\7v\2\2\u0140V\3\2\2\2\u0141\u0145"+
		"\t\3\2\2\u0142\u0144\t\4\2\2\u0143\u0142\3\2\2\2\u0144\u0147\3\2\2\2\u0145"+
		"\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146X\3\2\2\2\u0147\u0145\3\2\2\2"+
		"\u0148\u0149\t\5\2\2\u0149Z\3\2\2\2\u014a\u014c\5Y-\2\u014b\u014a\3\2"+
		"\2\2\u014c\u014d\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\u0161\3\2\2\2\u014f\u0151\5Y-\2\u0150\u014f\3\2\2\2\u0151\u0152\3\2\2"+
		"\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0156"+
		"\7\60\2\2\u0155\u0157\5Y-\2\u0156\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158"+
		"\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u0161\3\2\2\2\u015a\u015c\7\60"+
		"\2\2\u015b\u015d\5Y-\2\u015c\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015c"+
		"\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0161\3\2\2\2\u0160\u014b\3\2\2\2\u0160"+
		"\u0150\3\2\2\2\u0160\u015a\3\2\2\2\u0161\\\3\2\2\2\u0162\u0163\7.\2\2"+
		"\u0163^\3\2\2\2\r\2esw\u0080\u0145\u014d\u0152\u0158\u015e\u0160\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}