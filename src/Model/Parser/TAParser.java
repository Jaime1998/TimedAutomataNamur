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
		RETURN=9, AUTOMATON=10, LOCATION=11, CLOCK=12, ACTIONS=13, ACTION=14, 
		EDGES=15, SOURCE=16, TARGET=17, INVARIANT=18, GUARD=19, RESET=20, L_C_BRACKET=21, 
		R_C_BRACKET=22, L_PARENTHESIS=23, R_PARENTHESIS=24, EQUAL=25, COLON=26, 
		MUL=27, DIV=28, ADD=29, SUB=30, LESS_EQ=31, GREATER_EQ=32, TRUE=33, FALSE=34, 
		AND=35, AND_SYMBOL=36, OR=37, OR_SYMBOL=38, NEQ_MARK=39, NEQ_LOG=40, IDENTIFIER=41, 
		DOUBLE=42, COMMA=43;
	public static final int
		RULE_model = 0, RULE_block = 1, RULE_let = 2, RULE_statement = 3, RULE_printStatement = 4, 
		RULE_varDeclaration = 5, RULE_type = 6, RULE_varId = 7, RULE_initialiser = 8, 
		RULE_automaton = 9, RULE_locationType = 10, RULE_clockType = 11, RULE_actionType = 12, 
		RULE_edgesType = 13, RULE_location = 14, RULE_edge = 15, RULE_guard = 16, 
		RULE_consGuard = 17, RULE_funcExpr = 18, RULE_funcParameters = 19, RULE_funcParameter = 20, 
		RULE_arguments = 21, RULE_expr = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"model", "block", "let", "statement", "printStatement", "varDeclaration", 
			"type", "varId", "initialiser", "automaton", "locationType", "clockType", 
			"actionType", "edgesType", "location", "edge", "guard", "consGuard", 
			"funcExpr", "funcParameters", "funcParameter", "arguments", "expr"
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
		public LetContext let() {
			return getRuleContext(LetContext.class,0);
		}
		public AutomatonContext automaton() {
			return getRuleContext(AutomatonContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			let();
			setState(47);
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
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << NUM) | (1L << L_PARENTHESIS) | (1L << ADD) | (1L << SUB) | (1L << IDENTIFIER) | (1L << DOUBLE))) != 0)) {
				{
				{
				setState(49);
				statement();
				}
				}
				setState(54);
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
			setState(55);
			match(LET);
			setState(56);
			match(L_C_BRACKET);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << NUM) | (1L << L_PARENTHESIS) | (1L << ADD) | (1L << SUB) | (1L << IDENTIFIER) | (1L << DOUBLE))) != 0)) {
				{
				{
				setState(57);
				statement();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
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
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				_localctx = new VarDeclarationStContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
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
				setState(66);
				expr(0);
				}
				break;
			case PRINT:
				_localctx = new PrintStContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
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
			setState(70);
			match(PRINT);
			setState(71);
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
			setState(73);
			type();
			setState(74);
			varId();
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(75);
				match(COMMA);
				setState(76);
				varId();
				}
				}
				setState(81);
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
			setState(82);
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
			setState(84);
			match(IDENTIFIER);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(85);
				match(EQUAL);
				setState(86);
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
			setState(89);
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
			setState(91);
			match(AUTOMATON);
			setState(92);
			match(IDENTIFIER);
			setState(93);
			match(L_C_BRACKET);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOCATION) | (1L << CLOCK) | (1L << ACTIONS) | (1L << EDGES))) != 0)) {
				{
				setState(98);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LOCATION:
					{
					setState(94);
					locationType();
					}
					break;
				case CLOCK:
					{
					setState(95);
					clockType();
					}
					break;
				case ACTIONS:
					{
					setState(96);
					actionType();
					}
					break;
				case EDGES:
					{
					setState(97);
					edgesType();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
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
			setState(105);
			match(LOCATION);
			setState(106);
			match(EQUAL);
			setState(107);
			match(L_C_BRACKET);
			setState(108);
			location();
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(109);
				match(COMMA);
				setState(110);
				location();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
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
			setState(118);
			match(CLOCK);
			setState(119);
			match(EQUAL);
			setState(120);
			match(L_C_BRACKET);
			setState(121);
			match(IDENTIFIER);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(122);
				match(COMMA);
				setState(123);
				match(IDENTIFIER);
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
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
			setState(131);
			match(ACTIONS);
			setState(132);
			match(EQUAL);
			setState(133);
			match(L_C_BRACKET);
			setState(134);
			match(IDENTIFIER);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(135);
				match(COMMA);
				setState(136);
				match(IDENTIFIER);
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
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
			setState(144);
			match(EDGES);
			setState(145);
			match(EQUAL);
			setState(146);
			match(L_C_BRACKET);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==L_PARENTHESIS) {
				{
				{
				setState(147);
				edge();
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(153);
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
			setState(155);
			match(IDENTIFIER);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INVARIANT) {
				{
				setState(156);
				match(INVARIANT);
				setState(157);
				match(EQUAL);
				setState(158);
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
		enterRule(_localctx, 30, RULE_edge);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(L_PARENTHESIS);
			setState(162);
			match(SOURCE);
			setState(163);
			match(EQUAL);
			setState(164);
			match(IDENTIFIER);
			setState(165);
			match(COMMA);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GUARD) {
				{
				setState(166);
				match(GUARD);
				setState(167);
				match(EQUAL);
				setState(168);
				guard();
				setState(169);
				match(COMMA);
				}
			}

			setState(173);
			match(ACTION);
			setState(174);
			match(EQUAL);
			setState(175);
			match(IDENTIFIER);
			setState(176);
			match(COMMA);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RESET) {
				{
				setState(177);
				match(RESET);
				setState(178);
				match(EQUAL);
				setState(179);
				match(L_C_BRACKET);
				setState(180);
				match(R_C_BRACKET);
				}
			}

			setState(183);
			match(TARGET);
			setState(184);
			match(EQUAL);
			setState(185);
			match(IDENTIFIER);
			setState(186);
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
		public ConsGuardContext consGuard() {
			return getRuleContext(ConsGuardContext.class,0);
		}
		public GuardContext guard() {
			return getRuleContext(GuardContext.class,0);
		}
		public TerminalNode AND() { return getToken(TAParser.AND, 0); }
		public TerminalNode AND_SYMBOL() { return getToken(TAParser.AND_SYMBOL, 0); }
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
		enterRule(_localctx, 32, RULE_guard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			consGuard();
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND || _la==AND_SYMBOL) {
				{
				setState(189);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==AND_SYMBOL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(190);
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
		enterRule(_localctx, 34, RULE_consGuard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
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
		enterRule(_localctx, 36, RULE_funcExpr);
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(FUNCTION);
				setState(196);
				match(IDENTIFIER);
				setState(197);
				match(L_PARENTHESIS);
				setState(198);
				funcParameters();
				setState(199);
				match(R_PARENTHESIS);
				setState(200);
				match(RETURNS);
				setState(201);
				match(FUNCTION);
				setState(202);
				match(L_C_BRACKET);
				setState(203);
				block();
				setState(204);
				match(R_C_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				match(FUNCTION);
				setState(207);
				match(IDENTIFIER);
				setState(208);
				match(L_PARENTHESIS);
				setState(209);
				funcParameters();
				setState(210);
				match(R_PARENTHESIS);
				setState(211);
				match(RETURNS);
				setState(212);
				match(NUM);
				setState(213);
				match(L_C_BRACKET);
				setState(214);
				block();
				setState(215);
				match(R_C_BRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				match(IDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(218);
				match(IDENTIFIER);
				setState(219);
				match(L_PARENTHESIS);
				setState(220);
				arguments();
				setState(221);
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
		enterRule(_localctx, 38, RULE_funcParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUM) {
				{
				setState(225);
				funcParameter();
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(226);
					match(COMMA);
					setState(227);
					funcParameter();
					}
					}
					setState(232);
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
		enterRule(_localctx, 40, RULE_funcParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			type();
			setState(236);
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
		enterRule(_localctx, 42, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << L_PARENTHESIS) | (1L << ADD) | (1L << SUB) | (1L << IDENTIFIER) | (1L << DOUBLE))) != 0)) {
				{
				setState(238);
				expr(0);
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(239);
					match(COMMA);
					setState(240);
					expr(0);
					}
					}
					setState(245);
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
	public static class MulDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(TAParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(TAParser.DIV, 0); }
		public MulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).exitMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAParserVisitor ) return ((TAParserVisitor<? extends T>)visitor).visitMulDiv(this);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(249);
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
				setState(250);
				expr(7);
				}
				break;
			case 2:
				{
				_localctx = new DoubleExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(251);
				match(DOUBLE);
				}
				break;
			case 3:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(252);
				match(IDENTIFIER);
				}
				break;
			case 4:
				{
				_localctx = new ParensExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(253);
				match(L_PARENTHESIS);
				setState(254);
				expr(0);
				setState(255);
				match(R_PARENTHESIS);
				}
				break;
			case 5:
				{
				_localctx = new AssignExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(257);
				match(IDENTIFIER);
				setState(258);
				match(EQUAL);
				setState(259);
				expr(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(273);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(271);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new CompareExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(262);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(263);
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
						setState(264);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(265);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(266);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(267);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(268);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(269);
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
						setState(270);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(275);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		case 22:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u0117\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\3\7\3\65\n\3\f\3\16\38\13\3\3\4\3\4\3\4\7\4=\n\4\f\4\16\4@\13\4\3"+
		"\4\3\4\3\5\3\5\3\5\5\5G\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7P\n\7\f\7\16"+
		"\7S\13\7\3\b\3\b\3\t\3\t\3\t\5\tZ\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\7\13e\n\13\f\13\16\13h\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\7\fr\n\f\f\f\16\fu\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\177\n"+
		"\r\f\r\16\r\u0082\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u008c"+
		"\n\16\f\16\16\16\u008f\13\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u0097"+
		"\n\17\f\17\16\17\u009a\13\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u00a2"+
		"\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00ae\n\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00b8\n\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\5\22\u00c2\n\22\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00e2\n\24\3\25"+
		"\3\25\3\25\7\25\u00e7\n\25\f\25\16\25\u00ea\13\25\5\25\u00ec\n\25\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\7\27\u00f4\n\27\f\27\16\27\u00f7\13\27\5\27"+
		"\u00f9\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\5\30\u0107\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0112"+
		"\n\30\f\30\16\30\u0115\13\30\3\30\2\3.\31\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\2\6\3\2%&\3\2\37 \3\2!\"\3\2\35\36\2\u011f\2\60\3\2"+
		"\2\2\4\66\3\2\2\2\69\3\2\2\2\bF\3\2\2\2\nH\3\2\2\2\fK\3\2\2\2\16T\3\2"+
		"\2\2\20V\3\2\2\2\22[\3\2\2\2\24]\3\2\2\2\26k\3\2\2\2\30x\3\2\2\2\32\u0085"+
		"\3\2\2\2\34\u0092\3\2\2\2\36\u009d\3\2\2\2 \u00a3\3\2\2\2\"\u00be\3\2"+
		"\2\2$\u00c3\3\2\2\2&\u00e1\3\2\2\2(\u00eb\3\2\2\2*\u00ed\3\2\2\2,\u00f8"+
		"\3\2\2\2.\u0106\3\2\2\2\60\61\5\6\4\2\61\62\5\24\13\2\62\3\3\2\2\2\63"+
		"\65\5\b\5\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\5"+
		"\3\2\2\28\66\3\2\2\29:\7\6\2\2:>\7\27\2\2;=\5\b\5\2<;\3\2\2\2=@\3\2\2"+
		"\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2\2AB\7\30\2\2B\7\3\2\2\2CG\5\f"+
		"\7\2DG\5.\30\2EG\5\n\6\2FC\3\2\2\2FD\3\2\2\2FE\3\2\2\2G\t\3\2\2\2HI\7"+
		"\7\2\2IJ\5.\30\2J\13\3\2\2\2KL\5\16\b\2LQ\5\20\t\2MN\7-\2\2NP\5\20\t\2"+
		"OM\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\r\3\2\2\2SQ\3\2\2\2TU\7\b\2"+
		"\2U\17\3\2\2\2VY\7+\2\2WX\7\33\2\2XZ\5\22\n\2YW\3\2\2\2YZ\3\2\2\2Z\21"+
		"\3\2\2\2[\\\5.\30\2\\\23\3\2\2\2]^\7\f\2\2^_\7+\2\2_f\7\27\2\2`e\5\26"+
		"\f\2ae\5\30\r\2be\5\32\16\2ce\5\34\17\2d`\3\2\2\2da\3\2\2\2db\3\2\2\2"+
		"dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2ij\7\30\2"+
		"\2j\25\3\2\2\2kl\7\r\2\2lm\7\33\2\2mn\7\27\2\2ns\5\36\20\2op\7-\2\2pr"+
		"\5\36\20\2qo\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2"+
		"vw\7\30\2\2w\27\3\2\2\2xy\7\16\2\2yz\7\33\2\2z{\7\27\2\2{\u0080\7+\2\2"+
		"|}\7-\2\2}\177\7+\2\2~|\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7\30"+
		"\2\2\u0084\31\3\2\2\2\u0085\u0086\7\17\2\2\u0086\u0087\7\33\2\2\u0087"+
		"\u0088\7\27\2\2\u0088\u008d\7+\2\2\u0089\u008a\7-\2\2\u008a\u008c\7+\2"+
		"\2\u008b\u0089\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e"+
		"\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\7\30\2\2"+
		"\u0091\33\3\2\2\2\u0092\u0093\7\21\2\2\u0093\u0094\7\33\2\2\u0094\u0098"+
		"\7\27\2\2\u0095\u0097\5 \21\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2"+
		"\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0098"+
		"\3\2\2\2\u009b\u009c\7\30\2\2\u009c\35\3\2\2\2\u009d\u00a1\7+\2\2\u009e"+
		"\u009f\7\24\2\2\u009f\u00a0\7\33\2\2\u00a0\u00a2\5\"\22\2\u00a1\u009e"+
		"\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\37\3\2\2\2\u00a3\u00a4\7\31\2\2\u00a4"+
		"\u00a5\7\22\2\2\u00a5\u00a6\7\33\2\2\u00a6\u00a7\7+\2\2\u00a7\u00ad\7"+
		"-\2\2\u00a8\u00a9\7\25\2\2\u00a9\u00aa\7\33\2\2\u00aa\u00ab\5\"\22\2\u00ab"+
		"\u00ac\7-\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00a8\3\2\2\2\u00ad\u00ae\3\2"+
		"\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\7\20\2\2\u00b0\u00b1\7\33\2\2\u00b1"+
		"\u00b2\7+\2\2\u00b2\u00b7\7-\2\2\u00b3\u00b4\7\26\2\2\u00b4\u00b5\7\33"+
		"\2\2\u00b5\u00b6\7\27\2\2\u00b6\u00b8\7\30\2\2\u00b7\u00b3\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\7\23\2\2\u00ba\u00bb\7"+
		"\33\2\2\u00bb\u00bc\7+\2\2\u00bc\u00bd\7\32\2\2\u00bd!\3\2\2\2\u00be\u00c1"+
		"\5$\23\2\u00bf\u00c0\t\2\2\2\u00c0\u00c2\5\"\22\2\u00c1\u00bf\3\2\2\2"+
		"\u00c1\u00c2\3\2\2\2\u00c2#\3\2\2\2\u00c3\u00c4\5.\30\2\u00c4%\3\2\2\2"+
		"\u00c5\u00c6\7\t\2\2\u00c6\u00c7\7+\2\2\u00c7\u00c8\7\31\2\2\u00c8\u00c9"+
		"\5(\25\2\u00c9\u00ca\7\32\2\2\u00ca\u00cb\7\n\2\2\u00cb\u00cc\7\t\2\2"+
		"\u00cc\u00cd\7\27\2\2\u00cd\u00ce\5\4\3\2\u00ce\u00cf\7\30\2\2\u00cf\u00e2"+
		"\3\2\2\2\u00d0\u00d1\7\t\2\2\u00d1\u00d2\7+\2\2\u00d2\u00d3\7\31\2\2\u00d3"+
		"\u00d4\5(\25\2\u00d4\u00d5\7\32\2\2\u00d5\u00d6\7\n\2\2\u00d6\u00d7\7"+
		"\b\2\2\u00d7\u00d8\7\27\2\2\u00d8\u00d9\5\4\3\2\u00d9\u00da\7\30\2\2\u00da"+
		"\u00e2\3\2\2\2\u00db\u00e2\7+\2\2\u00dc\u00dd\7+\2\2\u00dd\u00de\7\31"+
		"\2\2\u00de\u00df\5,\27\2\u00df\u00e0\7\32\2\2\u00e0\u00e2\3\2\2\2\u00e1"+
		"\u00c5\3\2\2\2\u00e1\u00d0\3\2\2\2\u00e1\u00db\3\2\2\2\u00e1\u00dc\3\2"+
		"\2\2\u00e2\'\3\2\2\2\u00e3\u00e8\5*\26\2\u00e4\u00e5\7-\2\2\u00e5\u00e7"+
		"\5*\26\2\u00e6\u00e4\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00e3\3\2"+
		"\2\2\u00eb\u00ec\3\2\2\2\u00ec)\3\2\2\2\u00ed\u00ee\5\16\b\2\u00ee\u00ef"+
		"\7+\2\2\u00ef+\3\2\2\2\u00f0\u00f5\5.\30\2\u00f1\u00f2\7-\2\2\u00f2\u00f4"+
		"\5.\30\2\u00f3\u00f1\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00f0\3\2"+
		"\2\2\u00f8\u00f9\3\2\2\2\u00f9-\3\2\2\2\u00fa\u00fb\b\30\1\2\u00fb\u00fc"+
		"\t\3\2\2\u00fc\u0107\5.\30\t\u00fd\u0107\7,\2\2\u00fe\u0107\7+\2\2\u00ff"+
		"\u0100\7\31\2\2\u0100\u0101\5.\30\2\u0101\u0102\7\32\2\2\u0102\u0107\3"+
		"\2\2\2\u0103\u0104\7+\2\2\u0104\u0105\7\33\2\2\u0105\u0107\5.\30\3\u0106"+
		"\u00fa\3\2\2\2\u0106\u00fd\3\2\2\2\u0106\u00fe\3\2\2\2\u0106\u00ff\3\2"+
		"\2\2\u0106\u0103\3\2\2\2\u0107\u0113\3\2\2\2\u0108\u0109\f\n\2\2\u0109"+
		"\u010a\t\4\2\2\u010a\u0112\5.\30\13\u010b\u010c\f\b\2\2\u010c\u010d\t"+
		"\5\2\2\u010d\u0112\5.\30\t\u010e\u010f\f\7\2\2\u010f\u0110\t\3\2\2\u0110"+
		"\u0112\5.\30\b\u0111\u0108\3\2\2\2\u0111\u010b\3\2\2\2\u0111\u010e\3\2"+
		"\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"/\3\2\2\2\u0115\u0113\3\2\2\2\31\66>FQYdfs\u0080\u008d\u0098\u00a1\u00ad"+
		"\u00b7\u00c1\u00e1\u00e8\u00eb\u00f5\u00f8\u0106\u0111\u0113";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}