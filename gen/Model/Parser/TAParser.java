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
		COMMENT=1, COMMENT_LINE=2, WS=3, AUTOMATON=4, LOCATIONS=5, CLOCKS=6, ACTIONS=7, 
		L_C_BRACKET=8, R_C_BRACKET=9, L_PARENTHESIS=10, R_PARENTHESIS=11, EQUAL=12, 
		COLON=13, MUL=14, DIV=15, SUM=16, SUB=17, AND=18, OR=19, NEQ=20, NEQ_MARK=21, 
		IDENTIFIER=22, INT=23, DOUBLE=24, COMMA=25;
	public static final int
		RULE_model = 0, RULE_automaton = 1, RULE_loc = 2, RULE_clock = 3, RULE_actions = 4, 
		RULE_boolean = 5, RULE_expr = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"model", "automaton", "loc", "clock", "actions", "boolean", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'automaton'", "'locations'", "'clocks'", "'actions'", 
			"'{'", "'}'", "'('", "')'", "'='", "':'", "'*'", "'/'", "'+'", "'-'", 
			"'and'", "'or'", "'\u00C2\u00AC'", "'!'", null, null, null, "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "COMMENT_LINE", "WS", "AUTOMATON", "LOCATIONS", "CLOCKS", 
			"ACTIONS", "L_C_BRACKET", "R_C_BRACKET", "L_PARENTHESIS", "R_PARENTHESIS", 
			"EQUAL", "COLON", "MUL", "DIV", "SUM", "SUB", "AND", "OR", "NEQ", "NEQ_MARK", 
			"IDENTIFIER", "INT", "DOUBLE", "COMMA"
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
		public List<AutomatonContext> automaton() {
			return getRuleContexts(AutomatonContext.class);
		}
		public AutomatonContext automaton(int i) {
			return getRuleContext(AutomatonContext.class,i);
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
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14);
				automaton();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==AUTOMATON );
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
		public List<LocContext> loc() {
			return getRuleContexts(LocContext.class);
		}
		public LocContext loc(int i) {
			return getRuleContext(LocContext.class,i);
		}
		public ClockContext clock() {
			return getRuleContext(ClockContext.class,0);
		}
		public ActionsContext actions() {
			return getRuleContext(ActionsContext.class,0);
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
		enterRule(_localctx, 2, RULE_automaton);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(AUTOMATON);
			setState(20);
			match(IDENTIFIER);
			setState(21);
			match(L_C_BRACKET);
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				loc();
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LOCATIONS );
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLOCKS) {
				{
				setState(27);
				clock();
				}
			}

			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACTIONS) {
				{
				setState(30);
				actions();
				}
			}

			setState(33);
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

	public static class LocContext extends ParserRuleContext {
		public TerminalNode LOCATIONS() { return getToken(TAParser.LOCATIONS, 0); }
		public TerminalNode EQUAL() { return getToken(TAParser.EQUAL, 0); }
		public TerminalNode L_C_BRACKET() { return getToken(TAParser.L_C_BRACKET, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(TAParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(TAParser.IDENTIFIER, i);
		}
		public TerminalNode R_C_BRACKET() { return getToken(TAParser.R_C_BRACKET, 0); }
		public List<TerminalNode> COLON() { return getTokens(TAParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(TAParser.COLON, i);
		}
		public List<BooleanContext> boolean() {
			return getRuleContexts(BooleanContext.class);
		}
		public BooleanContext boolean(int i) {
			return getRuleContext(BooleanContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TAParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TAParser.COMMA, i);
		}
		public LocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).enterLoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).exitLoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAParserVisitor ) return ((TAParserVisitor<? extends T>)visitor).visitLoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocContext loc() throws RecognitionException {
		LocContext _localctx = new LocContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_loc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(LOCATIONS);
			setState(36);
			match(EQUAL);
			setState(37);
			match(L_C_BRACKET);
			setState(38);
			match(IDENTIFIER);
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(39);
				match(COLON);
				setState(40);
				boolean(0);
				}
			}

			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(43);
				match(COMMA);
				setState(44);
				match(IDENTIFIER);
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(45);
					match(COLON);
					setState(46);
					boolean(0);
					}
				}

				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
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

	public static class ClockContext extends ParserRuleContext {
		public TerminalNode CLOCKS() { return getToken(TAParser.CLOCKS, 0); }
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
		public ClockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).enterClock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).exitClock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAParserVisitor ) return ((TAParserVisitor<? extends T>)visitor).visitClock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClockContext clock() throws RecognitionException {
		ClockContext _localctx = new ClockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_clock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(CLOCKS);
			setState(57);
			match(EQUAL);
			setState(58);
			match(L_C_BRACKET);
			setState(59);
			match(IDENTIFIER);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(60);
				match(COMMA);
				setState(61);
				match(IDENTIFIER);
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

	public static class ActionsContext extends ParserRuleContext {
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
		public ActionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).enterActions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).exitActions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAParserVisitor ) return ((TAParserVisitor<? extends T>)visitor).visitActions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionsContext actions() throws RecognitionException {
		ActionsContext _localctx = new ActionsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_actions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(ACTIONS);
			setState(70);
			match(EQUAL);
			setState(71);
			match(L_C_BRACKET);
			setState(72);
			match(IDENTIFIER);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(73);
				match(COMMA);
				setState(74);
				match(IDENTIFIER);
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
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

	public static class BooleanContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(TAParser.INT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(TAParser.IDENTIFIER, 0); }
		public TerminalNode NEQ() { return getToken(TAParser.NEQ, 0); }
		public List<BooleanContext> boolean() {
			return getRuleContexts(BooleanContext.class);
		}
		public BooleanContext boolean(int i) {
			return getRuleContext(BooleanContext.class,i);
		}
		public TerminalNode NEQ_MARK() { return getToken(TAParser.NEQ_MARK, 0); }
		public TerminalNode AND() { return getToken(TAParser.AND, 0); }
		public TerminalNode OR() { return getToken(TAParser.OR, 0); }
		public BooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).exitBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAParserVisitor ) return ((TAParserVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanContext boolean() throws RecognitionException {
		return boolean(0);
	}

	private BooleanContext boolean(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanContext _localctx = new BooleanContext(_ctx, _parentState);
		BooleanContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_boolean, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(83);
				match(INT);
				}
				break;
			case IDENTIFIER:
				{
				setState(84);
				match(IDENTIFIER);
				}
				break;
			case NEQ:
				{
				setState(85);
				match(NEQ);
				setState(86);
				boolean(2);
				}
				break;
			case NEQ_MARK:
				{
				setState(87);
				match(NEQ_MARK);
				setState(88);
				boolean(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(97);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_boolean);
						setState(91);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(92);
						match(AND);
						setState(93);
						boolean(7);
						}
						break;
					case 2:
						{
						_localctx = new BooleanContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_boolean);
						setState(94);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(95);
						match(OR);
						setState(96);
						boolean(6);
						}
						break;
					}
					} 
				}
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
	public static class SumSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SUM() { return getToken(TAParser.SUM, 0); }
		public TerminalNode SUB() { return getToken(TAParser.SUB, 0); }
		public SumSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).enterSumSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).exitSumSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAParserVisitor ) return ((TAParserVisitor<? extends T>)visitor).visitSumSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerExprContext extends ExprContext {
		public TerminalNode INT() { return getToken(TAParser.INT, 0); }
		public IntegerExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).enterIntegerExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).exitIntegerExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAParserVisitor ) return ((TAParserVisitor<? extends T>)visitor).visitIntegerExpr(this);
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

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				_localctx = new IntegerExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(103);
				match(INT);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(104);
				match(IDENTIFIER);
				}
				break;
			case L_PARENTHESIS:
				{
				_localctx = new ParensExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(105);
				match(L_PARENTHESIS);
				setState(106);
				expr(0);
				setState(107);
				match(R_PARENTHESIS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(117);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(111);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(112);
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
						setState(113);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new SumSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(114);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(115);
						((SumSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==SUM || _la==SUB) ) {
							((SumSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(116);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(121);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return boolean_sempred((BooleanContext)_localctx, predIndex);
		case 6:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean boolean_sempred(BooleanContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33}\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\6\2\22\n\2\r\2\16\2\23"+
		"\3\3\3\3\3\3\3\3\6\3\32\n\3\r\3\16\3\33\3\3\5\3\37\n\3\3\3\5\3\"\n\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4,\n\4\3\4\3\4\3\4\3\4\5\4\62\n\4\7\4"+
		"\64\n\4\f\4\16\4\67\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5A\n\5\f\5"+
		"\16\5D\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6N\n\6\f\6\16\6Q\13\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\\\n\7\3\7\3\7\3\7\3\7\3\7\3\7\7"+
		"\7d\n\7\f\7\16\7g\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bp\n\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\7\bx\n\b\f\b\16\b{\13\b\3\b\2\4\f\16\t\2\4\6\b\n\f\16\2"+
		"\4\3\2\20\21\3\2\22\23\2\u0087\2\21\3\2\2\2\4\25\3\2\2\2\6%\3\2\2\2\b"+
		":\3\2\2\2\nG\3\2\2\2\f[\3\2\2\2\16o\3\2\2\2\20\22\5\4\3\2\21\20\3\2\2"+
		"\2\22\23\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\3\3\2\2\2\25\26\7\6\2"+
		"\2\26\27\7\30\2\2\27\31\7\n\2\2\30\32\5\6\4\2\31\30\3\2\2\2\32\33\3\2"+
		"\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\36\3\2\2\2\35\37\5\b\5\2\36\35\3\2"+
		"\2\2\36\37\3\2\2\2\37!\3\2\2\2 \"\5\n\6\2! \3\2\2\2!\"\3\2\2\2\"#\3\2"+
		"\2\2#$\7\13\2\2$\5\3\2\2\2%&\7\7\2\2&\'\7\16\2\2\'(\7\n\2\2(+\7\30\2\2"+
		")*\7\17\2\2*,\5\f\7\2+)\3\2\2\2+,\3\2\2\2,\65\3\2\2\2-.\7\33\2\2.\61\7"+
		"\30\2\2/\60\7\17\2\2\60\62\5\f\7\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2"+
		"\2\2\63-\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2"+
		"\67\65\3\2\2\289\7\13\2\29\7\3\2\2\2:;\7\b\2\2;<\7\16\2\2<=\7\n\2\2=B"+
		"\7\30\2\2>?\7\33\2\2?A\7\30\2\2@>\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2"+
		"\2CE\3\2\2\2DB\3\2\2\2EF\7\13\2\2F\t\3\2\2\2GH\7\t\2\2HI\7\16\2\2IJ\7"+
		"\n\2\2JO\7\30\2\2KL\7\33\2\2LN\7\30\2\2MK\3\2\2\2NQ\3\2\2\2OM\3\2\2\2"+
		"OP\3\2\2\2PR\3\2\2\2QO\3\2\2\2RS\7\13\2\2S\13\3\2\2\2TU\b\7\1\2U\\\7\31"+
		"\2\2V\\\7\30\2\2WX\7\26\2\2X\\\5\f\7\4YZ\7\27\2\2Z\\\5\f\7\3[T\3\2\2\2"+
		"[V\3\2\2\2[W\3\2\2\2[Y\3\2\2\2\\e\3\2\2\2]^\f\b\2\2^_\7\24\2\2_d\5\f\7"+
		"\t`a\f\7\2\2ab\7\25\2\2bd\5\f\7\bc]\3\2\2\2c`\3\2\2\2dg\3\2\2\2ec\3\2"+
		"\2\2ef\3\2\2\2f\r\3\2\2\2ge\3\2\2\2hi\b\b\1\2ip\7\31\2\2jp\7\30\2\2kl"+
		"\7\f\2\2lm\5\16\b\2mn\7\r\2\2np\3\2\2\2oh\3\2\2\2oj\3\2\2\2ok\3\2\2\2"+
		"py\3\2\2\2qr\f\7\2\2rs\t\2\2\2sx\5\16\b\btu\f\6\2\2uv\t\3\2\2vx\5\16\b"+
		"\7wq\3\2\2\2wt\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\17\3\2\2\2{y\3\2"+
		"\2\2\21\23\33\36!+\61\65BO[ceowy";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}