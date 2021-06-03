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
		COMMENT=1, COMMENT_LINE=2, WS=3, LET=4, NUM=5, AUTOMATON=6, LOCATION=7, 
		CLOCK=8, ACTION=9, EDGES=10, INVARIANT=11, GUARD=12, RESET=13, L_C_BRACKET=14, 
		R_C_BRACKET=15, L_PARENTHESIS=16, R_PARENTHESIS=17, EQUAL=18, COLON=19, 
		MUL=20, DIV=21, SUM=22, SUB=23, LESS=24, GREATER=25, TRUE=26, FALSE=27, 
		AND=28, AND_SYMBOL=29, OR=30, OR_SYMBOL=31, NEQ_MARK=32, NEQ_LOG=33, IDENTIFIER=34, 
		DOUBLE=35, COMMA=36;
	public static final int
		RULE_model = 0, RULE_let = 1, RULE_declaration = 2, RULE_varDeclaration = 3, 
		RULE_type = 4, RULE_varId = 5, RULE_initialiser = 6, RULE_automaton = 7, 
		RULE_types_TA = 8, RULE_location = 9, RULE_edge = 10, RULE_guard = 11, 
		RULE_cons_guard = 12, RULE_expr = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"model", "let", "declaration", "varDeclaration", "type", "varId", "initialiser", 
			"automaton", "types_TA", "location", "edge", "guard", "cons_guard", "expr"
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
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LET) {
				{
				setState(28);
				let();
				}
			}

			setState(31);
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

	public static class LetContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(TAParser.LET, 0); }
		public TerminalNode L_C_BRACKET() { return getToken(TAParser.L_C_BRACKET, 0); }
		public TerminalNode R_C_BRACKET() { return getToken(TAParser.R_C_BRACKET, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
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
		enterRule(_localctx, 2, RULE_let);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(LET);
			setState(34);
			match(L_C_BRACKET);
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUM) {
				{
				{
				setState(35);
				declaration();
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(41);
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

	public static class DeclarationContext extends ParserRuleContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAParserVisitor ) return ((TAParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			varDeclaration();
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
		enterRule(_localctx, 6, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(45);
			type();
			setState(46);
			varId();
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(47);
				match(COMMA);
				setState(48);
				varId();
				}
				}
				setState(53);
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
		enterRule(_localctx, 8, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
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
		enterRule(_localctx, 10, RULE_varId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(IDENTIFIER);
			setState(57);
			match(EQUAL);
			setState(58);
			initialiser();
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
		enterRule(_localctx, 12, RULE_initialiser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
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
		enterRule(_localctx, 14, RULE_automaton);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(AUTOMATON);
			setState(63);
			match(IDENTIFIER);
			setState(64);
			match(L_C_BRACKET);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LOCATION) | (1L << CLOCK) | (1L << ACTION) | (1L << EDGES))) != 0)) {
				{
				{
				setState(65);
				types_TA();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
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
		enterRule(_localctx, 16, RULE_types_TA);
		int _la;
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOCATION:
				_localctx = new LocationTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(LOCATION);
				setState(74);
				match(EQUAL);
				setState(75);
				match(L_C_BRACKET);
				setState(76);
				location();
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(77);
					match(COMMA);
					setState(78);
					location();
					}
					}
					setState(83);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(84);
				match(R_C_BRACKET);
				}
				break;
			case CLOCK:
				_localctx = new ClockTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(CLOCK);
				setState(87);
				match(EQUAL);
				setState(88);
				match(L_C_BRACKET);
				setState(89);
				match(IDENTIFIER);
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(90);
					match(COMMA);
					setState(91);
					match(IDENTIFIER);
					}
					}
					setState(96);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(97);
				match(R_C_BRACKET);
				}
				break;
			case ACTION:
				_localctx = new ActionsTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				match(ACTION);
				setState(99);
				match(EQUAL);
				setState(100);
				match(L_C_BRACKET);
				setState(101);
				match(IDENTIFIER);
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(102);
					match(COMMA);
					setState(103);
					match(IDENTIFIER);
					}
					}
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(109);
				match(R_C_BRACKET);
				}
				break;
			case EDGES:
				_localctx = new EdgesTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(110);
				match(EDGES);
				setState(111);
				match(EQUAL);
				setState(112);
				match(L_C_BRACKET);
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==L_PARENTHESIS) {
					{
					{
					setState(113);
					edge();
					}
					}
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(119);
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
		enterRule(_localctx, 18, RULE_location);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(IDENTIFIER);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INVARIANT) {
				{
				setState(123);
				match(INVARIANT);
				setState(124);
				match(COLON);
				setState(125);
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
		enterRule(_localctx, 20, RULE_edge);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(L_PARENTHESIS);
			setState(129);
			((EdgeContext)_localctx).source = match(IDENTIFIER);
			setState(130);
			match(COMMA);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GUARD) {
				{
				setState(131);
				match(GUARD);
				setState(132);
				match(COLON);
				setState(133);
				guard();
				setState(134);
				match(COMMA);
				}
			}

			setState(138);
			((EdgeContext)_localctx).action = match(IDENTIFIER);
			setState(139);
			match(COMMA);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RESET) {
				{
				setState(140);
				match(RESET);
				setState(141);
				match(COLON);
				setState(142);
				match(L_C_BRACKET);
				setState(143);
				match(R_C_BRACKET);
				}
			}

			setState(146);
			((EdgeContext)_localctx).target = match(IDENTIFIER);
			setState(147);
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
		enterRule(_localctx, 22, RULE_guard);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			cons_guard();
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(150);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==AND_SYMBOL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(151);
					guard();
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LESS() { return getToken(TAParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(TAParser.GREATER, 0); }
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
		enterRule(_localctx, 24, RULE_cons_guard);
		int _la;
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				expr(0);
				setState(158);
				((Cons_guardContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LESS || _la==GREATER) ) {
					((Cons_guardContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(159);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				match(L_PARENTHESIS);
				setState(163);
				cons_guard();
				setState(164);
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
	public static class TrueExprContext extends ExprContext {
		public TerminalNode TRUE() { return getToken(TAParser.TRUE, 0); }
		public TrueExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).enterTrueExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).exitTrueExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAParserVisitor ) return ((TAParserVisitor<? extends T>)visitor).visitTrueExpr(this);
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
	public static class FalseExprqContext extends ExprContext {
		public TerminalNode FALSE() { return getToken(TAParser.FALSE, 0); }
		public FalseExprqContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).enterFalseExprq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TAParserListener ) ((TAParserListener)listener).exitFalseExprq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TAParserVisitor ) return ((TAParserVisitor<? extends T>)visitor).visitFalseExprq(this);
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
	public static class CompareExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LESS() { return getToken(TAParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(TAParser.GREATER, 0); }
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
		public TerminalNode SUB() { return getToken(TAParser.SUB, 0); }
		public TerminalNode SUM() { return getToken(TAParser.SUM, 0); }
		public TerminalNode NEQ_LOG() { return getToken(TAParser.NEQ_LOG, 0); }
		public TerminalNode NEQ_MARK() { return getToken(TAParser.NEQ_MARK, 0); }
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

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUM:
			case SUB:
			case NEQ_MARK:
			case NEQ_LOG:
				{
				_localctx = new UnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(169);
				((UnaryContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUM) | (1L << SUB) | (1L << NEQ_MARK) | (1L << NEQ_LOG))) != 0)) ) {
					((UnaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(170);
				expr(9);
				}
				break;
			case DOUBLE:
				{
				_localctx = new DoubleExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(171);
				match(DOUBLE);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				match(IDENTIFIER);
				}
				break;
			case TRUE:
				{
				_localctx = new TrueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				_localctx = new FalseExprqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				match(FALSE);
				}
				break;
			case L_PARENTHESIS:
				{
				_localctx = new ParensExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				match(L_PARENTHESIS);
				setState(176);
				expr(0);
				setState(177);
				match(R_PARENTHESIS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(190);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(181);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(182);
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
						setState(183);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new SumSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(184);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(185);
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
						setState(186);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new CompareExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(187);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(188);
						((CompareExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==LESS || _la==GREATER) ) {
							((CompareExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(189);
						expr(7);
						}
						break;
					}
					} 
				}
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		case 13:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u00c6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\5\2 \n\2\3\2\3\2\3\3\3\3\3"+
		"\3\7\3\'\n\3\f\3\16\3*\13\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\7\5\64\n\5"+
		"\f\5\16\5\67\13\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\7\t"+
		"E\n\t\f\t\16\tH\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7\nR\n\n\f\n\16\n"+
		"U\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n_\n\n\f\n\16\nb\13\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\7\nk\n\n\f\n\16\nn\13\n\3\n\3\n\3\n\3\n\3\n\7\nu"+
		"\n\n\f\n\16\nx\13\n\3\n\5\n{\n\n\3\13\3\13\3\13\3\13\5\13\u0081\n\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u008b\n\f\3\f\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u0093\n\f\3\f\3\f\3\f\3\r\3\r\3\r\7\r\u009b\n\r\f\r\16\r\u009e\13\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00a9\n\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00b6\n\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00c1\n\17\f\17\16\17\u00c4\13"+
		"\17\3\17\2\3\34\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\7\3\2\36\37\3"+
		"\2\32\33\4\2\30\31\"#\3\2\26\27\3\2\30\31\2\u00d0\2\37\3\2\2\2\4#\3\2"+
		"\2\2\6-\3\2\2\2\b/\3\2\2\2\n8\3\2\2\2\f:\3\2\2\2\16>\3\2\2\2\20@\3\2\2"+
		"\2\22z\3\2\2\2\24|\3\2\2\2\26\u0082\3\2\2\2\30\u0097\3\2\2\2\32\u00a8"+
		"\3\2\2\2\34\u00b5\3\2\2\2\36 \5\4\3\2\37\36\3\2\2\2\37 \3\2\2\2 !\3\2"+
		"\2\2!\"\5\20\t\2\"\3\3\2\2\2#$\7\6\2\2$(\7\20\2\2%\'\5\6\4\2&%\3\2\2\2"+
		"\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2)+\3\2\2\2*(\3\2\2\2+,\7\21\2\2,\5\3\2"+
		"\2\2-.\5\b\5\2.\7\3\2\2\2/\60\5\n\6\2\60\65\5\f\7\2\61\62\7&\2\2\62\64"+
		"\5\f\7\2\63\61\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\t"+
		"\3\2\2\2\67\65\3\2\2\289\7\7\2\29\13\3\2\2\2:;\7$\2\2;<\7\24\2\2<=\5\16"+
		"\b\2=\r\3\2\2\2>?\5\34\17\2?\17\3\2\2\2@A\7\b\2\2AB\7$\2\2BF\7\20\2\2"+
		"CE\5\22\n\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2"+
		"\2IJ\7\21\2\2J\21\3\2\2\2KL\7\t\2\2LM\7\24\2\2MN\7\20\2\2NS\5\24\13\2"+
		"OP\7&\2\2PR\5\24\13\2QO\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2"+
		"\2US\3\2\2\2VW\7\21\2\2W{\3\2\2\2XY\7\n\2\2YZ\7\24\2\2Z[\7\20\2\2[`\7"+
		"$\2\2\\]\7&\2\2]_\7$\2\2^\\\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3"+
		"\2\2\2b`\3\2\2\2c{\7\21\2\2de\7\13\2\2ef\7\24\2\2fg\7\20\2\2gl\7$\2\2"+
		"hi\7&\2\2ik\7$\2\2jh\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2n"+
		"l\3\2\2\2o{\7\21\2\2pq\7\f\2\2qr\7\24\2\2rv\7\20\2\2su\5\26\f\2ts\3\2"+
		"\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2\2\2y{\7\21\2\2zK\3"+
		"\2\2\2zX\3\2\2\2zd\3\2\2\2zp\3\2\2\2{\23\3\2\2\2|\u0080\7$\2\2}~\7\r\2"+
		"\2~\177\7\25\2\2\177\u0081\5\30\r\2\u0080}\3\2\2\2\u0080\u0081\3\2\2\2"+
		"\u0081\25\3\2\2\2\u0082\u0083\7\22\2\2\u0083\u0084\7$\2\2\u0084\u008a"+
		"\7&\2\2\u0085\u0086\7\16\2\2\u0086\u0087\7\25\2\2\u0087\u0088\5\30\r\2"+
		"\u0088\u0089\7&\2\2\u0089\u008b\3\2\2\2\u008a\u0085\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\7$\2\2\u008d\u0092\7&\2\2\u008e"+
		"\u008f\7\17\2\2\u008f\u0090\7\25\2\2\u0090\u0091\7\20\2\2\u0091\u0093"+
		"\7\21\2\2\u0092\u008e\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2"+
		"\u0094\u0095\7$\2\2\u0095\u0096\7\23\2\2\u0096\27\3\2\2\2\u0097\u009c"+
		"\5\32\16\2\u0098\u0099\t\2\2\2\u0099\u009b\5\30\r\2\u009a\u0098\3\2\2"+
		"\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\31"+
		"\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\5\34\17\2\u00a0\u00a1\t\3\2\2"+
		"\u00a1\u00a2\5\34\17\2\u00a2\u00a9\3\2\2\2\u00a3\u00a9\5\34\17\2\u00a4"+
		"\u00a5\7\22\2\2\u00a5\u00a6\5\32\16\2\u00a6\u00a7\7\23\2\2\u00a7\u00a9"+
		"\3\2\2\2\u00a8\u009f\3\2\2\2\u00a8\u00a3\3\2\2\2\u00a8\u00a4\3\2\2\2\u00a9"+
		"\33\3\2\2\2\u00aa\u00ab\b\17\1\2\u00ab\u00ac\t\4\2\2\u00ac\u00b6\5\34"+
		"\17\13\u00ad\u00b6\7%\2\2\u00ae\u00b6\7$\2\2\u00af\u00b6\7\34\2\2\u00b0"+
		"\u00b6\7\35\2\2\u00b1\u00b2\7\22\2\2\u00b2\u00b3\5\34\17\2\u00b3\u00b4"+
		"\7\23\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00aa\3\2\2\2\u00b5\u00ad\3\2\2\2"+
		"\u00b5\u00ae\3\2\2\2\u00b5\u00af\3\2\2\2\u00b5\u00b0\3\2\2\2\u00b5\u00b1"+
		"\3\2\2\2\u00b6\u00c2\3\2\2\2\u00b7\u00b8\f\n\2\2\u00b8\u00b9\t\5\2\2\u00b9"+
		"\u00c1\5\34\17\13\u00ba\u00bb\f\t\2\2\u00bb\u00bc\t\6\2\2\u00bc\u00c1"+
		"\5\34\17\n\u00bd\u00be\f\b\2\2\u00be\u00bf\t\3\2\2\u00bf\u00c1\5\34\17"+
		"\t\u00c0\u00b7\3\2\2\2\u00c0\u00ba\3\2\2\2\u00c0\u00bd\3\2\2\2\u00c1\u00c4"+
		"\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\35\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\23\37(\65FS`lvz\u0080\u008a\u0092\u009c\u00a8\u00b5\u00c0"+
		"\u00c2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}