package desi;

// Generated from ./src/desi/grammar/DesiGrammar.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DesiGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, DIGITS=14, BOOLEAN=15, ADD=16, 
		SUB=17, MUL=18, DIV=19, AND=20, OR=21, LESSER=22, GREATER=23, LESS_or_EQU=24, 
		MORE_or_EQU=25, NotEquals=26, ISEquals=27, IDENTIFIER=28, EQUALSto=29, 
		WS=30, Comment=31;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_command = 2, RULE_expression = 3, 
		RULE_bool_expressn = 4, RULE_comp_expressn = 5, RULE_num_expressn = 6, 
		RULE_cond_expressn = 7, RULE_ifExpressn = 8, RULE_elseIfExpressn = 9, 
		RULE_elseExpressn = 10, RULE_whileExpressn = 11, RULE_print = 12;
	public static final String[] ruleNames = {
		"program", "block", "command", "expression", "bool_expressn", "comp_expressn", 
		"num_expressn", "cond_expressn", "ifExpressn", "elseIfExpressn", "elseExpressn", 
		"whileExpressn", "print"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'shuru'", "'khatam'", "'int'", "'boolean'", "'('", "')'", "'agar'", 
		"'bas'", "'magar'", "'nahitoh'", "'jabtak'", "'tabtak'", "'dikhao'", null, 
		null, "'+'", "'-'", "'*'", "'/'", "'&&'", "'||'", "'<'", "'>'", "'<='", 
		"'>='", "'!='", "'=='", null, "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "DIGITS", "BOOLEAN", "ADD", "SUB", "MUL", "DIV", "AND", "OR", 
		"LESSER", "GREATER", "LESS_or_EQU", "MORE_or_EQU", "NotEquals", "ISEquals", 
		"IDENTIFIER", "EQUALSto", "WS", "Comment"
	};
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
	public String getGrammarFileName() { return "DesiGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DesiGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesiGrammarVisitor ) return ((DesiGrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(T__0);
			setState(27);
			block();
			setState(28);
			match(T__1);
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
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesiGrammarVisitor ) return ((DesiGrammarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__2:
			case T__3:
			case T__6:
			case T__10:
			case T__12:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(32); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(31);
					command();
					}
					}
					setState(34); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__6) | (1L << T__10) | (1L << T__12) | (1L << IDENTIFIER))) != 0) );
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

	public static class CommandContext extends ParserRuleContext {
		public IfExpressnContext ifExpressn() {
			return getRuleContext(IfExpressnContext.class,0);
		}
		public WhileExpressnContext whileExpressn() {
			return getRuleContext(WhileExpressnContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesiGrammarVisitor ) return ((DesiGrammarVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				{
				setState(38);
				ifExpressn();
				}
				break;
			case T__10:
				{
				setState(39);
				whileExpressn();
				}
				break;
			case T__12:
				{
				setState(40);
				print();
				}
				break;
			case T__2:
			case T__3:
			case IDENTIFIER:
				{
				setState(41);
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignmentIntegerContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(DesiGrammarParser.IDENTIFIER, 0); }
		public TerminalNode EQUALSto() { return getToken(DesiGrammarParser.EQUALSto, 0); }
		public Num_expressnContext num_expressn() {
			return getRuleContext(Num_expressnContext.class,0);
		}
		public AssignmentIntegerContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).enterAssignmentInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).exitAssignmentInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesiGrammarVisitor ) return ((DesiGrammarVisitor<? extends T>)visitor).visitAssignmentInteger(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentBooleanContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(DesiGrammarParser.IDENTIFIER, 0); }
		public TerminalNode EQUALSto() { return getToken(DesiGrammarParser.EQUALSto, 0); }
		public Bool_expressnContext bool_expressn() {
			return getRuleContext(Bool_expressnContext.class,0);
		}
		public AssignmentBooleanContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).enterAssignmentBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).exitAssignmentBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesiGrammarVisitor ) return ((DesiGrammarVisitor<? extends T>)visitor).visitAssignmentBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expression);
		int _la;
		try {
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new AssignmentIntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				match(T__2);
				setState(45);
				match(IDENTIFIER);
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUALSto) {
					{
					setState(46);
					match(EQUALSto);
					setState(47);
					num_expressn(0);
					}
				}

				}
				break;
			case 2:
				_localctx = new AssignmentBooleanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				match(T__3);
				setState(51);
				match(IDENTIFIER);
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUALSto) {
					{
					setState(52);
					match(EQUALSto);
					setState(53);
					bool_expressn(0);
					}
				}

				}
				break;
			case 3:
				_localctx = new AssignmentIntegerContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				match(IDENTIFIER);
				setState(57);
				match(EQUALSto);
				setState(58);
				num_expressn(0);
				}
				break;
			case 4:
				_localctx = new AssignmentBooleanContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(59);
				match(IDENTIFIER);
				setState(60);
				match(EQUALSto);
				setState(61);
				bool_expressn(0);
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

	public static class Bool_expressnContext extends ParserRuleContext {
		public Bool_expressnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expressn; }
	 
		public Bool_expressnContext() { }
		public void copyFrom(Bool_expressnContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionBooleanParenthesesContext extends Bool_expressnContext {
		public Bool_expressnContext bool_expressn() {
			return getRuleContext(Bool_expressnContext.class,0);
		}
		public ExpressionBooleanParenthesesContext(Bool_expressnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).enterExpressionBooleanParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).exitExpressionBooleanParentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesiGrammarVisitor ) return ((DesiGrammarVisitor<? extends T>)visitor).visitExpressionBooleanParentheses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionBooleanContext extends Bool_expressnContext {
		public Token op;
		public List<Bool_expressnContext> bool_expressn() {
			return getRuleContexts(Bool_expressnContext.class);
		}
		public Bool_expressnContext bool_expressn(int i) {
			return getRuleContext(Bool_expressnContext.class,i);
		}
		public TerminalNode ISEquals() { return getToken(DesiGrammarParser.ISEquals, 0); }
		public TerminalNode NotEquals() { return getToken(DesiGrammarParser.NotEquals, 0); }
		public ExpressionBooleanContext(Bool_expressnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).enterExpressionBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).exitExpressionBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesiGrammarVisitor ) return ((DesiGrammarVisitor<? extends T>)visitor).visitExpressionBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionBooleanComparisonContext extends Bool_expressnContext {
		public Comp_expressnContext comp_expressn() {
			return getRuleContext(Comp_expressnContext.class,0);
		}
		public ExpressionBooleanComparisonContext(Bool_expressnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).enterExpressionBooleanComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).exitExpressionBooleanComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesiGrammarVisitor ) return ((DesiGrammarVisitor<? extends T>)visitor).visitExpressionBooleanComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionBooleanConnectorContext extends Bool_expressnContext {
		public Token op;
		public List<Bool_expressnContext> bool_expressn() {
			return getRuleContexts(Bool_expressnContext.class);
		}
		public Bool_expressnContext bool_expressn(int i) {
			return getRuleContext(Bool_expressnContext.class,i);
		}
		public TerminalNode AND() { return getToken(DesiGrammarParser.AND, 0); }
		public TerminalNode OR() { return getToken(DesiGrammarParser.OR, 0); }
		public ExpressionBooleanConnectorContext(Bool_expressnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).enterExpressionBooleanConnector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).exitExpressionBooleanConnector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesiGrammarVisitor ) return ((DesiGrammarVisitor<? extends T>)visitor).visitExpressionBooleanConnector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expressnContext bool_expressn() throws RecognitionException {
		return bool_expressn(0);
	}

	private Bool_expressnContext bool_expressn(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bool_expressnContext _localctx = new Bool_expressnContext(_ctx, _parentState);
		Bool_expressnContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_bool_expressn, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new ExpressionBooleanComparisonContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(65);
				comp_expressn();
				}
				break;
			case 2:
				{
				_localctx = new ExpressionBooleanParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66);
				match(T__4);
				setState(67);
				bool_expressn(0);
				setState(68);
				match(T__5);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(80);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(78);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionBooleanContext(new Bool_expressnContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool_expressn);
						setState(72);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(73);
						((ExpressionBooleanContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==NotEquals || _la==ISEquals) ) {
							((ExpressionBooleanContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(74);
						bool_expressn(5);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionBooleanConnectorContext(new Bool_expressnContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_bool_expressn);
						setState(75);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(76);
						((ExpressionBooleanConnectorContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((ExpressionBooleanConnectorContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(77);
						bool_expressn(4);
						}
						break;
					}
					} 
				}
				setState(82);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class Comp_expressnContext extends ParserRuleContext {
		public Comp_expressnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_expressn; }
	 
		public Comp_expressnContext() { }
		public void copyFrom(Comp_expressnContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionNumberComparisonContext extends Comp_expressnContext {
		public Token op;
		public List<Num_expressnContext> num_expressn() {
			return getRuleContexts(Num_expressnContext.class);
		}
		public Num_expressnContext num_expressn(int i) {
			return getRuleContext(Num_expressnContext.class,i);
		}
		public TerminalNode GREATER() { return getToken(DesiGrammarParser.GREATER, 0); }
		public TerminalNode LESSER() { return getToken(DesiGrammarParser.LESSER, 0); }
		public TerminalNode MORE_or_EQU() { return getToken(DesiGrammarParser.MORE_or_EQU, 0); }
		public TerminalNode LESS_or_EQU() { return getToken(DesiGrammarParser.LESS_or_EQU, 0); }
		public TerminalNode ISEquals() { return getToken(DesiGrammarParser.ISEquals, 0); }
		public TerminalNode NotEquals() { return getToken(DesiGrammarParser.NotEquals, 0); }
		public ExpressionNumberComparisonContext(Comp_expressnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).enterExpressionNumberComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).exitExpressionNumberComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesiGrammarVisitor ) return ((DesiGrammarVisitor<? extends T>)visitor).visitExpressionNumberComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_expressnContext comp_expressn() throws RecognitionException {
		Comp_expressnContext _localctx = new Comp_expressnContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comp_expressn);
		int _la;
		try {
			_localctx = new ExpressionNumberComparisonContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			num_expressn(0);
			setState(84);
			((ExpressionNumberComparisonContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESSER) | (1L << GREATER) | (1L << LESS_or_EQU) | (1L << MORE_or_EQU) | (1L << NotEquals) | (1L << ISEquals))) != 0)) ) {
				((ExpressionNumberComparisonContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(85);
			num_expressn(0);
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

	public static class Num_expressnContext extends ParserRuleContext {
		public Num_expressnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_expressn; }
	 
		public Num_expressnContext() { }
		public void copyFrom(Num_expressnContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionNumberParenthesesContext extends Num_expressnContext {
		public Num_expressnContext num_expressn() {
			return getRuleContext(Num_expressnContext.class,0);
		}
		public ExpressionNumberParenthesesContext(Num_expressnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).enterExpressionNumberParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).exitExpressionNumberParentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesiGrammarVisitor ) return ((DesiGrammarVisitor<? extends T>)visitor).visitExpressionNumberParentheses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionNumberPlusMinusContext extends Num_expressnContext {
		public Token op;
		public List<Num_expressnContext> num_expressn() {
			return getRuleContexts(Num_expressnContext.class);
		}
		public Num_expressnContext num_expressn(int i) {
			return getRuleContext(Num_expressnContext.class,i);
		}
		public TerminalNode ADD() { return getToken(DesiGrammarParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(DesiGrammarParser.SUB, 0); }
		public ExpressionNumberPlusMinusContext(Num_expressnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).enterExpressionNumberPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).exitExpressionNumberPlusMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesiGrammarVisitor ) return ((DesiGrammarVisitor<? extends T>)visitor).visitExpressionNumberPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionNumberMultiplyDivideContext extends Num_expressnContext {
		public Token op;
		public List<Num_expressnContext> num_expressn() {
			return getRuleContexts(Num_expressnContext.class);
		}
		public Num_expressnContext num_expressn(int i) {
			return getRuleContext(Num_expressnContext.class,i);
		}
		public TerminalNode MUL() { return getToken(DesiGrammarParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(DesiGrammarParser.DIV, 0); }
		public ExpressionNumberMultiplyDivideContext(Num_expressnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).enterExpressionNumberMultiplyDivide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).exitExpressionNumberMultiplyDivide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesiGrammarVisitor ) return ((DesiGrammarVisitor<? extends T>)visitor).visitExpressionNumberMultiplyDivide(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionNumberIdentifierOnlyContext extends Num_expressnContext {
		public TerminalNode IDENTIFIER() { return getToken(DesiGrammarParser.IDENTIFIER, 0); }
		public TerminalNode SUB() { return getToken(DesiGrammarParser.SUB, 0); }
		public ExpressionNumberIdentifierOnlyContext(Num_expressnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).enterExpressionNumberIdentifierOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).exitExpressionNumberIdentifierOnly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesiGrammarVisitor ) return ((DesiGrammarVisitor<? extends T>)visitor).visitExpressionNumberIdentifierOnly(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionNumberOnlyContext extends Num_expressnContext {
		public TerminalNode DIGITS() { return getToken(DesiGrammarParser.DIGITS, 0); }
		public TerminalNode SUB() { return getToken(DesiGrammarParser.SUB, 0); }
		public ExpressionNumberOnlyContext(Num_expressnContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).enterExpressionNumberOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).exitExpressionNumberOnly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesiGrammarVisitor ) return ((DesiGrammarVisitor<? extends T>)visitor).visitExpressionNumberOnly(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Num_expressnContext num_expressn() throws RecognitionException {
		return num_expressn(0);
	}

	private Num_expressnContext num_expressn(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Num_expressnContext _localctx = new Num_expressnContext(_ctx, _parentState);
		Num_expressnContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_num_expressn, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new ExpressionNumberParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(88);
				match(T__4);
				setState(89);
				num_expressn(0);
				setState(90);
				match(T__5);
				}
				break;
			case 2:
				{
				_localctx = new ExpressionNumberOnlyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(92);
					match(SUB);
					}
				}

				setState(95);
				match(DIGITS);
				}
				break;
			case 3:
				{
				_localctx = new ExpressionNumberIdentifierOnlyContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(96);
					match(SUB);
					}
				}

				setState(99);
				match(IDENTIFIER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(108);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionNumberMultiplyDivideContext(new Num_expressnContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_num_expressn);
						setState(102);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(103);
						((ExpressionNumberMultiplyDivideContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((ExpressionNumberMultiplyDivideContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(104);
						num_expressn(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionNumberPlusMinusContext(new Num_expressnContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_num_expressn);
						setState(105);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(106);
						((ExpressionNumberPlusMinusContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExpressionNumberPlusMinusContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(107);
						num_expressn(5);
						}
						break;
					}
					} 
				}
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class Cond_expressnContext extends ParserRuleContext {
		public Bool_expressnContext bool_expressn() {
			return getRuleContext(Bool_expressnContext.class,0);
		}
		public Cond_expressnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_expressn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).enterCond_expressn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).exitCond_expressn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesiGrammarVisitor ) return ((DesiGrammarVisitor<? extends T>)visitor).visitCond_expressn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cond_expressnContext cond_expressn() throws RecognitionException {
		Cond_expressnContext _localctx = new Cond_expressnContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cond_expressn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__4);
			setState(114);
			bool_expressn(0);
			setState(115);
			match(T__5);
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

	public static class IfExpressnContext extends ParserRuleContext {
		public Cond_expressnContext cond_expressn() {
			return getRuleContext(Cond_expressnContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ElseIfExpressnContext> elseIfExpressn() {
			return getRuleContexts(ElseIfExpressnContext.class);
		}
		public ElseIfExpressnContext elseIfExpressn(int i) {
			return getRuleContext(ElseIfExpressnContext.class,i);
		}
		public ElseExpressnContext elseExpressn() {
			return getRuleContext(ElseExpressnContext.class,0);
		}
		public IfExpressnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExpressn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).enterIfExpressn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).exitIfExpressn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesiGrammarVisitor ) return ((DesiGrammarVisitor<? extends T>)visitor).visitIfExpressn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfExpressnContext ifExpressn() throws RecognitionException {
		IfExpressnContext _localctx = new IfExpressnContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifExpressn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__6);
			setState(118);
			cond_expressn();
			setState(119);
			match(T__0);
			setState(120);
			block();
			setState(121);
			match(T__1);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(122);
				elseIfExpressn();
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(128);
				elseExpressn();
				}
			}

			setState(131);
			match(T__7);
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

	public static class ElseIfExpressnContext extends ParserRuleContext {
		public Cond_expressnContext cond_expressn() {
			return getRuleContext(Cond_expressnContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseIfExpressnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfExpressn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).enterElseIfExpressn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).exitElseIfExpressn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesiGrammarVisitor ) return ((DesiGrammarVisitor<? extends T>)visitor).visitElseIfExpressn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfExpressnContext elseIfExpressn() throws RecognitionException {
		ElseIfExpressnContext _localctx = new ElseIfExpressnContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_elseIfExpressn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__8);
			setState(134);
			cond_expressn();
			setState(135);
			match(T__0);
			setState(136);
			block();
			setState(137);
			match(T__1);
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

	public static class ElseExpressnContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseExpressnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseExpressn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).enterElseExpressn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).exitElseExpressn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesiGrammarVisitor ) return ((DesiGrammarVisitor<? extends T>)visitor).visitElseExpressn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseExpressnContext elseExpressn() throws RecognitionException {
		ElseExpressnContext _localctx = new ElseExpressnContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_elseExpressn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(T__9);
			setState(140);
			match(T__0);
			setState(141);
			block();
			setState(142);
			match(T__1);
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

	public static class WhileExpressnContext extends ParserRuleContext {
		public Cond_expressnContext cond_expressn() {
			return getRuleContext(Cond_expressnContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileExpressnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileExpressn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).enterWhileExpressn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).exitWhileExpressn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesiGrammarVisitor ) return ((DesiGrammarVisitor<? extends T>)visitor).visitWhileExpressn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileExpressnContext whileExpressn() throws RecognitionException {
		WhileExpressnContext _localctx = new WhileExpressnContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_whileExpressn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(T__10);
			setState(145);
			cond_expressn();
			setState(146);
			match(T__0);
			setState(147);
			block();
			setState(148);
			match(T__1);
			setState(149);
			match(T__11);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode DIGITS() { return getToken(DesiGrammarParser.DIGITS, 0); }
		public TerminalNode BOOLEAN() { return getToken(DesiGrammarParser.BOOLEAN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DesiGrammarParser.IDENTIFIER, 0); }
		public Num_expressnContext num_expressn() {
			return getRuleContext(Num_expressnContext.class,0);
		}
		public Bool_expressnContext bool_expressn() {
			return getRuleContext(Bool_expressnContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DesiGrammarVisitor ) return ((DesiGrammarVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__12);
			setState(152);
			match(T__4);
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(153);
				match(DIGITS);
				}
				break;
			case 2:
				{
				setState(154);
				match(BOOLEAN);
				}
				break;
			case 3:
				{
				setState(155);
				match(IDENTIFIER);
				}
				break;
			case 4:
				{
				setState(156);
				num_expressn(0);
				}
				break;
			case 5:
				{
				setState(157);
				bool_expressn(0);
				}
				break;
			}
			setState(160);
			match(T__5);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return bool_expressn_sempred((Bool_expressnContext)_localctx, predIndex);
		case 6:
			return num_expressn_sempred((Num_expressnContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean bool_expressn_sempred(Bool_expressnContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean num_expressn_sempred(Num_expressnContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u00a5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\3\3\3\6\3#\n\3\r\3\16"+
		"\3$\5\3\'\n\3\3\4\3\4\3\4\3\4\5\4-\n\4\3\5\3\5\3\5\3\5\5\5\63\n\5\3\5"+
		"\3\5\3\5\3\5\5\59\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5A\n\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6I\n\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6Q\n\6\f\6\16\6T\13\6\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b`\n\b\3\b\3\b\5\bd\n\b\3\b\5\b"+
		"g\n\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bo\n\b\f\b\16\br\13\b\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\7\n~\n\n\f\n\16\n\u0081\13\n\3\n\5\n\u0084\n"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00a1\n\16"+
		"\3\16\3\16\3\16\2\4\n\16\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\7\3\2\34"+
		"\35\3\2\26\27\3\2\30\35\3\2\24\25\3\2\22\23\2\u00b0\2\34\3\2\2\2\4&\3"+
		"\2\2\2\6,\3\2\2\2\b@\3\2\2\2\nH\3\2\2\2\fU\3\2\2\2\16f\3\2\2\2\20s\3\2"+
		"\2\2\22w\3\2\2\2\24\u0087\3\2\2\2\26\u008d\3\2\2\2\30\u0092\3\2\2\2\32"+
		"\u0099\3\2\2\2\34\35\7\3\2\2\35\36\5\4\3\2\36\37\7\4\2\2\37\3\3\2\2\2"+
		" \'\3\2\2\2!#\5\6\4\2\"!\3\2\2\2#$\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\'\3\2"+
		"\2\2& \3\2\2\2&\"\3\2\2\2\'\5\3\2\2\2(-\5\22\n\2)-\5\30\r\2*-\5\32\16"+
		"\2+-\5\b\5\2,(\3\2\2\2,)\3\2\2\2,*\3\2\2\2,+\3\2\2\2-\7\3\2\2\2./\7\5"+
		"\2\2/\62\7\36\2\2\60\61\7\37\2\2\61\63\5\16\b\2\62\60\3\2\2\2\62\63\3"+
		"\2\2\2\63A\3\2\2\2\64\65\7\6\2\2\658\7\36\2\2\66\67\7\37\2\2\679\5\n\6"+
		"\28\66\3\2\2\289\3\2\2\29A\3\2\2\2:;\7\36\2\2;<\7\37\2\2<A\5\16\b\2=>"+
		"\7\36\2\2>?\7\37\2\2?A\5\n\6\2@.\3\2\2\2@\64\3\2\2\2@:\3\2\2\2@=\3\2\2"+
		"\2A\t\3\2\2\2BC\b\6\1\2CI\5\f\7\2DE\7\7\2\2EF\5\n\6\2FG\7\b\2\2GI\3\2"+
		"\2\2HB\3\2\2\2HD\3\2\2\2IR\3\2\2\2JK\f\6\2\2KL\t\2\2\2LQ\5\n\6\7MN\f\5"+
		"\2\2NO\t\3\2\2OQ\5\n\6\6PJ\3\2\2\2PM\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2"+
		"\2\2S\13\3\2\2\2TR\3\2\2\2UV\5\16\b\2VW\t\4\2\2WX\5\16\b\2X\r\3\2\2\2"+
		"YZ\b\b\1\2Z[\7\7\2\2[\\\5\16\b\2\\]\7\b\2\2]g\3\2\2\2^`\7\23\2\2_^\3\2"+
		"\2\2_`\3\2\2\2`a\3\2\2\2ag\7\20\2\2bd\7\23\2\2cb\3\2\2\2cd\3\2\2\2de\3"+
		"\2\2\2eg\7\36\2\2fY\3\2\2\2f_\3\2\2\2fc\3\2\2\2gp\3\2\2\2hi\f\7\2\2ij"+
		"\t\5\2\2jo\5\16\b\bkl\f\6\2\2lm\t\6\2\2mo\5\16\b\7nh\3\2\2\2nk\3\2\2\2"+
		"or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\17\3\2\2\2rp\3\2\2\2st\7\7\2\2tu\5\n\6"+
		"\2uv\7\b\2\2v\21\3\2\2\2wx\7\t\2\2xy\5\20\t\2yz\7\3\2\2z{\5\4\3\2{\177"+
		"\7\4\2\2|~\5\24\13\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3"+
		"\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0082\u0084\5\26\f\2\u0083"+
		"\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\7\n"+
		"\2\2\u0086\23\3\2\2\2\u0087\u0088\7\13\2\2\u0088\u0089\5\20\t\2\u0089"+
		"\u008a\7\3\2\2\u008a\u008b\5\4\3\2\u008b\u008c\7\4\2\2\u008c\25\3\2\2"+
		"\2\u008d\u008e\7\f\2\2\u008e\u008f\7\3\2\2\u008f\u0090\5\4\3\2\u0090\u0091"+
		"\7\4\2\2\u0091\27\3\2\2\2\u0092\u0093\7\r\2\2\u0093\u0094\5\20\t\2\u0094"+
		"\u0095\7\3\2\2\u0095\u0096\5\4\3\2\u0096\u0097\7\4\2\2\u0097\u0098\7\16"+
		"\2\2\u0098\31\3\2\2\2\u0099\u009a\7\17\2\2\u009a\u00a0\7\7\2\2\u009b\u00a1"+
		"\7\20\2\2\u009c\u00a1\7\21\2\2\u009d\u00a1\7\36\2\2\u009e\u00a1\5\16\b"+
		"\2\u009f\u00a1\5\n\6\2\u00a0\u009b\3\2\2\2\u00a0\u009c\3\2\2\2\u00a0\u009d"+
		"\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a3\7\b\2\2\u00a3\33\3\2\2\2\23$&,\628@HPR_cfnp\177\u0083\u00a0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}