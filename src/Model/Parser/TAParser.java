// Generated from C:/Users/57310/OneDrive - correounivalle.edu.co/Documentos/Github/TimedAutomataNamur/src/Model/Parser\TAParser.g4 by ANTLR 4.9.1
package Model.Parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TAParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, COMMENT_LINE=2, WS=3, LET=4, PRINT=5, NUM=6, FUNCTION=7, RETURNS=8, 
		RETURN=9, AUTOMATON=10, LOCATION=11, INIT=12, CLOCK=13, ACTIONS=14, ACTION=15, 
		EDGES=16, SOURCE=17, TARGET=18, INVARIANT=19, GUARD=20, RESET=21, L_C_BRACKET=22, 
		R_C_BRACKET=23, L_PARENTHESIS=24, R_PARENTHESIS=25, EQUAL=26, COLON=27, 
		MUL=28, DIV=29, ADD=30, SUB=31, LESS_EQ=32, GREATER_EQ=33, TRUE=34, FALSE=35, 
		AND=36, AND_SYMBOL=37, OR=38, OR_SYMBOL=39, NEQ_MARK=40, NEQ_LOG=41, IDENTIFIER=42, 
		DOUBLE=43, COMMA=44;
	public static final int
		RULE_model = 0, RULE_block = 1, RULE_let = 2, RULE_statement = 3, RULE_printStatement = 4, 
		RULE_varDeclaration = 5, RULE_type = 6, RULE_varId = 7, RULE_initialiser = 8, 
		RULE_automaton = 9, RULE_locationType = 10, RULE_clockType = 11, RULE_actionType = 12, 
		RULE_edgesType = 13, RULE_location = 14, RULE_initLocation = 15, RULE_edge = 16, 
		RULE_guard = 17, RULE_consGuard = 18, RULE_funcExpr = 19, RULE_funcParameters = 20, 
		RULE_funcParameter = 21, RULE_arguments = 22, RULE_expr = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"model", "block", "let", "statement", "printStatement", "varDeclaration", 
			"type", "varId", "initialiser", "automaton", "locationType", "clockType", 
			"actionType", "edgesType", "location", "initLocation", "edge", "guard", 
			"consGuard", "funcExpr", "funcParameters", "funcParameter", "arguments", 
			"expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'let'", "'print'", "'num'", "'function'", "'returns'", 
			"'return'", "'automaton'", "'locations'", "'init'", "'clocks'", "'actions'", 
			"'action'", "'edges'", "'source'", "'target'", "'invariant'", "'guard'", 
			"'reset'", "'{'", "'}'", "'('", "')'", "'='", "':'", "'*'", "'/'", "'+'", 
			"'-'", "'<='", "'>='", "'true'", "'false'", "'and'", "'&&'", "'or'", 
			"'||'", "'!'", "'not'", null, null, "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "COMMENT_LINE", "WS", "LET", "PRINT", "NUM", "FUNCTION", 
			"RETURNS", "RETURN", "AUTOMATON", "LOCATION", "INIT", "CLOCK", "ACTIONS", 
			"ACTION", "EDGES", "SOURCE", "TARGET", "INVARIANT", "GUARD", "RESET", 
			"L_C_BRACKET", "R_C_BRACKET", "L_PARENTHESIS", "R_PARENTHESIS", "EQUAL", 
			"COLON", "MUL", "DIV", "ADD", "SUB", "LESS_EQ", "GREATER_EQ", "TRUE", 
			"FALSE", "AND", "AND_SYMBOL", "OR", "OR_SYMBOL", "NEQ_MARK", "NEQ_LOG", 
			"IDENTIFIER", "DOUBLE", "COMMA"
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

	@Override
	public String getGrammarFileName() { return "TAParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TAParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ModelContext extends ParserRuleContext {
		public AutomatonContext automaton() {
			return getRuleContext(AutomatonContext.class,0);
		}
		public LetContext let() {
			return getRuleContext(LetContext.class,0);
		}
		public ModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).enterModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).exitModel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAParserVisitor ) return ((TAParserVisitor<? extends T>)visitor).visitModel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModelContext model() throws RecognitionException {
		ModelContext _localctx = new ModelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_model);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LET) {
				{
				setState(48);
				let();
				}
			}

			setState(51);
			automaton();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAParserVisitor ) return ((TAParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << NUM) | (1L << L_PARENTHESIS) | (1L << ADD) | (1L << SUB) | (1L << IDENTIFIER) | (1L << DOUBLE))) != 0)) {
				{
				{
				setState(53);
				statement();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(TAParser.LET, 0); }
		public TerminalNode L_C_BRACKET() { return getToken(TAParser.L_C_BRACKET, 0); }
		public TerminalNode R_C_BRACKET() { return getToken(TAParser.R_C_BRACKET, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public LetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).enterLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).exitLet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAParserVisitor ) return ((TAParserVisitor<? extends T>)visitor).visitLet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetContext let() throws RecognitionException {
		LetContext _localctx = new LetContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_let);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(LET);
			setState(60);
			match(L_C_BRACKET);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << NUM) | (1L << L_PARENTHESIS) | (1L << ADD) | (1L << SUB) | (1L << IDENTIFIER) | (1L << DOUBLE))) != 0)) {
				{
				{
				setState(61);
				statement();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			match(R_C_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarDeclarationStContext extends StatementContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public VarDeclarationStContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).enterVarDeclarationSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).exitVarDeclarationSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAParserVisitor ) return ((TAParserVisitor<? extends T>)visitor).visitVarDeclarationSt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprStContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprStContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).enterExprSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).exitExprSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAParserVisitor ) return ((TAParserVisitor<? extends T>)visitor).visitExprSt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintStContext extends StatementContext {
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public PrintStContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).enterPrintSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).exitPrintSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAParserVisitor ) return ((TAParserVisitor<? extends T>)visitor).visitPrintSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				_localctx = new VarDeclarationStContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				varDeclaration();
				}
				break;
			case L_PARENTHESIS:
			case ADD:
			case SUB:
			case IDENTIFIER:
			case DOUBLE:
				_localctx = new ExprStContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				expr(0);
				}
				break;
			case PRINT:
				_localctx = new PrintStContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				printStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(TAParser.PRINT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAParserVisitor ) return ((TAParserVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(PRINT);
			setState(75);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<VarIdContext> varId() {
			return getRuleContexts(VarIdContext.class);
		}
		public VarIdContext varId(int i) {
			return getRuleContext(VarIdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TAParser.COMMA, i);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAParserVisitor ) return ((TAParserVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(77);
			type();
			setState(78);
			varId();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(79);
				match(COMMA);
				setState(80);
				varId();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(TAParser.NUM, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAParserVisitor ) return ((TAParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarIdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TAParser.IDENTIFIER, 0); }
		public TerminalNode EQUAL() { return getToken(TAParser.EQUAL, 0); }
		public InitialiserContext initialiser() {
			return getRuleContext(InitialiserContext.class,0);
		}
		public VarIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).enterVarId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).exitVarId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAParserVisitor ) return ((TAParserVisitor<? extends T>)visitor).visitVarId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarIdContext varId() throws RecognitionException {
		VarIdContext _localctx = new VarIdContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(IDENTIFIER);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(89);
				match(EQUAL);
				setState(90);
				initialiser();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitialiserContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InitialiserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialiser; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).enterInitialiser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).exitInitialiser(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAParserVisitor ) return ((TAParserVisitor<? extends T>)visitor).visitInitialiser(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitialiserContext initialiser() throws RecognitionException {
		InitialiserContext _localctx = new InitialiserContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_initialiser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AutomatonContext extends ParserRuleContext {
		public TerminalNode AUTOMATON() { return getToken(TAParser.AUTOMATON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TAParser.IDENTIFIER, 0); }
		public TerminalNode L_C_BRACKET() { return getToken(TAParser.L_C_BRACKET, 0); }
		public InitLocationContext initLocation() {
			return getRuleContext(InitLocationContext.class,0);
		}
		public TerminalNode R_C_BRACKET() { return getToken(TAParser.R_C_BRACKET, 0); }
		public List<LocationTypeContext> locationType() {
			return getRuleContexts(LocationTypeContext.class);
		}
		public LocationTypeContext locationType(int i) {
			return getRuleContext(LocationTypeContext.class,i);
		}
		public List<ClockTypeContext> clockType() {
			return getRuleContexts(ClockTypeContext.class);
		}
		public ClockTypeContext clockType(int i) {
			return getRuleContext(ClockTypeContext.class,i);
		}
		public List<ActionTypeContext> actionType() {
			return getRuleContexts(ActionTypeContext.class);
		}
		public ActionTypeContext actionType(int i) {
			return getRuleContext(ActionTypeContext.class,i);
		}
		public List<EdgesTypeContext> edgesType() {
			return getRuleContexts(EdgesTypeContext.class);
		}
		public EdgesTypeContext edgesType(int i) {
			return getRuleContext(EdgesTypeContext.class,i);
		}
		public AutomatonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_automaton; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).enterAutomaton(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).exitAutomaton(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAParserVisitor ) return ((TAParserVisitor<? extends T>)visitor).visitAutomaton(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AutomatonContext automaton() throws RecognitionException {
		AutomatonContext _localctx = new AutomatonContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_automaton);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(AUTOMATON);
			setState(96);
			match(IDENTIFIER);
			setState(97);
			match(L_C_BRACKET);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOCATION) | (1L << CLOCK) | (1L << ACTIONS) | (1L << EDGES))) != 0)) {
				{
				setState(102);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LOCATION:
					{
					setState(98);
					locationType();
					}
					break;
				case CLOCK:
					{
					setState(99);
					clockType();
					}
					break;
				case ACTIONS:
					{
					setState(100);
					actionType();
					}
					break;
				case EDGES:
					{
					setState(101);
					edgesType();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			initLocation();
			setState(108);
			match(R_C_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocationTypeContext extends ParserRuleContext {
		public TerminalNode LOCATION() { return getToken(TAParser.LOCATION, 0); }
		public TerminalNode EQUAL() { return getToken(TAParser.EQUAL, 0); }
		public TerminalNode L_C_BRACKET() { return getToken(TAParser.L_C_BRACKET, 0); }
		public List<LocationContext> location() {
			return getRuleContexts(LocationContext.class);
		}
		public LocationContext location(int i) {
			return getRuleContext(LocationContext.class,i);
		}
		public TerminalNode R_C_BRACKET() { return getToken(TAParser.R_C_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(TAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TAParser.COMMA, i);
		}
		public LocationTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).enterLocationType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).exitLocationType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAParserVisitor ) return ((TAParserVisitor<? extends T>)visitor).visitLocationType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationTypeContext locationType() throws RecognitionException {
		LocationTypeContext _localctx = new LocationTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_locationType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(LOCATION);
			setState(111);
			match(EQUAL);
			setState(112);
			match(L_C_BRACKET);
			setState(113);
			location();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(114);
				match(COMMA);
				setState(115);
				location();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
			match(R_C_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClockTypeContext extends ParserRuleContext {
		public TerminalNode CLOCK() { return getToken(TAParser.CLOCK, 0); }
		public TerminalNode EQUAL() { return getToken(TAParser.EQUAL, 0); }
		public TerminalNode L_C_BRACKET() { return getToken(TAParser.L_C_BRACKET, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(TAParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TAParser.IDENTIFIER, i);
		}
		public TerminalNode R_C_BRACKET() { return getToken(TAParser.R_C_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(TAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TAParser.COMMA, i);
		}
		public ClockTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clockType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).enterClockType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).exitClockType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAParserVisitor ) return ((TAParserVisitor<? extends T>)visitor).visitClockType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClockTypeContext clockType() throws RecognitionException {
		ClockTypeContext _localctx = new ClockTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_clockType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(CLOCK);
			setState(124);
			match(EQUAL);
			setState(125);
			match(L_C_BRACKET);
			setState(126);
			match(IDENTIFIER);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(127);
				match(COMMA);
				setState(128);
				match(IDENTIFIER);
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			match(R_C_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionTypeContext extends ParserRuleContext {
		public TerminalNode ACTIONS() { return getToken(TAParser.ACTIONS, 0); }
		public TerminalNode EQUAL() { return getToken(TAParser.EQUAL, 0); }
		public TerminalNode L_C_BRACKET() { return getToken(TAParser.L_C_BRACKET, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(TAParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TAParser.IDENTIFIER, i);
		}
		public TerminalNode R_C_BRACKET() { return getToken(TAParser.R_C_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(TAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TAParser.COMMA, i);
		}
		public ActionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).enterActionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).exitActionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAParserVisitor ) return ((TAParserVisitor<? extends T>)visitor).visitActionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionTypeContext actionType() throws RecognitionException {
		ActionTypeContext _localctx = new ActionTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_actionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(ACTIONS);
			setState(137);
			match(EQUAL);
			setState(138);
			match(L_C_BRACKET);
			setState(139);
			match(IDENTIFIER);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(140);
				match(COMMA);
				setState(141);
				match(IDENTIFIER);
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(147);
			match(R_C_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EdgesTypeContext extends ParserRuleContext {
		public TerminalNode EDGES() { return getToken(TAParser.EDGES, 0); }
		public TerminalNode EQUAL() { return getToken(TAParser.EQUAL, 0); }
		public TerminalNode L_C_BRACKET() { return getToken(TAParser.L_C_BRACKET, 0); }
		public TerminalNode R_C_BRACKET() { return getToken(TAParser.R_C_BRACKET, 0); }
		public List<EdgeContext> edge() {
			return getRuleContexts(EdgeContext.class);
		}
		public EdgeContext edge(int i) {
			return getRuleContext(EdgeContext.class,i);
		}
		public EdgesTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edgesType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).enterEdgesType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).exitEdgesType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAParserVisitor ) return ((TAParserVisitor<? extends T>)visitor).visitEdgesType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EdgesTypeContext edgesType() throws RecognitionException {
		EdgesTypeContext _localctx = new EdgesTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_edgesType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(EDGES);
			setState(150);
			match(EQUAL);
			setState(151);
			match(L_C_BRACKET);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==L_PARENTHESIS) {
				{
				{
				setState(152);
				edge();
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(158);
			match(R_C_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TAParser.IDENTIFIER, 0); }
		public TerminalNode INVARIANT() { return getToken(TAParser.INVARIANT, 0); }
		public TerminalNode EQUAL() { return getToken(TAParser.EQUAL, 0); }
		public GuardContext guard() {
			return getRuleContext(GuardContext.class,0);
		}
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).exitLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAParserVisitor ) return ((TAParserVisitor<? extends T>)visitor).visitLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_location);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(IDENTIFIER);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INVARIANT) {
				{
				setState(161);
				match(INVARIANT);
				setState(162);
				match(EQUAL);
				setState(163);
				guard();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitLocationContext extends ParserRuleContext {
		public TerminalNode INIT() { return getToken(TAParser.INIT, 0); }
		public TerminalNode EQUAL() { return getToken(TAParser.EQUAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TAParser.IDENTIFIER, 0); }
		public InitLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initLocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).enterInitLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).exitInitLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAParserVisitor ) return ((TAParserVisitor<? extends T>)visitor).visitInitLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitLocationContext initLocation() throws RecognitionException {
		InitLocationContext _localctx = new InitLocationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_initLocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(INIT);
			setState(167);
			match(EQUAL);
			setState(168);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EdgeContext extends ParserRuleContext {
		public TerminalNode L_PARENTHESIS() { return getToken(TAParser.L_PARENTHESIS, 0); }
		public TerminalNode SOURCE() { return getToken(TAParser.SOURCE, 0); }
		public List<TerminalNode> EQUAL() { return getTokens(TAParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(TAParser.EQUAL, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(TAParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TAParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TAParser.COMMA, i);
		}
		public TerminalNode ACTION() { return getToken(TAParser.ACTION, 0); }
		public TerminalNode TARGET() { return getToken(TAParser.TARGET, 0); }
		public TerminalNode R_PARENTHESIS() { return getToken(TAParser.R_PARENTHESIS, 0); }
		public TerminalNode GUARD() { return getToken(TAParser.GUARD, 0); }
		public GuardContext guard() {
			return getRuleContext(GuardContext.class,0);
		}
		public TerminalNode RESET() { return getToken(TAParser.RESET, 0); }
		public TerminalNode L_C_BRACKET() { return getToken(TAParser.L_C_BRACKET, 0); }
		public TerminalNode R_C_BRACKET() { return getToken(TAParser.R_C_BRACKET, 0); }
		public EdgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).enterEdge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).exitEdge(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAParserVisitor ) return ((TAParserVisitor<? extends T>)visitor).visitEdge(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EdgeContext edge() throws RecognitionException {
		EdgeContext _localctx = new EdgeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_edge);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(L_PARENTHESIS);
			setState(171);
			match(SOURCE);
			setState(172);
			match(EQUAL);
			setState(173);
			match(IDENTIFIER);
			setState(174);
			match(COMMA);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GUARD) {
				{
				setState(175);
				match(GUARD);
				setState(176);
				match(EQUAL);
				setState(177);
				guard();
				setState(178);
				match(COMMA);
				}
			}

			setState(182);
			match(ACTION);
			setState(183);
			match(EQUAL);
			setState(184);
			match(IDENTIFIER);
			setState(185);
			match(COMMA);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RESET) {
				{
				setState(186);
				match(RESET);
				setState(187);
				match(EQUAL);
				setState(188);
				match(L_C_BRACKET);
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(189);
					match(IDENTIFIER);
					}
					}
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(195);
				match(R_C_BRACKET);
				}
			}

			setState(198);
			match(TARGET);
			setState(199);
			match(EQUAL);
			setState(200);
			match(IDENTIFIER);
			setState(201);
			match(R_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GuardContext extends ParserRuleContext {
		public List<ConsGuardContext> consGuard() {
			return getRuleContexts(ConsGuardContext.class);
		}
		public ConsGuardContext consGuard(int i) {
			return getRuleContext(ConsGuardContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(TAParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(TAParser.AND, i);
		}
		public List<TerminalNode> AND_SYMBOL() { return getTokens(TAParser.AND_SYMBOL); }
		public TerminalNode AND_SYMBOL(int i) {
			return getToken(TAParser.AND_SYMBOL, i);
		}
		public GuardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).enterGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).exitGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAParserVisitor ) return ((TAParserVisitor<? extends T>)visitor).visitGuard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GuardContext guard() throws RecognitionException {
		GuardContext _localctx = new GuardContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_guard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			consGuard();
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==AND_SYMBOL) {
				{
				{
				setState(204);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==AND_SYMBOL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(205);
				consGuard();
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConsGuardContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ConsGuardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consGuard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).enterConsGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).exitConsGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAParserVisitor ) return ((TAParserVisitor<? extends T>)visitor).visitConsGuard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConsGuardContext consGuard() throws RecognitionException {
		ConsGuardContext _localctx = new ConsGuardContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_consGuard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncExprContext extends ParserRuleContext {
		public List<TerminalNode> FUNCTION() { return getTokens(TAParser.FUNCTION); }
		public TerminalNode FUNCTION(int i) {
			return getToken(TAParser.FUNCTION, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(TAParser.IDENTIFIER, 0); }
		public TerminalNode L_PARENTHESIS() { return getToken(TAParser.L_PARENTHESIS, 0); }
		public FuncParametersContext funcParameters() {
			return getRuleContext(FuncParametersContext.class,0);
		}
		public TerminalNode R_PARENTHESIS() { return getToken(TAParser.R_PARENTHESIS, 0); }
		public TerminalNode RETURNS() { return getToken(TAParser.RETURNS, 0); }
		public TerminalNode L_C_BRACKET() { return getToken(TAParser.L_C_BRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode R_C_BRACKET() { return getToken(TAParser.R_C_BRACKET, 0); }
		public TerminalNode NUM() { return getToken(TAParser.NUM, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public FuncExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).enterFuncExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).exitFuncExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAParserVisitor ) return ((TAParserVisitor<? extends T>)visitor).visitFuncExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncExprContext funcExpr() throws RecognitionException {
		FuncExprContext _localctx = new FuncExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_funcExpr);
		try {
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(FUNCTION);
				setState(214);
				match(IDENTIFIER);
				setState(215);
				match(L_PARENTHESIS);
				setState(216);
				funcParameters();
				setState(217);
				match(R_PARENTHESIS);
				setState(218);
				match(RETURNS);
				setState(219);
				match(FUNCTION);
				setState(220);
				match(L_C_BRACKET);
				setState(221);
				block();
				setState(222);
				match(R_C_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				match(FUNCTION);
				setState(225);
				match(IDENTIFIER);
				setState(226);
				match(L_PARENTHESIS);
				setState(227);
				funcParameters();
				setState(228);
				match(R_PARENTHESIS);
				setState(229);
				match(RETURNS);
				setState(230);
				match(NUM);
				setState(231);
				match(L_C_BRACKET);
				setState(232);
				block();
				setState(233);
				match(R_C_BRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(235);
				match(IDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(236);
				match(IDENTIFIER);
				setState(237);
				match(L_PARENTHESIS);
				setState(238);
				arguments();
				setState(239);
				match(R_PARENTHESIS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncParametersContext extends ParserRuleContext {
		public List<FuncParameterContext> funcParameter() {
			return getRuleContexts(FuncParameterContext.class);
		}
		public FuncParameterContext funcParameter(int i) {
			return getRuleContext(FuncParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TAParser.COMMA, i);
		}
		public FuncParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).enterFuncParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).exitFuncParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAParserVisitor ) return ((TAParserVisitor<? extends T>)visitor).visitFuncParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncParametersContext funcParameters() throws RecognitionException {
		FuncParametersContext _localctx = new FuncParametersContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_funcParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUM) {
				{
				setState(243);
				funcParameter();
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(244);
					match(COMMA);
					setState(245);
					funcParameter();
					}
					}
					setState(250);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(TAParser.IDENTIFIER, 0); }
		public FuncParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).enterFuncParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).exitFuncParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAParserVisitor ) return ((TAParserVisitor<? extends T>)visitor).visitFuncParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncParameterContext funcParameter() throws RecognitionException {
		FuncParameterContext _localctx = new FuncParameterContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_funcParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			type();
			setState(254);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TAParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAParserVisitor ) return ((TAParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << L_PARENTHESIS) | (1L << ADD) | (1L << SUB) | (1L << IDENTIFIER) | (1L << DOUBLE))) != 0)) {
				{
				setState(256);
				expr(0);
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(257);
					match(COMMA);
					setState(258);
					expr(0);
					}
					}
					setState(263);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DoubleExprContext extends ExprContext {
		public TerminalNode DOUBLE() { return getToken(TAParser.DOUBLE, 0); }
		public DoubleExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).enterDoubleExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).exitDoubleExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAParserVisitor ) return ((TAParserVisitor<? extends T>)visitor).visitDoubleExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdExprContext extends ExprContext {
		public TerminalNode IDENTIFIER() { return getToken(TAParser.IDENTIFIER, 0); }
		public IdExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).enterIdExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).exitIdExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAParserVisitor ) return ((TAParserVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompareExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LESS_EQ() { return getToken(TAParser.LESS_EQ, 0); }
		public TerminalNode GREATER_EQ() { return getToken(TAParser.GREATER_EQ, 0); }
		public CompareExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).enterCompareExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).exitCompareExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAParserVisitor ) return ((TAParserVisitor<? extends T>)visitor).visitCompareExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(TAParser.MUL, 0); }
		public MulContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).exitMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAParserVisitor ) return ((TAParserVisitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(TAParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(TAParser.SUB, 0); }
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAParserVisitor ) return ((TAParserVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensExprContext extends ExprContext {
		public TerminalNode L_PARENTHESIS() { return getToken(TAParser.L_PARENTHESIS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode R_PARENTHESIS() { return getToken(TAParser.R_PARENTHESIS, 0); }
		public ParensExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).enterParensExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).exitParensExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAParserVisitor ) return ((TAParserVisitor<? extends T>)visitor).visitParensExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ADD() { return getToken(TAParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(TAParser.SUB, 0); }
		public UnaryContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).exitUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAParserVisitor ) return ((TAParserVisitor<? extends T>)visitor).visitUnary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignExprContext extends ExprContext {
		public TerminalNode IDENTIFIER() { return getToken(TAParser.IDENTIFIER, 0); }
		public TerminalNode EQUAL() { return getToken(TAParser.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).enterAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).exitAssignExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAParserVisitor ) return ((TAParserVisitor<? extends T>)visitor).visitAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(267);
				((UnaryContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
					((UnaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(268);
				expr(7);
				}
				break;
			case 2:
				{
				_localctx = new DoubleExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(269);
				match(DOUBLE);
				}
				break;
			case 3:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(270);
				match(IDENTIFIER);
				}
				break;
			case 4:
				{
				_localctx = new ParensExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(271);
				match(L_PARENTHESIS);
				setState(272);
				expr(0);
				setState(273);
				match(R_PARENTHESIS);
				}
				break;
			case 5:
				{
				_localctx = new AssignExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(275);
				match(IDENTIFIER);
				setState(276);
				match(EQUAL);
				setState(277);
				expr(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(291);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(289);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new CompareExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(280);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(281);
						((CompareExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==LESS_EQ || _la==GREATER_EQ) ) {
							((CompareExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(282);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new MulContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(283);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(284);
						match(MUL);
						setState(285);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(286);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(287);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(288);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(293);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 23:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u0129\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\5\2\64\n\2\3\2\3\2\3\3\7\39\n\3\f\3\16\3<\13\3\3\4\3\4\3\4\7\4A\n"+
		"\4\f\4\16\4D\13\4\3\4\3\4\3\5\3\5\3\5\5\5K\n\5\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\7\7T\n\7\f\7\16\7W\13\7\3\b\3\b\3\t\3\t\3\t\5\t^\n\t\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\7\13i\n\13\f\13\16\13l\13\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\7\fw\n\f\f\f\16\fz\13\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\7\r\u0084\n\r\f\r\16\r\u0087\13\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\7\16\u0091\n\16\f\16\16\16\u0094\13\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\7\17\u009c\n\17\f\17\16\17\u009f\13\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\5\20\u00a7\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00b7\n\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\7\22\u00c1\n\22\f\22\16\22\u00c4\13\22\3\22\5\22"+
		"\u00c7\n\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\7\23\u00d1\n\23\f"+
		"\23\16\23\u00d4\13\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00f4\n\25\3\26\3\26\3\26\7\26\u00f9"+
		"\n\26\f\26\16\26\u00fc\13\26\5\26\u00fe\n\26\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\7\30\u0106\n\30\f\30\16\30\u0109\13\30\5\30\u010b\n\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0119\n\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0124\n\31\f\31\16\31\u0127"+
		"\13\31\3\31\2\3\60\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,."+
		"\60\2\5\3\2&\'\3\2 !\3\2\"#\2\u0132\2\63\3\2\2\2\4:\3\2\2\2\6=\3\2\2\2"+
		"\bJ\3\2\2\2\nL\3\2\2\2\fO\3\2\2\2\16X\3\2\2\2\20Z\3\2\2\2\22_\3\2\2\2"+
		"\24a\3\2\2\2\26p\3\2\2\2\30}\3\2\2\2\32\u008a\3\2\2\2\34\u0097\3\2\2\2"+
		"\36\u00a2\3\2\2\2 \u00a8\3\2\2\2\"\u00ac\3\2\2\2$\u00cd\3\2\2\2&\u00d5"+
		"\3\2\2\2(\u00f3\3\2\2\2*\u00fd\3\2\2\2,\u00ff\3\2\2\2.\u010a\3\2\2\2\60"+
		"\u0118\3\2\2\2\62\64\5\6\4\2\63\62\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2"+
		"\65\66\5\24\13\2\66\3\3\2\2\2\679\5\b\5\28\67\3\2\2\29<\3\2\2\2:8\3\2"+
		"\2\2:;\3\2\2\2;\5\3\2\2\2<:\3\2\2\2=>\7\6\2\2>B\7\30\2\2?A\5\b\5\2@?\3"+
		"\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2EF\7\31\2\2F\7"+
		"\3\2\2\2GK\5\f\7\2HK\5\60\31\2IK\5\n\6\2JG\3\2\2\2JH\3\2\2\2JI\3\2\2\2"+
		"K\t\3\2\2\2LM\7\7\2\2MN\5\60\31\2N\13\3\2\2\2OP\5\16\b\2PU\5\20\t\2QR"+
		"\7.\2\2RT\5\20\t\2SQ\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V\r\3\2\2\2"+
		"WU\3\2\2\2XY\7\b\2\2Y\17\3\2\2\2Z]\7,\2\2[\\\7\34\2\2\\^\5\22\n\2][\3"+
		"\2\2\2]^\3\2\2\2^\21\3\2\2\2_`\5\60\31\2`\23\3\2\2\2ab\7\f\2\2bc\7,\2"+
		"\2cj\7\30\2\2di\5\26\f\2ei\5\30\r\2fi\5\32\16\2gi\5\34\17\2hd\3\2\2\2"+
		"he\3\2\2\2hf\3\2\2\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2"+
		"lj\3\2\2\2mn\5 \21\2no\7\31\2\2o\25\3\2\2\2pq\7\r\2\2qr\7\34\2\2rs\7\30"+
		"\2\2sx\5\36\20\2tu\7.\2\2uw\5\36\20\2vt\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy"+
		"\3\2\2\2y{\3\2\2\2zx\3\2\2\2{|\7\31\2\2|\27\3\2\2\2}~\7\17\2\2~\177\7"+
		"\34\2\2\177\u0080\7\30\2\2\u0080\u0085\7,\2\2\u0081\u0082\7.\2\2\u0082"+
		"\u0084\7,\2\2\u0083\u0081\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2"+
		"\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088"+
		"\u0089\7\31\2\2\u0089\31\3\2\2\2\u008a\u008b\7\20\2\2\u008b\u008c\7\34"+
		"\2\2\u008c\u008d\7\30\2\2\u008d\u0092\7,\2\2\u008e\u008f\7.\2\2\u008f"+
		"\u0091\7,\2\2\u0090\u008e\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2"+
		"\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095"+
		"\u0096\7\31\2\2\u0096\33\3\2\2\2\u0097\u0098\7\22\2\2\u0098\u0099\7\34"+
		"\2\2\u0099\u009d\7\30\2\2\u009a\u009c\5\"\22\2\u009b\u009a\3\2\2\2\u009c"+
		"\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2"+
		"\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\7\31\2\2\u00a1\35\3\2\2\2\u00a2\u00a6"+
		"\7,\2\2\u00a3\u00a4\7\25\2\2\u00a4\u00a5\7\34\2\2\u00a5\u00a7\5$\23\2"+
		"\u00a6\u00a3\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\37\3\2\2\2\u00a8\u00a9"+
		"\7\16\2\2\u00a9\u00aa\7\34\2\2\u00aa\u00ab\7,\2\2\u00ab!\3\2\2\2\u00ac"+
		"\u00ad\7\32\2\2\u00ad\u00ae\7\23\2\2\u00ae\u00af\7\34\2\2\u00af\u00b0"+
		"\7,\2\2\u00b0\u00b6\7.\2\2\u00b1\u00b2\7\26\2\2\u00b2\u00b3\7\34\2\2\u00b3"+
		"\u00b4\5$\23\2\u00b4\u00b5\7.\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b1\3\2"+
		"\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\7\21\2\2\u00b9"+
		"\u00ba\7\34\2\2\u00ba\u00bb\7,\2\2\u00bb\u00c6\7.\2\2\u00bc\u00bd\7\27"+
		"\2\2\u00bd\u00be\7\34\2\2\u00be\u00c2\7\30\2\2\u00bf\u00c1\7,\2\2\u00c0"+
		"\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2"+
		"\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c7\7\31\2\2\u00c6"+
		"\u00bc\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\7\24"+
		"\2\2\u00c9\u00ca\7\34\2\2\u00ca\u00cb\7,\2\2\u00cb\u00cc\7\33\2\2\u00cc"+
		"#\3\2\2\2\u00cd\u00d2\5&\24\2\u00ce\u00cf\t\2\2\2\u00cf\u00d1\5&\24\2"+
		"\u00d0\u00ce\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3"+
		"\3\2\2\2\u00d3%\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\5\60\31\2\u00d6"+
		"\'\3\2\2\2\u00d7\u00d8\7\t\2\2\u00d8\u00d9\7,\2\2\u00d9\u00da\7\32\2\2"+
		"\u00da\u00db\5*\26\2\u00db\u00dc\7\33\2\2\u00dc\u00dd\7\n\2\2\u00dd\u00de"+
		"\7\t\2\2\u00de\u00df\7\30\2\2\u00df\u00e0\5\4\3\2\u00e0\u00e1\7\31\2\2"+
		"\u00e1\u00f4\3\2\2\2\u00e2\u00e3\7\t\2\2\u00e3\u00e4\7,\2\2\u00e4\u00e5"+
		"\7\32\2\2\u00e5\u00e6\5*\26\2\u00e6\u00e7\7\33\2\2\u00e7\u00e8\7\n\2\2"+
		"\u00e8\u00e9\7\b\2\2\u00e9\u00ea\7\30\2\2\u00ea\u00eb\5\4\3\2\u00eb\u00ec"+
		"\7\31\2\2\u00ec\u00f4\3\2\2\2\u00ed\u00f4\7,\2\2\u00ee\u00ef\7,\2\2\u00ef"+
		"\u00f0\7\32\2\2\u00f0\u00f1\5.\30\2\u00f1\u00f2\7\33\2\2\u00f2\u00f4\3"+
		"\2\2\2\u00f3\u00d7\3\2\2\2\u00f3\u00e2\3\2\2\2\u00f3\u00ed\3\2\2\2\u00f3"+
		"\u00ee\3\2\2\2\u00f4)\3\2\2\2\u00f5\u00fa\5,\27\2\u00f6\u00f7\7.\2\2\u00f7"+
		"\u00f9\5,\27\2\u00f8\u00f6\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2"+
		"\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd"+
		"\u00f5\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe+\3\2\2\2\u00ff\u0100\5\16\b\2"+
		"\u0100\u0101\7,\2\2\u0101-\3\2\2\2\u0102\u0107\5\60\31\2\u0103\u0104\7"+
		".\2\2\u0104\u0106\5\60\31\2\u0105\u0103\3\2\2\2\u0106\u0109\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2"+
		"\2\2\u010a\u0102\3\2\2\2\u010a\u010b\3\2\2\2\u010b/\3\2\2\2\u010c\u010d"+
		"\b\31\1\2\u010d\u010e\t\3\2\2\u010e\u0119\5\60\31\t\u010f\u0119\7-\2\2"+
		"\u0110\u0119\7,\2\2\u0111\u0112\7\32\2\2\u0112\u0113\5\60\31\2\u0113\u0114"+
		"\7\33\2\2\u0114\u0119\3\2\2\2\u0115\u0116\7,\2\2\u0116\u0117\7\34\2\2"+
		"\u0117\u0119\5\60\31\3\u0118\u010c\3\2\2\2\u0118\u010f\3\2\2\2\u0118\u0110"+
		"\3\2\2\2\u0118\u0111\3\2\2\2\u0118\u0115\3\2\2\2\u0119\u0125\3\2\2\2\u011a"+
		"\u011b\f\n\2\2\u011b\u011c\t\4\2\2\u011c\u0124\5\60\31\13\u011d\u011e"+
		"\f\b\2\2\u011e\u011f\7\36\2\2\u011f\u0124\5\60\31\t\u0120\u0121\f\7\2"+
		"\2\u0121\u0122\t\3\2\2\u0122\u0124\5\60\31\b\u0123\u011a\3\2\2\2\u0123"+
		"\u011d\3\2\2\2\u0123\u0120\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2"+
		"\2\2\u0125\u0126\3\2\2\2\u0126\61\3\2\2\2\u0127\u0125\3\2\2\2\33\63:B"+
		"JU]hjx\u0085\u0092\u009d\u00a6\u00b6\u00c2\u00c6\u00d2\u00f3\u00fa\u00fd"+
		"\u0107\u010a\u0118\u0123\u0125";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}