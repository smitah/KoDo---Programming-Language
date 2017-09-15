package Compiler;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KodoGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		While=1, If=2, Else=3, Elseif=4, End=5, Display=6, Number=7, Binary=8, 
		String=9, Equal=10, Assign=11, Addition=12, Substraction=13, Multiplication=14, 
		Division=15, Modulus=16, GreaterThan=17, LessThan=18, GTEqual=19, LTEqual=20, 
		NEqual=21, Not=22, And=23, Or=24, True=25, False=26, Variable=27, Word=28, 
		Comment=29, Whitespace=30, Integer=31;
	public static final int
		RULE_entryPoint = 0, RULE_program = 1, RULE_statement = 2, RULE_assignment = 3, 
		RULE_display = 4, RULE_variableDeclare = 5, RULE_whileblockstatement = 6, 
		RULE_ifblockstatement = 7, RULE_elseifstatement = 8, RULE_elsestatement = 9, 
		RULE_ifstatement = 10, RULE_expr = 11, RULE_binary = 12, RULE_integer = 13, 
		RULE_string = 14;
	public static final String[] ruleNames = {
		"entryPoint", "program", "statement", "assignment", "display", "variableDeclare", 
		"whileblockstatement", "ifblockstatement", "elseifstatement", "elsestatement", 
		"ifstatement", "expr", "binary", "integer", "string"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'While'", "'If'", "'Else'", "'ElseIf'", "'End'", "'Display'", "'Number'", 
		"'Binary'", "'String'", "'=='", "'='", "'+'", "'-'", "'*'", "'/'", "'%'", 
		"'>'", "'<'", "'>='", "'<='", "'!='", "'!'", "'&'", "'|'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "While", "If", "Else", "Elseif", "End", "Display", "Number", "Binary", 
		"String", "Equal", "Assign", "Addition", "Substraction", "Multiplication", 
		"Division", "Modulus", "GreaterThan", "LessThan", "GTEqual", "LTEqual", 
		"NEqual", "Not", "And", "Or", "True", "False", "Variable", "Word", "Comment", 
		"Whitespace", "Integer"
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
	public String getGrammarFileName() { return "KodoGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public KodoGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class EntryPointContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public TerminalNode EOF() { return getToken(KodoGrammarParser.EOF, 0); }
		public EntryPointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entryPoint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).enterEntryPoint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).exitEntryPoint(this);
		}
	}

	public final EntryPointContext entryPoint() throws RecognitionException {
		EntryPointContext _localctx = new EntryPointContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_entryPoint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			program();
			setState(31);
			match(EOF);
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

	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << While) | (1L << If) | (1L << Display) | (1L << Number) | (1L << Binary) | (1L << String) | (1L << Variable))) != 0)) {
				{
				{
				setState(33);
				statement();
				}
				}
				setState(38);
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

	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public VariableDeclareContext variableDeclare() {
			return getRuleContext(VariableDeclareContext.class,0);
		}
		public DisplayContext display() {
			return getRuleContext(DisplayContext.class,0);
		}
		public WhileblockstatementContext whileblockstatement() {
			return getRuleContext(WhileblockstatementContext.class,0);
		}
		public IfblockstatementContext ifblockstatement() {
			return getRuleContext(IfblockstatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Variable:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				assignment();
				}
				break;
			case Number:
			case Binary:
			case String:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				variableDeclare();
				}
				break;
			case Display:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				display();
				}
				break;
			case While:
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
				whileblockstatement();
				}
				break;
			case If:
				enterOuterAlt(_localctx, 5);
				{
				setState(43);
				ifblockstatement();
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode Variable() { return getToken(KodoGrammarParser.Variable, 0); }
		public TerminalNode Assign() { return getToken(KodoGrammarParser.Assign, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(Variable);
			setState(47);
			match(Assign);
			setState(48);
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

	public static class DisplayContext extends ParserRuleContext {
		public TerminalNode Display() { return getToken(KodoGrammarParser.Display, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DisplayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_display; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).enterDisplay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).exitDisplay(this);
		}
	}

	public final DisplayContext display() throws RecognitionException {
		DisplayContext _localctx = new DisplayContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_display);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(Display);
			setState(51);
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

	public static class VariableDeclareContext extends ParserRuleContext {
		public VariableDeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclare; }
	 
		public VariableDeclareContext() { }
		public void copyFrom(VariableDeclareContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BinvariableContext extends VariableDeclareContext {
		public TerminalNode Binary() { return getToken(KodoGrammarParser.Binary, 0); }
		public TerminalNode Variable() { return getToken(KodoGrammarParser.Variable, 0); }
		public BinvariableContext(VariableDeclareContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).enterBinvariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).exitBinvariable(this);
		}
	}
	public static class StrvariableContext extends VariableDeclareContext {
		public TerminalNode String() { return getToken(KodoGrammarParser.String, 0); }
		public TerminalNode Variable() { return getToken(KodoGrammarParser.Variable, 0); }
		public StrvariableContext(VariableDeclareContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).enterStrvariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).exitStrvariable(this);
		}
	}
	public static class NumvariableContext extends VariableDeclareContext {
		public TerminalNode Number() { return getToken(KodoGrammarParser.Number, 0); }
		public TerminalNode Variable() { return getToken(KodoGrammarParser.Variable, 0); }
		public NumvariableContext(VariableDeclareContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).enterNumvariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).exitNumvariable(this);
		}
	}

	public final VariableDeclareContext variableDeclare() throws RecognitionException {
		VariableDeclareContext _localctx = new VariableDeclareContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variableDeclare);
		try {
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Number:
				_localctx = new NumvariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				match(Number);
				setState(54);
				match(Variable);
				}
				break;
			case Binary:
				_localctx = new BinvariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				match(Binary);
				setState(56);
				match(Variable);
				}
				break;
			case String:
				_localctx = new StrvariableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				match(String);
				setState(58);
				match(Variable);
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

	public static class WhileblockstatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(KodoGrammarParser.While, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public TerminalNode End() { return getToken(KodoGrammarParser.End, 0); }
		public WhileblockstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileblockstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).enterWhileblockstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).exitWhileblockstatement(this);
		}
	}

	public final WhileblockstatementContext whileblockstatement() throws RecognitionException {
		WhileblockstatementContext _localctx = new WhileblockstatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_whileblockstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(While);
			setState(62);
			expr(0);
			setState(63);
			program();
			setState(64);
			match(End);
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

	public static class IfblockstatementContext extends ParserRuleContext {
		public IfstatementContext ifstatement() {
			return getRuleContext(IfstatementContext.class,0);
		}
		public ElsestatementContext elsestatement() {
			return getRuleContext(ElsestatementContext.class,0);
		}
		public TerminalNode End() { return getToken(KodoGrammarParser.End, 0); }
		public List<ElseifstatementContext> elseifstatement() {
			return getRuleContexts(ElseifstatementContext.class);
		}
		public ElseifstatementContext elseifstatement(int i) {
			return getRuleContext(ElseifstatementContext.class,i);
		}
		public IfblockstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifblockstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).enterIfblockstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).exitIfblockstatement(this);
		}
	}

	public final IfblockstatementContext ifblockstatement() throws RecognitionException {
		IfblockstatementContext _localctx = new IfblockstatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifblockstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			ifstatement();
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Elseif) {
				{
				{
				setState(67);
				elseifstatement();
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			elsestatement();
			setState(74);
			match(End);
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

	public static class ElseifstatementContext extends ParserRuleContext {
		public TerminalNode Elseif() { return getToken(KodoGrammarParser.Elseif, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public ElseifstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseifstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).enterElseifstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).exitElseifstatement(this);
		}
	}

	public final ElseifstatementContext elseifstatement() throws RecognitionException {
		ElseifstatementContext _localctx = new ElseifstatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_elseifstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(Elseif);
			setState(77);
			expr(0);
			setState(78);
			program();
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

	public static class ElsestatementContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(KodoGrammarParser.Else, 0); }
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public ElsestatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsestatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).enterElsestatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).exitElsestatement(this);
		}
	}

	public final ElsestatementContext elsestatement() throws RecognitionException {
		ElsestatementContext _localctx = new ElsestatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_elsestatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(Else);
			setState(81);
			program();
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

	public static class IfstatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(KodoGrammarParser.If, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public IfstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).enterIfstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).exitIfstatement(this);
		}
	}

	public final IfstatementContext ifstatement() throws RecognitionException {
		IfstatementContext _localctx = new IfstatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(If);
			setState(84);
			expr(0);
			setState(85);
			program();
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
	public static class LtexprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LessThan() { return getToken(KodoGrammarParser.LessThan, 0); }
		public LtexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).enterLtexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).exitLtexpr(this);
		}
	}
	public static class LteexprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LTEqual() { return getToken(KodoGrammarParser.LTEqual, 0); }
		public LteexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).enterLteexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).exitLteexpr(this);
		}
	}
	public static class EqexprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Equal() { return getToken(KodoGrammarParser.Equal, 0); }
		public EqexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).enterEqexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).exitEqexpr(this);
		}
	}
	public static class NeqexprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NEqual() { return getToken(KodoGrammarParser.NEqual, 0); }
		public NeqexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).enterNeqexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).exitNeqexpr(this);
		}
	}
	public static class NotexprContext extends ExprContext {
		public TerminalNode Not() { return getToken(KodoGrammarParser.Not, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).enterNotexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).exitNotexpr(this);
		}
	}
	public static class VarexprContext extends ExprContext {
		public TerminalNode Variable() { return getToken(KodoGrammarParser.Variable, 0); }
		public VarexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).enterVarexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).exitVarexpr(this);
		}
	}
	public static class AddexprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Addition() { return getToken(KodoGrammarParser.Addition, 0); }
		public AddexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).enterAddexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).exitAddexpr(this);
		}
	}
	public static class DivexprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Division() { return getToken(KodoGrammarParser.Division, 0); }
		public DivexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).enterDivexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).exitDivexpr(this);
		}
	}
	public static class AndexprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode And() { return getToken(KodoGrammarParser.And, 0); }
		public AndexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).enterAndexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).exitAndexpr(this);
		}
	}
	public static class IntexprContext extends ExprContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public IntexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).enterIntexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).exitIntexpr(this);
		}
	}
	public static class StrexprContext extends ExprContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public StrexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).enterStrexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).exitStrexpr(this);
		}
	}
	public static class OrpexprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Or() { return getToken(KodoGrammarParser.Or, 0); }
		public OrpexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).enterOrpexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).exitOrpexpr(this);
		}
	}
	public static class ModexprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Modulus() { return getToken(KodoGrammarParser.Modulus, 0); }
		public ModexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).enterModexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).exitModexpr(this);
		}
	}
	public static class MulexprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Multiplication() { return getToken(KodoGrammarParser.Multiplication, 0); }
		public MulexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).enterMulexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).exitMulexpr(this);
		}
	}
	public static class GtexprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GreaterThan() { return getToken(KodoGrammarParser.GreaterThan, 0); }
		public GtexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).enterGtexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).exitGtexpr(this);
		}
	}
	public static class BinaryexprContext extends ExprContext {
		public BinaryContext binary() {
			return getRuleContext(BinaryContext.class,0);
		}
		public BinaryexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).enterBinaryexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).exitBinaryexpr(this);
		}
	}
	public static class SubexprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Substraction() { return getToken(KodoGrammarParser.Substraction, 0); }
		public SubexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).enterSubexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).exitSubexpr(this);
		}
	}
	public static class GteexprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GTEqual() { return getToken(KodoGrammarParser.GTEqual, 0); }
		public GteexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).enterGteexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).exitGteexpr(this);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Not:
				{
				_localctx = new NotexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(88);
				match(Not);
				setState(89);
				expr(7);
				}
				break;
			case True:
			case False:
				{
				_localctx = new BinaryexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(90);
				binary();
				}
				break;
			case Integer:
				{
				_localctx = new IntexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91);
				integer();
				}
				break;
			case Word:
				{
				_localctx = new StrexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(92);
				string();
				}
				break;
			case Variable:
				{
				_localctx = new VarexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93);
				match(Variable);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(135);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new MulexprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(96);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(97);
						match(Multiplication);
						setState(98);
						expr(19);
						}
						break;
					case 2:
						{
						_localctx = new DivexprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(99);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(100);
						match(Division);
						setState(101);
						expr(18);
						}
						break;
					case 3:
						{
						_localctx = new ModexprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(102);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(103);
						match(Modulus);
						setState(104);
						expr(17);
						}
						break;
					case 4:
						{
						_localctx = new AddexprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(105);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(106);
						match(Addition);
						setState(107);
						expr(16);
						}
						break;
					case 5:
						{
						_localctx = new SubexprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(108);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(109);
						match(Substraction);
						setState(110);
						expr(15);
						}
						break;
					case 6:
						{
						_localctx = new GtexprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(111);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(112);
						match(GreaterThan);
						setState(113);
						expr(14);
						}
						break;
					case 7:
						{
						_localctx = new LtexprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(114);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(115);
						match(LessThan);
						setState(116);
						expr(13);
						}
						break;
					case 8:
						{
						_localctx = new LteexprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(117);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(118);
						match(LTEqual);
						setState(119);
						expr(12);
						}
						break;
					case 9:
						{
						_localctx = new GteexprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(120);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(121);
						match(GTEqual);
						setState(122);
						expr(11);
						}
						break;
					case 10:
						{
						_localctx = new EqexprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(123);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(124);
						match(Equal);
						setState(125);
						expr(10);
						}
						break;
					case 11:
						{
						_localctx = new NeqexprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(126);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(127);
						match(NEqual);
						setState(128);
						expr(9);
						}
						break;
					case 12:
						{
						_localctx = new AndexprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(129);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(130);
						match(And);
						setState(131);
						expr(7);
						}
						break;
					case 13:
						{
						_localctx = new OrpexprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(132);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(133);
						match(Or);
						setState(134);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class BinaryContext extends ParserRuleContext {
		public TerminalNode True() { return getToken(KodoGrammarParser.True, 0); }
		public TerminalNode False() { return getToken(KodoGrammarParser.False, 0); }
		public BinaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).enterBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).exitBinary(this);
		}
	}

	public final BinaryContext binary() throws RecognitionException {
		BinaryContext _localctx = new BinaryContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_binary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_la = _input.LA(1);
			if ( !(_la==True || _la==False) ) {
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

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode Integer() { return getToken(KodoGrammarParser.Integer, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).exitInteger(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(Integer);
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode Word() { return getToken(KodoGrammarParser.Word, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KodoGrammarListener ) ((KodoGrammarListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(Word);
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
		case 11:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 18);
		case 1:
			return precpred(_ctx, 17);
		case 2:
			return precpred(_ctx, 16);
		case 3:
			return precpred(_ctx, 15);
		case 4:
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 13);
		case 6:
			return precpred(_ctx, 12);
		case 7:
			return precpred(_ctx, 11);
		case 8:
			return precpred(_ctx, 10);
		case 9:
			return precpred(_ctx, 9);
		case 10:
			return precpred(_ctx, 8);
		case 11:
			return precpred(_ctx, 6);
		case 12:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u0095\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\3\7\3"+
		"%\n\3\f\3\16\3(\13\3\3\4\3\4\3\4\3\4\3\4\5\4/\n\4\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7>\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\7\tG\n\t\f\t\16\tJ\13\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\ra\n\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7"+
		"\r\u008a\n\r\f\r\16\r\u008d\13\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\2"+
		"\3\30\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\3\3\2\33\34\2\u009e"+
		"\2 \3\2\2\2\4&\3\2\2\2\6.\3\2\2\2\b\60\3\2\2\2\n\64\3\2\2\2\f=\3\2\2\2"+
		"\16?\3\2\2\2\20D\3\2\2\2\22N\3\2\2\2\24R\3\2\2\2\26U\3\2\2\2\30`\3\2\2"+
		"\2\32\u008e\3\2\2\2\34\u0090\3\2\2\2\36\u0092\3\2\2\2 !\5\4\3\2!\"\7\2"+
		"\2\3\"\3\3\2\2\2#%\5\6\4\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'"+
		"\5\3\2\2\2(&\3\2\2\2)/\5\b\5\2*/\5\f\7\2+/\5\n\6\2,/\5\16\b\2-/\5\20\t"+
		"\2.)\3\2\2\2.*\3\2\2\2.+\3\2\2\2.,\3\2\2\2.-\3\2\2\2/\7\3\2\2\2\60\61"+
		"\7\35\2\2\61\62\7\r\2\2\62\63\5\30\r\2\63\t\3\2\2\2\64\65\7\b\2\2\65\66"+
		"\5\30\r\2\66\13\3\2\2\2\678\7\t\2\28>\7\35\2\29:\7\n\2\2:>\7\35\2\2;<"+
		"\7\13\2\2<>\7\35\2\2=\67\3\2\2\2=9\3\2\2\2=;\3\2\2\2>\r\3\2\2\2?@\7\3"+
		"\2\2@A\5\30\r\2AB\5\4\3\2BC\7\7\2\2C\17\3\2\2\2DH\5\26\f\2EG\5\22\n\2"+
		"FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IK\3\2\2\2JH\3\2\2\2KL\5\24\13"+
		"\2LM\7\7\2\2M\21\3\2\2\2NO\7\6\2\2OP\5\30\r\2PQ\5\4\3\2Q\23\3\2\2\2RS"+
		"\7\5\2\2ST\5\4\3\2T\25\3\2\2\2UV\7\4\2\2VW\5\30\r\2WX\5\4\3\2X\27\3\2"+
		"\2\2YZ\b\r\1\2Z[\7\30\2\2[a\5\30\r\t\\a\5\32\16\2]a\5\34\17\2^a\5\36\20"+
		"\2_a\7\35\2\2`Y\3\2\2\2`\\\3\2\2\2`]\3\2\2\2`^\3\2\2\2`_\3\2\2\2a\u008b"+
		"\3\2\2\2bc\f\24\2\2cd\7\20\2\2d\u008a\5\30\r\25ef\f\23\2\2fg\7\21\2\2"+
		"g\u008a\5\30\r\24hi\f\22\2\2ij\7\22\2\2j\u008a\5\30\r\23kl\f\21\2\2lm"+
		"\7\16\2\2m\u008a\5\30\r\22no\f\20\2\2op\7\17\2\2p\u008a\5\30\r\21qr\f"+
		"\17\2\2rs\7\23\2\2s\u008a\5\30\r\20tu\f\16\2\2uv\7\24\2\2v\u008a\5\30"+
		"\r\17wx\f\r\2\2xy\7\26\2\2y\u008a\5\30\r\16z{\f\f\2\2{|\7\25\2\2|\u008a"+
		"\5\30\r\r}~\f\13\2\2~\177\7\f\2\2\177\u008a\5\30\r\f\u0080\u0081\f\n\2"+
		"\2\u0081\u0082\7\27\2\2\u0082\u008a\5\30\r\13\u0083\u0084\f\b\2\2\u0084"+
		"\u0085\7\31\2\2\u0085\u008a\5\30\r\t\u0086\u0087\f\7\2\2\u0087\u0088\7"+
		"\32\2\2\u0088\u008a\5\30\r\b\u0089b\3\2\2\2\u0089e\3\2\2\2\u0089h\3\2"+
		"\2\2\u0089k\3\2\2\2\u0089n\3\2\2\2\u0089q\3\2\2\2\u0089t\3\2\2\2\u0089"+
		"w\3\2\2\2\u0089z\3\2\2\2\u0089}\3\2\2\2\u0089\u0080\3\2\2\2\u0089\u0083"+
		"\3\2\2\2\u0089\u0086\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\31\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\t\2\2"+
		"\2\u008f\33\3\2\2\2\u0090\u0091\7!\2\2\u0091\35\3\2\2\2\u0092\u0093\7"+
		"\36\2\2\u0093\37\3\2\2\2\t&.=H`\u0089\u008b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}