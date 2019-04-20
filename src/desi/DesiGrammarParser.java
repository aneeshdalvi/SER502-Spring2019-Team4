package desi;
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
		T__0=1, T__1=2, DATATYPE=3, DIGIT=4, IDENTIFIER=5, SHURU=6, KHATAM=7, 
		ADD=8, SUB=9, MUL=10, DIV=11, ASSIGNMENT=12, EQUALS=13, GREATERTHAN=14, 
		LESSTHAN=15, NOTEQUALTO=16, KHATAMOFSTATEMENT=17, WHILE=18, KHATAMWHILE=19, 
		IF=20, ELSE=21, KHATAMIF=22, OPENPARA=23, CLOSEPARA=24, WS=25, Comment=26;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_declaration = 2, RULE_command = 3, 
		RULE_expression = 4, RULE_expression1 = 5, RULE_term = 6, RULE_factor = 7, 
		RULE_unit = 8, RULE_booleanexp = 9;
	public static final String[] ruleNames = {
		"program", "block", "declaration", "command", "expression", "expression1", 
		"term", "factor", "unit", "booleanexp"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'TRUE'", "'FALSE'", null, null, null, "'shuru'", "'khatam'", "'+'", 
		"'-'", "'*'", "'/'", "'='", "'=='", "'>'", "'<'", "'!'", "';'", "'jabtak'", 
		"'tabtak'", "'agar'", "'nahitoh'", "'bas'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "DATATYPE", "DIGIT", "IDENTIFIER", "SHURU", "KHATAM", 
		"ADD", "SUB", "MUL", "DIV", "ASSIGNMENT", "EQUALS", "GREATERTHAN", "LESSTHAN", 
		"NOTEQUALTO", "KHATAMOFSTATEMENT", "WHILE", "KHATAMWHILE", "IF", "ELSE", 
		"KHATAMIF", "OPENPARA", "CLOSEPARA", "WS", "Comment"
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
		public TerminalNode SHURU() { return getToken(DesiGrammarParser.SHURU, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode KHATAM() { return getToken(DesiGrammarParser.KHATAM, 0); }
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
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(SHURU);
			setState(21);
			block();
			setState(22);
			match(KHATAM);
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
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode KHATAMOFSTATEMENT() { return getToken(DesiGrammarParser.KHATAMOFSTATEMENT, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
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
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATATYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				declaration();
				setState(25);
				match(KHATAMOFSTATEMENT);
				setState(26);
				command();
				}
				break;
			case DIGIT:
			case IDENTIFIER:
			case SHURU:
			case WHILE:
			case IF:
			case OPENPARA:
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				command();
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

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode DATATYPE() { return getToken(DesiGrammarParser.DATATYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(DesiGrammarParser.IDENTIFIER, 0); }
		public TerminalNode KHATAMOFSTATEMENT() { return getToken(DesiGrammarParser.KHATAMOFSTATEMENT, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(DesiGrammarParser.ASSIGNMENT, 0); }
		public TerminalNode DIGIT() { return getToken(DesiGrammarParser.DIGIT, 0); }
		public BooleanexpContext booleanexp() {
			return getRuleContext(BooleanexpContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				match(DATATYPE);
				setState(32);
				match(IDENTIFIER);
				setState(33);
				match(KHATAMOFSTATEMENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				match(DATATYPE);
				setState(35);
				match(IDENTIFIER);
				setState(36);
				match(ASSIGNMENT);
				setState(37);
				match(DIGIT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				match(DATATYPE);
				setState(39);
				match(IDENTIFIER);
				setState(40);
				match(ASSIGNMENT);
				setState(41);
				booleanexp();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
				match(DATATYPE);
				setState(43);
				match(IDENTIFIER);
				setState(44);
				match(KHATAMOFSTATEMENT);
				setState(45);
				declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(46);
				match(DATATYPE);
				setState(47);
				match(IDENTIFIER);
				setState(48);
				match(ASSIGNMENT);
				setState(49);
				match(DIGIT);
				setState(50);
				match(KHATAMOFSTATEMENT);
				setState(51);
				declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(52);
				match(DATATYPE);
				setState(53);
				match(IDENTIFIER);
				setState(54);
				match(ASSIGNMENT);
				setState(55);
				booleanexp();
				setState(56);
				match(KHATAMOFSTATEMENT);
				setState(57);
				declaration();
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

	public static class CommandContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode KHATAMOFSTATEMENT() { return getToken(DesiGrammarParser.KHATAMOFSTATEMENT, 0); }
		public List<TerminalNode> SHURU() { return getTokens(DesiGrammarParser.SHURU); }
		public TerminalNode SHURU(int i) {
			return getToken(DesiGrammarParser.SHURU, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> KHATAM() { return getTokens(DesiGrammarParser.KHATAM); }
		public TerminalNode KHATAM(int i) {
			return getToken(DesiGrammarParser.KHATAM, i);
		}
		public TerminalNode WHILE() { return getToken(DesiGrammarParser.WHILE, 0); }
		public BooleanexpContext booleanexp() {
			return getRuleContext(BooleanexpContext.class,0);
		}
		public TerminalNode KHATAMWHILE() { return getToken(DesiGrammarParser.KHATAMWHILE, 0); }
		public TerminalNode IF() { return getToken(DesiGrammarParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(DesiGrammarParser.ELSE, 0); }
		public TerminalNode KHATAMIF() { return getToken(DesiGrammarParser.KHATAMIF, 0); }
		public TerminalNode GREATERTHAN() { return getToken(DesiGrammarParser.GREATERTHAN, 0); }
		public TerminalNode LESSTHAN() { return getToken(DesiGrammarParser.LESSTHAN, 0); }
		public TerminalNode EQUALS() { return getToken(DesiGrammarParser.EQUALS, 0); }
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
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_command);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				expression();
				setState(62);
				match(KHATAMOFSTATEMENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(SHURU);
				setState(65);
				block();
				setState(66);
				match(KHATAM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				match(WHILE);
				setState(69);
				booleanexp();
				setState(70);
				match(SHURU);
				setState(71);
				block();
				setState(72);
				match(KHATAM);
				setState(73);
				match(KHATAMWHILE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				match(IF);
				setState(76);
				booleanexp();
				setState(77);
				match(SHURU);
				setState(78);
				block();
				setState(79);
				match(KHATAM);
				setState(80);
				match(ELSE);
				setState(81);
				match(SHURU);
				setState(82);
				block();
				setState(83);
				match(KHATAM);
				setState(84);
				match(KHATAMIF);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(86);
				match(IF);
				setState(87);
				booleanexp();
				setState(88);
				match(SHURU);
				setState(89);
				block();
				setState(90);
				match(KHATAM);
				setState(91);
				match(KHATAMIF);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(93);
				expression();
				setState(94);
				match(GREATERTHAN);
				setState(95);
				expression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(97);
				expression();
				setState(98);
				match(LESSTHAN);
				setState(99);
				expression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(101);
				expression();
				setState(102);
				match(EQUALS);
				setState(103);
				expression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DesiGrammarParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(DesiGrammarParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression1Context expression1() {
			return getRuleContext(Expression1Context.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expression);
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(IDENTIFIER);
				setState(108);
				match(ASSIGNMENT);
				setState(109);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				expression1();
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

	public static class Expression1Context extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode ADD() { return getToken(DesiGrammarParser.ADD, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SUB() { return getToken(DesiGrammarParser.SUB, 0); }
		public Expression1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).enterExpression1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).exitExpression1(this);
		}
	}

	public final Expression1Context expression1() throws RecognitionException {
		Expression1Context _localctx = new Expression1Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_expression1);
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				term();
				setState(114);
				match(ADD);
				setState(115);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				term();
				setState(118);
				match(SUB);
				setState(119);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				term();
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

	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode MUL() { return getToken(DesiGrammarParser.MUL, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode DIV() { return getToken(DesiGrammarParser.DIV, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_term);
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				factor();
				setState(125);
				match(MUL);
				setState(126);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				factor();
				setState(129);
				match(DIV);
				setState(130);
				term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				factor();
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode OPENPARA() { return getToken(DesiGrammarParser.OPENPARA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSEPARA() { return getToken(DesiGrammarParser.CLOSEPARA, 0); }
		public UnitContext unit() {
			return getRuleContext(UnitContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_factor);
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPENPARA:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(OPENPARA);
				setState(136);
				expression();
				setState(137);
				match(CLOSEPARA);
				}
				break;
			case DIGIT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				unit();
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

	public static class UnitContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DesiGrammarParser.IDENTIFIER, 0); }
		public TerminalNode DIGIT() { return getToken(DesiGrammarParser.DIGIT, 0); }
		public UnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).enterUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).exitUnit(this);
		}
	}

	public final UnitContext unit() throws RecognitionException {
		UnitContext _localctx = new UnitContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_la = _input.LA(1);
			if ( !(_la==DIGIT || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class BooleanexpContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ASSIGNMENT() { return getToken(DesiGrammarParser.ASSIGNMENT, 0); }
		public TerminalNode NOTEQUALTO() { return getToken(DesiGrammarParser.NOTEQUALTO, 0); }
		public BooleanexpContext booleanexp() {
			return getRuleContext(BooleanexpContext.class,0);
		}
		public BooleanexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).enterBooleanexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DesiGrammarListener ) ((DesiGrammarListener)listener).exitBooleanexp(this);
		}
	}

	public final BooleanexpContext booleanexp() throws RecognitionException {
		BooleanexpContext _localctx = new BooleanexpContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_booleanexp);
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(T__0);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(T__1);
				}
				break;
			case DIGIT:
			case IDENTIFIER:
			case OPENPARA:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				expression();
				setState(147);
				match(ASSIGNMENT);
				setState(148);
				expression();
				}
				break;
			case NOTEQUALTO:
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
				match(NOTEQUALTO);
				setState(151);
				booleanexp();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34\u009d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3 \n\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\4>\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5l\n\5\3\6\3\6\3\6\3\6\5\6r\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7}\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0088\n\b\3\t\3\t\3\t"+
		"\3\t\3\t\5\t\u008f\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u009b\n\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\3\3\2\6\7\2\u00a8"+
		"\2\26\3\2\2\2\4\37\3\2\2\2\6=\3\2\2\2\bk\3\2\2\2\nq\3\2\2\2\f|\3\2\2\2"+
		"\16\u0087\3\2\2\2\20\u008e\3\2\2\2\22\u0090\3\2\2\2\24\u009a\3\2\2\2\26"+
		"\27\7\b\2\2\27\30\5\4\3\2\30\31\7\t\2\2\31\3\3\2\2\2\32\33\5\6\4\2\33"+
		"\34\7\23\2\2\34\35\5\b\5\2\35 \3\2\2\2\36 \5\b\5\2\37\32\3\2\2\2\37\36"+
		"\3\2\2\2 \5\3\2\2\2!\"\7\5\2\2\"#\7\7\2\2#>\7\23\2\2$%\7\5\2\2%&\7\7\2"+
		"\2&\'\7\16\2\2\'>\7\6\2\2()\7\5\2\2)*\7\7\2\2*+\7\16\2\2+>\5\24\13\2,"+
		"-\7\5\2\2-.\7\7\2\2./\7\23\2\2/>\5\6\4\2\60\61\7\5\2\2\61\62\7\7\2\2\62"+
		"\63\7\16\2\2\63\64\7\6\2\2\64\65\7\23\2\2\65>\5\6\4\2\66\67\7\5\2\2\67"+
		"8\7\7\2\289\7\16\2\29:\5\24\13\2:;\7\23\2\2;<\5\6\4\2<>\3\2\2\2=!\3\2"+
		"\2\2=$\3\2\2\2=(\3\2\2\2=,\3\2\2\2=\60\3\2\2\2=\66\3\2\2\2>\7\3\2\2\2"+
		"?@\5\n\6\2@A\7\23\2\2Al\3\2\2\2BC\7\b\2\2CD\5\4\3\2DE\7\t\2\2El\3\2\2"+
		"\2FG\7\24\2\2GH\5\24\13\2HI\7\b\2\2IJ\5\4\3\2JK\7\t\2\2KL\7\25\2\2Ll\3"+
		"\2\2\2MN\7\26\2\2NO\5\24\13\2OP\7\b\2\2PQ\5\4\3\2QR\7\t\2\2RS\7\27\2\2"+
		"ST\7\b\2\2TU\5\4\3\2UV\7\t\2\2VW\7\30\2\2Wl\3\2\2\2XY\7\26\2\2YZ\5\24"+
		"\13\2Z[\7\b\2\2[\\\5\4\3\2\\]\7\t\2\2]^\7\30\2\2^l\3\2\2\2_`\5\n\6\2`"+
		"a\7\20\2\2ab\5\n\6\2bl\3\2\2\2cd\5\n\6\2de\7\21\2\2ef\5\n\6\2fl\3\2\2"+
		"\2gh\5\n\6\2hi\7\17\2\2ij\5\n\6\2jl\3\2\2\2k?\3\2\2\2kB\3\2\2\2kF\3\2"+
		"\2\2kM\3\2\2\2kX\3\2\2\2k_\3\2\2\2kc\3\2\2\2kg\3\2\2\2l\t\3\2\2\2mn\7"+
		"\7\2\2no\7\16\2\2or\5\n\6\2pr\5\f\7\2qm\3\2\2\2qp\3\2\2\2r\13\3\2\2\2"+
		"st\5\16\b\2tu\7\n\2\2uv\5\n\6\2v}\3\2\2\2wx\5\16\b\2xy\7\13\2\2yz\5\n"+
		"\6\2z}\3\2\2\2{}\5\16\b\2|s\3\2\2\2|w\3\2\2\2|{\3\2\2\2}\r\3\2\2\2~\177"+
		"\5\20\t\2\177\u0080\7\f\2\2\u0080\u0081\5\16\b\2\u0081\u0088\3\2\2\2\u0082"+
		"\u0083\5\20\t\2\u0083\u0084\7\r\2\2\u0084\u0085\5\16\b\2\u0085\u0088\3"+
		"\2\2\2\u0086\u0088\5\20\t\2\u0087~\3\2\2\2\u0087\u0082\3\2\2\2\u0087\u0086"+
		"\3\2\2\2\u0088\17\3\2\2\2\u0089\u008a\7\31\2\2\u008a\u008b\5\n\6\2\u008b"+
		"\u008c\7\32\2\2\u008c\u008f\3\2\2\2\u008d\u008f\5\22\n\2\u008e\u0089\3"+
		"\2\2\2\u008e\u008d\3\2\2\2\u008f\21\3\2\2\2\u0090\u0091\t\2\2\2\u0091"+
		"\23\3\2\2\2\u0092\u009b\7\3\2\2\u0093\u009b\7\4\2\2\u0094\u0095\5\n\6"+
		"\2\u0095\u0096\7\16\2\2\u0096\u0097\5\n\6\2\u0097\u009b\3\2\2\2\u0098"+
		"\u0099\7\22\2\2\u0099\u009b\5\24\13\2\u009a\u0092\3\2\2\2\u009a\u0093"+
		"\3\2\2\2\u009a\u0094\3\2\2\2\u009a\u0098\3\2\2\2\u009b\25\3\2\2\2\n\37"+
		"=kq|\u0087\u008e\u009a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}