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
		RETURN=9, AUTOMATON=10, LOCATION=11, CLOCK=12, ACTION=13, EDGES=14, INVARIANT=15, 
		GUARD=16, RESET=17, L_C_BRACKET=18, R_C_BRACKET=19, L_PARENTHESIS=20, 
		R_PARENTHESIS=21, EQUAL=22, COLON=23, MUL=24, DIV=25, ADD=26, SUB=27, 
		LESS_EQ=28, GREATER_EQ=29, TRUE=30, FALSE=31, AND=32, AND_SYMBOL=33, OR=34, 
		OR_SYMBOL=35, NEQ_MARK=36, NEQ_LOG=37, IDENTIFIER=38, DOUBLE=39, COMMA=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMMENT", "COMMENT_LINE", "WS", "LET", "PRINT", "NUM", "FUNCTION", "RETURNS", 
			"RETURN", "AUTOMATON", "LOCATION", "CLOCK", "ACTION", "EDGES", "INVARIANT", 
			"GUARD", "RESET", "L_C_BRACKET", "R_C_BRACKET", "L_PARENTHESIS", "R_PARENTHESIS", 
			"EQUAL", "COLON", "MUL", "DIV", "ADD", "SUB", "LESS_EQ", "GREATER_EQ", 
			"TRUE", "FALSE", "AND", "AND_SYMBOL", "OR", "OR_SYMBOL", "NEQ_MARK", 
			"NEQ_LOG", "IDENTIFIER", "DIGIT", "DOUBLE", "COMMA"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'let'", "'print'", "'num'", "'function'", "'returns'", 
			"'return'", "'automaton'", "'locations'", "'clocks'", "'actions'", "'edges'", 
			"'invariant'", "'guard'", "'reset'", "'{'", "'}'", "'('", "')'", "'='", 
			"':'", "'*'", "'/'", "'+'", "'-'", "'<='", "'>='", "'true'", "'false'", 
			"'and'", "'&&'", "'or'", "'||'", "'!'", "'not'", null, null, "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "COMMENT_LINE", "WS", "LET", "PRINT", "NUM", "FUNCTION", 
			"RETURNS", "RETURN", "AUTOMATON", "LOCATION", "CLOCK", "ACTION", "EDGES", 
			"INVARIANT", "GUARD", "RESET", "L_C_BRACKET", "R_C_BRACKET", "L_PARENTHESIS", 
			"R_PARENTHESIS", "EQUAL", "COLON", "MUL", "DIV", "ADD", "SUB", "LESS_EQ", 
			"GREATER_EQ", "TRUE", "FALSE", "AND", "AND_SYMBOL", "OR", "OR_SYMBOL", 
			"NEQ_MARK", "NEQ_LOG", "IDENTIFIER", "DOUBLE", "COMMA"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u013a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\7\2Z\n\2\f\2\16\2]\13\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7"+
		"\3h\n\3\f\3\16\3k\13\3\3\3\5\3n\n\3\3\3\3\3\3\3\3\3\3\4\6\4u\n\4\r\4\16"+
		"\4v\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 "+
		"\3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3&\3&\3&\3&"+
		"\3\'\3\'\7\'\u011a\n\'\f\'\16\'\u011d\13\'\3(\3(\3)\6)\u0122\n)\r)\16"+
		")\u0123\3)\6)\u0127\n)\r)\16)\u0128\3)\3)\6)\u012d\n)\r)\16)\u012e\3)"+
		"\3)\6)\u0133\n)\r)\16)\u0134\5)\u0137\n)\3*\3*\4[i\2+\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K"+
		"\'M(O\2Q)S*\3\2\6\5\2\13\f\17\17\"\"\5\2C\\aac|\6\2\62;C\\aac|\3\2\62"+
		";\2\u0143\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3U"+
		"\3\2\2\2\5c\3\2\2\2\7t\3\2\2\2\tz\3\2\2\2\13~\3\2\2\2\r\u0084\3\2\2\2"+
		"\17\u0088\3\2\2\2\21\u0091\3\2\2\2\23\u0099\3\2\2\2\25\u00a0\3\2\2\2\27"+
		"\u00aa\3\2\2\2\31\u00b4\3\2\2\2\33\u00bb\3\2\2\2\35\u00c3\3\2\2\2\37\u00c9"+
		"\3\2\2\2!\u00d3\3\2\2\2#\u00d9\3\2\2\2%\u00df\3\2\2\2\'\u00e1\3\2\2\2"+
		")\u00e3\3\2\2\2+\u00e5\3\2\2\2-\u00e7\3\2\2\2/\u00e9\3\2\2\2\61\u00eb"+
		"\3\2\2\2\63\u00ed\3\2\2\2\65\u00ef\3\2\2\2\67\u00f1\3\2\2\29\u00f3\3\2"+
		"\2\2;\u00f6\3\2\2\2=\u00f9\3\2\2\2?\u00fe\3\2\2\2A\u0104\3\2\2\2C\u0108"+
		"\3\2\2\2E\u010b\3\2\2\2G\u010e\3\2\2\2I\u0111\3\2\2\2K\u0113\3\2\2\2M"+
		"\u0117\3\2\2\2O\u011e\3\2\2\2Q\u0136\3\2\2\2S\u0138\3\2\2\2UV\7\61\2\2"+
		"VW\7,\2\2W[\3\2\2\2XZ\13\2\2\2YX\3\2\2\2Z]\3\2\2\2[\\\3\2\2\2[Y\3\2\2"+
		"\2\\^\3\2\2\2][\3\2\2\2^_\7,\2\2_`\7\61\2\2`a\3\2\2\2ab\b\2\2\2b\4\3\2"+
		"\2\2cd\7\61\2\2de\7\61\2\2ei\3\2\2\2fh\13\2\2\2gf\3\2\2\2hk\3\2\2\2ij"+
		"\3\2\2\2ig\3\2\2\2jm\3\2\2\2ki\3\2\2\2ln\7\17\2\2ml\3\2\2\2mn\3\2\2\2"+
		"no\3\2\2\2op\7\f\2\2pq\3\2\2\2qr\b\3\2\2r\6\3\2\2\2su\t\2\2\2ts\3\2\2"+
		"\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\b\4\2\2y\b\3\2\2\2z{\7n\2"+
		"\2{|\7g\2\2|}\7v\2\2}\n\3\2\2\2~\177\7r\2\2\177\u0080\7t\2\2\u0080\u0081"+
		"\7k\2\2\u0081\u0082\7p\2\2\u0082\u0083\7v\2\2\u0083\f\3\2\2\2\u0084\u0085"+
		"\7p\2\2\u0085\u0086\7w\2\2\u0086\u0087\7o\2\2\u0087\16\3\2\2\2\u0088\u0089"+
		"\7h\2\2\u0089\u008a\7w\2\2\u008a\u008b\7p\2\2\u008b\u008c\7e\2\2\u008c"+
		"\u008d\7v\2\2\u008d\u008e\7k\2\2\u008e\u008f\7q\2\2\u008f\u0090\7p\2\2"+
		"\u0090\20\3\2\2\2\u0091\u0092\7t\2\2\u0092\u0093\7g\2\2\u0093\u0094\7"+
		"v\2\2\u0094\u0095\7w\2\2\u0095\u0096\7t\2\2\u0096\u0097\7p\2\2\u0097\u0098"+
		"\7u\2\2\u0098\22\3\2\2\2\u0099\u009a\7t\2\2\u009a\u009b\7g\2\2\u009b\u009c"+
		"\7v\2\2\u009c\u009d\7w\2\2\u009d\u009e\7t\2\2\u009e\u009f\7p\2\2\u009f"+
		"\24\3\2\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2\7w\2\2\u00a2\u00a3\7v\2\2\u00a3"+
		"\u00a4\7q\2\2\u00a4\u00a5\7o\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7v\2\2"+
		"\u00a7\u00a8\7q\2\2\u00a8\u00a9\7p\2\2\u00a9\26\3\2\2\2\u00aa\u00ab\7"+
		"n\2\2\u00ab\u00ac\7q\2\2\u00ac\u00ad\7e\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af"+
		"\7v\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2\7p\2\2\u00b2"+
		"\u00b3\7u\2\2\u00b3\30\3\2\2\2\u00b4\u00b5\7e\2\2\u00b5\u00b6\7n\2\2\u00b6"+
		"\u00b7\7q\2\2\u00b7\u00b8\7e\2\2\u00b8\u00b9\7m\2\2\u00b9\u00ba\7u\2\2"+
		"\u00ba\32\3\2\2\2\u00bb\u00bc\7c\2\2\u00bc\u00bd\7e\2\2\u00bd\u00be\7"+
		"v\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1\7p\2\2\u00c1\u00c2"+
		"\7u\2\2\u00c2\34\3\2\2\2\u00c3\u00c4\7g\2\2\u00c4\u00c5\7f\2\2\u00c5\u00c6"+
		"\7i\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7u\2\2\u00c8\36\3\2\2\2\u00c9\u00ca"+
		"\7k\2\2\u00ca\u00cb\7p\2\2\u00cb\u00cc\7x\2\2\u00cc\u00cd\7c\2\2\u00cd"+
		"\u00ce\7t\2\2\u00ce\u00cf\7k\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1\7p\2\2"+
		"\u00d1\u00d2\7v\2\2\u00d2 \3\2\2\2\u00d3\u00d4\7i\2\2\u00d4\u00d5\7w\2"+
		"\2\u00d5\u00d6\7c\2\2\u00d6\u00d7\7t\2\2\u00d7\u00d8\7f\2\2\u00d8\"\3"+
		"\2\2\2\u00d9\u00da\7t\2\2\u00da\u00db\7g\2\2\u00db\u00dc\7u\2\2\u00dc"+
		"\u00dd\7g\2\2\u00dd\u00de\7v\2\2\u00de$\3\2\2\2\u00df\u00e0\7}\2\2\u00e0"+
		"&\3\2\2\2\u00e1\u00e2\7\177\2\2\u00e2(\3\2\2\2\u00e3\u00e4\7*\2\2\u00e4"+
		"*\3\2\2\2\u00e5\u00e6\7+\2\2\u00e6,\3\2\2\2\u00e7\u00e8\7?\2\2\u00e8."+
		"\3\2\2\2\u00e9\u00ea\7<\2\2\u00ea\60\3\2\2\2\u00eb\u00ec\7,\2\2\u00ec"+
		"\62\3\2\2\2\u00ed\u00ee\7\61\2\2\u00ee\64\3\2\2\2\u00ef\u00f0\7-\2\2\u00f0"+
		"\66\3\2\2\2\u00f1\u00f2\7/\2\2\u00f28\3\2\2\2\u00f3\u00f4\7>\2\2\u00f4"+
		"\u00f5\7?\2\2\u00f5:\3\2\2\2\u00f6\u00f7\7@\2\2\u00f7\u00f8\7?\2\2\u00f8"+
		"<\3\2\2\2\u00f9\u00fa\7v\2\2\u00fa\u00fb\7t\2\2\u00fb\u00fc\7w\2\2\u00fc"+
		"\u00fd\7g\2\2\u00fd>\3\2\2\2\u00fe\u00ff\7h\2\2\u00ff\u0100\7c\2\2\u0100"+
		"\u0101\7n\2\2\u0101\u0102\7u\2\2\u0102\u0103\7g\2\2\u0103@\3\2\2\2\u0104"+
		"\u0105\7c\2\2\u0105\u0106\7p\2\2\u0106\u0107\7f\2\2\u0107B\3\2\2\2\u0108"+
		"\u0109\7(\2\2\u0109\u010a\7(\2\2\u010aD\3\2\2\2\u010b\u010c\7q\2\2\u010c"+
		"\u010d\7t\2\2\u010dF\3\2\2\2\u010e\u010f\7~\2\2\u010f\u0110\7~\2\2\u0110"+
		"H\3\2\2\2\u0111\u0112\7#\2\2\u0112J\3\2\2\2\u0113\u0114\7p\2\2\u0114\u0115"+
		"\7q\2\2\u0115\u0116\7v\2\2\u0116L\3\2\2\2\u0117\u011b\t\3\2\2\u0118\u011a"+
		"\t\4\2\2\u0119\u0118\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011cN\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u011f\t\5\2\2"+
		"\u011fP\3\2\2\2\u0120\u0122\5O(\2\u0121\u0120\3\2\2\2\u0122\u0123\3\2"+
		"\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0137\3\2\2\2\u0125"+
		"\u0127\5O(\2\u0126\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0126\3\2\2"+
		"\2\u0128\u0129\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\7\60\2\2\u012b"+
		"\u012d\5O(\2\u012c\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012c\3\2\2"+
		"\2\u012e\u012f\3\2\2\2\u012f\u0137\3\2\2\2\u0130\u0132\7\60\2\2\u0131"+
		"\u0133\5O(\2\u0132\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0132\3\2\2"+
		"\2\u0134\u0135\3\2\2\2\u0135\u0137\3\2\2\2\u0136\u0121\3\2\2\2\u0136\u0126"+
		"\3\2\2\2\u0136\u0130\3\2\2\2\u0137R\3\2\2\2\u0138\u0139\7.\2\2\u0139T"+
		"\3\2\2\2\r\2[imv\u011b\u0123\u0128\u012e\u0134\u0136\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}