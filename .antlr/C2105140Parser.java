// Generated from /home/tamanna/Documents/offline3-cs310/C2105140Parser.g4 by ANTLR 4.13.1

    #include <iostream>
    #include <fstream>
    #include <string>
    #include <cstdlib>
    #include "C8086Lexer.h"
    #include "SymbolTable.h"

    extern std::ofstream parserLogFile;
    extern std::ofstream errorFile;
    extern SymbolTable* symbolTable;

    extern int syntaxErrorCount;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class C2105140Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LINE_COMMENT=1, BLOCK_COMMENT=2, STRING=3, WS=4, IF=5, ELSE=6, FOR=7, 
		WHILE=8, PRINTLN=9, RETURN=10, INT=11, FLOAT=12, VOID=13, LPAREN=14, RPAREN=15, 
		LCURL=16, RCURL=17, LTHIRD=18, RTHIRD=19, SEMICOLON=20, COMMA=21, ADDOP=22, 
		SUBOP=23, MULOP=24, INCOP=25, DECOP=26, NOT=27, RELOP=28, LOGICOP=29, 
		ASSIGNOP=30, ID=31, CONST_INT=32, CONST_FLOAT=33;
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_unit = 2, RULE_func_declaration = 3, 
		RULE_parameter_list_err = 4, RULE_id_err = 5, RULE_func_definition = 6, 
		RULE_parameter_list = 7, RULE_compound_statement = 8, RULE_var_declaration = 9, 
		RULE_declaration_list_err = 10, RULE_type_specifier = 11, RULE_declaration_list = 12, 
		RULE_statements = 13, RULE_statement = 14, RULE_expression_statement = 15, 
		RULE_variable = 16, RULE_expression = 17, RULE_logic_expression = 18, 
		RULE_rel_expression = 19, RULE_simple_expression = 20, RULE_term = 21, 
		RULE_unary_expression = 22, RULE_factor = 23, RULE_argument_list = 24, 
		RULE_arguments = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "program", "unit", "func_declaration", "parameter_list_err", 
			"id_err", "func_definition", "parameter_list", "compound_statement", 
			"var_declaration", "declaration_list_err", "type_specifier", "declaration_list", 
			"statements", "statement", "expression_statement", "variable", "expression", 
			"logic_expression", "rel_expression", "simple_expression", "term", "unary_expression", 
			"factor", "argument_list", "arguments"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'if'", "'else'", "'for'", "'while'", "'println'", 
			"'return'", "'int'", "'float'", "'void'", "'('", "')'", "'{'", "'}'", 
			"'['", "']'", "';'", "','", null, null, null, "'++'", "'--'", "'!'", 
			null, null, "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LINE_COMMENT", "BLOCK_COMMENT", "STRING", "WS", "IF", "ELSE", 
			"FOR", "WHILE", "PRINTLN", "RETURN", "INT", "FLOAT", "VOID", "LPAREN", 
			"RPAREN", "LCURL", "RCURL", "LTHIRD", "RTHIRD", "SEMICOLON", "COMMA", 
			"ADDOP", "SUBOP", "MULOP", "INCOP", "DECOP", "NOT", "RELOP", "LOGICOP", 
			"ASSIGNOP", "ID", "CONST_INT", "CONST_FLOAT"
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
	public String getGrammarFileName() { return "C2105140Parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    void writeIntoparserLogFile(const std::string message) {
	        if (!parserLogFile) {
	            std::cout << "Error opening parserLogFile.txt" << std::endl;
	            return;
	        }

	        parserLogFile << message << std::endl;
	        parserLogFile.flush();
	    }

	    void writeIntoErrorFile(const std::string message) {
	        if (!errorFile) {
	            std::cout << "Error opening errorFile.txt" << std::endl;
	            return;
	        }
	        errorFile << message << std::endl;
	        errorFile.flush();
	    }

	public C2105140Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			program(0);

			        writeIntoparserLogFile("Parsing completed successfully with " + std::to_string(syntaxErrorCount) + " syntax errors.");
					symbolTable->printAllScopeTable();
				
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

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext p;
		public UnitContext u;
		public UnitContext unit() {
			return getRuleContext(UnitContext.class,0);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		return program(0);
	}

	private ProgramContext program(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ProgramContext _localctx = new ProgramContext(_ctx, _parentState);
		ProgramContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_program, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(56);
			((ProgramContext)_localctx).u = unit();

			        writeIntoparserLogFile("Line " + std::to_string((((ProgramContext)_localctx).u!=null?(((ProgramContext)_localctx).u.start):null)->getLine()) + ": program : unit");
			        writeIntoparserLogFile((((ProgramContext)_localctx).u!=null?_input.getText(((ProgramContext)_localctx).u.start,((ProgramContext)_localctx).u.stop):null));
			    
			}
			_ctx.stop = _input.LT(-1);
			setState(65);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ProgramContext(_parentctx, _parentState);
					_localctx.p = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_program);
					setState(59);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(60);
					((ProgramContext)_localctx).u = unit();

					                  writeIntoparserLogFile("Line " + std::to_string((((ProgramContext)_localctx).u!=null?(((ProgramContext)_localctx).u.start):null)->getLine()) + ": program : program unit");
					                  writeIntoparserLogFile((((ProgramContext)_localctx).p!=null?_input.getText(((ProgramContext)_localctx).p.start,((ProgramContext)_localctx).p.stop):null) + "\n" + (((ProgramContext)_localctx).u!=null?_input.getText(((ProgramContext)_localctx).u.start,((ProgramContext)_localctx).u.stop):null));
					              
					}
					} 
				}
				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UnitContext extends ParserRuleContext {
		public Var_declarationContext v;
		public Func_declarationContext fd;
		public Func_definitionContext fdef;
		public Var_declarationContext var_declaration() {
			return getRuleContext(Var_declarationContext.class,0);
		}
		public Func_declarationContext func_declaration() {
			return getRuleContext(Func_declarationContext.class,0);
		}
		public Func_definitionContext func_definition() {
			return getRuleContext(Func_definitionContext.class,0);
		}
		public UnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unit; }
	}

	public final UnitContext unit() throws RecognitionException {
		UnitContext _localctx = new UnitContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_unit);
		try {
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				((UnitContext)_localctx).v = var_declaration();

				        writeIntoparserLogFile("Line " + std::to_string((((UnitContext)_localctx).v!=null?(((UnitContext)_localctx).v.start):null)->getLine()) + ": unit : var_declaration");
				        writeIntoparserLogFile((((UnitContext)_localctx).v!=null?_input.getText(((UnitContext)_localctx).v.start,((UnitContext)_localctx).v.stop):null));
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				((UnitContext)_localctx).fd = func_declaration();

				        writeIntoparserLogFile("Line " + std::to_string((((UnitContext)_localctx).fd!=null?(((UnitContext)_localctx).fd.start):null)->getLine()) + ": unit : func_declaration");
				        writeIntoparserLogFile((((UnitContext)_localctx).fd!=null?_input.getText(((UnitContext)_localctx).fd.start,((UnitContext)_localctx).fd.stop):null));
				     
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				((UnitContext)_localctx).fdef = func_definition();

				        writeIntoparserLogFile("Line " + std::to_string((((UnitContext)_localctx).fdef!=null?(((UnitContext)_localctx).fdef.start):null)->getLine()) + ": unit : func_definition");
				        writeIntoparserLogFile((((UnitContext)_localctx).fdef!=null?_input.getText(((UnitContext)_localctx).fdef.start,((UnitContext)_localctx).fdef.stop):null));
				     
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

	@SuppressWarnings("CheckReturnValue")
	public static class Func_declarationContext extends ParserRuleContext {
		public Type_specifierContext t;
		public Token id;
		public Token lp;
		public Parameter_listContext pl;
		public Token rp;
		public Token sm;
		public Parameter_list_errContext ple;
		public Id_errContext ide;
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public TerminalNode ID() { return getToken(C2105140Parser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(C2105140Parser.LPAREN, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(C2105140Parser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(C2105140Parser.SEMICOLON, 0); }
		public Parameter_list_errContext parameter_list_err() {
			return getRuleContext(Parameter_list_errContext.class,0);
		}
		public Id_errContext id_err() {
			return getRuleContext(Id_errContext.class,0);
		}
		public Func_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_declaration; }
	}

	public final Func_declarationContext func_declaration() throws RecognitionException {
		Func_declarationContext _localctx = new Func_declarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_func_declaration);
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				((Func_declarationContext)_localctx).t = type_specifier();
				setState(80);
				((Func_declarationContext)_localctx).id = match(ID);
				setState(81);
				((Func_declarationContext)_localctx).lp = match(LPAREN);
				setState(82);
				((Func_declarationContext)_localctx).pl = parameter_list(0);
				setState(83);
				((Func_declarationContext)_localctx).rp = match(RPAREN);
				setState(84);
				((Func_declarationContext)_localctx).sm = match(SEMICOLON);

				        writeIntoparserLogFile("Line " + std::to_string(((Func_declarationContext)_localctx).sm->getLine()) + ": func_declaration : type_specifier ID LPAREN parameter_list RPAREN SEMICOLON");
				        writeIntoparserLogFile(((Func_declarationContext)_localctx).t.text + " " + ((Func_declarationContext)_localctx).id->getText() + "(" + (((Func_declarationContext)_localctx).pl!=null?_input.getText(((Func_declarationContext)_localctx).pl.start,((Func_declarationContext)_localctx).pl.stop):null) + ");");
				        
				        // Insert function into symbol table
				        std::string funcType = ((Func_declarationContext)_localctx).t.text + "(" + (((Func_declarationContext)_localctx).pl!=null?_input.getText(((Func_declarationContext)_localctx).pl.start,((Func_declarationContext)_localctx).pl.stop):null) + ")";
				        symbolTable->insert(((Func_declarationContext)_localctx).id->getText(), funcType);
				        std::cout<<"insert hoise "<< std::endl;
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				((Func_declarationContext)_localctx).t = type_specifier();
				setState(88);
				((Func_declarationContext)_localctx).id = match(ID);
				setState(89);
				((Func_declarationContext)_localctx).lp = match(LPAREN);
				setState(90);
				((Func_declarationContext)_localctx).rp = match(RPAREN);
				setState(91);
				((Func_declarationContext)_localctx).sm = match(SEMICOLON);

				        writeIntoparserLogFile("Line " + std::to_string(((Func_declarationContext)_localctx).sm->getLine()) + ": func_declaration : type_specifier ID LPAREN RPAREN SEMICOLON");
				        writeIntoparserLogFile(((Func_declarationContext)_localctx).t.text + " " + ((Func_declarationContext)_localctx).id->getText() + "();");
				        
				        // Insert function into symbol table
				        std::string funcType = ((Func_declarationContext)_localctx).t.text + "()";
				        symbolTable->insert(((Func_declarationContext)_localctx).id->getText(), funcType);
				        std::cout<<"insert hoise "<< std::endl;
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				((Func_declarationContext)_localctx).t = type_specifier();
				setState(95);
				((Func_declarationContext)_localctx).id = match(ID);
				setState(96);
				((Func_declarationContext)_localctx).lp = match(LPAREN);
				setState(97);
				((Func_declarationContext)_localctx).ple = parameter_list_err();
				setState(98);
				((Func_declarationContext)_localctx).rp = match(RPAREN);
				setState(99);
				((Func_declarationContext)_localctx).sm = match(SEMICOLON);

				        writeIntoErrorFile(
				            std::string("Line# ") + std::to_string(((Func_declarationContext)_localctx).sm->getLine()) +
				            " with error name: " + ((Func_declarationContext)_localctx).ple.error_name +
				            " - Syntax error at parameter list of function declaration"
				        );
				        syntaxErrorCount++;
				    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				((Func_declarationContext)_localctx).t = type_specifier();
				setState(103);
				((Func_declarationContext)_localctx).ide = id_err();
				setState(104);
				((Func_declarationContext)_localctx).lp = match(LPAREN);
				setState(105);
				((Func_declarationContext)_localctx).pl = parameter_list(0);
				setState(106);
				((Func_declarationContext)_localctx).rp = match(RPAREN);
				setState(107);
				((Func_declarationContext)_localctx).sm = match(SEMICOLON);

				        writeIntoErrorFile(
				            std::string("Line# ") + std::to_string(((Func_declarationContext)_localctx).lp->getLine()) +
				            " with error name: " + ((Func_declarationContext)_localctx).ide.error_name +
				            " - Syntax error at function name in function declaration"
				        );
				        syntaxErrorCount++;
				    
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(110);
				((Func_declarationContext)_localctx).t = type_specifier();
				setState(111);
				((Func_declarationContext)_localctx).ide = id_err();
				setState(112);
				((Func_declarationContext)_localctx).lp = match(LPAREN);
				setState(113);
				((Func_declarationContext)_localctx).rp = match(RPAREN);
				setState(114);
				((Func_declarationContext)_localctx).sm = match(SEMICOLON);

				        writeIntoErrorFile(
				            std::string("Line# ") + std::to_string(((Func_declarationContext)_localctx).lp->getLine()) +
				            " with error name: " + ((Func_declarationContext)_localctx).ide.error_name +
				            " - Syntax error at function name in function declaration"
				        );
				        syntaxErrorCount++;
				    
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

	@SuppressWarnings("CheckReturnValue")
	public static class Parameter_list_errContext extends ParserRuleContext {
		public std::string error_name;
		public Parameter_list_errContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list_err; }
	}

	public final Parameter_list_errContext parameter_list_err() throws RecognitionException {
		Parameter_list_errContext _localctx = new Parameter_list_errContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameter_list_err);
		try {
			enterOuterAlt(_localctx, 1);
			{

			        ((Parameter_list_errContext)_localctx).error_name =  "Error in parameter list";
			    
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

	@SuppressWarnings("CheckReturnValue")
	public static class Id_errContext extends ParserRuleContext {
		public std::string error_name;
		public Id_errContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id_err; }
	}

	public final Id_errContext id_err() throws RecognitionException {
		Id_errContext _localctx = new Id_errContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_id_err);
		try {
			enterOuterAlt(_localctx, 1);
			{

			        ((Id_errContext)_localctx).error_name =  "Error in function identifier";
			    
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

	@SuppressWarnings("CheckReturnValue")
	public static class Func_definitionContext extends ParserRuleContext {
		public Type_specifierContext t;
		public Token id;
		public Token lp;
		public Parameter_listContext pl;
		public Token rp;
		public Compound_statementContext cs;
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public TerminalNode ID() { return getToken(C2105140Parser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(C2105140Parser.LPAREN, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(C2105140Parser.RPAREN, 0); }
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Func_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_definition; }
	}

	public final Func_definitionContext func_definition() throws RecognitionException {
		Func_definitionContext _localctx = new Func_definitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_func_definition);
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				((Func_definitionContext)_localctx).t = type_specifier();
				setState(124);
				((Func_definitionContext)_localctx).id = match(ID);
				setState(125);
				((Func_definitionContext)_localctx).lp = match(LPAREN);
				setState(126);
				((Func_definitionContext)_localctx).pl = parameter_list(0);
				setState(127);
				((Func_definitionContext)_localctx).rp = match(RPAREN);
				setState(128);
				((Func_definitionContext)_localctx).cs = compound_statement();

				        writeIntoparserLogFile("Line " + std::to_string(((Func_definitionContext)_localctx).id->getLine()) + ": func_definition : type_specifier ID LPAREN parameter_list RPAREN compound_statement");
				        writeIntoparserLogFile(((Func_definitionContext)_localctx).t.text + " " + ((Func_definitionContext)_localctx).id->getText() + "(" + (((Func_definitionContext)_localctx).pl!=null?_input.getText(((Func_definitionContext)_localctx).pl.start,((Func_definitionContext)_localctx).pl.stop):null) + ") " + (((Func_definitionContext)_localctx).cs!=null?_input.getText(((Func_definitionContext)_localctx).cs.start,((Func_definitionContext)_localctx).cs.stop):null));
				        
				        // Insert function into symbol table
				        std::string funcType = ((Func_definitionContext)_localctx).t.text + "(" + (((Func_definitionContext)_localctx).pl!=null?_input.getText(((Func_definitionContext)_localctx).pl.start,((Func_definitionContext)_localctx).pl.stop):null) + ")";
				        symbolTable->insert(((Func_definitionContext)_localctx).id->getText(), funcType);
				         std::cout<<"insert hoise "<< std::endl;
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				((Func_definitionContext)_localctx).t = type_specifier();
				setState(132);
				((Func_definitionContext)_localctx).id = match(ID);
				setState(133);
				((Func_definitionContext)_localctx).lp = match(LPAREN);
				setState(134);
				((Func_definitionContext)_localctx).rp = match(RPAREN);
				setState(135);
				((Func_definitionContext)_localctx).cs = compound_statement();

				        writeIntoparserLogFile("Line " + std::to_string(((Func_definitionContext)_localctx).id->getLine()) + ": func_definition : type_specifier ID LPAREN RPAREN compound_statement");
				        writeIntoparserLogFile(((Func_definitionContext)_localctx).t.text + " " + ((Func_definitionContext)_localctx).id->getText() + "() " + (((Func_definitionContext)_localctx).cs!=null?_input.getText(((Func_definitionContext)_localctx).cs.start,((Func_definitionContext)_localctx).cs.stop):null));
				        
				        // Insert function into symbol table
				        std::string funcType = ((Func_definitionContext)_localctx).t.text + "()";
				        symbolTable->insert(((Func_definitionContext)_localctx).id->getText(), funcType);
				         std::cout<<"insert hoise "<< std::endl;
				    
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

	@SuppressWarnings("CheckReturnValue")
	public static class Parameter_listContext extends ParserRuleContext {
		public Parameter_listContext pl;
		public Type_specifierContext ts;
		public Token id;
		public Token c;
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public TerminalNode ID() { return getToken(C2105140Parser.ID, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(C2105140Parser.COMMA, 0); }
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		return parameter_list(0);
	}

	private Parameter_listContext parameter_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, _parentState);
		Parameter_listContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_parameter_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(141);
				((Parameter_listContext)_localctx).ts = type_specifier();
				setState(142);
				((Parameter_listContext)_localctx).id = match(ID);

				        writeIntoparserLogFile("Line " + std::to_string(((Parameter_listContext)_localctx).id->getLine()) + ": parameter_list : type_specifier ID");
				        writeIntoparserLogFile(((Parameter_listContext)_localctx).ts.text + " " + ((Parameter_listContext)_localctx).id->getText());
				        
				        // Insert parameter into symbol table
				        symbolTable->insert(((Parameter_listContext)_localctx).id->getText(), ((Parameter_listContext)_localctx).ts.text);
				         std::cout<<"insert hoise "<< std::endl;
				    
				}
				break;
			case 2:
				{
				setState(145);
				((Parameter_listContext)_localctx).ts = type_specifier();

				        writeIntoparserLogFile("Line " + std::to_string((((Parameter_listContext)_localctx).ts!=null?(((Parameter_listContext)_localctx).ts.start):null)->getLine()) + ": parameter_list : type_specifier");
				        writeIntoparserLogFile(((Parameter_listContext)_localctx).ts.text);
				    
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(161);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new Parameter_listContext(_parentctx, _parentState);
						_localctx.pl = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_parameter_list);
						setState(150);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(151);
						((Parameter_listContext)_localctx).c = match(COMMA);
						setState(152);
						((Parameter_listContext)_localctx).ts = type_specifier();
						setState(153);
						((Parameter_listContext)_localctx).id = match(ID);

						                  writeIntoparserLogFile("Line " + std::to_string(((Parameter_listContext)_localctx).id->getLine()) + ": parameter_list : parameter_list COMMA type_specifier ID");
						                  writeIntoparserLogFile((((Parameter_listContext)_localctx).pl!=null?_input.getText(((Parameter_listContext)_localctx).pl.start,((Parameter_listContext)_localctx).pl.stop):null) + ", " + ((Parameter_listContext)_localctx).ts.text + " " + ((Parameter_listContext)_localctx).id->getText());
						                  
						                  // Insert parameter into symbol table
						                  symbolTable->insert(((Parameter_listContext)_localctx).id->getText(), ((Parameter_listContext)_localctx).ts.text);
						                   std::cout<<"insert hoise "<< std::endl;
						              
						}
						break;
					case 2:
						{
						_localctx = new Parameter_listContext(_parentctx, _parentState);
						_localctx.pl = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_parameter_list);
						setState(156);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(157);
						((Parameter_listContext)_localctx).c = match(COMMA);
						setState(158);
						((Parameter_listContext)_localctx).ts = type_specifier();

						                  writeIntoparserLogFile("Line " + std::to_string((((Parameter_listContext)_localctx).ts!=null?(((Parameter_listContext)_localctx).ts.start):null)->getLine()) + ": parameter_list : parameter_list COMMA type_specifier");
						                  writeIntoparserLogFile((((Parameter_listContext)_localctx).pl!=null?_input.getText(((Parameter_listContext)_localctx).pl.start,((Parameter_listContext)_localctx).pl.stop):null) + ", " + ((Parameter_listContext)_localctx).ts.text);
						              
						}
						break;
					}
					} 
				}
				setState(165);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Compound_statementContext extends ParserRuleContext {
		public Token lc;
		public StatementsContext st;
		public Token rc;
		public TerminalNode LCURL() { return getToken(C2105140Parser.LCURL, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(C2105140Parser.RCURL, 0); }
		public Compound_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_statement; }
	}

	public final Compound_statementContext compound_statement() throws RecognitionException {
		Compound_statementContext _localctx = new Compound_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_compound_statement);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				((Compound_statementContext)_localctx).lc = match(LCURL);

				        // Enter new scope
				        symbolTable->enterScope();
				    
				setState(168);
				((Compound_statementContext)_localctx).st = statements(0);
				setState(169);
				((Compound_statementContext)_localctx).rc = match(RCURL);

				        writeIntoparserLogFile("Line " + std::to_string(((Compound_statementContext)_localctx).rc->getLine()) + ": compound_statement : LCURL statements RCURL");
				        writeIntoparserLogFile("{\n" + (((Compound_statementContext)_localctx).st!=null?_input.getText(((Compound_statementContext)_localctx).st.start,((Compound_statementContext)_localctx).st.stop):null) + "\n}");
				        
				        // Exit scope
				        symbolTable->exitScope();
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				((Compound_statementContext)_localctx).lc = match(LCURL);

				        // Enter new scope
				        symbolTable->enterScope();
				    
				setState(174);
				((Compound_statementContext)_localctx).rc = match(RCURL);

				        writeIntoparserLogFile("Line " + std::to_string(((Compound_statementContext)_localctx).rc->getLine()) + ": compound_statement : LCURL RCURL");
				        writeIntoparserLogFile("{}");
				        
				        // Exit scope
				        symbolTable->exitScope();
				    
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

	@SuppressWarnings("CheckReturnValue")
	public static class Var_declarationContext extends ParserRuleContext {
		public Type_specifierContext t;
		public Declaration_listContext dl;
		public Token sm;
		public Declaration_list_errContext de;
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public Declaration_listContext declaration_list() {
			return getRuleContext(Declaration_listContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(C2105140Parser.SEMICOLON, 0); }
		public Declaration_list_errContext declaration_list_err() {
			return getRuleContext(Declaration_list_errContext.class,0);
		}
		public Var_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_declaration; }
	}

	public final Var_declarationContext var_declaration() throws RecognitionException {
		Var_declarationContext _localctx = new Var_declarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_var_declaration);
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				((Var_declarationContext)_localctx).t = type_specifier();
				setState(179);
				((Var_declarationContext)_localctx).dl = declaration_list(((Var_declarationContext)_localctx).t.text);
				setState(180);
				((Var_declarationContext)_localctx).sm = match(SEMICOLON);

				        writeIntoparserLogFile("Line " + std::to_string(((Var_declarationContext)_localctx).sm->getLine()) + ": var_declaration : type_specifier declaration_list SEMICOLON");
				        writeIntoparserLogFile(((Var_declarationContext)_localctx).t.text + " " + ((Var_declarationContext)_localctx).dl.text + ";");
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				((Var_declarationContext)_localctx).t = type_specifier();
				setState(184);
				((Var_declarationContext)_localctx).de = declaration_list_err();
				setState(185);
				((Var_declarationContext)_localctx).sm = match(SEMICOLON);

				        writeIntoErrorFile(
				            std::string("Line# ") + std::to_string(((Var_declarationContext)_localctx).sm->getLine()) +
				            " with error name: " + ((Var_declarationContext)_localctx).de.error_name +
				            " - Syntax error at declaration list of variable declaration"
				        );
				        syntaxErrorCount++;
				    
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

	@SuppressWarnings("CheckReturnValue")
	public static class Declaration_list_errContext extends ParserRuleContext {
		public std::string error_name;
		public Declaration_list_errContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_list_err; }
	}

	public final Declaration_list_errContext declaration_list_err() throws RecognitionException {
		Declaration_list_errContext _localctx = new Declaration_list_errContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaration_list_err);
		try {
			enterOuterAlt(_localctx, 1);
			{

			        ((Declaration_list_errContext)_localctx).error_name =  "Error in declaration list";
			    
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

	@SuppressWarnings("CheckReturnValue")
	public static class Type_specifierContext extends ParserRuleContext {
		public std::string text;
		public Token i;
		public Token f;
		public Token v;
		public TerminalNode INT() { return getToken(C2105140Parser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(C2105140Parser.FLOAT, 0); }
		public TerminalNode VOID() { return getToken(C2105140Parser.VOID, 0); }
		public Type_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_specifier; }
	}

	public final Type_specifierContext type_specifier() throws RecognitionException {
		Type_specifierContext _localctx = new Type_specifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type_specifier);
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				((Type_specifierContext)_localctx).i = match(INT);

				            writeIntoparserLogFile("Line " + std::to_string(((Type_specifierContext)_localctx).i->getLine()) + ": type_specifier : INT");
				            writeIntoparserLogFile(((Type_specifierContext)_localctx).i->getText());
				            ((Type_specifierContext)_localctx).text =  ((Type_specifierContext)_localctx).i->getText();
				        
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				((Type_specifierContext)_localctx).f = match(FLOAT);

				            writeIntoparserLogFile("Line " + std::to_string(((Type_specifierContext)_localctx).f->getLine()) + ": type_specifier : FLOAT");
				            writeIntoparserLogFile(((Type_specifierContext)_localctx).f->getText());
				            ((Type_specifierContext)_localctx).text =  ((Type_specifierContext)_localctx).f->getText();
				        
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				((Type_specifierContext)_localctx).v = match(VOID);

				            writeIntoparserLogFile("Line " + std::to_string(((Type_specifierContext)_localctx).v->getLine()) + ": type_specifier : VOID");
				            writeIntoparserLogFile(((Type_specifierContext)_localctx).v->getText());
				            ((Type_specifierContext)_localctx).text =  ((Type_specifierContext)_localctx).v->getText();
				        
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

	@SuppressWarnings("CheckReturnValue")
	public static class Declaration_listContext extends ParserRuleContext {
		public std::string varType;
		public std::string text;
		public Token id;
		public Token l;
		public Token ci;
		public Token r;
		public Token c;
		public Declaration_listContext dl;
		public TerminalNode ID() { return getToken(C2105140Parser.ID, 0); }
		public TerminalNode LTHIRD() { return getToken(C2105140Parser.LTHIRD, 0); }
		public TerminalNode CONST_INT() { return getToken(C2105140Parser.CONST_INT, 0); }
		public TerminalNode RTHIRD() { return getToken(C2105140Parser.RTHIRD, 0); }
		public TerminalNode COMMA() { return getToken(C2105140Parser.COMMA, 0); }
		public Declaration_listContext declaration_list() {
			return getRuleContext(Declaration_listContext.class,0);
		}
		public Declaration_listContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Declaration_listContext(ParserRuleContext parent, int invokingState, std::string varType) {
			super(parent, invokingState);
			this.varType = varType;
		}
		@Override public int getRuleIndex() { return RULE_declaration_list; }
	}

	public final Declaration_listContext declaration_list(std::string varType) throws RecognitionException {
		Declaration_listContext _localctx = new Declaration_listContext(_ctx, getState(), varType);
		enterRule(_localctx, 24, RULE_declaration_list);
		try {
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				((Declaration_listContext)_localctx).id = match(ID);

				        writeIntoparserLogFile("Line " + std::to_string(((Declaration_listContext)_localctx).id->getLine()) + ": declaration_list : ID");
				        writeIntoparserLogFile(((Declaration_listContext)_localctx).id->getText());
				        symbolTable->insert(((Declaration_listContext)_localctx).id->getText(), varType);
				         std::cout<<"insert hoise "<< std::endl;
				        ((Declaration_listContext)_localctx).text =  ((Declaration_listContext)_localctx).id->getText();
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				((Declaration_listContext)_localctx).id = match(ID);
				setState(203);
				((Declaration_listContext)_localctx).l = match(LTHIRD);
				setState(204);
				((Declaration_listContext)_localctx).ci = match(CONST_INT);
				setState(205);
				((Declaration_listContext)_localctx).r = match(RTHIRD);

				        writeIntoparserLogFile("Line " + std::to_string(((Declaration_listContext)_localctx).id->getLine()) + ": declaration_list : ID LTHIRD CONST_INT RTHIRD");
				        writeIntoparserLogFile(((Declaration_listContext)_localctx).id->getText() + "[" + ((Declaration_listContext)_localctx).ci->getText() + "]");
				        std::string arrayType = varType + "[" + ((Declaration_listContext)_localctx).ci->getText() + "]";
				        symbolTable->insert(((Declaration_listContext)_localctx).id->getText(), arrayType);
				         std::cout<<"insert hoise "<< std::endl;
				        ((Declaration_listContext)_localctx).text =  ((Declaration_listContext)_localctx).id->getText() + "[" + ((Declaration_listContext)_localctx).ci->getText() + "]";
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
				((Declaration_listContext)_localctx).id = match(ID);
				setState(208);
				((Declaration_listContext)_localctx).c = match(COMMA);
				setState(209);
				((Declaration_listContext)_localctx).dl = declaration_list(varType);

				        writeIntoparserLogFile("Line " + std::to_string(((Declaration_listContext)_localctx).id->getLine()) + ": declaration_list : ID COMMA declaration_list");
				        writeIntoparserLogFile(((Declaration_listContext)_localctx).id->getText() + ", " + ((Declaration_listContext)_localctx).dl.text);
				        symbolTable->insert(((Declaration_listContext)_localctx).id->getText(), varType);
				         std::cout<<"insert hoise "<< std::endl;
				        ((Declaration_listContext)_localctx).text =  ((Declaration_listContext)_localctx).id->getText() + ", " + ((Declaration_listContext)_localctx).dl.text;
				    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(212);
				((Declaration_listContext)_localctx).id = match(ID);
				setState(213);
				((Declaration_listContext)_localctx).l = match(LTHIRD);
				setState(214);
				((Declaration_listContext)_localctx).ci = match(CONST_INT);
				setState(215);
				((Declaration_listContext)_localctx).r = match(RTHIRD);
				setState(216);
				((Declaration_listContext)_localctx).c = match(COMMA);
				setState(217);
				((Declaration_listContext)_localctx).dl = declaration_list(varType);

				        writeIntoparserLogFile("Line " + std::to_string(((Declaration_listContext)_localctx).id->getLine()) + ": declaration_list : ID LTHIRD CONST_INT RTHIRD COMMA declaration_list");
				        writeIntoparserLogFile(((Declaration_listContext)_localctx).id->getText() + "[" + ((Declaration_listContext)_localctx).ci->getText() + "]" + ", " + ((Declaration_listContext)_localctx).dl.text);
				        std::string arrayType = varType + "[" + ((Declaration_listContext)_localctx).ci->getText() + "]";
				        symbolTable->insert(((Declaration_listContext)_localctx).id->getText(), arrayType);
				         std::cout<<"insert hoise "<< std::endl;
				        ((Declaration_listContext)_localctx).text =  ((Declaration_listContext)_localctx).id->getText() + "[" + ((Declaration_listContext)_localctx).ci->getText() + "]" + ", " + ((Declaration_listContext)_localctx).dl.text;
				    
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementsContext extends ParserRuleContext {
		public StatementsContext sts;
		public StatementContext st;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		return statements(0);
	}

	private StatementsContext statements(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementsContext _localctx = new StatementsContext(_ctx, _parentState);
		StatementsContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_statements, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(223);
			((StatementsContext)_localctx).st = statement();

			        writeIntoparserLogFile("Line " + std::to_string((((StatementsContext)_localctx).st!=null?(((StatementsContext)_localctx).st.start):null)->getLine()) + ": statements : statement");
			        writeIntoparserLogFile((((StatementsContext)_localctx).st!=null?_input.getText(((StatementsContext)_localctx).st.start,((StatementsContext)_localctx).st.stop):null));
			    
			}
			_ctx.stop = _input.LT(-1);
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatementsContext(_parentctx, _parentState);
					_localctx.sts = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_statements);
					setState(226);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(227);
					((StatementsContext)_localctx).st = statement();

					                  writeIntoparserLogFile("Line " + std::to_string((((StatementsContext)_localctx).st!=null?(((StatementsContext)_localctx).st.start):null)->getLine()) + ": statements : statements statement");
					                  writeIntoparserLogFile((((StatementsContext)_localctx).sts!=null?_input.getText(((StatementsContext)_localctx).sts.start,((StatementsContext)_localctx).sts.stop):null) + "\n" + (((StatementsContext)_localctx).st!=null?_input.getText(((StatementsContext)_localctx).st.start,((StatementsContext)_localctx).st.stop):null));
					             
					}
					} 
				}
				setState(234);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Var_declarationContext vd;
		public Expression_statementContext es;
		public Compound_statementContext cs;
		public Token f;
		public Token lp;
		public Expression_statementContext es1;
		public Expression_statementContext es2;
		public ExpressionContext ex;
		public Token rp;
		public StatementContext st;
		public Token i;
		public StatementContext st1;
		public Token e;
		public StatementContext st2;
		public Token w;
		public Token p;
		public Token id;
		public Token sm;
		public Token r;
		public Var_declarationContext var_declaration() {
			return getRuleContext(Var_declarationContext.class,0);
		}
		public List<Expression_statementContext> expression_statement() {
			return getRuleContexts(Expression_statementContext.class);
		}
		public Expression_statementContext expression_statement(int i) {
			return getRuleContext(Expression_statementContext.class,i);
		}
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public TerminalNode FOR() { return getToken(C2105140Parser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(C2105140Parser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(C2105140Parser.RPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode IF() { return getToken(C2105140Parser.IF, 0); }
		public TerminalNode ELSE() { return getToken(C2105140Parser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(C2105140Parser.WHILE, 0); }
		public TerminalNode PRINTLN() { return getToken(C2105140Parser.PRINTLN, 0); }
		public TerminalNode ID() { return getToken(C2105140Parser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(C2105140Parser.SEMICOLON, 0); }
		public TerminalNode RETURN() { return getToken(C2105140Parser.RETURN, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statement);
		try {
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				((StatementContext)_localctx).vd = var_declaration();

				        writeIntoparserLogFile("Line " + std::to_string((((StatementContext)_localctx).vd!=null?(((StatementContext)_localctx).vd.start):null)->getLine()) + ": statement : var_declaration");
				        writeIntoparserLogFile((((StatementContext)_localctx).vd!=null?_input.getText(((StatementContext)_localctx).vd.start,((StatementContext)_localctx).vd.stop):null));
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				((StatementContext)_localctx).es = expression_statement();

				        writeIntoparserLogFile("Line " + std::to_string((((StatementContext)_localctx).es!=null?(((StatementContext)_localctx).es.start):null)->getLine()) + ": statement : expression_statement");
				        writeIntoparserLogFile(((StatementContext)_localctx).es.text);
				      
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				((StatementContext)_localctx).cs = compound_statement();

				        writeIntoparserLogFile("Line " + std::to_string((((StatementContext)_localctx).cs!=null?(((StatementContext)_localctx).cs.start):null)->getLine()) + ": statement : compound_statement");
				        writeIntoparserLogFile((((StatementContext)_localctx).cs!=null?_input.getText(((StatementContext)_localctx).cs.start,((StatementContext)_localctx).cs.stop):null));
				      
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(244);
				((StatementContext)_localctx).f = match(FOR);
				setState(245);
				((StatementContext)_localctx).lp = match(LPAREN);
				setState(246);
				((StatementContext)_localctx).es1 = expression_statement();
				setState(247);
				((StatementContext)_localctx).es2 = expression_statement();
				setState(248);
				((StatementContext)_localctx).ex = expression();
				setState(249);
				((StatementContext)_localctx).rp = match(RPAREN);
				setState(250);
				((StatementContext)_localctx).st = statement();

				        writeIntoparserLogFile("Line " + std::to_string(((StatementContext)_localctx).f->getLine()) + ": statement : FOR LPAREN expression_statement expression_statement expression RPAREN statement");
				        writeIntoparserLogFile("for(" + ((StatementContext)_localctx).es1.text + " " + ((StatementContext)_localctx).es2.text + " " + (((StatementContext)_localctx).ex!=null?_input.getText(((StatementContext)_localctx).ex.start,((StatementContext)_localctx).ex.stop):null) + ") " + (((StatementContext)_localctx).st!=null?_input.getText(((StatementContext)_localctx).st.start,((StatementContext)_localctx).st.stop):null));
				      
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(253);
				((StatementContext)_localctx).i = match(IF);
				setState(254);
				((StatementContext)_localctx).lp = match(LPAREN);
				setState(255);
				((StatementContext)_localctx).ex = expression();
				setState(256);
				((StatementContext)_localctx).rp = match(RPAREN);
				setState(257);
				((StatementContext)_localctx).st = statement();

				        writeIntoparserLogFile("Line " + std::to_string(((StatementContext)_localctx).i->getLine()) + ": statement : IF LPAREN expression RPAREN statement");
				        writeIntoparserLogFile("if(" + (((StatementContext)_localctx).ex!=null?_input.getText(((StatementContext)_localctx).ex.start,((StatementContext)_localctx).ex.stop):null) + ") " + (((StatementContext)_localctx).st!=null?_input.getText(((StatementContext)_localctx).st.start,((StatementContext)_localctx).st.stop):null));
				      
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(260);
				((StatementContext)_localctx).i = match(IF);
				setState(261);
				((StatementContext)_localctx).lp = match(LPAREN);
				setState(262);
				((StatementContext)_localctx).ex = expression();
				setState(263);
				((StatementContext)_localctx).rp = match(RPAREN);
				setState(264);
				((StatementContext)_localctx).st1 = statement();
				setState(265);
				((StatementContext)_localctx).e = match(ELSE);
				setState(266);
				((StatementContext)_localctx).st2 = statement();

				        writeIntoparserLogFile("Line " + std::to_string(((StatementContext)_localctx).i->getLine()) + ": statement : IF LPAREN expression RPAREN statement ELSE statement");
				        writeIntoparserLogFile("if(" + (((StatementContext)_localctx).ex!=null?_input.getText(((StatementContext)_localctx).ex.start,((StatementContext)_localctx).ex.stop):null) + ") " + (((StatementContext)_localctx).st1!=null?_input.getText(((StatementContext)_localctx).st1.start,((StatementContext)_localctx).st1.stop):null) + " else " + (((StatementContext)_localctx).st2!=null?_input.getText(((StatementContext)_localctx).st2.start,((StatementContext)_localctx).st2.stop):null));
				      
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(269);
				((StatementContext)_localctx).w = match(WHILE);
				setState(270);
				((StatementContext)_localctx).lp = match(LPAREN);
				setState(271);
				((StatementContext)_localctx).ex = expression();
				setState(272);
				((StatementContext)_localctx).rp = match(RPAREN);
				setState(273);
				((StatementContext)_localctx).st = statement();

				        writeIntoparserLogFile("Line " + std::to_string(((StatementContext)_localctx).w->getLine()) + ": statement : WHILE LPAREN expression RPAREN statement");
				        writeIntoparserLogFile("while(" + (((StatementContext)_localctx).ex!=null?_input.getText(((StatementContext)_localctx).ex.start,((StatementContext)_localctx).ex.stop):null) + ") " + (((StatementContext)_localctx).st!=null?_input.getText(((StatementContext)_localctx).st.start,((StatementContext)_localctx).st.stop):null));
				      
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(276);
				((StatementContext)_localctx).p = match(PRINTLN);
				setState(277);
				((StatementContext)_localctx).lp = match(LPAREN);
				setState(278);
				((StatementContext)_localctx).id = match(ID);
				setState(279);
				((StatementContext)_localctx).rp = match(RPAREN);
				setState(280);
				((StatementContext)_localctx).sm = match(SEMICOLON);

				        writeIntoparserLogFile("Line " + std::to_string(((StatementContext)_localctx).p->getLine()) + ": statement : PRINTLN LPAREN ID RPAREN SEMICOLON");
				        writeIntoparserLogFile("println(" + ((StatementContext)_localctx).id->getText() + ");");
				        
				        // Check if variable exists in symbol table
				        SymbolInfo* symbol = symbolTable->lookup(((StatementContext)_localctx).id->getText());
				        if (symbol == nullptr) {
				            writeIntoErrorFile("Line# " + std::to_string(((StatementContext)_localctx).id->getLine()) + " - Undeclared variable '" + ((StatementContext)_localctx).id->getText() + "'");
				            syntaxErrorCount++;
				        }
				      
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(282);
				((StatementContext)_localctx).r = match(RETURN);
				setState(283);
				((StatementContext)_localctx).ex = expression();
				setState(284);
				((StatementContext)_localctx).sm = match(SEMICOLON);

				        writeIntoparserLogFile("Line " + std::to_string(((StatementContext)_localctx).r->getLine()) + ": statement : RETURN expression SEMICOLON");
				        writeIntoparserLogFile("return " + (((StatementContext)_localctx).ex!=null?_input.getText(((StatementContext)_localctx).ex.start,((StatementContext)_localctx).ex.stop):null) + ";");
				      
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expression_statementContext extends ParserRuleContext {
		public std::string text;
		public Token sm;
		public ExpressionContext ex;
		public TerminalNode SEMICOLON() { return getToken(C2105140Parser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_statement; }
	}

	public final Expression_statementContext expression_statement() throws RecognitionException {
		Expression_statementContext _localctx = new Expression_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expression_statement);
		try {
			setState(295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMICOLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				((Expression_statementContext)_localctx).sm = match(SEMICOLON);
				 
				        ((Expression_statementContext)_localctx).text =  ";";
				    
				}
				break;
			case LPAREN:
			case ADDOP:
			case NOT:
			case ID:
			case CONST_INT:
			case CONST_FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				((Expression_statementContext)_localctx).ex = expression();
				setState(292);
				((Expression_statementContext)_localctx).sm = match(SEMICOLON);
				 
				        ((Expression_statementContext)_localctx).text =  (((Expression_statementContext)_localctx).ex!=null?_input.getText(((Expression_statementContext)_localctx).ex.start,((Expression_statementContext)_localctx).ex.stop):null) + ";";
				    
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public Token id;
		public Token lt;
		public ExpressionContext ex;
		public Token rt;
		public TerminalNode ID() { return getToken(C2105140Parser.ID, 0); }
		public TerminalNode LTHIRD() { return getToken(C2105140Parser.LTHIRD, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RTHIRD() { return getToken(C2105140Parser.RTHIRD, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variable);
		try {
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				((VariableContext)_localctx).id = match(ID);

				        writeIntoparserLogFile("Line " + std::to_string(((VariableContext)_localctx).id->getLine()) + ": variable : ID");
				        writeIntoparserLogFile(((VariableContext)_localctx).id->getText());
				        
				        // Check if variable exists in symbol table
				        SymbolInfo* symbol = symbolTable->lookup(((VariableContext)_localctx).id->getText());
				        if (symbol == nullptr) {
				            writeIntoErrorFile("Line# " + std::to_string(((VariableContext)_localctx).id->getLine()) + " - Undeclared variable '" + ((VariableContext)_localctx).id->getText() + "'");
				            syntaxErrorCount++;
				        }
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				((VariableContext)_localctx).id = match(ID);
				setState(300);
				((VariableContext)_localctx).lt = match(LTHIRD);
				setState(301);
				((VariableContext)_localctx).ex = expression();
				setState(302);
				((VariableContext)_localctx).rt = match(RTHIRD);

				        writeIntoparserLogFile("Line " + std::to_string(((VariableContext)_localctx).id->getLine()) + ": variable : ID LTHIRD expression RTHIRD");
				        writeIntoparserLogFile(((VariableContext)_localctx).id->getText() + "[" + (((VariableContext)_localctx).ex!=null?_input.getText(((VariableContext)_localctx).ex.start,((VariableContext)_localctx).ex.stop):null) + "]");
				        
				        // Check if array variable exists in symbol table
				        SymbolInfo* symbol = symbolTable->lookup(((VariableContext)_localctx).id->getText());
				        if (symbol == nullptr) {
				            writeIntoErrorFile("Line# " + std::to_string(((VariableContext)_localctx).id->getLine()) + " - Undeclared variable '" + ((VariableContext)_localctx).id->getText() + "'");
				            syntaxErrorCount++;
				        }
				     
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Logic_expressionContext le;
		public VariableContext v;
		public Token ao;
		public Logic_expressionContext logic_expression() {
			return getRuleContext(Logic_expressionContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGNOP() { return getToken(C2105140Parser.ASSIGNOP, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expression);
		try {
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				((ExpressionContext)_localctx).le = logic_expression();

				        writeIntoparserLogFile("Line " + std::to_string((((ExpressionContext)_localctx).le!=null?(((ExpressionContext)_localctx).le.start):null)->getLine()) + ": expression : logic_expression");
				        writeIntoparserLogFile((((ExpressionContext)_localctx).le!=null?_input.getText(((ExpressionContext)_localctx).le.start,((ExpressionContext)_localctx).le.stop):null));
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				((ExpressionContext)_localctx).v = variable();
				setState(311);
				((ExpressionContext)_localctx).ao = match(ASSIGNOP);
				setState(312);
				((ExpressionContext)_localctx).le = logic_expression();

				        writeIntoparserLogFile("Line " + std::to_string((((ExpressionContext)_localctx).v!=null?(((ExpressionContext)_localctx).v.start):null)->getLine()) + ": expression : variable ASSIGNOP logic_expression");
				        writeIntoparserLogFile((((ExpressionContext)_localctx).v!=null?_input.getText(((ExpressionContext)_localctx).v.start,((ExpressionContext)_localctx).v.stop):null) + " " + ((ExpressionContext)_localctx).ao->getText() + " " + (((ExpressionContext)_localctx).le!=null?_input.getText(((ExpressionContext)_localctx).le.start,((ExpressionContext)_localctx).le.stop):null));
				       
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

	@SuppressWarnings("CheckReturnValue")
	public static class Logic_expressionContext extends ParserRuleContext {
		public Rel_expressionContext re;
		public Rel_expressionContext re1;
		public Token lo;
		public Rel_expressionContext re2;
		public List<Rel_expressionContext> rel_expression() {
			return getRuleContexts(Rel_expressionContext.class);
		}
		public Rel_expressionContext rel_expression(int i) {
			return getRuleContext(Rel_expressionContext.class,i);
		}
		public TerminalNode LOGICOP() { return getToken(C2105140Parser.LOGICOP, 0); }
		public Logic_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_expression; }
	}

	public final Logic_expressionContext logic_expression() throws RecognitionException {
		Logic_expressionContext _localctx = new Logic_expressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_logic_expression);
		try {
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				((Logic_expressionContext)_localctx).re = rel_expression();

				        writeIntoparserLogFile("Line " + std::to_string((((Logic_expressionContext)_localctx).re!=null?(((Logic_expressionContext)_localctx).re.start):null)->getLine()) + ": logic_expression : rel_expression");
				        writeIntoparserLogFile((((Logic_expressionContext)_localctx).re!=null?_input.getText(((Logic_expressionContext)_localctx).re.start,((Logic_expressionContext)_localctx).re.stop):null));
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				((Logic_expressionContext)_localctx).re1 = rel_expression();
				setState(321);
				((Logic_expressionContext)_localctx).lo = match(LOGICOP);
				setState(322);
				((Logic_expressionContext)_localctx).re2 = rel_expression();

				        writeIntoparserLogFile("Line " + std::to_string((((Logic_expressionContext)_localctx).re1!=null?(((Logic_expressionContext)_localctx).re1.start):null)->getLine()) + ": logic_expression : rel_expression LOGICOP rel_expression");
				        writeIntoparserLogFile((((Logic_expressionContext)_localctx).re1!=null?_input.getText(((Logic_expressionContext)_localctx).re1.start,((Logic_expressionContext)_localctx).re1.stop):null) + " " + ((Logic_expressionContext)_localctx).lo->getText() + " " + (((Logic_expressionContext)_localctx).re2!=null?_input.getText(((Logic_expressionContext)_localctx).re2.start,((Logic_expressionContext)_localctx).re2.stop):null));
				         
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

	@SuppressWarnings("CheckReturnValue")
	public static class Rel_expressionContext extends ParserRuleContext {
		public Simple_expressionContext se;
		public Simple_expressionContext se1;
		public Token ro;
		public Simple_expressionContext se2;
		public List<Simple_expressionContext> simple_expression() {
			return getRuleContexts(Simple_expressionContext.class);
		}
		public Simple_expressionContext simple_expression(int i) {
			return getRuleContext(Simple_expressionContext.class,i);
		}
		public TerminalNode RELOP() { return getToken(C2105140Parser.RELOP, 0); }
		public Rel_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_expression; }
	}

	public final Rel_expressionContext rel_expression() throws RecognitionException {
		Rel_expressionContext _localctx = new Rel_expressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_rel_expression);
		try {
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				((Rel_expressionContext)_localctx).se = simple_expression(0);

				        writeIntoparserLogFile("Line " + std::to_string((((Rel_expressionContext)_localctx).se!=null?(((Rel_expressionContext)_localctx).se.start):null)->getLine()) + ": rel_expression : simple_expression");
				        writeIntoparserLogFile((((Rel_expressionContext)_localctx).se!=null?_input.getText(((Rel_expressionContext)_localctx).se.start,((Rel_expressionContext)_localctx).se.stop):null));
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				((Rel_expressionContext)_localctx).se1 = simple_expression(0);
				setState(331);
				((Rel_expressionContext)_localctx).ro = match(RELOP);
				setState(332);
				((Rel_expressionContext)_localctx).se2 = simple_expression(0);

				        writeIntoparserLogFile("Line " + std::to_string((((Rel_expressionContext)_localctx).se1!=null?(((Rel_expressionContext)_localctx).se1.start):null)->getLine()) + ": rel_expression : simple_expression RELOP simple_expression");
				        writeIntoparserLogFile((((Rel_expressionContext)_localctx).se1!=null?_input.getText(((Rel_expressionContext)_localctx).se1.start,((Rel_expressionContext)_localctx).se1.stop):null) + " " + ((Rel_expressionContext)_localctx).ro->getText() + " " + (((Rel_expressionContext)_localctx).se2!=null?_input.getText(((Rel_expressionContext)_localctx).se2.start,((Rel_expressionContext)_localctx).se2.stop):null));
				        
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

	@SuppressWarnings("CheckReturnValue")
	public static class Simple_expressionContext extends ParserRuleContext {
		public Simple_expressionContext se;
		public TermContext t;
		public Token ao;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Simple_expressionContext simple_expression() {
			return getRuleContext(Simple_expressionContext.class,0);
		}
		public TerminalNode ADDOP() { return getToken(C2105140Parser.ADDOP, 0); }
		public Simple_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expression; }
	}

	public final Simple_expressionContext simple_expression() throws RecognitionException {
		return simple_expression(0);
	}

	private Simple_expressionContext simple_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Simple_expressionContext _localctx = new Simple_expressionContext(_ctx, _parentState);
		Simple_expressionContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_simple_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(338);
			((Simple_expressionContext)_localctx).t = term(0);

			        writeIntoparserLogFile("Line " + std::to_string((((Simple_expressionContext)_localctx).t!=null?(((Simple_expressionContext)_localctx).t.start):null)->getLine()) + ": simple_expression : term");
			        writeIntoparserLogFile((((Simple_expressionContext)_localctx).t!=null?_input.getText(((Simple_expressionContext)_localctx).t.start,((Simple_expressionContext)_localctx).t.stop):null));
			    
			}
			_ctx.stop = _input.LT(-1);
			setState(348);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Simple_expressionContext(_parentctx, _parentState);
					_localctx.se = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_simple_expression);
					setState(341);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(342);
					((Simple_expressionContext)_localctx).ao = match(ADDOP);
					setState(343);
					((Simple_expressionContext)_localctx).t = term(0);

					                  writeIntoparserLogFile("Line " + std::to_string((((Simple_expressionContext)_localctx).se!=null?(((Simple_expressionContext)_localctx).se.start):null)->getLine()) + ": simple_expression : simple_expression ADDOP term");
					                  writeIntoparserLogFile((((Simple_expressionContext)_localctx).se!=null?_input.getText(((Simple_expressionContext)_localctx).se.start,((Simple_expressionContext)_localctx).se.stop):null) + " " + ((Simple_expressionContext)_localctx).ao->getText() + " " + (((Simple_expressionContext)_localctx).t!=null?_input.getText(((Simple_expressionContext)_localctx).t.start,((Simple_expressionContext)_localctx).t.stop):null));
					                    
					}
					} 
				}
				setState(350);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public TermContext t;
		public Unary_expressionContext ue;
		public Token mo;
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode MULOP() { return getToken(C2105140Parser.MULOP, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(352);
			((TermContext)_localctx).ue = unary_expression();

			        writeIntoparserLogFile("Line " + std::to_string((((TermContext)_localctx).ue!=null?(((TermContext)_localctx).ue.start):null)->getLine()) + ": term : unary_expression");
			        writeIntoparserLogFile((((TermContext)_localctx).ue!=null?_input.getText(((TermContext)_localctx).ue.start,((TermContext)_localctx).ue.stop):null));
			    
			}
			_ctx.stop = _input.LT(-1);
			setState(362);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TermContext(_parentctx, _parentState);
					_localctx.t = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(355);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(356);
					((TermContext)_localctx).mo = match(MULOP);
					setState(357);
					((TermContext)_localctx).ue = unary_expression();

					                  writeIntoparserLogFile("Line " + std::to_string((((TermContext)_localctx).t!=null?(((TermContext)_localctx).t.start):null)->getLine()) + ": term : term MULOP unary_expression");
					                  writeIntoparserLogFile((((TermContext)_localctx).t!=null?_input.getText(((TermContext)_localctx).t.start,((TermContext)_localctx).t.stop):null) + " " + ((TermContext)_localctx).mo->getText() + " " + (((TermContext)_localctx).ue!=null?_input.getText(((TermContext)_localctx).ue.start,((TermContext)_localctx).ue.stop):null));
					               
					}
					} 
				}
				setState(364);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Unary_expressionContext extends ParserRuleContext {
		public Token ao;
		public Unary_expressionContext ue;
		public Token n;
		public FactorContext f;
		public TerminalNode ADDOP() { return getToken(C2105140Parser.ADDOP, 0); }
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(C2105140Parser.NOT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_unary_expression);
		try {
			setState(376);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADDOP:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				((Unary_expressionContext)_localctx).ao = match(ADDOP);
				setState(366);
				((Unary_expressionContext)_localctx).ue = unary_expression();

				        writeIntoparserLogFile("Line " + std::to_string(((Unary_expressionContext)_localctx).ao->getLine()) + ": unary_expression : ADDOP unary_expression");
				        writeIntoparserLogFile(((Unary_expressionContext)_localctx).ao->getText() + (((Unary_expressionContext)_localctx).ue!=null?_input.getText(((Unary_expressionContext)_localctx).ue.start,((Unary_expressionContext)_localctx).ue.stop):null));
				    
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(369);
				((Unary_expressionContext)_localctx).n = match(NOT);
				setState(370);
				((Unary_expressionContext)_localctx).ue = unary_expression();

				        writeIntoparserLogFile("Line " + std::to_string(((Unary_expressionContext)_localctx).n->getLine()) + ": unary_expression : NOT unary_expression");
				        writeIntoparserLogFile(((Unary_expressionContext)_localctx).n->getText() + (((Unary_expressionContext)_localctx).ue!=null?_input.getText(((Unary_expressionContext)_localctx).ue.start,((Unary_expressionContext)_localctx).ue.stop):null));
				         
				}
				break;
			case LPAREN:
			case ID:
			case CONST_INT:
			case CONST_FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(373);
				((Unary_expressionContext)_localctx).f = factor();

				        writeIntoparserLogFile("Line " + std::to_string((((Unary_expressionContext)_localctx).f!=null?(((Unary_expressionContext)_localctx).f.start):null)->getLine()) + ": unary_expression : factor");
				        writeIntoparserLogFile((((Unary_expressionContext)_localctx).f!=null?_input.getText(((Unary_expressionContext)_localctx).f.start,((Unary_expressionContext)_localctx).f.stop):null));
				         
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

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public VariableContext v;
		public Token id;
		public Token lp;
		public Argument_listContext al;
		public Token rp;
		public ExpressionContext ex;
		public Token ci;
		public Token cf;
		public Token io;
		public Token do_;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ID() { return getToken(C2105140Parser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(C2105140Parser.LPAREN, 0); }
		public Argument_listContext argument_list() {
			return getRuleContext(Argument_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(C2105140Parser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CONST_INT() { return getToken(C2105140Parser.CONST_INT, 0); }
		public TerminalNode CONST_FLOAT() { return getToken(C2105140Parser.CONST_FLOAT, 0); }
		public TerminalNode INCOP() { return getToken(C2105140Parser.INCOP, 0); }
		public TerminalNode DECOP() { return getToken(C2105140Parser.DECOP, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_factor);
		try {
			setState(404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				((FactorContext)_localctx).v = variable();

				        writeIntoparserLogFile("Line " + std::to_string((((FactorContext)_localctx).v!=null?(((FactorContext)_localctx).v.start):null)->getLine()) + ": factor : variable");
				        writeIntoparserLogFile((((FactorContext)_localctx).v!=null?_input.getText(((FactorContext)_localctx).v.start,((FactorContext)_localctx).v.stop):null));
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(381);
				((FactorContext)_localctx).id = match(ID);
				setState(382);
				((FactorContext)_localctx).lp = match(LPAREN);
				setState(383);
				((FactorContext)_localctx).al = argument_list();
				setState(384);
				((FactorContext)_localctx).rp = match(RPAREN);

				        writeIntoparserLogFile("Line " + std::to_string(((FactorContext)_localctx).id->getLine()) + ": factor : ID LPAREN argument_list RPAREN");
				        writeIntoparserLogFile(((FactorContext)_localctx).id->getText() + "(" + ((FactorContext)_localctx).al.text + ")");
				        
				        // Check if function exists in symbol table
				        SymbolInfo* symbol = symbolTable->lookup(((FactorContext)_localctx).id->getText());
				        if (symbol == nullptr) {
				            writeIntoErrorFile("Line# " + std::to_string(((FactorContext)_localctx).id->getLine()) + " - Undeclared function '" + ((FactorContext)_localctx).id->getText() + "'");
				            syntaxErrorCount++;
				        }
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(387);
				((FactorContext)_localctx).lp = match(LPAREN);
				setState(388);
				((FactorContext)_localctx).ex = expression();
				setState(389);
				((FactorContext)_localctx).rp = match(RPAREN);

				        writeIntoparserLogFile("Line " + std::to_string(((FactorContext)_localctx).lp->getLine()) + ": factor : LPAREN expression RPAREN");
				        writeIntoparserLogFile("(" + (((FactorContext)_localctx).ex!=null?_input.getText(((FactorContext)_localctx).ex.start,((FactorContext)_localctx).ex.stop):null) + ")");
				    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(392);
				((FactorContext)_localctx).ci = match(CONST_INT);

				        writeIntoparserLogFile("Line " + std::to_string(((FactorContext)_localctx).ci->getLine()) + ": factor : CONST_INT");
				        writeIntoparserLogFile(((FactorContext)_localctx).ci->getText());
				    
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(394);
				((FactorContext)_localctx).cf = match(CONST_FLOAT);

				        writeIntoparserLogFile("Line " + std::to_string(((FactorContext)_localctx).cf->getLine()) + ": factor : CONST_FLOAT");
				        writeIntoparserLogFile(((FactorContext)_localctx).cf->getText());
				    
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(396);
				((FactorContext)_localctx).v = variable();
				setState(397);
				((FactorContext)_localctx).io = match(INCOP);

				        writeIntoparserLogFile("Line " + std::to_string((((FactorContext)_localctx).v!=null?(((FactorContext)_localctx).v.start):null)->getLine()) + ": factor : variable INCOP");
				        writeIntoparserLogFile((((FactorContext)_localctx).v!=null?_input.getText(((FactorContext)_localctx).v.start,((FactorContext)_localctx).v.stop):null) + " " + ((FactorContext)_localctx).io->getText());
				    
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(400);
				((FactorContext)_localctx).v = variable();
				setState(401);
				((FactorContext)_localctx).do_ = match(DECOP);

				        writeIntoparserLogFile("Line " + std::to_string((((FactorContext)_localctx).v!=null?(((FactorContext)_localctx).v.start):null)->getLine()) + ": factor : variable DECOP");
				        writeIntoparserLogFile((((FactorContext)_localctx).v!=null?_input.getText(((FactorContext)_localctx).v.start,((FactorContext)_localctx).v.stop):null) + " " + ((FactorContext)_localctx).do_->getText());
				    
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

	@SuppressWarnings("CheckReturnValue")
	public static class Argument_listContext extends ParserRuleContext {
		public std::string text;
		public ArgumentsContext args;
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public Argument_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_list; }
	}

	public final Argument_listContext argument_list() throws RecognitionException {
		Argument_listContext _localctx = new Argument_listContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_argument_list);
		try {
			setState(410);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
			case ADDOP:
			case NOT:
			case ID:
			case CONST_INT:
			case CONST_FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				((Argument_listContext)_localctx).args = arguments(0);
				 ((Argument_listContext)_localctx).text =  ((Argument_listContext)_localctx).args.text; 
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
				 ((Argument_listContext)_localctx).text =  ""; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsContext extends ParserRuleContext {
		public std::string text;
		public ArgumentsContext args;
		public Logic_expressionContext le;
		public Token c;
		public Logic_expressionContext logic_expression() {
			return getRuleContext(Logic_expressionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(C2105140Parser.COMMA, 0); }
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		return arguments(0);
	}

	private ArgumentsContext arguments(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, _parentState);
		ArgumentsContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_arguments, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(413);
			((ArgumentsContext)_localctx).le = logic_expression();

			        ((ArgumentsContext)_localctx).text =  (((ArgumentsContext)_localctx).le!=null?_input.getText(((ArgumentsContext)_localctx).le.start,((ArgumentsContext)_localctx).le.stop):null);
			    
			}
			_ctx.stop = _input.LT(-1);
			setState(423);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgumentsContext(_parentctx, _parentState);
					_localctx.args = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_arguments);
					setState(416);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(417);
					((ArgumentsContext)_localctx).c = match(COMMA);
					setState(418);
					((ArgumentsContext)_localctx).le = logic_expression();

					                  ((ArgumentsContext)_localctx).text =  ((ArgumentsContext)_localctx).args.text + ", " + (((ArgumentsContext)_localctx).le!=null?_input.getText(((ArgumentsContext)_localctx).le.start,((ArgumentsContext)_localctx).le.stop):null);
					              
					}
					} 
				}
				setState(425);
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
		case 1:
			return program_sempred((ProgramContext)_localctx, predIndex);
		case 7:
			return parameter_list_sempred((Parameter_listContext)_localctx, predIndex);
		case 13:
			return statements_sempred((StatementsContext)_localctx, predIndex);
		case 20:
			return simple_expression_sempred((Simple_expressionContext)_localctx, predIndex);
		case 21:
			return term_sempred((TermContext)_localctx, predIndex);
		case 25:
			return arguments_sempred((ArgumentsContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean program_sempred(ProgramContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean parameter_list_sempred(Parameter_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean statements_sempred(StatementsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean simple_expression_sempred(Simple_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean arguments_sempred(ArgumentsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001!\u01ab\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001@\b\u0001\n\u0001\f\u0001C\t\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002N\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003v\b\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u008b\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u0095\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u00a2\b\u0007\n\u0007\f\u0007\u00a5"+
		"\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u00b1\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00bd\b\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u00c7\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00dd\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00e7\b\r\n"+
		"\r\f\r\u00ea\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u0120\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u0128\b\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u0132\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u013c\b\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u0146\b\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u0150\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u015b"+
		"\b\u0014\n\u0014\f\u0014\u015e\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0005\u0015\u0169\b\u0015\n\u0015\f\u0015\u016c\t\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0179\b\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u0195\b\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u019b\b\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0005\u0019\u01a6\b\u0019\n\u0019\f\u0019\u01a9\t\u0019\u0001\u0019"+
		"\u0000\u0006\u0002\u000e\u001a(*2\u001a\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02\u0000"+
		"\u0000\u01bc\u00004\u0001\u0000\u0000\u0000\u00027\u0001\u0000\u0000\u0000"+
		"\u0004M\u0001\u0000\u0000\u0000\u0006u\u0001\u0000\u0000\u0000\bw\u0001"+
		"\u0000\u0000\u0000\ny\u0001\u0000\u0000\u0000\f\u008a\u0001\u0000\u0000"+
		"\u0000\u000e\u0094\u0001\u0000\u0000\u0000\u0010\u00b0\u0001\u0000\u0000"+
		"\u0000\u0012\u00bc\u0001\u0000\u0000\u0000\u0014\u00be\u0001\u0000\u0000"+
		"\u0000\u0016\u00c6\u0001\u0000\u0000\u0000\u0018\u00dc\u0001\u0000\u0000"+
		"\u0000\u001a\u00de\u0001\u0000\u0000\u0000\u001c\u011f\u0001\u0000\u0000"+
		"\u0000\u001e\u0127\u0001\u0000\u0000\u0000 \u0131\u0001\u0000\u0000\u0000"+
		"\"\u013b\u0001\u0000\u0000\u0000$\u0145\u0001\u0000\u0000\u0000&\u014f"+
		"\u0001\u0000\u0000\u0000(\u0151\u0001\u0000\u0000\u0000*\u015f\u0001\u0000"+
		"\u0000\u0000,\u0178\u0001\u0000\u0000\u0000.\u0194\u0001\u0000\u0000\u0000"+
		"0\u019a\u0001\u0000\u0000\u00002\u019c\u0001\u0000\u0000\u000045\u0003"+
		"\u0002\u0001\u000056\u0006\u0000\uffff\uffff\u00006\u0001\u0001\u0000"+
		"\u0000\u000078\u0006\u0001\uffff\uffff\u000089\u0003\u0004\u0002\u0000"+
		"9:\u0006\u0001\uffff\uffff\u0000:A\u0001\u0000\u0000\u0000;<\n\u0002\u0000"+
		"\u0000<=\u0003\u0004\u0002\u0000=>\u0006\u0001\uffff\uffff\u0000>@\u0001"+
		"\u0000\u0000\u0000?;\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000"+
		"A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000B\u0003\u0001\u0000"+
		"\u0000\u0000CA\u0001\u0000\u0000\u0000DE\u0003\u0012\t\u0000EF\u0006\u0002"+
		"\uffff\uffff\u0000FN\u0001\u0000\u0000\u0000GH\u0003\u0006\u0003\u0000"+
		"HI\u0006\u0002\uffff\uffff\u0000IN\u0001\u0000\u0000\u0000JK\u0003\f\u0006"+
		"\u0000KL\u0006\u0002\uffff\uffff\u0000LN\u0001\u0000\u0000\u0000MD\u0001"+
		"\u0000\u0000\u0000MG\u0001\u0000\u0000\u0000MJ\u0001\u0000\u0000\u0000"+
		"N\u0005\u0001\u0000\u0000\u0000OP\u0003\u0016\u000b\u0000PQ\u0005\u001f"+
		"\u0000\u0000QR\u0005\u000e\u0000\u0000RS\u0003\u000e\u0007\u0000ST\u0005"+
		"\u000f\u0000\u0000TU\u0005\u0014\u0000\u0000UV\u0006\u0003\uffff\uffff"+
		"\u0000Vv\u0001\u0000\u0000\u0000WX\u0003\u0016\u000b\u0000XY\u0005\u001f"+
		"\u0000\u0000YZ\u0005\u000e\u0000\u0000Z[\u0005\u000f\u0000\u0000[\\\u0005"+
		"\u0014\u0000\u0000\\]\u0006\u0003\uffff\uffff\u0000]v\u0001\u0000\u0000"+
		"\u0000^_\u0003\u0016\u000b\u0000_`\u0005\u001f\u0000\u0000`a\u0005\u000e"+
		"\u0000\u0000ab\u0003\b\u0004\u0000bc\u0005\u000f\u0000\u0000cd\u0005\u0014"+
		"\u0000\u0000de\u0006\u0003\uffff\uffff\u0000ev\u0001\u0000\u0000\u0000"+
		"fg\u0003\u0016\u000b\u0000gh\u0003\n\u0005\u0000hi\u0005\u000e\u0000\u0000"+
		"ij\u0003\u000e\u0007\u0000jk\u0005\u000f\u0000\u0000kl\u0005\u0014\u0000"+
		"\u0000lm\u0006\u0003\uffff\uffff\u0000mv\u0001\u0000\u0000\u0000no\u0003"+
		"\u0016\u000b\u0000op\u0003\n\u0005\u0000pq\u0005\u000e\u0000\u0000qr\u0005"+
		"\u000f\u0000\u0000rs\u0005\u0014\u0000\u0000st\u0006\u0003\uffff\uffff"+
		"\u0000tv\u0001\u0000\u0000\u0000uO\u0001\u0000\u0000\u0000uW\u0001\u0000"+
		"\u0000\u0000u^\u0001\u0000\u0000\u0000uf\u0001\u0000\u0000\u0000un\u0001"+
		"\u0000\u0000\u0000v\u0007\u0001\u0000\u0000\u0000wx\u0006\u0004\uffff"+
		"\uffff\u0000x\t\u0001\u0000\u0000\u0000yz\u0006\u0005\uffff\uffff\u0000"+
		"z\u000b\u0001\u0000\u0000\u0000{|\u0003\u0016\u000b\u0000|}\u0005\u001f"+
		"\u0000\u0000}~\u0005\u000e\u0000\u0000~\u007f\u0003\u000e\u0007\u0000"+
		"\u007f\u0080\u0005\u000f\u0000\u0000\u0080\u0081\u0003\u0010\b\u0000\u0081"+
		"\u0082\u0006\u0006\uffff\uffff\u0000\u0082\u008b\u0001\u0000\u0000\u0000"+
		"\u0083\u0084\u0003\u0016\u000b\u0000\u0084\u0085\u0005\u001f\u0000\u0000"+
		"\u0085\u0086\u0005\u000e\u0000\u0000\u0086\u0087\u0005\u000f\u0000\u0000"+
		"\u0087\u0088\u0003\u0010\b\u0000\u0088\u0089\u0006\u0006\uffff\uffff\u0000"+
		"\u0089\u008b\u0001\u0000\u0000\u0000\u008a{\u0001\u0000\u0000\u0000\u008a"+
		"\u0083\u0001\u0000\u0000\u0000\u008b\r\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0006\u0007\uffff\uffff\u0000\u008d\u008e\u0003\u0016\u000b\u0000\u008e"+
		"\u008f\u0005\u001f\u0000\u0000\u008f\u0090\u0006\u0007\uffff\uffff\u0000"+
		"\u0090\u0095\u0001\u0000\u0000\u0000\u0091\u0092\u0003\u0016\u000b\u0000"+
		"\u0092\u0093\u0006\u0007\uffff\uffff\u0000\u0093\u0095\u0001\u0000\u0000"+
		"\u0000\u0094\u008c\u0001\u0000\u0000\u0000\u0094\u0091\u0001\u0000\u0000"+
		"\u0000\u0095\u00a3\u0001\u0000\u0000\u0000\u0096\u0097\n\u0004\u0000\u0000"+
		"\u0097\u0098\u0005\u0015\u0000\u0000\u0098\u0099\u0003\u0016\u000b\u0000"+
		"\u0099\u009a\u0005\u001f\u0000\u0000\u009a\u009b\u0006\u0007\uffff\uffff"+
		"\u0000\u009b\u00a2\u0001\u0000\u0000\u0000\u009c\u009d\n\u0003\u0000\u0000"+
		"\u009d\u009e\u0005\u0015\u0000\u0000\u009e\u009f\u0003\u0016\u000b\u0000"+
		"\u009f\u00a0\u0006\u0007\uffff\uffff\u0000\u00a0\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a1\u0096\u0001\u0000\u0000\u0000\u00a1\u009c\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u000f\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u0010\u0000"+
		"\u0000\u00a7\u00a8\u0006\b\uffff\uffff\u0000\u00a8\u00a9\u0003\u001a\r"+
		"\u0000\u00a9\u00aa\u0005\u0011\u0000\u0000\u00aa\u00ab\u0006\b\uffff\uffff"+
		"\u0000\u00ab\u00b1\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\u0010\u0000"+
		"\u0000\u00ad\u00ae\u0006\b\uffff\uffff\u0000\u00ae\u00af\u0005\u0011\u0000"+
		"\u0000\u00af\u00b1\u0006\b\uffff\uffff\u0000\u00b0\u00a6\u0001\u0000\u0000"+
		"\u0000\u00b0\u00ac\u0001\u0000\u0000\u0000\u00b1\u0011\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b3\u0003\u0016\u000b\u0000\u00b3\u00b4\u0003\u0018\f\u0000"+
		"\u00b4\u00b5\u0005\u0014\u0000\u0000\u00b5\u00b6\u0006\t\uffff\uffff\u0000"+
		"\u00b6\u00bd\u0001\u0000\u0000\u0000\u00b7\u00b8\u0003\u0016\u000b\u0000"+
		"\u00b8\u00b9\u0003\u0014\n\u0000\u00b9\u00ba\u0005\u0014\u0000\u0000\u00ba"+
		"\u00bb\u0006\t\uffff\uffff\u0000\u00bb\u00bd\u0001\u0000\u0000\u0000\u00bc"+
		"\u00b2\u0001\u0000\u0000\u0000\u00bc\u00b7\u0001\u0000\u0000\u0000\u00bd"+
		"\u0013\u0001\u0000\u0000\u0000\u00be\u00bf\u0006\n\uffff\uffff\u0000\u00bf"+
		"\u0015\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005\u000b\u0000\u0000\u00c1"+
		"\u00c7\u0006\u000b\uffff\uffff\u0000\u00c2\u00c3\u0005\f\u0000\u0000\u00c3"+
		"\u00c7\u0006\u000b\uffff\uffff\u0000\u00c4\u00c5\u0005\r\u0000\u0000\u00c5"+
		"\u00c7\u0006\u000b\uffff\uffff\u0000\u00c6\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c2\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000"+
		"\u00c7\u0017\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005\u001f\u0000\u0000"+
		"\u00c9\u00dd\u0006\f\uffff\uffff\u0000\u00ca\u00cb\u0005\u001f\u0000\u0000"+
		"\u00cb\u00cc\u0005\u0012\u0000\u0000\u00cc\u00cd\u0005 \u0000\u0000\u00cd"+
		"\u00ce\u0005\u0013\u0000\u0000\u00ce\u00dd\u0006\f\uffff\uffff\u0000\u00cf"+
		"\u00d0\u0005\u001f\u0000\u0000\u00d0\u00d1\u0005\u0015\u0000\u0000\u00d1"+
		"\u00d2\u0003\u0018\f\u0000\u00d2\u00d3\u0006\f\uffff\uffff\u0000\u00d3"+
		"\u00dd\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005\u001f\u0000\u0000\u00d5"+
		"\u00d6\u0005\u0012\u0000\u0000\u00d6\u00d7\u0005 \u0000\u0000\u00d7\u00d8"+
		"\u0005\u0013\u0000\u0000\u00d8\u00d9\u0005\u0015\u0000\u0000\u00d9\u00da"+
		"\u0003\u0018\f\u0000\u00da\u00db\u0006\f\uffff\uffff\u0000\u00db\u00dd"+
		"\u0001\u0000\u0000\u0000\u00dc\u00c8\u0001\u0000\u0000\u0000\u00dc\u00ca"+
		"\u0001\u0000\u0000\u0000\u00dc\u00cf\u0001\u0000\u0000\u0000\u00dc\u00d4"+
		"\u0001\u0000\u0000\u0000\u00dd\u0019\u0001\u0000\u0000\u0000\u00de\u00df"+
		"\u0006\r\uffff\uffff\u0000\u00df\u00e0\u0003\u001c\u000e\u0000\u00e0\u00e1"+
		"\u0006\r\uffff\uffff\u0000\u00e1\u00e8\u0001\u0000\u0000\u0000\u00e2\u00e3"+
		"\n\u0001\u0000\u0000\u00e3\u00e4\u0003\u001c\u000e\u0000\u00e4\u00e5\u0006"+
		"\r\uffff\uffff\u0000\u00e5\u00e7\u0001\u0000\u0000\u0000\u00e6\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e7\u00ea\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u001b\u0001"+
		"\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00eb\u00ec\u0003"+
		"\u0012\t\u0000\u00ec\u00ed\u0006\u000e\uffff\uffff\u0000\u00ed\u0120\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ef\u0003\u001e\u000f\u0000\u00ef\u00f0\u0006"+
		"\u000e\uffff\uffff\u0000\u00f0\u0120\u0001\u0000\u0000\u0000\u00f1\u00f2"+
		"\u0003\u0010\b\u0000\u00f2\u00f3\u0006\u000e\uffff\uffff\u0000\u00f3\u0120"+
		"\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005\u0007\u0000\u0000\u00f5\u00f6"+
		"\u0005\u000e\u0000\u0000\u00f6\u00f7\u0003\u001e\u000f\u0000\u00f7\u00f8"+
		"\u0003\u001e\u000f\u0000\u00f8\u00f9\u0003\"\u0011\u0000\u00f9\u00fa\u0005"+
		"\u000f\u0000\u0000\u00fa\u00fb\u0003\u001c\u000e\u0000\u00fb\u00fc\u0006"+
		"\u000e\uffff\uffff\u0000\u00fc\u0120\u0001\u0000\u0000\u0000\u00fd\u00fe"+
		"\u0005\u0005\u0000\u0000\u00fe\u00ff\u0005\u000e\u0000\u0000\u00ff\u0100"+
		"\u0003\"\u0011\u0000\u0100\u0101\u0005\u000f\u0000\u0000\u0101\u0102\u0003"+
		"\u001c\u000e\u0000\u0102\u0103\u0006\u000e\uffff\uffff\u0000\u0103\u0120"+
		"\u0001\u0000\u0000\u0000\u0104\u0105\u0005\u0005\u0000\u0000\u0105\u0106"+
		"\u0005\u000e\u0000\u0000\u0106\u0107\u0003\"\u0011\u0000\u0107\u0108\u0005"+
		"\u000f\u0000\u0000\u0108\u0109\u0003\u001c\u000e\u0000\u0109\u010a\u0005"+
		"\u0006\u0000\u0000\u010a\u010b\u0003\u001c\u000e\u0000\u010b\u010c\u0006"+
		"\u000e\uffff\uffff\u0000\u010c\u0120\u0001\u0000\u0000\u0000\u010d\u010e"+
		"\u0005\b\u0000\u0000\u010e\u010f\u0005\u000e\u0000\u0000\u010f\u0110\u0003"+
		"\"\u0011\u0000\u0110\u0111\u0005\u000f\u0000\u0000\u0111\u0112\u0003\u001c"+
		"\u000e\u0000\u0112\u0113\u0006\u000e\uffff\uffff\u0000\u0113\u0120\u0001"+
		"\u0000\u0000\u0000\u0114\u0115\u0005\t\u0000\u0000\u0115\u0116\u0005\u000e"+
		"\u0000\u0000\u0116\u0117\u0005\u001f\u0000\u0000\u0117\u0118\u0005\u000f"+
		"\u0000\u0000\u0118\u0119\u0005\u0014\u0000\u0000\u0119\u0120\u0006\u000e"+
		"\uffff\uffff\u0000\u011a\u011b\u0005\n\u0000\u0000\u011b\u011c\u0003\""+
		"\u0011\u0000\u011c\u011d\u0005\u0014\u0000\u0000\u011d\u011e\u0006\u000e"+
		"\uffff\uffff\u0000\u011e\u0120\u0001\u0000\u0000\u0000\u011f\u00eb\u0001"+
		"\u0000\u0000\u0000\u011f\u00ee\u0001\u0000\u0000\u0000\u011f\u00f1\u0001"+
		"\u0000\u0000\u0000\u011f\u00f4\u0001\u0000\u0000\u0000\u011f\u00fd\u0001"+
		"\u0000\u0000\u0000\u011f\u0104\u0001\u0000\u0000\u0000\u011f\u010d\u0001"+
		"\u0000\u0000\u0000\u011f\u0114\u0001\u0000\u0000\u0000\u011f\u011a\u0001"+
		"\u0000\u0000\u0000\u0120\u001d\u0001\u0000\u0000\u0000\u0121\u0122\u0005"+
		"\u0014\u0000\u0000\u0122\u0128\u0006\u000f\uffff\uffff\u0000\u0123\u0124"+
		"\u0003\"\u0011\u0000\u0124\u0125\u0005\u0014\u0000\u0000\u0125\u0126\u0006"+
		"\u000f\uffff\uffff\u0000\u0126\u0128\u0001\u0000\u0000\u0000\u0127\u0121"+
		"\u0001\u0000\u0000\u0000\u0127\u0123\u0001\u0000\u0000\u0000\u0128\u001f"+
		"\u0001\u0000\u0000\u0000\u0129\u012a\u0005\u001f\u0000\u0000\u012a\u0132"+
		"\u0006\u0010\uffff\uffff\u0000\u012b\u012c\u0005\u001f\u0000\u0000\u012c"+
		"\u012d\u0005\u0012\u0000\u0000\u012d\u012e\u0003\"\u0011\u0000\u012e\u012f"+
		"\u0005\u0013\u0000\u0000\u012f\u0130\u0006\u0010\uffff\uffff\u0000\u0130"+
		"\u0132\u0001\u0000\u0000\u0000\u0131\u0129\u0001\u0000\u0000\u0000\u0131"+
		"\u012b\u0001\u0000\u0000\u0000\u0132!\u0001\u0000\u0000\u0000\u0133\u0134"+
		"\u0003$\u0012\u0000\u0134\u0135\u0006\u0011\uffff\uffff\u0000\u0135\u013c"+
		"\u0001\u0000\u0000\u0000\u0136\u0137\u0003 \u0010\u0000\u0137\u0138\u0005"+
		"\u001e\u0000\u0000\u0138\u0139\u0003$\u0012\u0000\u0139\u013a\u0006\u0011"+
		"\uffff\uffff\u0000\u013a\u013c\u0001\u0000\u0000\u0000\u013b\u0133\u0001"+
		"\u0000\u0000\u0000\u013b\u0136\u0001\u0000\u0000\u0000\u013c#\u0001\u0000"+
		"\u0000\u0000\u013d\u013e\u0003&\u0013\u0000\u013e\u013f\u0006\u0012\uffff"+
		"\uffff\u0000\u013f\u0146\u0001\u0000\u0000\u0000\u0140\u0141\u0003&\u0013"+
		"\u0000\u0141\u0142\u0005\u001d\u0000\u0000\u0142\u0143\u0003&\u0013\u0000"+
		"\u0143\u0144\u0006\u0012\uffff\uffff\u0000\u0144\u0146\u0001\u0000\u0000"+
		"\u0000\u0145\u013d\u0001\u0000\u0000\u0000\u0145\u0140\u0001\u0000\u0000"+
		"\u0000\u0146%\u0001\u0000\u0000\u0000\u0147\u0148\u0003(\u0014\u0000\u0148"+
		"\u0149\u0006\u0013\uffff\uffff\u0000\u0149\u0150\u0001\u0000\u0000\u0000"+
		"\u014a\u014b\u0003(\u0014\u0000\u014b\u014c\u0005\u001c\u0000\u0000\u014c"+
		"\u014d\u0003(\u0014\u0000\u014d\u014e\u0006\u0013\uffff\uffff\u0000\u014e"+
		"\u0150\u0001\u0000\u0000\u0000\u014f\u0147\u0001\u0000\u0000\u0000\u014f"+
		"\u014a\u0001\u0000\u0000\u0000\u0150\'\u0001\u0000\u0000\u0000\u0151\u0152"+
		"\u0006\u0014\uffff\uffff\u0000\u0152\u0153\u0003*\u0015\u0000\u0153\u0154"+
		"\u0006\u0014\uffff\uffff\u0000\u0154\u015c\u0001\u0000\u0000\u0000\u0155"+
		"\u0156\n\u0001\u0000\u0000\u0156\u0157\u0005\u0016\u0000\u0000\u0157\u0158"+
		"\u0003*\u0015\u0000\u0158\u0159\u0006\u0014\uffff\uffff\u0000\u0159\u015b"+
		"\u0001\u0000\u0000\u0000\u015a\u0155\u0001\u0000\u0000\u0000\u015b\u015e"+
		"\u0001\u0000\u0000\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015c\u015d"+
		"\u0001\u0000\u0000\u0000\u015d)\u0001\u0000\u0000\u0000\u015e\u015c\u0001"+
		"\u0000\u0000\u0000\u015f\u0160\u0006\u0015\uffff\uffff\u0000\u0160\u0161"+
		"\u0003,\u0016\u0000\u0161\u0162\u0006\u0015\uffff\uffff\u0000\u0162\u016a"+
		"\u0001\u0000\u0000\u0000\u0163\u0164\n\u0001\u0000\u0000\u0164\u0165\u0005"+
		"\u0018\u0000\u0000\u0165\u0166\u0003,\u0016\u0000\u0166\u0167\u0006\u0015"+
		"\uffff\uffff\u0000\u0167\u0169\u0001\u0000\u0000\u0000\u0168\u0163\u0001"+
		"\u0000\u0000\u0000\u0169\u016c\u0001\u0000\u0000\u0000\u016a\u0168\u0001"+
		"\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b+\u0001\u0000"+
		"\u0000\u0000\u016c\u016a\u0001\u0000\u0000\u0000\u016d\u016e\u0005\u0016"+
		"\u0000\u0000\u016e\u016f\u0003,\u0016\u0000\u016f\u0170\u0006\u0016\uffff"+
		"\uffff\u0000\u0170\u0179\u0001\u0000\u0000\u0000\u0171\u0172\u0005\u001b"+
		"\u0000\u0000\u0172\u0173\u0003,\u0016\u0000\u0173\u0174\u0006\u0016\uffff"+
		"\uffff\u0000\u0174\u0179\u0001\u0000\u0000\u0000\u0175\u0176\u0003.\u0017"+
		"\u0000\u0176\u0177\u0006\u0016\uffff\uffff\u0000\u0177\u0179\u0001\u0000"+
		"\u0000\u0000\u0178\u016d\u0001\u0000\u0000\u0000\u0178\u0171\u0001\u0000"+
		"\u0000\u0000\u0178\u0175\u0001\u0000\u0000\u0000\u0179-\u0001\u0000\u0000"+
		"\u0000\u017a\u017b\u0003 \u0010\u0000\u017b\u017c\u0006\u0017\uffff\uffff"+
		"\u0000\u017c\u0195\u0001\u0000\u0000\u0000\u017d\u017e\u0005\u001f\u0000"+
		"\u0000\u017e\u017f\u0005\u000e\u0000\u0000\u017f\u0180\u00030\u0018\u0000"+
		"\u0180\u0181\u0005\u000f\u0000\u0000\u0181\u0182\u0006\u0017\uffff\uffff"+
		"\u0000\u0182\u0195\u0001\u0000\u0000\u0000\u0183\u0184\u0005\u000e\u0000"+
		"\u0000\u0184\u0185\u0003\"\u0011\u0000\u0185\u0186\u0005\u000f\u0000\u0000"+
		"\u0186\u0187\u0006\u0017\uffff\uffff\u0000\u0187\u0195\u0001\u0000\u0000"+
		"\u0000\u0188\u0189\u0005 \u0000\u0000\u0189\u0195\u0006\u0017\uffff\uffff"+
		"\u0000\u018a\u018b\u0005!\u0000\u0000\u018b\u0195\u0006\u0017\uffff\uffff"+
		"\u0000\u018c\u018d\u0003 \u0010\u0000\u018d\u018e\u0005\u0019\u0000\u0000"+
		"\u018e\u018f\u0006\u0017\uffff\uffff\u0000\u018f\u0195\u0001\u0000\u0000"+
		"\u0000\u0190\u0191\u0003 \u0010\u0000\u0191\u0192\u0005\u001a\u0000\u0000"+
		"\u0192\u0193\u0006\u0017\uffff\uffff\u0000\u0193\u0195\u0001\u0000\u0000"+
		"\u0000\u0194\u017a\u0001\u0000\u0000\u0000\u0194\u017d\u0001\u0000\u0000"+
		"\u0000\u0194\u0183\u0001\u0000\u0000\u0000\u0194\u0188\u0001\u0000\u0000"+
		"\u0000\u0194\u018a\u0001\u0000\u0000\u0000\u0194\u018c\u0001\u0000\u0000"+
		"\u0000\u0194\u0190\u0001\u0000\u0000\u0000\u0195/\u0001\u0000\u0000\u0000"+
		"\u0196\u0197\u00032\u0019\u0000\u0197\u0198\u0006\u0018\uffff\uffff\u0000"+
		"\u0198\u019b\u0001\u0000\u0000\u0000\u0199\u019b\u0006\u0018\uffff\uffff"+
		"\u0000\u019a\u0196\u0001\u0000\u0000\u0000\u019a\u0199\u0001\u0000\u0000"+
		"\u0000\u019b1\u0001\u0000\u0000\u0000\u019c\u019d\u0006\u0019\uffff\uffff"+
		"\u0000\u019d\u019e\u0003$\u0012\u0000\u019e\u019f\u0006\u0019\uffff\uffff"+
		"\u0000\u019f\u01a7\u0001\u0000\u0000\u0000\u01a0\u01a1\n\u0002\u0000\u0000"+
		"\u01a1\u01a2\u0005\u0015\u0000\u0000\u01a2\u01a3\u0003$\u0012\u0000\u01a3"+
		"\u01a4\u0006\u0019\uffff\uffff\u0000\u01a4\u01a6\u0001\u0000\u0000\u0000"+
		"\u01a5\u01a0\u0001\u0000\u0000\u0000\u01a6\u01a9\u0001\u0000\u0000\u0000"+
		"\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000"+
		"\u01a83\u0001\u0000\u0000\u0000\u01a9\u01a7\u0001\u0000\u0000\u0000\u0018"+
		"AMu\u008a\u0094\u00a1\u00a3\u00b0\u00bc\u00c6\u00dc\u00e8\u011f\u0127"+
		"\u0131\u013b\u0145\u014f\u015c\u016a\u0178\u0194\u019a\u01a7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}