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
		COMMENT=1, COMMENT_LINE=2, WS=3, AUTOMATON=4, LOCATIONS=5, CLOCKS=6, ACTIONS=7, 
		EDGES=8, L_C_BRACKET=9, R_C_BRACKET=10, L_PARENTHESIS=11, R_PARENTHESIS=12, 
		EQUAL=13, COLON=14, MUL=15, DIV=16, SUM=17, SUB=18, LESS=19, GREATER=20, 
		TRUE=21, FALSE=22, AND=23, AND_SYMBOL=24, OR=25, OR_SYMBOL=26, NEQ_MARK=27, 
		IDENTIFIER=28, INT=29, DOUBLE=30, COMMA=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMMENT", "COMMENT_LINE", "WS", "AUTOMATON", "LOCATIONS", "CLOCKS", 
			"ACTIONS", "EDGES", "L_C_BRACKET", "R_C_BRACKET", "L_PARENTHESIS", "R_PARENTHESIS", 
			"EQUAL", "COLON", "MUL", "DIV", "SUM", "SUB", "LESS", "GREATER", "TRUE", 
			"FALSE", "AND", "AND_SYMBOL", "OR", "OR_SYMBOL", "NEQ_MARK", "IDENTIFIER", 
			"DIGIT", "INT", "DOUBLE", "COMMA"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'automaton'", "'locations'", "'clocks'", "'actions'", 
			"'edges'", "'{'", "'}'", "'('", "')'", "'='", "':'", "'*'", "'/'", "'+'", 
			"'-'", "'<='", "'>='", "'true'", "'false'", "'and'", "'&&'", "'or'", 
			"'||'", "'!'", null, null, null, "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "COMMENT_LINE", "WS", "AUTOMATON", "LOCATIONS", "CLOCKS", 
			"ACTIONS", "EDGES", "L_C_BRACKET", "R_C_BRACKET", "L_PARENTHESIS", "R_PARENTHESIS", 
			"EQUAL", "COLON", "MUL", "DIV", "SUM", "SUB", "LESS", "GREATER", "TRUE", 
			"FALSE", "AND", "AND_SYMBOL", "OR", "OR_SYMBOL", "NEQ_MARK", "IDENTIFIER", 
			"INT", "DOUBLE", "COMMA"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u00e4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\2\7\2H\n\2\f\2\16\2K\13\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\7\3V\n\3\f\3\16\3Y\13\3\3\3\5\3\\\n\3\3\3\3\3\3\3\3\3\3\4\6"+
		"\4c\n\4\r\4\16\4d\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\34\3\34\3\35\3\35\7\35\u00c8\n\35\f\35\16\35\u00cb\13"+
		"\35\3\36\3\36\3\37\6\37\u00d0\n\37\r\37\16\37\u00d1\3 \3 \3 \6 \u00d7"+
		"\n \r \16 \u00d8\3 \3 \6 \u00dd\n \r \16 \u00de\5 \u00e1\n \3!\3!\4IW"+
		"\2\"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\2=\37? A!\3\2\6\5\2\13\f\17\17\"\"\5\2C\\aac|\6\2\62;C\\aac|\3\2\62"+
		";\2\u00eb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\3C\3\2\2\2\5Q\3\2\2\2\7b\3\2\2\2"+
		"\th\3\2\2\2\13r\3\2\2\2\r|\3\2\2\2\17\u0083\3\2\2\2\21\u008b\3\2\2\2\23"+
		"\u0091\3\2\2\2\25\u0093\3\2\2\2\27\u0095\3\2\2\2\31\u0097\3\2\2\2\33\u0099"+
		"\3\2\2\2\35\u009b\3\2\2\2\37\u009d\3\2\2\2!\u009f\3\2\2\2#\u00a1\3\2\2"+
		"\2%\u00a3\3\2\2\2\'\u00a5\3\2\2\2)\u00a8\3\2\2\2+\u00ab\3\2\2\2-\u00b0"+
		"\3\2\2\2/\u00b6\3\2\2\2\61\u00ba\3\2\2\2\63\u00bd\3\2\2\2\65\u00c0\3\2"+
		"\2\2\67\u00c3\3\2\2\29\u00c5\3\2\2\2;\u00cc\3\2\2\2=\u00cf\3\2\2\2?\u00e0"+
		"\3\2\2\2A\u00e2\3\2\2\2CD\7\61\2\2DE\7,\2\2EI\3\2\2\2FH\13\2\2\2GF\3\2"+
		"\2\2HK\3\2\2\2IJ\3\2\2\2IG\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\7,\2\2MN\7\61"+
		"\2\2NO\3\2\2\2OP\b\2\2\2P\4\3\2\2\2QR\7\61\2\2RS\7\61\2\2SW\3\2\2\2TV"+
		"\13\2\2\2UT\3\2\2\2VY\3\2\2\2WX\3\2\2\2WU\3\2\2\2X[\3\2\2\2YW\3\2\2\2"+
		"Z\\\7\17\2\2[Z\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\7\f\2\2^_\3\2\2\2_`\b\3"+
		"\2\2`\6\3\2\2\2ac\t\2\2\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2ef\3"+
		"\2\2\2fg\b\4\2\2g\b\3\2\2\2hi\7c\2\2ij\7w\2\2jk\7v\2\2kl\7q\2\2lm\7o\2"+
		"\2mn\7c\2\2no\7v\2\2op\7q\2\2pq\7p\2\2q\n\3\2\2\2rs\7n\2\2st\7q\2\2tu"+
		"\7e\2\2uv\7c\2\2vw\7v\2\2wx\7k\2\2xy\7q\2\2yz\7p\2\2z{\7u\2\2{\f\3\2\2"+
		"\2|}\7e\2\2}~\7n\2\2~\177\7q\2\2\177\u0080\7e\2\2\u0080\u0081\7m\2\2\u0081"+
		"\u0082\7u\2\2\u0082\16\3\2\2\2\u0083\u0084\7c\2\2\u0084\u0085\7e\2\2\u0085"+
		"\u0086\7v\2\2\u0086\u0087\7k\2\2\u0087\u0088\7q\2\2\u0088\u0089\7p\2\2"+
		"\u0089\u008a\7u\2\2\u008a\20\3\2\2\2\u008b\u008c\7g\2\2\u008c\u008d\7"+
		"f\2\2\u008d\u008e\7i\2\2\u008e\u008f\7g\2\2\u008f\u0090\7u\2\2\u0090\22"+
		"\3\2\2\2\u0091\u0092\7}\2\2\u0092\24\3\2\2\2\u0093\u0094\7\177\2\2\u0094"+
		"\26\3\2\2\2\u0095\u0096\7*\2\2\u0096\30\3\2\2\2\u0097\u0098\7+\2\2\u0098"+
		"\32\3\2\2\2\u0099\u009a\7?\2\2\u009a\34\3\2\2\2\u009b\u009c\7<\2\2\u009c"+
		"\36\3\2\2\2\u009d\u009e\7,\2\2\u009e \3\2\2\2\u009f\u00a0\7\61\2\2\u00a0"+
		"\"\3\2\2\2\u00a1\u00a2\7-\2\2\u00a2$\3\2\2\2\u00a3\u00a4\7/\2\2\u00a4"+
		"&\3\2\2\2\u00a5\u00a6\7>\2\2\u00a6\u00a7\7?\2\2\u00a7(\3\2\2\2\u00a8\u00a9"+
		"\7@\2\2\u00a9\u00aa\7?\2\2\u00aa*\3\2\2\2\u00ab\u00ac\7v\2\2\u00ac\u00ad"+
		"\7t\2\2\u00ad\u00ae\7w\2\2\u00ae\u00af\7g\2\2\u00af,\3\2\2\2\u00b0\u00b1"+
		"\7h\2\2\u00b1\u00b2\7c\2\2\u00b2\u00b3\7n\2\2\u00b3\u00b4\7u\2\2\u00b4"+
		"\u00b5\7g\2\2\u00b5.\3\2\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7p\2\2\u00b8"+
		"\u00b9\7f\2\2\u00b9\60\3\2\2\2\u00ba\u00bb\7(\2\2\u00bb\u00bc\7(\2\2\u00bc"+
		"\62\3\2\2\2\u00bd\u00be\7q\2\2\u00be\u00bf\7t\2\2\u00bf\64\3\2\2\2\u00c0"+
		"\u00c1\7~\2\2\u00c1\u00c2\7~\2\2\u00c2\66\3\2\2\2\u00c3\u00c4\7#\2\2\u00c4"+
		"8\3\2\2\2\u00c5\u00c9\t\3\2\2\u00c6\u00c8\t\4\2\2\u00c7\u00c6\3\2\2\2"+
		"\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca:\3"+
		"\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\t\5\2\2\u00cd<\3\2\2\2\u00ce\u00d0"+
		"\5;\36\2\u00cf\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2>\3\2\2\2\u00d3\u00d4\5=\37\2\u00d4\u00d6\7\60\2\2"+
		"\u00d5\u00d7\5;\36\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d6"+
		"\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00e1\3\2\2\2\u00da\u00dc\7\60\2\2"+
		"\u00db\u00dd\5;\36\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc"+
		"\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00d3\3\2\2\2\u00e0"+
		"\u00da\3\2\2\2\u00e1@\3\2\2\2\u00e2\u00e3\7.\2\2\u00e3B\3\2\2\2\f\2IW"+
		"[d\u00c9\u00d1\u00d8\u00de\u00e0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}