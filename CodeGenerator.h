#ifndef CODEGENERATOR_H
#define CODEGENERATOR_H

#include <iostream>
#include <fstream>
#include <string>
#include <vector>
#include <map>
#include <stack>
#include <sstream>
#include "antlr4-runtime.h"
#include "CBaseListener.h"
#include "CParser.h"

using namespace std;
using namespace antlr4;

struct SymbolInfo {
    string type;
    int offset;
    int size;
    bool isArray;
    int arraySize;
    string scope;
    int lineNumber;
};

struct FunctionInfo {
    string returnType;
    vector<string> paramTypes;
    int stackSize;
};

class CodeGenerator : public CBaseListener {
private:
    ofstream codeFile;
    ofstream optimizedFile;
    vector<string> instructions;
    map<string, SymbolInfo> symbolTable;
    map<string, FunctionInfo> functionTable;
    stack<string> labelStack;
    stack<int> scopeStack;
    stack<string> operandStack;
    
    int labelCounter;
    int stackOffset;
    int currentScope;
    string currentFunction;
    int lineNumber;
    bool inExpression;
    
    // Helper methods
    string newLabel();
    void emit(const string& instruction);
    void emitComment(const string& comment);
    void emitWithLine(const string& instruction, int line);
    int getVariableOffset(const string& varName);
    bool isVariableInScope(const string& varName);
    string getCurrentScope();
    
    // Assembly generation helpers
    void generatePrologue();
    void generateEpilogue();
    void generateDataSection();
    void generatePrintlnProcedure();
    
    // Expression handling
    void pushOperand(const string& operand);
    string popOperand();
    void generateArithmetic(const string& op);
    void generateComparison(const string& op);
    void generateLogical(const string& op);
    
    // Optimization methods
    vector<string> performOptimizations(const vector<string>& code);
    vector<string> removeRedundantMov(const vector<string>& code);
    vector<string> removeRedundantPushPop(const vector<string>& code);
    vector<string> removeRedundantOperations(const vector<string>& code);
    vector<string> removeRedundantLabels(const vector<string>& code);
    
public:
    CodeGenerator();
    ~CodeGenerator();
    
    void writeToFiles();
    
    // Listener methods for new grammar
    void enterStart(CParser::StartContext *ctx) override;
    void exitStart(CParser::StartContext *ctx) override;
    
    void enterProgram(CParser::ProgramContext *ctx) override;
    void exitProgram(CParser::ProgramContext *ctx) override;
    
    void enterUnit(CParser::UnitContext *ctx) override;
    void exitUnit(CParser::UnitContext *ctx) override;
    
    void enterFunc_definition(CParser::Func_definitionContext *ctx) override;
    void exitFunc_definition(CParser::Func_definitionContext *ctx) override;
    
    void enterFunc_declaration(CParser::Func_declarationContext *ctx) override;
    void exitFunc_declaration(CParser::Func_declarationContext *ctx) override;
    
    void enterVar_declaration(CParser::Var_declarationContext *ctx) override;
    void exitVar_declaration(CParser::Var_declarationContext *ctx) override;
    
    void enterCompound_statement(CParser::Compound_statementContext *ctx) override;
    void exitCompound_statement(CParser::Compound_statementContext *ctx) override;
    
    void enterStatement(CParser::StatementContext *ctx) override;
    void exitStatement(CParser::StatementContext *ctx) override;
    
    void enterExpression(CParser::ExpressionContext *ctx) override;
    void exitExpression(CParser::ExpressionContext *ctx) override;
    
    void enterLogic_expression(CParser::Logic_expressionContext *ctx) override;
    void exitLogic_expression(CParser::Logic_expressionContext *ctx) override;
    
    void enterRel_expression(CParser::Rel_expressionContext *ctx) override;
    void exitRel_expression(CParser::Rel_expressionContext *ctx) override;
    
    void enterSimple_expression(CParser::Simple_expressionContext *ctx) override;
    void exitSimple_expression(CParser::Simple_expressionContext *ctx) override;
    
    void enterTerm(CParser::TermContext *ctx) override;
    void exitTerm(CParser::TermContext *ctx) override;
    
    void enterUnary_expression(CParser::Unary_expressionContext *ctx) override;
    void exitUnary_expression(CParser::Unary_expressionContext *ctx) override;
    
    void enterFactor(CParser::FactorContext *ctx) override;
    void exitFactor(CParser::FactorContext *ctx) override;
    
    void enterVariable(CParser::VariableContext *ctx) override;
    void exitVariable(CParser::VariableContext *ctx) override;
    
    void enterDeclaration_list(CParser::Declaration_listContext *ctx) override;
    void exitDeclaration_list(CParser::Declaration_listContext *ctx) override;
    
    void enterParameter_list(CParser::Parameter_listContext *ctx) override;
    void exitParameter_list(CParser::Parameter_listContext *ctx) override;
};

#endif // CODEGENERATOR_H