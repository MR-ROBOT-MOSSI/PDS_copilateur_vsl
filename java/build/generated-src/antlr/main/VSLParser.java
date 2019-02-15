// Generated from TP2/VSLParser.g by ANTLR 4.7.1

  package TP2;

  import java.util.stream.Collectors;
  import java.util.Arrays;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VSLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, COMMENT=2, LP=3, RP=4, PLUS=5, MINUS=6, TIMES=7, DIV=8, IDENT=9, 
		TEXT=10, INTEGER=11;
	public static final int
		RULE_program = 0, RULE_expression = 1, RULE_expression2 = 2, RULE_expressionTimes = 3, 
		RULE_expressionDiv = 4, RULE_factor = 5, RULE_primary = 6;
	public static final String[] ruleNames = {
		"program", "expression", "expression2", "expressionTimes", "expressionDiv", 
		"factor", "primary"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'('", "')'", "'+'", "'-'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "COMMENT", "LP", "RP", "PLUS", "MINUS", "TIMES", "DIV", "IDENT", 
		"TEXT", "INTEGER"
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
	public String getGrammarFileName() { return "VSLParser.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VSLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ASD.Program out;
		public ExpressionContext e;
		public Expression2Context e2;
		public ExpressionTimesContext e3;
		public ExpressionDivContext e4;
		public TerminalNode EOF() { return getToken(VSLParser.EOF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression2Context expression2() {
			return getRuleContext(Expression2Context.class,0);
		}
		public ExpressionTimesContext expressionTimes() {
			return getRuleContext(ExpressionTimesContext.class,0);
		}
		public ExpressionDivContext expressionDiv() {
			return getRuleContext(ExpressionDivContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			setState(30);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				((ProgramContext)_localctx).e = expression();
				setState(15);
				match(EOF);
				 ((ProgramContext)_localctx).out =  new ASD.Program(((ProgramContext)_localctx).e.out); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(18);
				((ProgramContext)_localctx).e2 = expression2();
				setState(19);
				match(EOF);
				 ((ProgramContext)_localctx).out =  new ASD.Program(((ProgramContext)_localctx).e2.out); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(22);
				((ProgramContext)_localctx).e3 = expressionTimes();
				setState(23);
				match(EOF);
				 ((ProgramContext)_localctx).out =  new ASD.Program(((ProgramContext)_localctx).e3.out); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(26);
				((ProgramContext)_localctx).e4 = expressionDiv();
				setState(27);
				match(EOF);
				 ((ProgramContext)_localctx).out =  new ASD.Program(((ProgramContext)_localctx).e4.out); 
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
		public ASD.Expression out;
		public FactorContext l;
		public ExpressionContext r;
		public FactorContext f;
		public TerminalNode PLUS() { return getToken(VSLParser.PLUS, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		try {
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				((ExpressionContext)_localctx).l = factor();
				setState(33);
				match(PLUS);
				setState(34);
				((ExpressionContext)_localctx).r = expression();
				 ((ExpressionContext)_localctx).out =  new ASD.AddExpression(((ExpressionContext)_localctx).l.out, ((ExpressionContext)_localctx).r.out); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				((ExpressionContext)_localctx).f = factor();
				 ((ExpressionContext)_localctx).out =  ((ExpressionContext)_localctx).f.out; 
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

	public static class Expression2Context extends ParserRuleContext {
		public ASD.Expression out;
		public FactorContext l;
		public ExpressionContext r;
		public FactorContext f;
		public TerminalNode MINUS() { return getToken(VSLParser.MINUS, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression2; }
	}

	public final Expression2Context expression2() throws RecognitionException {
		Expression2Context _localctx = new Expression2Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_expression2);
		try {
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				((Expression2Context)_localctx).l = factor();
				setState(43);
				match(MINUS);
				setState(44);
				((Expression2Context)_localctx).r = expression();
				 ((Expression2Context)_localctx).out =  new ASD.MinExpression(((Expression2Context)_localctx).l.out, ((Expression2Context)_localctx).r.out); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				((Expression2Context)_localctx).f = factor();
				 ((Expression2Context)_localctx).out =  ((Expression2Context)_localctx).f.out; 
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

	public static class ExpressionTimesContext extends ParserRuleContext {
		public ASD.Expression out;
		public FactorContext l;
		public ExpressionContext r;
		public FactorContext f;
		public TerminalNode TIMES() { return getToken(VSLParser.TIMES, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionTimesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionTimes; }
	}

	public final ExpressionTimesContext expressionTimes() throws RecognitionException {
		ExpressionTimesContext _localctx = new ExpressionTimesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expressionTimes);
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				((ExpressionTimesContext)_localctx).l = factor();
				setState(53);
				match(TIMES);
				setState(54);
				((ExpressionTimesContext)_localctx).r = expression();
				 ((ExpressionTimesContext)_localctx).out =  new ASD.MulExpression(((ExpressionTimesContext)_localctx).l.out, ((ExpressionTimesContext)_localctx).r.out); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				((ExpressionTimesContext)_localctx).f = factor();
				 ((ExpressionTimesContext)_localctx).out =  ((ExpressionTimesContext)_localctx).f.out; 
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

	public static class ExpressionDivContext extends ParserRuleContext {
		public ASD.Expression out;
		public FactorContext l;
		public ExpressionContext r;
		public FactorContext f;
		public TerminalNode DIV() { return getToken(VSLParser.DIV, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionDivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionDiv; }
	}

	public final ExpressionDivContext expressionDiv() throws RecognitionException {
		ExpressionDivContext _localctx = new ExpressionDivContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expressionDiv);
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				((ExpressionDivContext)_localctx).l = factor();
				setState(63);
				match(DIV);
				setState(64);
				((ExpressionDivContext)_localctx).r = expression();
				 ((ExpressionDivContext)_localctx).out =  new ASD.DivExpression(((ExpressionDivContext)_localctx).l.out, ((ExpressionDivContext)_localctx).r.out); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				((ExpressionDivContext)_localctx).f = factor();
				 ((ExpressionDivContext)_localctx).out =  ((ExpressionDivContext)_localctx).f.out; 
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
		public ASD.Expression out;
		public PrimaryContext p;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			((FactorContext)_localctx).p = primary();
			 ((FactorContext)_localctx).out =  ((FactorContext)_localctx).p.out; 
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

	public static class PrimaryContext extends ParserRuleContext {
		public ASD.Expression out;
		public Token INTEGER;
		public TerminalNode INTEGER() { return getToken(VSLParser.INTEGER, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			((PrimaryContext)_localctx).INTEGER = match(INTEGER);
			 ((PrimaryContext)_localctx).out =  new ASD.IntegerExpression((((PrimaryContext)_localctx).INTEGER!=null?Integer.valueOf(((PrimaryContext)_localctx).INTEGER.getText()):0)); 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\rQ\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2!\n\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3+\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\65\n\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5?\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6I\n"+
		"\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\2\2\t\2\4\6\b\n\f\16\2\2\2P\2 \3\2\2\2"+
		"\4*\3\2\2\2\6\64\3\2\2\2\b>\3\2\2\2\nH\3\2\2\2\fJ\3\2\2\2\16M\3\2\2\2"+
		"\20\21\5\4\3\2\21\22\7\2\2\3\22\23\b\2\1\2\23!\3\2\2\2\24\25\5\6\4\2\25"+
		"\26\7\2\2\3\26\27\b\2\1\2\27!\3\2\2\2\30\31\5\b\5\2\31\32\7\2\2\3\32\33"+
		"\b\2\1\2\33!\3\2\2\2\34\35\5\n\6\2\35\36\7\2\2\3\36\37\b\2\1\2\37!\3\2"+
		"\2\2 \20\3\2\2\2 \24\3\2\2\2 \30\3\2\2\2 \34\3\2\2\2!\3\3\2\2\2\"#\5\f"+
		"\7\2#$\7\7\2\2$%\5\4\3\2%&\b\3\1\2&+\3\2\2\2\'(\5\f\7\2()\b\3\1\2)+\3"+
		"\2\2\2*\"\3\2\2\2*\'\3\2\2\2+\5\3\2\2\2,-\5\f\7\2-.\7\b\2\2./\5\4\3\2"+
		"/\60\b\4\1\2\60\65\3\2\2\2\61\62\5\f\7\2\62\63\b\4\1\2\63\65\3\2\2\2\64"+
		",\3\2\2\2\64\61\3\2\2\2\65\7\3\2\2\2\66\67\5\f\7\2\678\7\t\2\289\5\4\3"+
		"\29:\b\5\1\2:?\3\2\2\2;<\5\f\7\2<=\b\5\1\2=?\3\2\2\2>\66\3\2\2\2>;\3\2"+
		"\2\2?\t\3\2\2\2@A\5\f\7\2AB\7\n\2\2BC\5\4\3\2CD\b\6\1\2DI\3\2\2\2EF\5"+
		"\f\7\2FG\b\6\1\2GI\3\2\2\2H@\3\2\2\2HE\3\2\2\2I\13\3\2\2\2JK\5\16\b\2"+
		"KL\b\7\1\2L\r\3\2\2\2MN\7\r\2\2NO\b\b\1\2O\17\3\2\2\2\7 *\64>H";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}