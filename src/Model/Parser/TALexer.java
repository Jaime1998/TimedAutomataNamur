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
		COMMENT=1, COMMENT_LINE=2, WS=3, LET=4, NUM=5, AUTOMATON=6, LOCATION=7, 
		CLOCK=8, ACTION=9, EDGES=10, INVARIANT=11, GUARD=12, RESET=13, L_C_BRACKET=14, 
		R_C_BRACKET=15, L_PARENTHESIS=16, R_PARENTHESIS=17, EQUAL=18, COLON=19, 
		MUL=20, DIV=21, SUM=22, SUB=23, LESS=24, GREATER=25, TRUE=26, FALSE=27, 
		AND=28, AND_SYMBOL=29, OR=30, OR_SYMBOL=31, NEQ_MARK=32, NEQ_LOG=33, IDENTIFIER=34, 
		DOUBLE=35, COMMA=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMMENT", "COMMENT_LINE", "WS", "LET", "NUM", "AUTOMATON", "LOCATION", 
			"CLOCK", "ACTION", "EDGES", "INVARIANT", "GUARD", "RESET", "L_C_BRACKET", 
			"R_C_BRACKET", "L_PARENTHESIS", "R_PARENTHESIS", "EQUAL", "COLON", "MUL", 
			"DIV", "SUM", "SUB", "LESS", "GREATER", "TRUE", "FALSE", "AND", "AND_SYMBOL", 
			"OR", "OR_SYMBOL", "NEQ_MARK", "NEQ_LOG", "IDENTIFIER", "DIGIT", "DOUBLE", 
			"COMMA"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'let'", "'num'", "'automaton'", "'locations'", 
			"'clocks'", "'actions'", "'edges'", "'invariant'", "'guard'", "'reset'", 
			"'{'", "'}'", "'('", "')'", "'='", "':'", "'*'", "'/'", "'+'", "'-'", 
			"'<='", "'>='", "'true'", "'false'", "'and'", "'&&'", "'or'", "'||'", 
			"'!'", "'not'", null, null, "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "COMMENT_LINE", "WS", "LET", "NUM", "AUTOMATON", "LOCATION", 
			"CLOCK", "ACTION", "EDGES", "INVARIANT", "GUARD", "RESET", "L_C_BRACKET", 
			"R_C_BRACKET", "L_PARENTHESIS", "R_PARENTHESIS", "EQUAL", "COLON", "MUL", 
			"DIV", "SUM", "SUB", "LESS", "GREATER", "TRUE", "FALSE", "AND", "AND_SYMBOL", 
			"OR", "OR_SYMBOL", "NEQ_MARK", "NEQ_LOG", "IDENTIFIER", "DOUBLE", "COMMA"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u0114\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\7\2R\n\2\f\2\16\2"+
		"U\13\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3`\n\3\f\3\16\3c\13\3\3\3"+
		"\5\3f\n\3\3\3\3\3\3\3\3\3\3\4\6\4m\n\4\r\4\16\4n\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3"+
		"\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3\"\3\"\3#\3#\7#\u00f4"+
		"\n#\f#\16#\u00f7\13#\3$\3$\3%\6%\u00fc\n%\r%\16%\u00fd\3%\6%\u0101\n%"+
		"\r%\16%\u0102\3%\3%\6%\u0107\n%\r%\16%\u0108\3%\3%\6%\u010d\n%\r%\16%"+
		"\u010e\5%\u0111\n%\3&\3&\4Sa\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G\2I%K&\3\2\6\5\2\13\f\17\17"+
		"\"\"\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\2\u011d\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2"+
		"\5[\3\2\2\2\7l\3\2\2\2\tr\3\2\2\2\13v\3\2\2\2\rz\3\2\2\2\17\u0084\3\2"+
		"\2\2\21\u008e\3\2\2\2\23\u0095\3\2\2\2\25\u009d\3\2\2\2\27\u00a3\3\2\2"+
		"\2\31\u00ad\3\2\2\2\33\u00b3\3\2\2\2\35\u00b9\3\2\2\2\37\u00bb\3\2\2\2"+
		"!\u00bd\3\2\2\2#\u00bf\3\2\2\2%\u00c1\3\2\2\2\'\u00c3\3\2\2\2)\u00c5\3"+
		"\2\2\2+\u00c7\3\2\2\2-\u00c9\3\2\2\2/\u00cb\3\2\2\2\61\u00cd\3\2\2\2\63"+
		"\u00d0\3\2\2\2\65\u00d3\3\2\2\2\67\u00d8\3\2\2\29\u00de\3\2\2\2;\u00e2"+
		"\3\2\2\2=\u00e5\3\2\2\2?\u00e8\3\2\2\2A\u00eb\3\2\2\2C\u00ed\3\2\2\2E"+
		"\u00f1\3\2\2\2G\u00f8\3\2\2\2I\u0110\3\2\2\2K\u0112\3\2\2\2MN\7\61\2\2"+
		"NO\7,\2\2OS\3\2\2\2PR\13\2\2\2QP\3\2\2\2RU\3\2\2\2ST\3\2\2\2SQ\3\2\2\2"+
		"TV\3\2\2\2US\3\2\2\2VW\7,\2\2WX\7\61\2\2XY\3\2\2\2YZ\b\2\2\2Z\4\3\2\2"+
		"\2[\\\7\61\2\2\\]\7\61\2\2]a\3\2\2\2^`\13\2\2\2_^\3\2\2\2`c\3\2\2\2ab"+
		"\3\2\2\2a_\3\2\2\2be\3\2\2\2ca\3\2\2\2df\7\17\2\2ed\3\2\2\2ef\3\2\2\2"+
		"fg\3\2\2\2gh\7\f\2\2hi\3\2\2\2ij\b\3\2\2j\6\3\2\2\2km\t\2\2\2lk\3\2\2"+
		"\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2op\3\2\2\2pq\b\4\2\2q\b\3\2\2\2rs\7n\2"+
		"\2st\7g\2\2tu\7v\2\2u\n\3\2\2\2vw\7p\2\2wx\7w\2\2xy\7o\2\2y\f\3\2\2\2"+
		"z{\7c\2\2{|\7w\2\2|}\7v\2\2}~\7q\2\2~\177\7o\2\2\177\u0080\7c\2\2\u0080"+
		"\u0081\7v\2\2\u0081\u0082\7q\2\2\u0082\u0083\7p\2\2\u0083\16\3\2\2\2\u0084"+
		"\u0085\7n\2\2\u0085\u0086\7q\2\2\u0086\u0087\7e\2\2\u0087\u0088\7c\2\2"+
		"\u0088\u0089\7v\2\2\u0089\u008a\7k\2\2\u008a\u008b\7q\2\2\u008b\u008c"+
		"\7p\2\2\u008c\u008d\7u\2\2\u008d\20\3\2\2\2\u008e\u008f\7e\2\2\u008f\u0090"+
		"\7n\2\2\u0090\u0091\7q\2\2\u0091\u0092\7e\2\2\u0092\u0093\7m\2\2\u0093"+
		"\u0094\7u\2\2\u0094\22\3\2\2\2\u0095\u0096\7c\2\2\u0096\u0097\7e\2\2\u0097"+
		"\u0098\7v\2\2\u0098\u0099\7k\2\2\u0099\u009a\7q\2\2\u009a\u009b\7p\2\2"+
		"\u009b\u009c\7u\2\2\u009c\24\3\2\2\2\u009d\u009e\7g\2\2\u009e\u009f\7"+
		"f\2\2\u009f\u00a0\7i\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7u\2\2\u00a2\26"+
		"\3\2\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7p\2\2\u00a5\u00a6\7x\2\2\u00a6"+
		"\u00a7\7c\2\2\u00a7\u00a8\7t\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7c\2\2"+
		"\u00aa\u00ab\7p\2\2\u00ab\u00ac\7v\2\2\u00ac\30\3\2\2\2\u00ad\u00ae\7"+
		"i\2\2\u00ae\u00af\7w\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2"+
		"\7f\2\2\u00b2\32\3\2\2\2\u00b3\u00b4\7t\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6"+
		"\7u\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7v\2\2\u00b8\34\3\2\2\2\u00b9\u00ba"+
		"\7}\2\2\u00ba\36\3\2\2\2\u00bb\u00bc\7\177\2\2\u00bc \3\2\2\2\u00bd\u00be"+
		"\7*\2\2\u00be\"\3\2\2\2\u00bf\u00c0\7+\2\2\u00c0$\3\2\2\2\u00c1\u00c2"+
		"\7?\2\2\u00c2&\3\2\2\2\u00c3\u00c4\7<\2\2\u00c4(\3\2\2\2\u00c5\u00c6\7"+
		",\2\2\u00c6*\3\2\2\2\u00c7\u00c8\7\61\2\2\u00c8,\3\2\2\2\u00c9\u00ca\7"+
		"-\2\2\u00ca.\3\2\2\2\u00cb\u00cc\7/\2\2\u00cc\60\3\2\2\2\u00cd\u00ce\7"+
		">\2\2\u00ce\u00cf\7?\2\2\u00cf\62\3\2\2\2\u00d0\u00d1\7@\2\2\u00d1\u00d2"+
		"\7?\2\2\u00d2\64\3\2\2\2\u00d3\u00d4\7v\2\2\u00d4\u00d5\7t\2\2\u00d5\u00d6"+
		"\7w\2\2\u00d6\u00d7\7g\2\2\u00d7\66\3\2\2\2\u00d8\u00d9\7h\2\2\u00d9\u00da"+
		"\7c\2\2\u00da\u00db\7n\2\2\u00db\u00dc\7u\2\2\u00dc\u00dd\7g\2\2\u00dd"+
		"8\3\2\2\2\u00de\u00df\7c\2\2\u00df\u00e0\7p\2\2\u00e0\u00e1\7f\2\2\u00e1"+
		":\3\2\2\2\u00e2\u00e3\7(\2\2\u00e3\u00e4\7(\2\2\u00e4<\3\2\2\2\u00e5\u00e6"+
		"\7q\2\2\u00e6\u00e7\7t\2\2\u00e7>\3\2\2\2\u00e8\u00e9\7~\2\2\u00e9\u00ea"+
		"\7~\2\2\u00ea@\3\2\2\2\u00eb\u00ec\7#\2\2\u00ecB\3\2\2\2\u00ed\u00ee\7"+
		"p\2\2\u00ee\u00ef\7q\2\2\u00ef\u00f0\7v\2\2\u00f0D\3\2\2\2\u00f1\u00f5"+
		"\t\3\2\2\u00f2\u00f4\t\4\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6F\3\2\2\2\u00f7\u00f5\3\2\2\2"+
		"\u00f8\u00f9\t\5\2\2\u00f9H\3\2\2\2\u00fa\u00fc\5G$\2\u00fb\u00fa\3\2"+
		"\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u0111\3\2\2\2\u00ff\u0101\5G$\2\u0100\u00ff\3\2\2\2\u0101\u0102\3\2\2"+
		"\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106"+
		"\7\60\2\2\u0105\u0107\5G$\2\u0106\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u0111\3\2\2\2\u010a\u010c\7\60"+
		"\2\2\u010b\u010d\5G$\2\u010c\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010c"+
		"\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111\3\2\2\2\u0110\u00fb\3\2\2\2\u0110"+
		"\u0100\3\2\2\2\u0110\u010a\3\2\2\2\u0111J\3\2\2\2\u0112\u0113\7.\2\2\u0113"+
		"L\3\2\2\2\r\2Saen\u00f5\u00fd\u0102\u0108\u010e\u0110\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}