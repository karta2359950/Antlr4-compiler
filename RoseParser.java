// Generated from Rose.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RoseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, CONST=2, WHITESPACE=3, COMMENT=4, BEGIN=5, DECLARE=6, ELSE=7, END=8, 
		EXIT=9, FOR=10, IF=11, IN=12, INTEGER=13, IS=14, LOOP=15, PROCEDURE=16, 
		READ=17, THEN=18, WRITE=19, COL=20, TPR=21, TCOL=22, ADD=23, SUBTRACT=24, 
		MULTIPLY=25, DIVIDE=26, PERCENT=27, EQ=28, GT=29, LT=30, AND=31, DOUBLELINE=32, 
		EXCLAMATION=33, COLEQUAL=34, UPPAREN=35, DOWNPAREN=36;
	public static final int
		RULE_program = 0, RULE_variables = 1, RULE_variable = 2, RULE_statements = 3, 
		RULE_statement = 4, RULE_assignment_statement = 5, RULE_if_statement = 6, 
		RULE_if_statementA = 7, RULE_for_statement = 8, RULE_exit_statement = 9, 
		RULE_read_statement = 10, RULE_write_statement = 11, RULE_bool_expression = 12, 
		RULE_bool_expressions = 13, RULE_bool_term = 14, RULE_bool_terms = 15, 
		RULE_bool_factor = 16, RULE_bool_primary = 17, RULE_relation_op = 18, 
		RULE_relation_op_alpha = 19, RULE_relation_op_beta = 20, RULE_arith_expression = 21, 
		RULE_arith_expressions = 22, RULE_arith_term = 23, RULE_arith_terms = 24, 
		RULE_arith_factor = 25, RULE_arith_primary = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "variables", "variable", "statements", "statement", "assignment_statement", 
			"if_statement", "if_statementA", "for_statement", "exit_statement", "read_statement", 
			"write_statement", "bool_expression", "bool_expressions", "bool_term", 
			"bool_terms", "bool_factor", "bool_primary", "relation_op", "relation_op_alpha", 
			"relation_op_beta", "arith_expression", "arith_expressions", "arith_term", 
			"arith_terms", "arith_factor", "arith_primary"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'begin'", "'declare'", "'else'", "'end'", 
			"'exit'", "'for'", "'if'", "'in'", "'integer'", "'is'", "'loop'", "'procedure'", 
			"'read'", "'then'", "'write'", "':'", "'..'", "';'", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'='", "'>'", "'<'", "'&&'", "'||'", "'!'", "':='", "'('", 
			"')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ID", "CONST", "WHITESPACE", "COMMENT", "BEGIN", "DECLARE", "ELSE", 
			"END", "EXIT", "FOR", "IF", "IN", "INTEGER", "IS", "LOOP", "PROCEDURE", 
			"READ", "THEN", "WRITE", "COL", "TPR", "TCOL", "ADD", "SUBTRACT", "MULTIPLY", 
			"DIVIDE", "PERCENT", "EQ", "GT", "LT", "AND", "DOUBLELINE", "EXCLAMATION", 
			"COLEQUAL", "UPPAREN", "DOWNPAREN"
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
	public String getGrammarFileName() { return "Rose.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RoseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(RoseParser.PROCEDURE, 0); }
		public TerminalNode ID() { return getToken(RoseParser.ID, 0); }
		public TerminalNode IS() { return getToken(RoseParser.IS, 0); }
		public TerminalNode DECLARE() { return getToken(RoseParser.DECLARE, 0); }
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(RoseParser.BEGIN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(RoseParser.END, 0); }
		public TerminalNode TCOL() { return getToken(RoseParser.TCOL, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(PROCEDURE);
			setState(55);
			match(ID);
			setState(56);
			match(IS);
			setState(57);
			match(DECLARE);
			System.out.println("# variables\n\t.data");
			setState(59);
			variables();
			setState(60);
			match(BEGIN);
			System.out.println("# begin function\n\t.text\nmain:");
			setState(62);
			statements(0, 0);
			setState(63);
			match(END);
			setState(64);
			match(TCOL);
			System.out.println("# end function");
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

	public static class VariablesContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitVariables(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_variables);
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				variable();
				setState(68);
				variables();
				}
				break;
			case BEGIN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class VariableContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(RoseParser.ID, 0); }
		public TerminalNode COL() { return getToken(RoseParser.COL, 0); }
		public TerminalNode INTEGER() { return getToken(RoseParser.INTEGER, 0); }
		public TerminalNode TCOL() { return getToken(RoseParser.TCOL, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			((VariableContext)_localctx).ID = match(ID);
			setState(74);
			match(COL);
			setState(75);
			match(INTEGER);
			setState(76);
			match(TCOL);
			System.out.println((((VariableContext)_localctx).ID!=null?((VariableContext)_localctx).ID.getText():null) + ":\t.word 0");
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

	public static class StatementsContext extends ParserRuleContext {
		public int reg;
		public int label;
		public int nreg;
		public int nlabel;
		public StatementContext statement;
		public StatementsContext statements;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StatementsContext(ParserRuleContext parent, int invokingState, int reg, int label) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements(int reg,int label) throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState(), reg, label);
		enterRule(_localctx, 6, RULE_statements);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case EXIT:
			case FOR:
			case IF:
			case READ:
			case WRITE:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				((StatementsContext)_localctx).statement = statement(_localctx.reg, _localctx.label);
				setState(80);
				((StatementsContext)_localctx).statements = statements(((StatementsContext)_localctx).statement.nreg, ((StatementsContext)_localctx).statement.nlabel);
				((StatementsContext)_localctx).nreg =  ((StatementsContext)_localctx).statements.nreg; ((StatementsContext)_localctx).nlabel =  ((StatementsContext)_localctx).statements.nlabel;
				}
				break;
			case ELSE:
			case END:
				enterOuterAlt(_localctx, 2);
				{
				((StatementsContext)_localctx).nreg =  _localctx.reg; ((StatementsContext)_localctx).nlabel =  _localctx.label;
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

	public static class StatementContext extends ParserRuleContext {
		public int reg;
		public int label;
		public int nreg;
		public int nlabel;
		public If_statementContext if_statement;
		public For_statementContext for_statement;
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public Exit_statementContext exit_statement() {
			return getRuleContext(Exit_statementContext.class,0);
		}
		public Read_statementContext read_statement() {
			return getRuleContext(Read_statementContext.class,0);
		}
		public Write_statementContext write_statement() {
			return getRuleContext(Write_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StatementContext(ParserRuleContext parent, int invokingState, int reg, int label) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement(int reg,int label) throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState(), reg, label);
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				assignment_statement(_localctx.reg);
				((StatementContext)_localctx).nreg =  _localctx.reg;((StatementContext)_localctx).nlabel = _localctx.label;
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				((StatementContext)_localctx).if_statement = if_statement(_localctx.reg, _localctx.label);
				((StatementContext)_localctx).nreg = ((StatementContext)_localctx).if_statement.nreg;((StatementContext)_localctx).nlabel = ((StatementContext)_localctx).if_statement.nlabel;
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				((StatementContext)_localctx).for_statement = for_statement(_localctx.reg, _localctx.label);
				((StatementContext)_localctx).nreg = ((StatementContext)_localctx).for_statement.nreg;((StatementContext)_localctx).nlabel = ((StatementContext)_localctx).for_statement.nlabel;
				}
				break;
			case EXIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				exit_statement();
				((StatementContext)_localctx).nreg =  _localctx.reg;((StatementContext)_localctx).nlabel = _localctx.label;
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 5);
				{
				setState(98);
				read_statement(_localctx.reg);
				((StatementContext)_localctx).nreg =  _localctx.reg;((StatementContext)_localctx).nlabel = _localctx.label;
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 6);
				{
				setState(101);
				write_statement(_localctx.reg);
				((StatementContext)_localctx).nreg =  _localctx.reg;((StatementContext)_localctx).nlabel = _localctx.label;
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

	public static class Assignment_statementContext extends ParserRuleContext {
		public int reg;
		public Token ID;
		public Arith_expressionContext arith_expression;
		public TerminalNode ID() { return getToken(RoseParser.ID, 0); }
		public TerminalNode COLEQUAL() { return getToken(RoseParser.COLEQUAL, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public TerminalNode TCOL() { return getToken(RoseParser.TCOL, 0); }
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Assignment_statementContext(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterAssignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitAssignment_statement(this);
		}
	}

	public final Assignment_statementContext assignment_statement(int reg) throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState(), reg);
		enterRule(_localctx, 10, RULE_assignment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			((Assignment_statementContext)_localctx).ID = match(ID);
			setState(107);
			match(COLEQUAL);
			setState(108);
			((Assignment_statementContext)_localctx).arith_expression = arith_expression(_localctx.reg);
			setState(109);
			match(TCOL);
			System.out.println("\tla\t$t" + ((Assignment_statementContext)_localctx).arith_expression.nreg + ", " + (((Assignment_statementContext)_localctx).ID!=null?((Assignment_statementContext)_localctx).ID.getText():null));
			System.out.println("\tsw\t$t" + ((Assignment_statementContext)_localctx).arith_expression.nplace + ", 0($t" + ((Assignment_statementContext)_localctx).arith_expression.nreg +")");
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

	public static class If_statementContext extends ParserRuleContext {
		public int reg;
		public int label;
		public int nreg;
		public int nlabel;
		public Bool_expressionContext bool_expression;
		public StatementsContext statements;
		public If_statementAContext if_statementA;
		public TerminalNode IF() { return getToken(RoseParser.IF, 0); }
		public Bool_expressionContext bool_expression() {
			return getRuleContext(Bool_expressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(RoseParser.THEN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public If_statementAContext if_statementA() {
			return getRuleContext(If_statementAContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public If_statementContext(ParserRuleContext parent, int invokingState, int reg, int label) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement(int reg,int label) throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState(), reg, label);
		enterRule(_localctx, 12, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(IF);
			System.out.println("# if");
			setState(115);
			((If_statementContext)_localctx).bool_expression = bool_expression(_localctx.reg, _localctx.label, _localctx.label+1, _localctx.label+3);
			setState(116);
			match(THEN);
			System.out.println("L" + _localctx.label + ":\t# then");
			setState(118);
			((If_statementContext)_localctx).statements = statements(((If_statementContext)_localctx).bool_expression.nreg, ((If_statementContext)_localctx).bool_expression.nlabel);
			System.out.println("\tb\tL" + (_localctx.label+2));
			System.out.print("L" + (_localctx.label+1));
			System.out.println(":\t#else");
			setState(122);
			((If_statementContext)_localctx).if_statementA = if_statementA(((If_statementContext)_localctx).statements.nreg, (_localctx.label+2), ((If_statementContext)_localctx).statements.nlabel);
			((If_statementContext)_localctx).nreg =  ((If_statementContext)_localctx).if_statementA.nreg; ((If_statementContext)_localctx).nlabel =  ((If_statementContext)_localctx).if_statementA.nlabel;
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

	public static class If_statementAContext extends ParserRuleContext {
		public int reg;
		public int nextlabel;
		public int label;
		public int nreg;
		public int nlabel;
		public StatementsContext statements;
		public TerminalNode ELSE() { return getToken(RoseParser.ELSE, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(RoseParser.END, 0); }
		public TerminalNode IF() { return getToken(RoseParser.IF, 0); }
		public TerminalNode TCOL() { return getToken(RoseParser.TCOL, 0); }
		public If_statementAContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public If_statementAContext(ParserRuleContext parent, int invokingState, int reg, int nextlabel, int label) {
			super(parent, invokingState);
			this.reg = reg;
			this.nextlabel = nextlabel;
			this.label = label;
		}
		@Override public int getRuleIndex() { return RULE_if_statementA; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterIf_statementA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitIf_statementA(this);
		}
	}

	public final If_statementAContext if_statementA(int reg,int nextlabel,int label) throws RecognitionException {
		If_statementAContext _localctx = new If_statementAContext(_ctx, getState(), reg, nextlabel, label);
		enterRule(_localctx, 14, RULE_if_statementA);
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				match(ELSE);
				setState(126);
				((If_statementAContext)_localctx).statements = statements(_localctx.reg, _localctx.label);
				setState(127);
				match(END);
				setState(128);
				match(IF);
				setState(129);
				match(TCOL);
				System.out.println("L" + _localctx.nextlabel + ":\tend if");
				((If_statementAContext)_localctx).nreg = ((If_statementAContext)_localctx).statements.nreg;
				((If_statementAContext)_localctx).nlabel = ((If_statementAContext)_localctx).statements.nlabel;
				}
				break;
			case END:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(END);
				setState(135);
				match(IF);
				setState(136);
				match(TCOL);
				System.out.println("L" + _localctx.nextlabel + ":\tend if");
				((If_statementAContext)_localctx).nreg = _localctx.reg;
				((If_statementAContext)_localctx).nlabel = _localctx.label;
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

	public static class For_statementContext extends ParserRuleContext {
		public int reg;
		public int label;
		public int nreg;
		public int nlabel;
		public Token ID;
		public Arith_expressionContext arith1;
		public Arith_expressionContext arith2;
		public StatementsContext statements;
		public TerminalNode FOR() { return getToken(RoseParser.FOR, 0); }
		public TerminalNode ID() { return getToken(RoseParser.ID, 0); }
		public TerminalNode IN() { return getToken(RoseParser.IN, 0); }
		public TerminalNode TPR() { return getToken(RoseParser.TPR, 0); }
		public List<TerminalNode> LOOP() { return getTokens(RoseParser.LOOP); }
		public TerminalNode LOOP(int i) {
			return getToken(RoseParser.LOOP, i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(RoseParser.END, 0); }
		public TerminalNode TCOL() { return getToken(RoseParser.TCOL, 0); }
		public List<Arith_expressionContext> arith_expression() {
			return getRuleContexts(Arith_expressionContext.class);
		}
		public Arith_expressionContext arith_expression(int i) {
			return getRuleContext(Arith_expressionContext.class,i);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public For_statementContext(ParserRuleContext parent, int invokingState, int reg, int label) {
			super(parent, invokingState);
			this.reg = reg;
			this.label = label;
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitFor_statement(this);
		}
	}

	public final For_statementContext for_statement(int reg,int label) throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState(), reg, label);
		enterRule(_localctx, 16, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(FOR);
			setState(143);
			((For_statementContext)_localctx).ID = match(ID);
			setState(144);
			match(IN);
			setState(145);
			((For_statementContext)_localctx).arith1 = arith_expression(_localctx.reg);
			System.out.println("\tla\t$t" + ((For_statementContext)_localctx).arith1.nreg + ", " + (((For_statementContext)_localctx).ID!=null?((For_statementContext)_localctx).ID.getText():null));
			System.out.println("\tsw\t$t" + ((For_statementContext)_localctx).arith1.nplace + ", 0($t" + ((For_statementContext)_localctx).arith1.nreg + ")");
			System.out.println("L" + _localctx.label + ":\t# for");
			System.out.println("\tla\t$t" + _localctx.reg + ", " + (((For_statementContext)_localctx).ID!=null?((For_statementContext)_localctx).ID.getText():null));
			System.out.println("\tlw\t$t" + _localctx.reg + ", 0($t" + _localctx.reg + ")");
			setState(151);
			match(TPR);
			setState(152);
			((For_statementContext)_localctx).arith2 = arith_expression(_localctx.reg + 1);
			setState(153);
			match(LOOP);
			System.out.println("\tble\t$t" + _localctx.reg + ", $t" + ((For_statementContext)_localctx).arith2.nplace + ", L"+(_localctx.label+1));
			System.out.println("\tb\tL" + (_localctx.label+2));
			System.out.println("L" + (_localctx.label+1) + ":\t# for body");
			setState(157);
			((For_statementContext)_localctx).statements = statements(_localctx.reg, _localctx.label +3);
			System.out.println("\tla\t$t" + ((For_statementContext)_localctx).statements.nreg + ", " + (((For_statementContext)_localctx).ID!=null?((For_statementContext)_localctx).ID.getText():null));
			System.out.println("\tlw\t$t" + ((For_statementContext)_localctx).statements.nreg + ", 0($t" + ((For_statementContext)_localctx).statements.nreg + ")");
			System.out.println("\tli\t$t" + (((For_statementContext)_localctx).statements.nreg+1) + ", 1");
			System.out.println("\tadd\t$t" + ((For_statementContext)_localctx).statements.nreg + ", $t" + ((For_statementContext)_localctx).statements.nreg +", $t" + (((For_statementContext)_localctx).statements.nreg+1));
			System.out.println("\tla\t$t" + (((For_statementContext)_localctx).statements.nreg+1) + ", " + (((For_statementContext)_localctx).ID!=null?((For_statementContext)_localctx).ID.getText():null));
			System.out.println("\tsw\t$t" + ((For_statementContext)_localctx).statements.nreg + ", 0($t" + (((For_statementContext)_localctx).statements.nreg+1) + ")");
			System.out.println("\tb\tL" + (_localctx.label));
			setState(165);
			match(END);
			setState(166);
			match(LOOP);
			setState(167);
			match(TCOL);
			System.out.println("L" + (_localctx.label+2) + ":\t# end for");
			((For_statementContext)_localctx).nreg =  ((For_statementContext)_localctx).statements.nreg;
			((For_statementContext)_localctx).nlabel =  ((For_statementContext)_localctx).statements.nlabel;
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

	public static class Exit_statementContext extends ParserRuleContext {
		public TerminalNode EXIT() { return getToken(RoseParser.EXIT, 0); }
		public TerminalNode TCOL() { return getToken(RoseParser.TCOL, 0); }
		public Exit_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exit_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterExit_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitExit_statement(this);
		}
	}

	public final Exit_statementContext exit_statement() throws RecognitionException {
		Exit_statementContext _localctx = new Exit_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exit_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(EXIT);
			setState(173);
			match(TCOL);
			System.out.println("\tli\t$v0, 10\n\tsyscall");
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

	public static class Read_statementContext extends ParserRuleContext {
		public int reg;
		public Token ID;
		public TerminalNode READ() { return getToken(RoseParser.READ, 0); }
		public TerminalNode ID() { return getToken(RoseParser.ID, 0); }
		public TerminalNode TCOL() { return getToken(RoseParser.TCOL, 0); }
		public Read_statementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Read_statementContext(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
		}
		@Override public int getRuleIndex() { return RULE_read_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterRead_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitRead_statement(this);
		}
	}

	public final Read_statementContext read_statement(int reg) throws RecognitionException {
		Read_statementContext _localctx = new Read_statementContext(_ctx, getState(), reg);
		enterRule(_localctx, 20, RULE_read_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(READ);
			setState(177);
			((Read_statementContext)_localctx).ID = match(ID);
			setState(178);
			match(TCOL);
			System.out.println("\tli\t$v0, 5\n\tsyscall\n\tla\t$t" + _localctx.reg + "," + (((Read_statementContext)_localctx).ID!=null?((Read_statementContext)_localctx).ID.getText():null) + "\n\tsw\t$v0, 0($t" + _localctx.reg + ")");
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

	public static class Write_statementContext extends ParserRuleContext {
		public int reg;
		public Arith_expressionContext arith_expression;
		public TerminalNode WRITE() { return getToken(RoseParser.WRITE, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public TerminalNode TCOL() { return getToken(RoseParser.TCOL, 0); }
		public Write_statementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Write_statementContext(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
		}
		@Override public int getRuleIndex() { return RULE_write_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterWrite_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitWrite_statement(this);
		}
	}

	public final Write_statementContext write_statement(int reg) throws RecognitionException {
		Write_statementContext _localctx = new Write_statementContext(_ctx, getState(), reg);
		enterRule(_localctx, 22, RULE_write_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(WRITE);
			setState(182);
			((Write_statementContext)_localctx).arith_expression = arith_expression(_localctx.reg);
			setState(183);
			match(TCOL);
			System.out.println("\tmove\t$a0, $t" + ((Write_statementContext)_localctx).arith_expression.nplace + "\n\tli\t$v0, 1\n\tsyscall");
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

	public static class Bool_expressionContext extends ParserRuleContext {
		public int reg;
		public int truelabel;
		public int falselabel;
		public int label;
		public int nreg;
		public int nlabel;
		public Bool_termContext bool_term;
		public Bool_expressionsContext bool_expressions;
		public Bool_termContext bool_term() {
			return getRuleContext(Bool_termContext.class,0);
		}
		public Bool_expressionsContext bool_expressions() {
			return getRuleContext(Bool_expressionsContext.class,0);
		}
		public Bool_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Bool_expressionContext(ParserRuleContext parent, int invokingState, int reg, int truelabel, int falselabel, int label) {
			super(parent, invokingState);
			this.reg = reg;
			this.truelabel = truelabel;
			this.falselabel = falselabel;
			this.label = label;
		}
		@Override public int getRuleIndex() { return RULE_bool_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterBool_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitBool_expression(this);
		}
	}

	public final Bool_expressionContext bool_expression(int reg,int truelabel,int falselabel,int label) throws RecognitionException {
		Bool_expressionContext _localctx = new Bool_expressionContext(_ctx, getState(), reg, truelabel, falselabel, label);
		enterRule(_localctx, 24, RULE_bool_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			System.out.println("L" + _localctx.label + ":");
			setState(187);
			((Bool_expressionContext)_localctx).bool_term = bool_term(_localctx.reg, _localctx.truelabel, _localctx.falselabel, _localctx.label+1);
			setState(188);
			((Bool_expressionContext)_localctx).bool_expressions = bool_expressions(((Bool_expressionContext)_localctx).bool_term.nreg, _localctx.truelabel, _localctx.falselabel, _localctx.label+1);
			((Bool_expressionContext)_localctx).reg = ((Bool_expressionContext)_localctx).bool_expressions.nreg;((Bool_expressionContext)_localctx).nlabel = ((Bool_expressionContext)_localctx).bool_expressions.nlabel;
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

	public static class Bool_expressionsContext extends ParserRuleContext {
		public int reg;
		public int truelabel;
		public int falselabel;
		public int label;
		public int nreg;
		public int nlabel;
		public Bool_termContext bool_term;
		public Bool_expressionsContext bool_expressions;
		public TerminalNode DOUBLELINE() { return getToken(RoseParser.DOUBLELINE, 0); }
		public Bool_termContext bool_term() {
			return getRuleContext(Bool_termContext.class,0);
		}
		public Bool_expressionsContext bool_expressions() {
			return getRuleContext(Bool_expressionsContext.class,0);
		}
		public Bool_expressionsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Bool_expressionsContext(ParserRuleContext parent, int invokingState, int reg, int truelabel, int falselabel, int label) {
			super(parent, invokingState);
			this.reg = reg;
			this.truelabel = truelabel;
			this.falselabel = falselabel;
			this.label = label;
		}
		@Override public int getRuleIndex() { return RULE_bool_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterBool_expressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitBool_expressions(this);
		}
	}

	public final Bool_expressionsContext bool_expressions(int reg,int truelabel,int falselabel,int label) throws RecognitionException {
		Bool_expressionsContext _localctx = new Bool_expressionsContext(_ctx, getState(), reg, truelabel, falselabel, label);
		enterRule(_localctx, 26, RULE_bool_expressions);
		try {
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLELINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(DOUBLELINE);
				System.out.println("L" + _localctx.label + ":");
				setState(193);
				((Bool_expressionsContext)_localctx).bool_term = bool_term(_localctx.reg, _localctx.truelabel, _localctx.falselabel, _localctx.label+1);
				setState(194);
				((Bool_expressionsContext)_localctx).bool_expressions = bool_expressions(((Bool_expressionsContext)_localctx).bool_term.nreg, _localctx.truelabel, _localctx.falselabel, _localctx.label+1);
				((Bool_expressionsContext)_localctx).reg = ((Bool_expressionsContext)_localctx).bool_expressions.nreg;((Bool_expressionsContext)_localctx).nlabel = ((Bool_expressionsContext)_localctx).bool_expressions.nlabel;
				}
				break;
			case THEN:
				enterOuterAlt(_localctx, 2);
				{
				System.out.println("L" + _localctx.label + ":");
				System.out.println("\tb\tL" + _localctx.falselabel);
				((Bool_expressionsContext)_localctx).nreg = _localctx.reg;((Bool_expressionsContext)_localctx).nlabel =  _localctx.label+1;
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

	public static class Bool_termContext extends ParserRuleContext {
		public int reg;
		public int truelabel;
		public int falselabel;
		public int nlabel;
		public int nreg;
		public Bool_factorContext bool_factor;
		public Bool_termsContext bool_terms;
		public Bool_factorContext bool_factor() {
			return getRuleContext(Bool_factorContext.class,0);
		}
		public Bool_termsContext bool_terms() {
			return getRuleContext(Bool_termsContext.class,0);
		}
		public Bool_termContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Bool_termContext(ParserRuleContext parent, int invokingState, int reg, int truelabel, int falselabel, int nlabel) {
			super(parent, invokingState);
			this.reg = reg;
			this.truelabel = truelabel;
			this.falselabel = falselabel;
			this.nlabel = nlabel;
		}
		@Override public int getRuleIndex() { return RULE_bool_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterBool_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitBool_term(this);
		}
	}

	public final Bool_termContext bool_term(int reg,int truelabel,int falselabel,int nlabel) throws RecognitionException {
		Bool_termContext _localctx = new Bool_termContext(_ctx, getState(), reg, truelabel, falselabel, nlabel);
		enterRule(_localctx, 28, RULE_bool_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			((Bool_termContext)_localctx).bool_factor = bool_factor(_localctx.reg, _localctx.truelabel, _localctx.falselabel, _localctx.nlabel);
			setState(203);
			((Bool_termContext)_localctx).bool_terms = bool_terms(((Bool_termContext)_localctx).bool_factor.nreg, _localctx.truelabel, _localctx.falselabel, _localctx.nlabel);
			System.out.println("\tb\tL" + _localctx.truelabel);
			((Bool_termContext)_localctx).nreg =  ((Bool_termContext)_localctx).bool_terms.nreg;
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

	public static class Bool_termsContext extends ParserRuleContext {
		public int reg;
		public int truelabel;
		public int falselabel;
		public int nlabel;
		public int nreg;
		public Bool_factorContext bool_factor;
		public Bool_termsContext bool_terms;
		public TerminalNode AND() { return getToken(RoseParser.AND, 0); }
		public Bool_factorContext bool_factor() {
			return getRuleContext(Bool_factorContext.class,0);
		}
		public Bool_termsContext bool_terms() {
			return getRuleContext(Bool_termsContext.class,0);
		}
		public Bool_termsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Bool_termsContext(ParserRuleContext parent, int invokingState, int reg, int truelabel, int falselabel, int nlabel) {
			super(parent, invokingState);
			this.reg = reg;
			this.truelabel = truelabel;
			this.falselabel = falselabel;
			this.nlabel = nlabel;
		}
		@Override public int getRuleIndex() { return RULE_bool_terms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterBool_terms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitBool_terms(this);
		}
	}

	public final Bool_termsContext bool_terms(int reg,int truelabel,int falselabel,int nlabel) throws RecognitionException {
		Bool_termsContext _localctx = new Bool_termsContext(_ctx, getState(), reg, truelabel, falselabel, nlabel);
		enterRule(_localctx, 30, RULE_bool_terms);
		try {
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(AND);
				setState(208);
				((Bool_termsContext)_localctx).bool_factor = bool_factor(_localctx.reg, _localctx.truelabel, _localctx.falselabel, _localctx.nlabel);
				setState(209);
				((Bool_termsContext)_localctx).bool_terms = bool_terms(((Bool_termsContext)_localctx).bool_factor.nreg, _localctx.truelabel, _localctx.falselabel, _localctx.nlabel);
				((Bool_termsContext)_localctx).nreg = ((Bool_termsContext)_localctx).bool_terms.nreg;
				}
				break;
			case THEN:
			case DOUBLELINE:
				enterOuterAlt(_localctx, 2);
				{
				((Bool_termsContext)_localctx).nreg = _localctx.reg;
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

	public static class Bool_factorContext extends ParserRuleContext {
		public int reg;
		public int truelabel;
		public int falselabel;
		public int nextlabel;
		public int nreg;
		public Bool_primaryContext bool_primary;
		public TerminalNode EXCLAMATION() { return getToken(RoseParser.EXCLAMATION, 0); }
		public Bool_primaryContext bool_primary() {
			return getRuleContext(Bool_primaryContext.class,0);
		}
		public Bool_factorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Bool_factorContext(ParserRuleContext parent, int invokingState, int reg, int truelabel, int falselabel, int nextlabel) {
			super(parent, invokingState);
			this.reg = reg;
			this.truelabel = truelabel;
			this.falselabel = falselabel;
			this.nextlabel = nextlabel;
		}
		@Override public int getRuleIndex() { return RULE_bool_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterBool_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitBool_factor(this);
		}
	}

	public final Bool_factorContext bool_factor(int reg,int truelabel,int falselabel,int nextlabel) throws RecognitionException {
		Bool_factorContext _localctx = new Bool_factorContext(_ctx, getState(), reg, truelabel, falselabel, nextlabel);
		enterRule(_localctx, 32, RULE_bool_factor);
		try {
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXCLAMATION:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				match(EXCLAMATION);
				setState(216);
				((Bool_factorContext)_localctx).bool_primary = bool_primary(_localctx.reg,_localctx.truelabel,_localctx.falselabel,_localctx.nextlabel,1);
				((Bool_factorContext)_localctx).nreg = ((Bool_factorContext)_localctx).bool_primary.nreg;
				}
				break;
			case ID:
			case CONST:
			case SUBTRACT:
			case UPPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				((Bool_factorContext)_localctx).bool_primary = bool_primary(_localctx.reg,_localctx.truelabel,_localctx.falselabel,_localctx.nextlabel,0);
				((Bool_factorContext)_localctx).nreg = ((Bool_factorContext)_localctx).bool_primary.nreg;
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

	public static class Bool_primaryContext extends ParserRuleContext {
		public int reg;
		public int trueL;
		public int falseL;
		public int nlabel;
		public int not;
		public int nreg;
		public Arith_expressionContext arEx;
		public Arith_expressionContext arith_expression;
		public Relation_opContext relation_op;
		public Relation_opContext relation_op() {
			return getRuleContext(Relation_opContext.class,0);
		}
		public List<Arith_expressionContext> arith_expression() {
			return getRuleContexts(Arith_expressionContext.class);
		}
		public Arith_expressionContext arith_expression(int i) {
			return getRuleContext(Arith_expressionContext.class,i);
		}
		public Bool_primaryContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Bool_primaryContext(ParserRuleContext parent, int invokingState, int reg, int trueL, int falseL, int nlabel, int not) {
			super(parent, invokingState);
			this.reg = reg;
			this.trueL = trueL;
			this.falseL = falseL;
			this.nlabel = nlabel;
			this.not = not;
		}
		@Override public int getRuleIndex() { return RULE_bool_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterBool_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitBool_primary(this);
		}
	}

	public final Bool_primaryContext bool_primary(int reg,int trueL,int falseL,int nlabel,int not) throws RecognitionException {
		Bool_primaryContext _localctx = new Bool_primaryContext(_ctx, getState(), reg, trueL, falseL, nlabel, not);
		enterRule(_localctx, 34, RULE_bool_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			((Bool_primaryContext)_localctx).arEx = ((Bool_primaryContext)_localctx).arith_expression = arith_expression(_localctx.reg);
			setState(225);
			((Bool_primaryContext)_localctx).relation_op = relation_op();
			setState(226);
			((Bool_primaryContext)_localctx).arith_expression = arith_expression(((Bool_primaryContext)_localctx).arEx.nreg);

			      if(not == 0)
			      {
			        switch(((Bool_primaryContext)_localctx).relation_op.relationCase)
			        {
			          case 0:
			            System.out.println("\tbne\t$t" + ((Bool_primaryContext)_localctx).arEx.nplace + ", $t" + ((Bool_primaryContext)_localctx).arith_expression.nplace + ", L" + _localctx.nlabel);
			            break;
			          case 1:
			            System.out.println("\tbge\t$t" + ((Bool_primaryContext)_localctx).arEx.nplace + ", $t" + ((Bool_primaryContext)_localctx).arith_expression.nplace + ", L" + _localctx.nlabel);
			            break;
			          case 2:
			            System.out.println("\tble\t$t" + ((Bool_primaryContext)_localctx).arEx.nplace + ", $t" + ((Bool_primaryContext)_localctx).arith_expression.nplace + ", L" + _localctx.nlabel);
			            break;
			          case 3:
			            System.out.println("\tbeq\t$t" + ((Bool_primaryContext)_localctx).arEx.nplace + ", $t" + ((Bool_primaryContext)_localctx).arith_expression.nplace + ", L" + _localctx.nlabel);
			            break;
			          case 4:
			            System.out.println("\tbgt\t$t" + ((Bool_primaryContext)_localctx).arEx.nplace + ", $t" + ((Bool_primaryContext)_localctx).arith_expression.nplace + ", L" + _localctx.nlabel);
			            break;
			          case 5:
			            System.out.println("\tblt\t$t" + ((Bool_primaryContext)_localctx).arEx.nplace + ", $t" + ((Bool_primaryContext)_localctx).arith_expression.nplace + ", L" + _localctx.nlabel);
			            break;
			        }
			      }
			      else
			      {
			        switch(((Bool_primaryContext)_localctx).relation_op.relationCase)
			        {
			          case 0:
			            System.out.println("\tbeq\t$t" + ((Bool_primaryContext)_localctx).arEx.nplace + ", $t" + ((Bool_primaryContext)_localctx).arith_expression.nplace + ", L" + _localctx.nlabel);
			            break;
			          case 1:
			            System.out.println("\tblt\t$t" + ((Bool_primaryContext)_localctx).arEx.nplace + ", $t" + ((Bool_primaryContext)_localctx).arith_expression.nplace + ", L" + _localctx.nlabel);
			            break;
			          case 2:
			            System.out.println("\tbgt\t$t" + ((Bool_primaryContext)_localctx).arEx.nplace + ", $t" + ((Bool_primaryContext)_localctx).arith_expression.nplace + ", L" + _localctx.nlabel);
			            break;
			          case 3:
			            System.out.println("\tbne\t$t" + ((Bool_primaryContext)_localctx).arEx.nplace + ", $t" + ((Bool_primaryContext)_localctx).arith_expression.nplace + ", L" + _localctx.nlabel);
			            break;
			          case 4:
			            System.out.println("\tble\t$t" + ((Bool_primaryContext)_localctx).arEx.nplace + ", $t" + ((Bool_primaryContext)_localctx).arith_expression.nplace + ", L" + _localctx.nlabel);
			            break;
			          case 5:
			            System.out.println("\tbge\t$t" + ((Bool_primaryContext)_localctx).arEx.nplace + ", $t" + ((Bool_primaryContext)_localctx).arith_expression.nplace + ", L" + _localctx.nlabel);
			            break;
			        }
			      }
			    
			((Bool_primaryContext)_localctx).nreg =  _localctx.reg;
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

	public static class Relation_opContext extends ParserRuleContext {
		public int relationCase;
		public Relation_op_alphaContext relation_op_alpha;
		public Relation_op_betaContext relation_op_beta;
		public TerminalNode EQ() { return getToken(RoseParser.EQ, 0); }
		public TerminalNode LT() { return getToken(RoseParser.LT, 0); }
		public Relation_op_alphaContext relation_op_alpha() {
			return getRuleContext(Relation_op_alphaContext.class,0);
		}
		public TerminalNode GT() { return getToken(RoseParser.GT, 0); }
		public Relation_op_betaContext relation_op_beta() {
			return getRuleContext(Relation_op_betaContext.class,0);
		}
		public Relation_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterRelation_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitRelation_op(this);
		}
	}

	public final Relation_opContext relation_op() throws RecognitionException {
		Relation_opContext _localctx = new Relation_opContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_relation_op);
		try {
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				match(EQ);
				((Relation_opContext)_localctx).relationCase =  0;
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				match(LT);
				setState(233);
				((Relation_opContext)_localctx).relation_op_alpha = relation_op_alpha();
				((Relation_opContext)_localctx).relationCase =  1 + ((Relation_opContext)_localctx).relation_op_alpha.relationCase;
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				match(GT);
				setState(237);
				((Relation_opContext)_localctx).relation_op_beta = relation_op_beta();
				((Relation_opContext)_localctx).relationCase =  2 + ((Relation_opContext)_localctx).relation_op_beta.relationCase;
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

	public static class Relation_op_alphaContext extends ParserRuleContext {
		public int relationCase;
		public TerminalNode GT() { return getToken(RoseParser.GT, 0); }
		public TerminalNode EQ() { return getToken(RoseParser.EQ, 0); }
		public Relation_op_alphaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation_op_alpha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterRelation_op_alpha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitRelation_op_alpha(this);
		}
	}

	public final Relation_op_alphaContext relation_op_alpha() throws RecognitionException {
		Relation_op_alphaContext _localctx = new Relation_op_alphaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_relation_op_alpha);
		try {
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GT:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				match(GT);
				((Relation_op_alphaContext)_localctx).relationCase =  2;
				}
				break;
			case EQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				match(EQ);
				((Relation_op_alphaContext)_localctx).relationCase =  3;
				}
				break;
			case ID:
			case CONST:
			case SUBTRACT:
			case UPPAREN:
				enterOuterAlt(_localctx, 3);
				{
				((Relation_op_alphaContext)_localctx).relationCase =  0;
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

	public static class Relation_op_betaContext extends ParserRuleContext {
		public int relationCase;
		public TerminalNode EQ() { return getToken(RoseParser.EQ, 0); }
		public Relation_op_betaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation_op_beta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterRelation_op_beta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitRelation_op_beta(this);
		}
	}

	public final Relation_op_betaContext relation_op_beta() throws RecognitionException {
		Relation_op_betaContext _localctx = new Relation_op_betaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_relation_op_beta);
		try {
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				match(EQ);
				((Relation_op_betaContext)_localctx).relationCase =  3;
				}
				break;
			case ID:
			case CONST:
			case SUBTRACT:
			case UPPAREN:
				enterOuterAlt(_localctx, 2);
				{
				((Relation_op_betaContext)_localctx).relationCase =  0;
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

	public static class Arith_expressionContext extends ParserRuleContext {
		public int reg;
		public int nreg;
		public int nplace;
		public Arith_termContext arith_term;
		public Arith_expressionsContext arith_expressions;
		public Arith_termContext arith_term() {
			return getRuleContext(Arith_termContext.class,0);
		}
		public Arith_expressionsContext arith_expressions() {
			return getRuleContext(Arith_expressionsContext.class,0);
		}
		public Arith_expressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Arith_expressionContext(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
		}
		@Override public int getRuleIndex() { return RULE_arith_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterArith_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitArith_expression(this);
		}
	}

	public final Arith_expressionContext arith_expression(int reg) throws RecognitionException {
		Arith_expressionContext _localctx = new Arith_expressionContext(_ctx, getState(), reg);
		enterRule(_localctx, 42, RULE_arith_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			((Arith_expressionContext)_localctx).arith_term = arith_term(_localctx.reg);
			setState(255);
			((Arith_expressionContext)_localctx).arith_expressions = arith_expressions(((Arith_expressionContext)_localctx).arith_term.nreg, ((Arith_expressionContext)_localctx).arith_term.nplace);
			((Arith_expressionContext)_localctx).nreg = ((Arith_expressionContext)_localctx).arith_expressions.nreg;
			((Arith_expressionContext)_localctx).nplace = ((Arith_expressionContext)_localctx).arith_expressions.nplace;
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

	public static class Arith_expressionsContext extends ParserRuleContext {
		public int reg;
		public int place;
		public int nreg;
		public int nplace;
		public Arith_termContext arith_term;
		public Arith_expressionsContext arith_expressions;
		public TerminalNode ADD() { return getToken(RoseParser.ADD, 0); }
		public Arith_termContext arith_term() {
			return getRuleContext(Arith_termContext.class,0);
		}
		public Arith_expressionsContext arith_expressions() {
			return getRuleContext(Arith_expressionsContext.class,0);
		}
		public TerminalNode SUBTRACT() { return getToken(RoseParser.SUBTRACT, 0); }
		public Arith_expressionsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Arith_expressionsContext(ParserRuleContext parent, int invokingState, int reg, int place) {
			super(parent, invokingState);
			this.reg = reg;
			this.place = place;
		}
		@Override public int getRuleIndex() { return RULE_arith_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterArith_expressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitArith_expressions(this);
		}
	}

	public final Arith_expressionsContext arith_expressions(int reg,int place) throws RecognitionException {
		Arith_expressionsContext _localctx = new Arith_expressionsContext(_ctx, getState(), reg, place);
		enterRule(_localctx, 44, RULE_arith_expressions);
		try {
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				match(ADD);
				setState(260);
				((Arith_expressionsContext)_localctx).arith_term = arith_term(_localctx.reg);
				System.out.println("\tadd\t$t" + _localctx.place + ", $t" + _localctx.place +", $t" + ((Arith_expressionsContext)_localctx).arith_term.nplace);
				((Arith_expressionsContext)_localctx).arith_term.nreg=((Arith_expressionsContext)_localctx).arith_term.nreg-1;
				setState(263);
				((Arith_expressionsContext)_localctx).arith_expressions = arith_expressions(((Arith_expressionsContext)_localctx).arith_term.nreg, _localctx.place);
				((Arith_expressionsContext)_localctx).nreg =  ((Arith_expressionsContext)_localctx).arith_expressions.nreg;
				((Arith_expressionsContext)_localctx).nplace =  ((Arith_expressionsContext)_localctx).arith_expressions.nplace;
				}
				break;
			case SUBTRACT:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				match(SUBTRACT);
				setState(268);
				((Arith_expressionsContext)_localctx).arith_term = arith_term(_localctx.reg);
				System.out.println("\tsub\t$t" + _localctx.place + ", $t" + _localctx.place +", $t" + ((Arith_expressionsContext)_localctx).arith_term.nplace);
				((Arith_expressionsContext)_localctx).arith_term.nreg=((Arith_expressionsContext)_localctx).arith_term.nreg-1;
				setState(271);
				((Arith_expressionsContext)_localctx).arith_expressions = arith_expressions(((Arith_expressionsContext)_localctx).arith_term.nreg, _localctx.place);
				((Arith_expressionsContext)_localctx).nreg =  ((Arith_expressionsContext)_localctx).arith_expressions.nreg;
				((Arith_expressionsContext)_localctx).nplace =  ((Arith_expressionsContext)_localctx).arith_expressions.nplace;
				}
				break;
			case LOOP:
			case THEN:
			case TPR:
			case TCOL:
			case EQ:
			case GT:
			case LT:
			case AND:
			case DOUBLELINE:
			case DOWNPAREN:
				enterOuterAlt(_localctx, 3);
				{
				((Arith_expressionsContext)_localctx).nreg = _localctx.reg;((Arith_expressionsContext)_localctx).nplace = place;
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

	public static class Arith_termContext extends ParserRuleContext {
		public int reg;
		public int nreg;
		public int nplace;
		public Arith_factorContext arith_factor;
		public Arith_termsContext arith_terms;
		public Arith_factorContext arith_factor() {
			return getRuleContext(Arith_factorContext.class,0);
		}
		public Arith_termsContext arith_terms() {
			return getRuleContext(Arith_termsContext.class,0);
		}
		public Arith_termContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Arith_termContext(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
		}
		@Override public int getRuleIndex() { return RULE_arith_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterArith_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitArith_term(this);
		}
	}

	public final Arith_termContext arith_term(int reg) throws RecognitionException {
		Arith_termContext _localctx = new Arith_termContext(_ctx, getState(), reg);
		enterRule(_localctx, 46, RULE_arith_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			((Arith_termContext)_localctx).arith_factor = arith_factor(_localctx.reg);
			setState(279);
			((Arith_termContext)_localctx).arith_terms = arith_terms(((Arith_termContext)_localctx).arith_factor.nreg,((Arith_termContext)_localctx).arith_factor.nplace);
			((Arith_termContext)_localctx).nreg =  ((Arith_termContext)_localctx).arith_terms.nreg; ((Arith_termContext)_localctx).nplace = ((Arith_termContext)_localctx).arith_terms.nplace;
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

	public static class Arith_termsContext extends ParserRuleContext {
		public int reg;
		public int place;
		public int nreg;
		public int nplace;
		public Arith_factorContext arith_factor;
		public Arith_termsContext arith_terms;
		public TerminalNode MULTIPLY() { return getToken(RoseParser.MULTIPLY, 0); }
		public Arith_factorContext arith_factor() {
			return getRuleContext(Arith_factorContext.class,0);
		}
		public Arith_termsContext arith_terms() {
			return getRuleContext(Arith_termsContext.class,0);
		}
		public TerminalNode DIVIDE() { return getToken(RoseParser.DIVIDE, 0); }
		public TerminalNode PERCENT() { return getToken(RoseParser.PERCENT, 0); }
		public Arith_termsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Arith_termsContext(ParserRuleContext parent, int invokingState, int reg, int place) {
			super(parent, invokingState);
			this.reg = reg;
			this.place = place;
		}
		@Override public int getRuleIndex() { return RULE_arith_terms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterArith_terms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitArith_terms(this);
		}
	}

	public final Arith_termsContext arith_terms(int reg,int place) throws RecognitionException {
		Arith_termsContext _localctx = new Arith_termsContext(_ctx, getState(), reg, place);
		enterRule(_localctx, 48, RULE_arith_terms);
		try {
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULTIPLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				match(MULTIPLY);
				setState(283);
				((Arith_termsContext)_localctx).arith_factor = arith_factor(_localctx.reg);
				System.out.println("\tmul\t$t" + _localctx.place + ", $t" + _localctx.place +", $t" + ((Arith_termsContext)_localctx).arith_factor.nplace);((Arith_termsContext)_localctx).arith_factor.nreg=((Arith_termsContext)_localctx).arith_factor.nreg-1;
				setState(285);
				((Arith_termsContext)_localctx).arith_terms = arith_terms(((Arith_termsContext)_localctx).arith_factor.nreg,_localctx.place);
				((Arith_termsContext)_localctx).nreg =  ((Arith_termsContext)_localctx).arith_terms.nreg; ((Arith_termsContext)_localctx).nplace =  ((Arith_termsContext)_localctx).arith_terms.nplace;
				}
				break;
			case DIVIDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				match(DIVIDE);
				setState(289);
				((Arith_termsContext)_localctx).arith_factor = arith_factor(_localctx.reg);
				System.out.println("\tdiv\t$t" + _localctx.place + ", $t" + _localctx.place +", $t" + ((Arith_termsContext)_localctx).arith_factor.nplace);((Arith_termsContext)_localctx).arith_factor.nreg=((Arith_termsContext)_localctx).arith_factor.nreg-1;
				setState(291);
				((Arith_termsContext)_localctx).arith_terms = arith_terms(((Arith_termsContext)_localctx).arith_factor.nreg,_localctx.place);
				((Arith_termsContext)_localctx).nreg =  ((Arith_termsContext)_localctx).arith_terms.nreg; ((Arith_termsContext)_localctx).nplace =  ((Arith_termsContext)_localctx).arith_terms.nplace;
				}
				break;
			case PERCENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
				match(PERCENT);
				setState(295);
				((Arith_termsContext)_localctx).arith_factor = arith_factor(_localctx.reg);
				System.out.println("\trem\t$t" + _localctx.place + ", $t" + _localctx.place +", $t" + ((Arith_termsContext)_localctx).arith_factor.nplace);((Arith_termsContext)_localctx).arith_factor.nreg=((Arith_termsContext)_localctx).arith_factor.nreg-1;
				setState(297);
				((Arith_termsContext)_localctx).arith_terms = arith_terms(((Arith_termsContext)_localctx).arith_factor.nreg,_localctx.place);
				((Arith_termsContext)_localctx).nreg =  ((Arith_termsContext)_localctx).arith_terms.nreg; ((Arith_termsContext)_localctx).nplace =  ((Arith_termsContext)_localctx).arith_terms.nplace;
				}
				break;
			case LOOP:
			case THEN:
			case TPR:
			case TCOL:
			case ADD:
			case SUBTRACT:
			case EQ:
			case GT:
			case LT:
			case AND:
			case DOUBLELINE:
			case DOWNPAREN:
				enterOuterAlt(_localctx, 4);
				{
				((Arith_termsContext)_localctx).nreg = _localctx.reg; ((Arith_termsContext)_localctx).nplace =  _localctx.place;
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

	public static class Arith_factorContext extends ParserRuleContext {
		public int reg;
		public int nreg;
		public int nplace;
		public Arith_primaryContext arith_primary;
		public TerminalNode SUBTRACT() { return getToken(RoseParser.SUBTRACT, 0); }
		public Arith_primaryContext arith_primary() {
			return getRuleContext(Arith_primaryContext.class,0);
		}
		public Arith_factorContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Arith_factorContext(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
		}
		@Override public int getRuleIndex() { return RULE_arith_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterArith_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitArith_factor(this);
		}
	}

	public final Arith_factorContext arith_factor(int reg) throws RecognitionException {
		Arith_factorContext _localctx = new Arith_factorContext(_ctx, getState(), reg);
		enterRule(_localctx, 50, RULE_arith_factor);
		try {
			setState(313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUBTRACT:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				match(SUBTRACT);
				setState(304);
				((Arith_factorContext)_localctx).arith_primary = arith_primary(_localctx.reg);
				System.out.println("\tneg\t$t" + ((Arith_factorContext)_localctx).arith_primary.nplace +", $t" + ((Arith_factorContext)_localctx).arith_primary.nplace);
				((Arith_factorContext)_localctx).nreg =  ((Arith_factorContext)_localctx).arith_primary.nreg;
				((Arith_factorContext)_localctx).nplace =  ((Arith_factorContext)_localctx).arith_primary.nplace;
				}
				break;
			case ID:
			case CONST:
			case UPPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				((Arith_factorContext)_localctx).arith_primary = arith_primary(_localctx.reg);
				((Arith_factorContext)_localctx).nreg =  ((Arith_factorContext)_localctx).arith_primary.nreg;
				((Arith_factorContext)_localctx).nplace =  ((Arith_factorContext)_localctx).arith_primary.nplace;
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

	public static class Arith_primaryContext extends ParserRuleContext {
		public int reg;
		public int nreg;
		public int nplace;
		public Token CONST;
		public Token ID;
		public Arith_expressionContext arith_expression;
		public TerminalNode CONST() { return getToken(RoseParser.CONST, 0); }
		public TerminalNode ID() { return getToken(RoseParser.ID, 0); }
		public TerminalNode UPPAREN() { return getToken(RoseParser.UPPAREN, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public TerminalNode DOWNPAREN() { return getToken(RoseParser.DOWNPAREN, 0); }
		public Arith_primaryContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Arith_primaryContext(ParserRuleContext parent, int invokingState, int reg) {
			super(parent, invokingState);
			this.reg = reg;
		}
		@Override public int getRuleIndex() { return RULE_arith_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).enterArith_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RoseListener ) ((RoseListener)listener).exitArith_primary(this);
		}
	}

	public final Arith_primaryContext arith_primary(int reg) throws RecognitionException {
		Arith_primaryContext _localctx = new Arith_primaryContext(_ctx, getState(), reg);
		enterRule(_localctx, 52, RULE_arith_primary);
		try {
			setState(330);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				((Arith_primaryContext)_localctx).CONST = match(CONST);
				System.out.println("\tli\t$t" + _localctx.reg + ", " + (((Arith_primaryContext)_localctx).CONST!=null?((Arith_primaryContext)_localctx).CONST.getText():null));
				((Arith_primaryContext)_localctx).nplace = _localctx.reg;
				((Arith_primaryContext)_localctx).nreg = _localctx.reg + 1;
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				((Arith_primaryContext)_localctx).ID = match(ID);
				System.out.println("\tla\t$t" + _localctx.reg + ", " + (((Arith_primaryContext)_localctx).ID!=null?((Arith_primaryContext)_localctx).ID.getText():null));
				System.out.println("\tlw\t$t" + _localctx.reg + ", 0($" + _localctx.reg + ")");
				((Arith_primaryContext)_localctx).nplace = _localctx.reg;
				((Arith_primaryContext)_localctx).nreg = _localctx.reg + 1;
				}
				break;
			case UPPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(324);
				match(UPPAREN);
				setState(325);
				((Arith_primaryContext)_localctx).arith_expression = arith_expression(_localctx.reg);
				setState(326);
				match(DOWNPAREN);
				((Arith_primaryContext)_localctx).nreg =  ((Arith_primaryContext)_localctx).arith_expression.nreg;
				((Arith_primaryContext)_localctx).nplace =  ((Arith_primaryContext)_localctx).arith_expression.nplace;
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u014f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3J\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\5\5W\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6k\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u008f\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u00cb\n\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u00d8\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u00e1\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u00f3\n\24\3\25\3\25\3\25\3\25\3\25\5\25\u00fa"+
		"\n\25\3\26\3\26\3\26\5\26\u00ff\n\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\5\30\u0117\n\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u0130\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u013c"+
		"\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\5\34\u014d\n\34\3\34\2\2\35\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\66\2\2\2\u014b\28\3\2\2\2\4I\3\2\2\2\6K\3\2\2"+
		"\2\bV\3\2\2\2\nj\3\2\2\2\fl\3\2\2\2\16s\3\2\2\2\20\u008e\3\2\2\2\22\u0090"+
		"\3\2\2\2\24\u00ae\3\2\2\2\26\u00b2\3\2\2\2\30\u00b7\3\2\2\2\32\u00bc\3"+
		"\2\2\2\34\u00ca\3\2\2\2\36\u00cc\3\2\2\2 \u00d7\3\2\2\2\"\u00e0\3\2\2"+
		"\2$\u00e2\3\2\2\2&\u00f2\3\2\2\2(\u00f9\3\2\2\2*\u00fe\3\2\2\2,\u0100"+
		"\3\2\2\2.\u0116\3\2\2\2\60\u0118\3\2\2\2\62\u012f\3\2\2\2\64\u013b\3\2"+
		"\2\2\66\u014c\3\2\2\289\7\22\2\29:\7\3\2\2:;\7\20\2\2;<\7\b\2\2<=\b\2"+
		"\1\2=>\5\4\3\2>?\7\7\2\2?@\b\2\1\2@A\5\b\5\2AB\7\n\2\2BC\7\30\2\2CD\b"+
		"\2\1\2D\3\3\2\2\2EF\5\6\4\2FG\5\4\3\2GJ\3\2\2\2HJ\3\2\2\2IE\3\2\2\2IH"+
		"\3\2\2\2J\5\3\2\2\2KL\7\3\2\2LM\7\26\2\2MN\7\17\2\2NO\7\30\2\2OP\b\4\1"+
		"\2P\7\3\2\2\2QR\5\n\6\2RS\5\b\5\2ST\b\5\1\2TW\3\2\2\2UW\b\5\1\2VQ\3\2"+
		"\2\2VU\3\2\2\2W\t\3\2\2\2XY\5\f\7\2YZ\b\6\1\2Zk\3\2\2\2[\\\5\16\b\2\\"+
		"]\b\6\1\2]k\3\2\2\2^_\5\22\n\2_`\b\6\1\2`k\3\2\2\2ab\5\24\13\2bc\b\6\1"+
		"\2ck\3\2\2\2de\5\26\f\2ef\b\6\1\2fk\3\2\2\2gh\5\30\r\2hi\b\6\1\2ik\3\2"+
		"\2\2jX\3\2\2\2j[\3\2\2\2j^\3\2\2\2ja\3\2\2\2jd\3\2\2\2jg\3\2\2\2k\13\3"+
		"\2\2\2lm\7\3\2\2mn\7$\2\2no\5,\27\2op\7\30\2\2pq\b\7\1\2qr\b\7\1\2r\r"+
		"\3\2\2\2st\7\r\2\2tu\b\b\1\2uv\5\32\16\2vw\7\24\2\2wx\b\b\1\2xy\5\b\5"+
		"\2yz\b\b\1\2z{\b\b\1\2{|\b\b\1\2|}\5\20\t\2}~\b\b\1\2~\17\3\2\2\2\177"+
		"\u0080\7\t\2\2\u0080\u0081\5\b\5\2\u0081\u0082\7\n\2\2\u0082\u0083\7\r"+
		"\2\2\u0083\u0084\7\30\2\2\u0084\u0085\b\t\1\2\u0085\u0086\b\t\1\2\u0086"+
		"\u0087\b\t\1\2\u0087\u008f\3\2\2\2\u0088\u0089\7\n\2\2\u0089\u008a\7\r"+
		"\2\2\u008a\u008b\7\30\2\2\u008b\u008c\b\t\1\2\u008c\u008d\b\t\1\2\u008d"+
		"\u008f\b\t\1\2\u008e\177\3\2\2\2\u008e\u0088\3\2\2\2\u008f\21\3\2\2\2"+
		"\u0090\u0091\7\f\2\2\u0091\u0092\7\3\2\2\u0092\u0093\7\16\2\2\u0093\u0094"+
		"\5,\27\2\u0094\u0095\b\n\1\2\u0095\u0096\b\n\1\2\u0096\u0097\b\n\1\2\u0097"+
		"\u0098\b\n\1\2\u0098\u0099\b\n\1\2\u0099\u009a\7\27\2\2\u009a\u009b\5"+
		",\27\2\u009b\u009c\7\21\2\2\u009c\u009d\b\n\1\2\u009d\u009e\b\n\1\2\u009e"+
		"\u009f\b\n\1\2\u009f\u00a0\5\b\5\2\u00a0\u00a1\b\n\1\2\u00a1\u00a2\b\n"+
		"\1\2\u00a2\u00a3\b\n\1\2\u00a3\u00a4\b\n\1\2\u00a4\u00a5\b\n\1\2\u00a5"+
		"\u00a6\b\n\1\2\u00a6\u00a7\b\n\1\2\u00a7\u00a8\7\n\2\2\u00a8\u00a9\7\21"+
		"\2\2\u00a9\u00aa\7\30\2\2\u00aa\u00ab\b\n\1\2\u00ab\u00ac\b\n\1\2\u00ac"+
		"\u00ad\b\n\1\2\u00ad\23\3\2\2\2\u00ae\u00af\7\13\2\2\u00af\u00b0\7\30"+
		"\2\2\u00b0\u00b1\b\13\1\2\u00b1\25\3\2\2\2\u00b2\u00b3\7\23\2\2\u00b3"+
		"\u00b4\7\3\2\2\u00b4\u00b5\7\30\2\2\u00b5\u00b6\b\f\1\2\u00b6\27\3\2\2"+
		"\2\u00b7\u00b8\7\25\2\2\u00b8\u00b9\5,\27\2\u00b9\u00ba\7\30\2\2\u00ba"+
		"\u00bb\b\r\1\2\u00bb\31\3\2\2\2\u00bc\u00bd\b\16\1\2\u00bd\u00be\5\36"+
		"\20\2\u00be\u00bf\5\34\17\2\u00bf\u00c0\b\16\1\2\u00c0\33\3\2\2\2\u00c1"+
		"\u00c2\7\"\2\2\u00c2\u00c3\b\17\1\2\u00c3\u00c4\5\36\20\2\u00c4\u00c5"+
		"\5\34\17\2\u00c5\u00c6\b\17\1\2\u00c6\u00cb\3\2\2\2\u00c7\u00c8\b\17\1"+
		"\2\u00c8\u00c9\b\17\1\2\u00c9\u00cb\b\17\1\2\u00ca\u00c1\3\2\2\2\u00ca"+
		"\u00c7\3\2\2\2\u00cb\35\3\2\2\2\u00cc\u00cd\5\"\22\2\u00cd\u00ce\5 \21"+
		"\2\u00ce\u00cf\b\20\1\2\u00cf\u00d0\b\20\1\2\u00d0\37\3\2\2\2\u00d1\u00d2"+
		"\7!\2\2\u00d2\u00d3\5\"\22\2\u00d3\u00d4\5 \21\2\u00d4\u00d5\b\21\1\2"+
		"\u00d5\u00d8\3\2\2\2\u00d6\u00d8\b\21\1\2\u00d7\u00d1\3\2\2\2\u00d7\u00d6"+
		"\3\2\2\2\u00d8!\3\2\2\2\u00d9\u00da\7#\2\2\u00da\u00db\5$\23\2\u00db\u00dc"+
		"\b\22\1\2\u00dc\u00e1\3\2\2\2\u00dd\u00de\5$\23\2\u00de\u00df\b\22\1\2"+
		"\u00df\u00e1\3\2\2\2\u00e0\u00d9\3\2\2\2\u00e0\u00dd\3\2\2\2\u00e1#\3"+
		"\2\2\2\u00e2\u00e3\5,\27\2\u00e3\u00e4\5&\24\2\u00e4\u00e5\5,\27\2\u00e5"+
		"\u00e6\b\23\1\2\u00e6\u00e7\b\23\1\2\u00e7%\3\2\2\2\u00e8\u00e9\7\36\2"+
		"\2\u00e9\u00f3\b\24\1\2\u00ea\u00eb\7 \2\2\u00eb\u00ec\5(\25\2\u00ec\u00ed"+
		"\b\24\1\2\u00ed\u00f3\3\2\2\2\u00ee\u00ef\7\37\2\2\u00ef\u00f0\5*\26\2"+
		"\u00f0\u00f1\b\24\1\2\u00f1\u00f3\3\2\2\2\u00f2\u00e8\3\2\2\2\u00f2\u00ea"+
		"\3\2\2\2\u00f2\u00ee\3\2\2\2\u00f3\'\3\2\2\2\u00f4\u00f5\7\37\2\2\u00f5"+
		"\u00fa\b\25\1\2\u00f6\u00f7\7\36\2\2\u00f7\u00fa\b\25\1\2\u00f8\u00fa"+
		"\b\25\1\2\u00f9\u00f4\3\2\2\2\u00f9\u00f6\3\2\2\2\u00f9\u00f8\3\2\2\2"+
		"\u00fa)\3\2\2\2\u00fb\u00fc\7\36\2\2\u00fc\u00ff\b\26\1\2\u00fd\u00ff"+
		"\b\26\1\2\u00fe\u00fb\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff+\3\2\2\2\u0100"+
		"\u0101\5\60\31\2\u0101\u0102\5.\30\2\u0102\u0103\b\27\1\2\u0103\u0104"+
		"\b\27\1\2\u0104-\3\2\2\2\u0105\u0106\7\31\2\2\u0106\u0107\5\60\31\2\u0107"+
		"\u0108\b\30\1\2\u0108\u0109\b\30\1\2\u0109\u010a\5.\30\2\u010a\u010b\b"+
		"\30\1\2\u010b\u010c\b\30\1\2\u010c\u0117\3\2\2\2\u010d\u010e\7\32\2\2"+
		"\u010e\u010f\5\60\31\2\u010f\u0110\b\30\1\2\u0110\u0111\b\30\1\2\u0111"+
		"\u0112\5.\30\2\u0112\u0113\b\30\1\2\u0113\u0114\b\30\1\2\u0114\u0117\3"+
		"\2\2\2\u0115\u0117\b\30\1\2\u0116\u0105\3\2\2\2\u0116\u010d\3\2\2\2\u0116"+
		"\u0115\3\2\2\2\u0117/\3\2\2\2\u0118\u0119\5\64\33\2\u0119\u011a\5\62\32"+
		"\2\u011a\u011b\b\31\1\2\u011b\61\3\2\2\2\u011c\u011d\7\33\2\2\u011d\u011e"+
		"\5\64\33\2\u011e\u011f\b\32\1\2\u011f\u0120\5\62\32\2\u0120\u0121\b\32"+
		"\1\2\u0121\u0130\3\2\2\2\u0122\u0123\7\34\2\2\u0123\u0124\5\64\33\2\u0124"+
		"\u0125\b\32\1\2\u0125\u0126\5\62\32\2\u0126\u0127\b\32\1\2\u0127\u0130"+
		"\3\2\2\2\u0128\u0129\7\35\2\2\u0129\u012a\5\64\33\2\u012a\u012b\b\32\1"+
		"\2\u012b\u012c\5\62\32\2\u012c\u012d\b\32\1\2\u012d\u0130\3\2\2\2\u012e"+
		"\u0130\b\32\1\2\u012f\u011c\3\2\2\2\u012f\u0122\3\2\2\2\u012f\u0128\3"+
		"\2\2\2\u012f\u012e\3\2\2\2\u0130\63\3\2\2\2\u0131\u0132\7\32\2\2\u0132"+
		"\u0133\5\66\34\2\u0133\u0134\b\33\1\2\u0134\u0135\b\33\1\2\u0135\u0136"+
		"\b\33\1\2\u0136\u013c\3\2\2\2\u0137\u0138\5\66\34\2\u0138\u0139\b\33\1"+
		"\2\u0139\u013a\b\33\1\2\u013a\u013c\3\2\2\2\u013b\u0131\3\2\2\2\u013b"+
		"\u0137\3\2\2\2\u013c\65\3\2\2\2\u013d\u013e\7\4\2\2\u013e\u013f\b\34\1"+
		"\2\u013f\u0140\b\34\1\2\u0140\u014d\b\34\1\2\u0141\u0142\7\3\2\2\u0142"+
		"\u0143\b\34\1\2\u0143\u0144\b\34\1\2\u0144\u0145\b\34\1\2\u0145\u014d"+
		"\b\34\1\2\u0146\u0147\7%\2\2\u0147\u0148\5,\27\2\u0148\u0149\7&\2\2\u0149"+
		"\u014a\b\34\1\2\u014a\u014b\b\34\1\2\u014b\u014d\3\2\2\2\u014c\u013d\3"+
		"\2\2\2\u014c\u0141\3\2\2\2\u014c\u0146\3\2\2\2\u014d\67\3\2\2\2\20IVj"+
		"\u008e\u00ca\u00d7\u00e0\u00f2\u00f9\u00fe\u0116\u012f\u013b\u014c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}