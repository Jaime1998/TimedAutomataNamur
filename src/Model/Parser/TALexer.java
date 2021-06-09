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
		RETURN=9, AUTOMATON=10, LOCATION=11, CLOCK=12, ACTIONS=13, ACTION=14, 
		EDGES=15, SOURCE=16, TARGET=17, INVARIANT=18, GUARD=19, RESET=20, L_C_BRACKET=21, 
		R_C_BRACKET=22, L_PARENTHESIS=23, R_PARENTHESIS=24, EQUAL=25, COLON=26, 
		MUL=27, DIV=28, ADD=29, SUB=30, LESS_EQ=31, GREATER_EQ=32, TRUE=33, FALSE=34, 
		AND=35, AND_SYMBOL=36, OR=37, OR_SYMBOL=38, NEQ_MARK=39, NEQ_LOG=40, IDENTIFIER=41, 
		DOUBLE=42, COMMA=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"COMMENT", "COMMENT_LINE", "WS", "LET", "PRINT", "NUM", "FUNCTION", "RETURNS", 
			"RETURN", "AUTOMATON", "LOCATION", "CLOCK", "ACTIONS", "ACTION", "EDGES", 
			"SOURCE", "TARGET", "INVARIANT", "GUARD", "RESET", "L_C_BRACKET", "R_C_BRACKET", 
			"L_PARENTHESIS", "R_PARENTHESIS", "EQUAL", "COLON", "MUL", "DIV", "ADD", 
			"SUB", "LESS_EQ", "GREATER_EQ", "TRUE", "FALSE", "AND", "AND_SYMBOL", 
			"OR", "OR_SYMBOL", "NEQ_MARK", "NEQ_LOG", "IDENTIFIER", "DIGIT", "DOUBLE", 
			"COMMA"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'let'", "'print'", "'num'", "'function'", "'returns'", 
			"'return'", "'automaton'", "'locations'", "'clocks'", "'actions'", "'action'", 
			"'edges'", "'source'", "'target'", "'invariant'", "'guard'", "'reset'", 
			"'{'", "'}'", "'('", "')'", "'='", "':'", "'*'", "'/'", "'+'", "'-'", 
			"'<='", "'>='", "'true'", "'false'", "'and'", "'&&'", "'or'", "'||'", 
			"'!'", "'not'", null, null, "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "COMMENT_LINE", "WS", "LET", "PRINT", "NUM", "FUNCTION", 
			"RETURNS", "RETURN", "AUTOMATON", "LOCATION", "CLOCK", "ACTIONS", "ACTION", 
			"EDGES", "SOURCE", "TARGET", "INVARIANT", "GUARD", "RESET", "L_C_BRACKET", 
			"R_C_BRACKET", "L_PARENTHESIS", "R_PARENTHESIS", "EQUAL", "COLON", "MUL", 
			"DIV", "ADD", "SUB", "LESS_EQ", "GREATER_EQ", "TRUE", "FALSE", "AND", 
			"AND_SYMBOL", "OR", "OR_SYMBOL", "NEQ_MARK", "NEQ_LOG", "IDENTIFIER", 
			"DOUBLE", "COMMA"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u0155\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\3\2\7\2`\n\2\f\2\16\2c\13\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\7\3n\n\3\f\3\16\3q\13\3\3\3\5\3t\n\3\3\3\3\3\3\3\3\3"+
		"\3\4\6\4{\n\4\r\4\16\4|\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 "+
		"\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3"+
		"&\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3)\3)\3*\3*\7*\u0135\n*\f*\16*\u0138\13"+
		"*\3+\3+\3,\6,\u013d\n,\r,\16,\u013e\3,\6,\u0142\n,\r,\16,\u0143\3,\3,"+
		"\6,\u0148\n,\r,\16,\u0149\3,\3,\6,\u014e\n,\r,\16,\u014f\5,\u0152\n,\3"+
		"-\3-\4ao\2.\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U\2W,Y-\3\2\6\5\2\13\f\17\17\"\""+
		"\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\2\u015e\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M"+
		"\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\3[\3\2"+
		"\2\2\5i\3\2\2\2\7z\3\2\2\2\t\u0080\3\2\2\2\13\u0084\3\2\2\2\r\u008a\3"+
		"\2\2\2\17\u008e\3\2\2\2\21\u0097\3\2\2\2\23\u009f\3\2\2\2\25\u00a6\3\2"+
		"\2\2\27\u00b0\3\2\2\2\31\u00ba\3\2\2\2\33\u00c1\3\2\2\2\35\u00c9\3\2\2"+
		"\2\37\u00d0\3\2\2\2!\u00d6\3\2\2\2#\u00dd\3\2\2\2%\u00e4\3\2\2\2\'\u00ee"+
		"\3\2\2\2)\u00f4\3\2\2\2+\u00fa\3\2\2\2-\u00fc\3\2\2\2/\u00fe\3\2\2\2\61"+
		"\u0100\3\2\2\2\63\u0102\3\2\2\2\65\u0104\3\2\2\2\67\u0106\3\2\2\29\u0108"+
		"\3\2\2\2;\u010a\3\2\2\2=\u010c\3\2\2\2?\u010e\3\2\2\2A\u0111\3\2\2\2C"+
		"\u0114\3\2\2\2E\u0119\3\2\2\2G\u011f\3\2\2\2I\u0123\3\2\2\2K\u0126\3\2"+
		"\2\2M\u0129\3\2\2\2O\u012c\3\2\2\2Q\u012e\3\2\2\2S\u0132\3\2\2\2U\u0139"+
		"\3\2\2\2W\u0151\3\2\2\2Y\u0153\3\2\2\2[\\\7\61\2\2\\]\7,\2\2]a\3\2\2\2"+
		"^`\13\2\2\2_^\3\2\2\2`c\3\2\2\2ab\3\2\2\2a_\3\2\2\2bd\3\2\2\2ca\3\2\2"+
		"\2de\7,\2\2ef\7\61\2\2fg\3\2\2\2gh\b\2\2\2h\4\3\2\2\2ij\7\61\2\2jk\7\61"+
		"\2\2ko\3\2\2\2ln\13\2\2\2ml\3\2\2\2nq\3\2\2\2op\3\2\2\2om\3\2\2\2ps\3"+
		"\2\2\2qo\3\2\2\2rt\7\17\2\2sr\3\2\2\2st\3\2\2\2tu\3\2\2\2uv\7\f\2\2vw"+
		"\3\2\2\2wx\b\3\2\2x\6\3\2\2\2y{\t\2\2\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2"+
		"|}\3\2\2\2}~\3\2\2\2~\177\b\4\2\2\177\b\3\2\2\2\u0080\u0081\7n\2\2\u0081"+
		"\u0082\7g\2\2\u0082\u0083\7v\2\2\u0083\n\3\2\2\2\u0084\u0085\7r\2\2\u0085"+
		"\u0086\7t\2\2\u0086\u0087\7k\2\2\u0087\u0088\7p\2\2\u0088\u0089\7v\2\2"+
		"\u0089\f\3\2\2\2\u008a\u008b\7p\2\2\u008b\u008c\7w\2\2\u008c\u008d\7o"+
		"\2\2\u008d\16\3\2\2\2\u008e\u008f\7h\2\2\u008f\u0090\7w\2\2\u0090\u0091"+
		"\7p\2\2\u0091\u0092\7e\2\2\u0092\u0093\7v\2\2\u0093\u0094\7k\2\2\u0094"+
		"\u0095\7q\2\2\u0095\u0096\7p\2\2\u0096\20\3\2\2\2\u0097\u0098\7t\2\2\u0098"+
		"\u0099\7g\2\2\u0099\u009a\7v\2\2\u009a\u009b\7w\2\2\u009b\u009c\7t\2\2"+
		"\u009c\u009d\7p\2\2\u009d\u009e\7u\2\2\u009e\22\3\2\2\2\u009f\u00a0\7"+
		"t\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7v\2\2\u00a2\u00a3\7w\2\2\u00a3\u00a4"+
		"\7t\2\2\u00a4\u00a5\7p\2\2\u00a5\24\3\2\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8"+
		"\7w\2\2\u00a8\u00a9\7v\2\2\u00a9\u00aa\7q\2\2\u00aa\u00ab\7o\2\2\u00ab"+
		"\u00ac\7c\2\2\u00ac\u00ad\7v\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af\7p\2\2"+
		"\u00af\26\3\2\2\2\u00b0\u00b1\7n\2\2\u00b1\u00b2\7q\2\2\u00b2\u00b3\7"+
		"e\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7v\2\2\u00b5\u00b6\7k\2\2\u00b6\u00b7"+
		"\7q\2\2\u00b7\u00b8\7p\2\2\u00b8\u00b9\7u\2\2\u00b9\30\3\2\2\2\u00ba\u00bb"+
		"\7e\2\2\u00bb\u00bc\7n\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7e\2\2\u00be"+
		"\u00bf\7m\2\2\u00bf\u00c0\7u\2\2\u00c0\32\3\2\2\2\u00c1\u00c2\7c\2\2\u00c2"+
		"\u00c3\7e\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6\7q\2\2"+
		"\u00c6\u00c7\7p\2\2\u00c7\u00c8\7u\2\2\u00c8\34\3\2\2\2\u00c9\u00ca\7"+
		"c\2\2\u00ca\u00cb\7e\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7k\2\2\u00cd\u00ce"+
		"\7q\2\2\u00ce\u00cf\7p\2\2\u00cf\36\3\2\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2"+
		"\7f\2\2\u00d2\u00d3\7i\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5\7u\2\2\u00d5"+
		" \3\2\2\2\u00d6\u00d7\7u\2\2\u00d7\u00d8\7q\2\2\u00d8\u00d9\7w\2\2\u00d9"+
		"\u00da\7t\2\2\u00da\u00db\7e\2\2\u00db\u00dc\7g\2\2\u00dc\"\3\2\2\2\u00dd"+
		"\u00de\7v\2\2\u00de\u00df\7c\2\2\u00df\u00e0\7t\2\2\u00e0\u00e1\7i\2\2"+
		"\u00e1\u00e2\7g\2\2\u00e2\u00e3\7v\2\2\u00e3$\3\2\2\2\u00e4\u00e5\7k\2"+
		"\2\u00e5\u00e6\7p\2\2\u00e6\u00e7\7x\2\2\u00e7\u00e8\7c\2\2\u00e8\u00e9"+
		"\7t\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb\7c\2\2\u00eb\u00ec\7p\2\2\u00ec"+
		"\u00ed\7v\2\2\u00ed&\3\2\2\2\u00ee\u00ef\7i\2\2\u00ef\u00f0\7w\2\2\u00f0"+
		"\u00f1\7c\2\2\u00f1\u00f2\7t\2\2\u00f2\u00f3\7f\2\2\u00f3(\3\2\2\2\u00f4"+
		"\u00f5\7t\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7\7u\2\2\u00f7\u00f8\7g\2\2"+
		"\u00f8\u00f9\7v\2\2\u00f9*\3\2\2\2\u00fa\u00fb\7}\2\2\u00fb,\3\2\2\2\u00fc"+
		"\u00fd\7\177\2\2\u00fd.\3\2\2\2\u00fe\u00ff\7*\2\2\u00ff\60\3\2\2\2\u0100"+
		"\u0101\7+\2\2\u0101\62\3\2\2\2\u0102\u0103\7?\2\2\u0103\64\3\2\2\2\u0104"+
		"\u0105\7<\2\2\u0105\66\3\2\2\2\u0106\u0107\7,\2\2\u01078\3\2\2\2\u0108"+
		"\u0109\7\61\2\2\u0109:\3\2\2\2\u010a\u010b\7-\2\2\u010b<\3\2\2\2\u010c"+
		"\u010d\7/\2\2\u010d>\3\2\2\2\u010e\u010f\7>\2\2\u010f\u0110\7?\2\2\u0110"+
		"@\3\2\2\2\u0111\u0112\7@\2\2\u0112\u0113\7?\2\2\u0113B\3\2\2\2\u0114\u0115"+
		"\7v\2\2\u0115\u0116\7t\2\2\u0116\u0117\7w\2\2\u0117\u0118\7g\2\2\u0118"+
		"D\3\2\2\2\u0119\u011a\7h\2\2\u011a\u011b\7c\2\2\u011b\u011c\7n\2\2\u011c"+
		"\u011d\7u\2\2\u011d\u011e\7g\2\2\u011eF\3\2\2\2\u011f\u0120\7c\2\2\u0120"+
		"\u0121\7p\2\2\u0121\u0122\7f\2\2\u0122H\3\2\2\2\u0123\u0124\7(\2\2\u0124"+
		"\u0125\7(\2\2\u0125J\3\2\2\2\u0126\u0127\7q\2\2\u0127\u0128\7t\2\2\u0128"+
		"L\3\2\2\2\u0129\u012a\7~\2\2\u012a\u012b\7~\2\2\u012bN\3\2\2\2\u012c\u012d"+
		"\7#\2\2\u012dP\3\2\2\2\u012e\u012f\7p\2\2\u012f\u0130\7q\2\2\u0130\u0131"+
		"\7v\2\2\u0131R\3\2\2\2\u0132\u0136\t\3\2\2\u0133\u0135\t\4\2\2\u0134\u0133"+
		"\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137"+
		"T\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013a\t\5\2\2\u013aV\3\2\2\2\u013b"+
		"\u013d\5U+\2\u013c\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013c\3\2\2"+
		"\2\u013e\u013f\3\2\2\2\u013f\u0152\3\2\2\2\u0140\u0142\5U+\2\u0141\u0140"+
		"\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145\u0147\7\60\2\2\u0146\u0148\5U+\2\u0147\u0146\3\2"+
		"\2\2\u0148\u0149\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"\u0152\3\2\2\2\u014b\u014d\7\60\2\2\u014c\u014e\5U+\2\u014d\u014c\3\2"+
		"\2\2\u014e\u014f\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"\u0152\3\2\2\2\u0151\u013c\3\2\2\2\u0151\u0141\3\2\2\2\u0151\u014b\3\2"+
		"\2\2\u0152X\3\2\2\2\u0153\u0154\7.\2\2\u0154Z\3\2\2\2\r\2aos|\u0136\u013e"+
		"\u0143\u0149\u014f\u0151\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}