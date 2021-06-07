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
		RETURN=9, AUTOMATON=10, LOCATION=11, CLOCK=12, ACTION=13, EDGES=14, INVARIANT=15, 
		GUARD=16, RESET=17, L_C_BRACKET=18, R_C_BRACKET=19, L_PARENTHESIS=20, 
		R_PARENTHESIS=21, EQUAL=22, COLON=23, MUL=24, DIV=25, ADD=26, SUB=27, 
		LESS_EQ=28, GREATER_EQ=29, TRUE=30, FALSE=31, AND=32, AND_SYMBOL=33, OR=34, 
		OR_SYMBOL=35, NEQ_MARK=36, NEQ_LOG=37, IDENTIFIER=38, DOUBLE=39, COMMA=40;
	public static final int
		RULE_model = 0, RULE_block = 1, RULE_let = 2, RULE_statement = 3, RULE_printStatement = 4, 
		RULE_varDeclaration = 5, RULE_type = 6, RULE_varId = 7, RULE_initialiser = 8, 
		RULE_automaton = 9, RULE_types_TA = 10, RULE_location = 11, RULE_edge = 12, 
		RULE_guard = 13, RULE_cons_guard = 14, RULE_funcExpr = 15, RULE_funcParameters = 16, 
		RULE_funcParameter = 17, RULE_arguments = 18, RULE_numExpr = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"model", "block", "let", "statement", "printStatement", "varDeclaration", 
			"type", "varId", "initialiser", "automaton", "types_TA", "location", 
			"edge", "guard", "cons_guard", "funcExpr", "funcParameters", "funcParameter", 
			"arguments", "numExpr"
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
			setState(40);
			let();
			setState(41);
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
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << NUM) | (1L << L_PARENTHESIS) | (1L << ADD) | (1L << SUB) | (1L << IDENTIFIER) | (1L << DOUBLE))) != 0)) {
				{
				{
				setState(43);
				statement();
				}
				}
				setState(48);
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
			setState(49);
			match(LET);
			setState(50);
			match(L_C_BRACKET);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << NUM) | (1L << L_PARENTHESIS) | (1L << ADD) | (1L << SUB) | (1L << IDENTIFIER) | (1L << DOUBLE))) != 0)) {
				{
				{
				setState(51);
				statement();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
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
	public static class NumExprStContext extends StatementContext {
		public NumExprContext numExpr() {
			return getRuleContext(NumExprContext.class,0);
		}
		public NumExprStContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).enterNumExprSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).exitNumExprSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAParserVisitor ) return ((TAParserVisitor<? extends T>)visitor).visitNumExprSt(this);
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
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				_localctx = new VarDeclarationStContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				varDeclaration();
				}
				break;
			case L_PARENTHESIS:
			case ADD:
			case SUB:
			case IDENTIFIER:
			case DOUBLE:
				_localctx = new NumExprStContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				numExpr(0);
				}
				break;
			case PRINT:
				_localctx = new PrintStContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
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
		public NumExprContext numExpr() {
			return getRuleContext(NumExprContext.class,0);
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
			setState(64);
			match(PRINT);
			setState(65);
			numExpr(0);
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
			setState(67);
			type();
			setState(68);
			varId();
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(69);
				match(COMMA);
				setState(70);
				varId();
				}
				}
				setState(75);
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
			setState(76);
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
			setState(78);
			match(IDENTIFIER);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(79);
				match(EQUAL);
				setState(80);
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
		public NumExprContext numExpr() {
			return getRuleContext(NumExprContext.class,0);
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
			setState(83);
			numExpr(0);
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
		public List<Types_TAContext> types_TA() {
			return getRuleContexts(Types_TAContext.class);
		}
		public Types_TAContext types_TA(int i) {
			return getRuleContext(Types_TAContext.class,i);
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
			setState(85);
			match(AUTOMATON);
			setState(86);
			match(IDENTIFIER);
			setState(87);
			match(L_C_BRACKET);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOCATION) | (1L << CLOCK) | (1L << ACTION) | (1L << EDGES))) != 0)) {
				{
				{
				setState(88);
				types_TA();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
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

	public static class Types_TAContext extends ParserRuleContext {
		public Types_TAContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_types_TA; }
	 
		public Types_TAContext() { }
		public void copyFrom(Types_TAContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ActionsTypeContext extends Types_TAContext {
		public TerminalNode ACTION() { return getToken(TAParser.ACTION, 0); }
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
		public ActionsTypeContext(Types_TAContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).enterActionsType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).exitActionsType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAParserVisitor ) return ((TAParserVisitor<? extends T>)visitor).visitActionsType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LocationTypeContext extends Types_TAContext {
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
		public LocationTypeContext(Types_TAContext ctx) { copyFrom(ctx); }
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
	public static class ClockTypeContext extends Types_TAContext {
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
		public ClockTypeContext(Types_TAContext ctx) { copyFrom(ctx); }
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
	public static class EdgesTypeContext extends Types_TAContext {
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
		public EdgesTypeContext(Types_TAContext ctx) { copyFrom(ctx); }
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

	public final Types_TAContext types_TA() throws RecognitionException {
		Types_TAContext _localctx = new Types_TAContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_types_TA);
		int _la;
		try {
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOCATION:
				_localctx = new LocationTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(LOCATION);
				setState(97);
				match(EQUAL);
				setState(98);
				match(L_C_BRACKET);
				setState(99);
				location();
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(100);
					match(COMMA);
					setState(101);
					location();
					}
					}
					setState(106);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(107);
				match(R_C_BRACKET);
				}
				break;
			case CLOCK:
				_localctx = new ClockTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(CLOCK);
				setState(110);
				match(EQUAL);
				setState(111);
				match(L_C_BRACKET);
				setState(112);
				match(IDENTIFIER);
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(113);
					match(COMMA);
					setState(114);
					match(IDENTIFIER);
					}
					}
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(120);
				match(R_C_BRACKET);
				}
				break;
			case ACTION:
				_localctx = new ActionsTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				match(ACTION);
				setState(122);
				match(EQUAL);
				setState(123);
				match(L_C_BRACKET);
				setState(124);
				match(IDENTIFIER);
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(125);
					match(COMMA);
					setState(126);
					match(IDENTIFIER);
					}
					}
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(132);
				match(R_C_BRACKET);
				}
				break;
			case EDGES:
				_localctx = new EdgesTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				match(EDGES);
				setState(134);
				match(EQUAL);
				setState(135);
				match(L_C_BRACKET);
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==L_PARENTHESIS) {
					{
					{
					setState(136);
					edge();
					}
					}
					setState(141);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(142);
				match(R_C_BRACKET);
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

	public static class LocationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TAParser.IDENTIFIER, 0); }
		public TerminalNode INVARIANT() { return getToken(TAParser.INVARIANT, 0); }
		public TerminalNode COLON() { return getToken(TAParser.COLON, 0); }
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
		enterRule(_localctx, 22, RULE_location);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(IDENTIFIER);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INVARIANT) {
				{
				setState(146);
				match(INVARIANT);
				setState(147);
				match(COLON);
				setState(148);
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
		public Token source;
		public Token action;
		public Token target;
		public TerminalNode L_PARENTHESIS() { return getToken(TAParser.L_PARENTHESIS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(TAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TAParser.COMMA, i);
		}
		public TerminalNode R_PARENTHESIS() { return getToken(TAParser.R_PARENTHESIS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(TAParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TAParser.IDENTIFIER, i);
		}
		public TerminalNode GUARD() { return getToken(TAParser.GUARD, 0); }
		public List<TerminalNode> COLON() { return getTokens(TAParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(TAParser.COLON, i);
		}
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
		enterRule(_localctx, 24, RULE_edge);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(L_PARENTHESIS);
			setState(152);
			((EdgeContext)_localctx).source = match(IDENTIFIER);
			setState(153);
			match(COMMA);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GUARD) {
				{
				setState(154);
				match(GUARD);
				setState(155);
				match(COLON);
				setState(156);
				guard();
				setState(157);
				match(COMMA);
				}
			}

			setState(161);
			((EdgeContext)_localctx).action = match(IDENTIFIER);
			setState(162);
			match(COMMA);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RESET) {
				{
				setState(163);
				match(RESET);
				setState(164);
				match(COLON);
				setState(165);
				match(L_C_BRACKET);
				setState(166);
				match(R_C_BRACKET);
				}
			}

			setState(169);
			((EdgeContext)_localctx).target = match(IDENTIFIER);
			setState(170);
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
		public Cons_guardContext cons_guard() {
			return getRuleContext(Cons_guardContext.class,0);
		}
		public List<GuardContext> guard() {
			return getRuleContexts(GuardContext.class);
		}
		public GuardContext guard(int i) {
			return getRuleContext(GuardContext.class,i);
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
		enterRule(_localctx, 26, RULE_guard);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			cons_guard();
			setState(177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(173);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==AND_SYMBOL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(174);
					guard();
					}
					} 
				}
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class Cons_guardContext extends ParserRuleContext {
		public Token op;
		public List<NumExprContext> numExpr() {
			return getRuleContexts(NumExprContext.class);
		}
		public NumExprContext numExpr(int i) {
			return getRuleContext(NumExprContext.class,i);
		}
		public TerminalNode LESS_EQ() { return getToken(TAParser.LESS_EQ, 0); }
		public TerminalNode GREATER_EQ() { return getToken(TAParser.GREATER_EQ, 0); }
		public TerminalNode L_PARENTHESIS() { return getToken(TAParser.L_PARENTHESIS, 0); }
		public Cons_guardContext cons_guard() {
			return getRuleContext(Cons_guardContext.class,0);
		}
		public TerminalNode R_PARENTHESIS() { return getToken(TAParser.R_PARENTHESIS, 0); }
		public Cons_guardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cons_guard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).enterCons_guard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).exitCons_guard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAParserVisitor ) return ((TAParserVisitor<? extends T>)visitor).visitCons_guard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cons_guardContext cons_guard() throws RecognitionException {
		Cons_guardContext _localctx = new Cons_guardContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_cons_guard);
		int _la;
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				numExpr(0);
				setState(181);
				((Cons_guardContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LESS_EQ || _la==GREATER_EQ) ) {
					((Cons_guardContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(182);
				numExpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				numExpr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				match(L_PARENTHESIS);
				setState(186);
				cons_guard();
				setState(187);
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
		enterRule(_localctx, 30, RULE_funcExpr);
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(FUNCTION);
				setState(192);
				match(IDENTIFIER);
				setState(193);
				match(L_PARENTHESIS);
				setState(194);
				funcParameters();
				setState(195);
				match(R_PARENTHESIS);
				setState(196);
				match(RETURNS);
				setState(197);
				match(FUNCTION);
				setState(198);
				match(L_C_BRACKET);
				setState(199);
				block();
				setState(200);
				match(R_C_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				match(FUNCTION);
				setState(203);
				match(IDENTIFIER);
				setState(204);
				match(L_PARENTHESIS);
				setState(205);
				funcParameters();
				setState(206);
				match(R_PARENTHESIS);
				setState(207);
				match(RETURNS);
				setState(208);
				match(NUM);
				setState(209);
				match(L_C_BRACKET);
				setState(210);
				block();
				setState(211);
				match(R_C_BRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				match(IDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(214);
				match(IDENTIFIER);
				setState(215);
				match(L_PARENTHESIS);
				setState(216);
				arguments();
				setState(217);
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
		enterRule(_localctx, 32, RULE_funcParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUM) {
				{
				setState(221);
				funcParameter();
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(222);
					match(COMMA);
					setState(223);
					funcParameter();
					}
					}
					setState(228);
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
		enterRule(_localctx, 34, RULE_funcParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			type();
			setState(232);
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
		public List<NumExprContext> numExpr() {
			return getRuleContexts(NumExprContext.class);
		}
		public NumExprContext numExpr(int i) {
			return getRuleContext(NumExprContext.class,i);
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
		enterRule(_localctx, 36, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << L_PARENTHESIS) | (1L << ADD) | (1L << SUB) | (1L << IDENTIFIER) | (1L << DOUBLE))) != 0)) {
				{
				setState(234);
				numExpr(0);
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(235);
					match(COMMA);
					setState(236);
					numExpr(0);
					}
					}
					setState(241);
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

	public static class NumExprContext extends ParserRuleContext {
		public NumExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numExpr; }
	 
		public NumExprContext() { }
		public void copyFrom(NumExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DoubleExprContext extends NumExprContext {
		public TerminalNode DOUBLE() { return getToken(TAParser.DOUBLE, 0); }
		public DoubleExprContext(NumExprContext ctx) { copyFrom(ctx); }
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
	public static class IdExprContext extends NumExprContext {
		public TerminalNode IDENTIFIER() { return getToken(TAParser.IDENTIFIER, 0); }
		public IdExprContext(NumExprContext ctx) { copyFrom(ctx); }
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
	public static class MulDivContext extends NumExprContext {
		public Token op;
		public List<NumExprContext> numExpr() {
			return getRuleContexts(NumExprContext.class);
		}
		public NumExprContext numExpr(int i) {
			return getRuleContext(NumExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(TAParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(TAParser.DIV, 0); }
		public MulDivContext(NumExprContext ctx) { copyFrom(ctx); }
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
	public static class AddSubContext extends NumExprContext {
		public Token op;
		public List<NumExprContext> numExpr() {
			return getRuleContexts(NumExprContext.class);
		}
		public NumExprContext numExpr(int i) {
			return getRuleContext(NumExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(TAParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(TAParser.SUB, 0); }
		public AddSubContext(NumExprContext ctx) { copyFrom(ctx); }
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
	public static class CompareExprContext extends NumExprContext {
		public Token op;
		public List<NumExprContext> numExpr() {
			return getRuleContexts(NumExprContext.class);
		}
		public NumExprContext numExpr(int i) {
			return getRuleContext(NumExprContext.class,i);
		}
		public TerminalNode LESS_EQ() { return getToken(TAParser.LESS_EQ, 0); }
		public TerminalNode GREATER_EQ() { return getToken(TAParser.GREATER_EQ, 0); }
		public CompareExprContext(NumExprContext ctx) { copyFrom(ctx); }
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
	public static class ParensExprContext extends NumExprContext {
		public TerminalNode L_PARENTHESIS() { return getToken(TAParser.L_PARENTHESIS, 0); }
		public NumExprContext numExpr() {
			return getRuleContext(NumExprContext.class,0);
		}
		public TerminalNode R_PARENTHESIS() { return getToken(TAParser.R_PARENTHESIS, 0); }
		public ParensExprContext(NumExprContext ctx) { copyFrom(ctx); }
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
	public static class UnaryContext extends NumExprContext {
		public Token op;
		public NumExprContext numExpr() {
			return getRuleContext(NumExprContext.class,0);
		}
		public TerminalNode ADD() { return getToken(TAParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(TAParser.SUB, 0); }
		public UnaryContext(NumExprContext ctx) { copyFrom(ctx); }
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
	public static class AssignExprContext extends NumExprContext {
		public TerminalNode IDENTIFIER() { return getToken(TAParser.IDENTIFIER, 0); }
		public TerminalNode EQUAL() { return getToken(TAParser.EQUAL, 0); }
		public NumExprContext numExpr() {
			return getRuleContext(NumExprContext.class,0);
		}
		public AssignExprContext(NumExprContext ctx) { copyFrom(ctx); }
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

	public final NumExprContext numExpr() throws RecognitionException {
		return numExpr(0);
	}

	private NumExprContext numExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NumExprContext _localctx = new NumExprContext(_ctx, _parentState);
		NumExprContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_numExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(245);
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
				setState(246);
				numExpr(8);
				}
				break;
			case 2:
				{
				_localctx = new DoubleExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(247);
				match(DOUBLE);
				}
				break;
			case 3:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(248);
				match(IDENTIFIER);
				}
				break;
			case 4:
				{
				_localctx = new ParensExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(249);
				match(L_PARENTHESIS);
				setState(250);
				numExpr(0);
				setState(251);
				match(R_PARENTHESIS);
				}
				break;
			case 5:
				{
				_localctx = new AssignExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(253);
				match(IDENTIFIER);
				setState(254);
				match(EQUAL);
				setState(255);
				numExpr(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(269);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(267);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new NumExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_numExpr);
						setState(258);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(259);
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
						setState(260);
						numExpr(8);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new NumExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_numExpr);
						setState(261);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(262);
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
						setState(263);
						numExpr(7);
						}
						break;
					case 3:
						{
						_localctx = new CompareExprContext(new NumExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_numExpr);
						setState(264);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(265);
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
						setState(266);
						numExpr(6);
						}
						break;
					}
					} 
				}
				setState(271);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		case 19:
			return numExpr_sempred((NumExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean numExpr_sempred(NumExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u0113\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\3\7\3/\n\3\f\3\16\3\62\13"+
		"\3\3\4\3\4\3\4\7\4\67\n\4\f\4\16\4:\13\4\3\4\3\4\3\5\3\5\3\5\5\5A\n\5"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7J\n\7\f\7\16\7M\13\7\3\b\3\b\3\t\3\t\3"+
		"\t\5\tT\n\t\3\n\3\n\3\13\3\13\3\13\3\13\7\13\\\n\13\f\13\16\13_\13\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\7\fi\n\f\f\f\16\fl\13\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\7\fv\n\f\f\f\16\fy\13\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\7\f\u0082\n\f\f\f\16\f\u0085\13\f\3\f\3\f\3\f\3\f\3\f\7\f\u008c\n\f"+
		"\f\f\16\f\u008f\13\f\3\f\5\f\u0092\n\f\3\r\3\r\3\r\3\r\5\r\u0098\n\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00a2\n\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u00aa\n\16\3\16\3\16\3\16\3\17\3\17\3\17\7\17\u00b2"+
		"\n\17\f\17\16\17\u00b5\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\5\20\u00c0\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u00de\n\21\3\22\3\22\3\22\7\22\u00e3\n\22\f"+
		"\22\16\22\u00e6\13\22\5\22\u00e8\n\22\3\23\3\23\3\23\3\24\3\24\3\24\7"+
		"\24\u00f0\n\24\f\24\16\24\u00f3\13\24\5\24\u00f5\n\24\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0103\n\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u010e\n\25\f\25\16\25\u0111\13"+
		"\25\3\25\2\3(\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\6\3\2"+
		"\"#\3\2\36\37\3\2\34\35\3\2\32\33\2\u0120\2*\3\2\2\2\4\60\3\2\2\2\6\63"+
		"\3\2\2\2\b@\3\2\2\2\nB\3\2\2\2\fE\3\2\2\2\16N\3\2\2\2\20P\3\2\2\2\22U"+
		"\3\2\2\2\24W\3\2\2\2\26\u0091\3\2\2\2\30\u0093\3\2\2\2\32\u0099\3\2\2"+
		"\2\34\u00ae\3\2\2\2\36\u00bf\3\2\2\2 \u00dd\3\2\2\2\"\u00e7\3\2\2\2$\u00e9"+
		"\3\2\2\2&\u00f4\3\2\2\2(\u0102\3\2\2\2*+\5\6\4\2+,\5\24\13\2,\3\3\2\2"+
		"\2-/\5\b\5\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\5\3\2"+
		"\2\2\62\60\3\2\2\2\63\64\7\6\2\2\648\7\24\2\2\65\67\5\b\5\2\66\65\3\2"+
		"\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2\2;<\7\25\2\2"+
		"<\7\3\2\2\2=A\5\f\7\2>A\5(\25\2?A\5\n\6\2@=\3\2\2\2@>\3\2\2\2@?\3\2\2"+
		"\2A\t\3\2\2\2BC\7\7\2\2CD\5(\25\2D\13\3\2\2\2EF\5\16\b\2FK\5\20\t\2GH"+
		"\7*\2\2HJ\5\20\t\2IG\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\r\3\2\2\2"+
		"MK\3\2\2\2NO\7\b\2\2O\17\3\2\2\2PS\7(\2\2QR\7\30\2\2RT\5\22\n\2SQ\3\2"+
		"\2\2ST\3\2\2\2T\21\3\2\2\2UV\5(\25\2V\23\3\2\2\2WX\7\f\2\2XY\7(\2\2Y]"+
		"\7\24\2\2Z\\\5\26\f\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2"+
		"\2_]\3\2\2\2`a\7\25\2\2a\25\3\2\2\2bc\7\r\2\2cd\7\30\2\2de\7\24\2\2ej"+
		"\5\30\r\2fg\7*\2\2gi\5\30\r\2hf\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2"+
		"km\3\2\2\2lj\3\2\2\2mn\7\25\2\2n\u0092\3\2\2\2op\7\16\2\2pq\7\30\2\2q"+
		"r\7\24\2\2rw\7(\2\2st\7*\2\2tv\7(\2\2us\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx"+
		"\3\2\2\2xz\3\2\2\2yw\3\2\2\2z\u0092\7\25\2\2{|\7\17\2\2|}\7\30\2\2}~\7"+
		"\24\2\2~\u0083\7(\2\2\177\u0080\7*\2\2\u0080\u0082\7(\2\2\u0081\177\3"+
		"\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0092\7\25\2\2\u0087\u0088\7"+
		"\20\2\2\u0088\u0089\7\30\2\2\u0089\u008d\7\24\2\2\u008a\u008c\5\32\16"+
		"\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e"+
		"\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0092\7\25\2\2"+
		"\u0091b\3\2\2\2\u0091o\3\2\2\2\u0091{\3\2\2\2\u0091\u0087\3\2\2\2\u0092"+
		"\27\3\2\2\2\u0093\u0097\7(\2\2\u0094\u0095\7\21\2\2\u0095\u0096\7\31\2"+
		"\2\u0096\u0098\5\34\17\2\u0097\u0094\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\31\3\2\2\2\u0099\u009a\7\26\2\2\u009a\u009b\7(\2\2\u009b\u00a1\7*\2\2"+
		"\u009c\u009d\7\22\2\2\u009d\u009e\7\31\2\2\u009e\u009f\5\34\17\2\u009f"+
		"\u00a0\7*\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009c\3\2\2\2\u00a1\u00a2\3\2"+
		"\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\7(\2\2\u00a4\u00a9\7*\2\2\u00a5\u00a6"+
		"\7\23\2\2\u00a6\u00a7\7\31\2\2\u00a7\u00a8\7\24\2\2\u00a8\u00aa\7\25\2"+
		"\2\u00a9\u00a5\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac"+
		"\7(\2\2\u00ac\u00ad\7\27\2\2\u00ad\33\3\2\2\2\u00ae\u00b3\5\36\20\2\u00af"+
		"\u00b0\t\2\2\2\u00b0\u00b2\5\34\17\2\u00b1\u00af\3\2\2\2\u00b2\u00b5\3"+
		"\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\35\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b6\u00b7\5(\25\2\u00b7\u00b8\t\3\2\2\u00b8\u00b9\5("+
		"\25\2\u00b9\u00c0\3\2\2\2\u00ba\u00c0\5(\25\2\u00bb\u00bc\7\26\2\2\u00bc"+
		"\u00bd\5\36\20\2\u00bd\u00be\7\27\2\2\u00be\u00c0\3\2\2\2\u00bf\u00b6"+
		"\3\2\2\2\u00bf\u00ba\3\2\2\2\u00bf\u00bb\3\2\2\2\u00c0\37\3\2\2\2\u00c1"+
		"\u00c2\7\t\2\2\u00c2\u00c3\7(\2\2\u00c3\u00c4\7\26\2\2\u00c4\u00c5\5\""+
		"\22\2\u00c5\u00c6\7\27\2\2\u00c6\u00c7\7\n\2\2\u00c7\u00c8\7\t\2\2\u00c8"+
		"\u00c9\7\24\2\2\u00c9\u00ca\5\4\3\2\u00ca\u00cb\7\25\2\2\u00cb\u00de\3"+
		"\2\2\2\u00cc\u00cd\7\t\2\2\u00cd\u00ce\7(\2\2\u00ce\u00cf\7\26\2\2\u00cf"+
		"\u00d0\5\"\22\2\u00d0\u00d1\7\27\2\2\u00d1\u00d2\7\n\2\2\u00d2\u00d3\7"+
		"\b\2\2\u00d3\u00d4\7\24\2\2\u00d4\u00d5\5\4\3\2\u00d5\u00d6\7\25\2\2\u00d6"+
		"\u00de\3\2\2\2\u00d7\u00de\7(\2\2\u00d8\u00d9\7(\2\2\u00d9\u00da\7\26"+
		"\2\2\u00da\u00db\5&\24\2\u00db\u00dc\7\27\2\2\u00dc\u00de\3\2\2\2\u00dd"+
		"\u00c1\3\2\2\2\u00dd\u00cc\3\2\2\2\u00dd\u00d7\3\2\2\2\u00dd\u00d8\3\2"+
		"\2\2\u00de!\3\2\2\2\u00df\u00e4\5$\23\2\u00e0\u00e1\7*\2\2\u00e1\u00e3"+
		"\5$\23\2\u00e2\u00e0\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00df\3\2"+
		"\2\2\u00e7\u00e8\3\2\2\2\u00e8#\3\2\2\2\u00e9\u00ea\5\16\b\2\u00ea\u00eb"+
		"\7(\2\2\u00eb%\3\2\2\2\u00ec\u00f1\5(\25\2\u00ed\u00ee\7*\2\2\u00ee\u00f0"+
		"\5(\25\2\u00ef\u00ed\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00ec\3\2"+
		"\2\2\u00f4\u00f5\3\2\2\2\u00f5\'\3\2\2\2\u00f6\u00f7\b\25\1\2\u00f7\u00f8"+
		"\t\4\2\2\u00f8\u0103\5(\25\n\u00f9\u0103\7)\2\2\u00fa\u0103\7(\2\2\u00fb"+
		"\u00fc\7\26\2\2\u00fc\u00fd\5(\25\2\u00fd\u00fe\7\27\2\2\u00fe\u0103\3"+
		"\2\2\2\u00ff\u0100\7(\2\2\u0100\u0101\7\30\2\2\u0101\u0103\5(\25\3\u0102"+
		"\u00f6\3\2\2\2\u0102\u00f9\3\2\2\2\u0102\u00fa\3\2\2\2\u0102\u00fb\3\2"+
		"\2\2\u0102\u00ff\3\2\2\2\u0103\u010f\3\2\2\2\u0104\u0105\f\t\2\2\u0105"+
		"\u0106\t\5\2\2\u0106\u010e\5(\25\n\u0107\u0108\f\b\2\2\u0108\u0109\t\4"+
		"\2\2\u0109\u010e\5(\25\t\u010a\u010b\f\7\2\2\u010b\u010c\t\3\2\2\u010c"+
		"\u010e\5(\25\b\u010d\u0104\3\2\2\2\u010d\u0107\3\2\2\2\u010d\u010a\3\2"+
		"\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		")\3\2\2\2\u0111\u010f\3\2\2\2\32\608@KS]jw\u0083\u008d\u0091\u0097\u00a1"+
		"\u00a9\u00b3\u00bf\u00dd\u00e4\u00e7\u00f1\u00f4\u0102\u010d\u010f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}