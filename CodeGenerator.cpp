#include "CodeGenerator.h"

CodeGenerator::CodeGenerator() : labelCounter(0), stackOffset(0), currentScope(0), 
                                lineNumber(1), inExpression(false) {
    codeFile.open("code.asm");
    optimizedFile.open("optimized_code.asm");
    
    if (!codeFile.is_open() || !optimizedFile.is_open()) {
        cerr << "Error: Could not open output files!" << endl;
        exit(1);
    }
}

CodeGenerator::~CodeGenerator() {
    if (codeFile.is_open()) codeFile.close();
    if (optimizedFile.is_open()) optimizedFile.close();
}

string CodeGenerator::newLabel() {
    return "L" + to_string(labelCounter++);
}

void CodeGenerator::emit(const string& instruction) {
    instructions.push_back(instruction);
}

void CodeGenerator::emitComment(const string& comment) {
    emit("; " + comment);
}

void CodeGenerator::emitWithLine(const string& instruction, int line) {
    emit(instruction + " ; Line " + to_string(line));
}

string CodeGenerator::getCurrentScope() {
    return currentFunction.empty() ? "global" : currentFunction;
}

void CodeGenerator::pushOperand(const string& operand) {
    operandStack.push(operand);
}

string CodeGenerator::popOperand() {
    if (operandStack.empty()) return "";
    string operand = operandStack.top();
    operandStack.pop();
    return operand;
}

void CodeGenerator::generatePrologue() {
    emit(".MODEL SMALL");
    emit(".STACK 100H");
    emit("");
    generateDataSection();
    emit("");
    emit(".CODE");
    emit("");
    generatePrintlnProcedure();
    emit("");
    emit("MAIN PROC");
    emit("    MOV AX, @DATA");
    emit("    MOV DS, AX");
    emit("");
}

void CodeGenerator::generateDataSection() {
    emit(".DATA");
    emit("    NEWLINE DB 0DH, 0AH, '$'");
    emit("    TEMP_STR DB 10 DUP('$')");
}

void CodeGenerator::generatePrintlnProcedure() {
    emit("PRINTLN PROC");
    emit("    PUSH AX");
    emit("    PUSH BX");
    emit("    PUSH CX");
    emit("    PUSH DX");
    emit("");
    emit("    ; Check if number is negative");
    emit("    CMP AX, 0");
    emit("    JGE POSITIVE");
    emit("    NEG AX");
    emit("    PUSH AX");
    emit("    MOV DL, '-'");
    emit("    MOV AH, 2");
    emit("    INT 21H");
    emit("    POP AX");
    emit("");
    emit("POSITIVE:");
    emit("    ; Convert number to string and print");
    emit("    MOV BX, 10");
    emit("    MOV CX, 0");
    emit("    CMP AX, 0");
    emit("    JNE CONVERT_LOOP");
    emit("    ; Handle zero case");
    emit("    MOV DL, '0'");
    emit("    MOV AH, 2");
    emit("    INT 21H");
    emit("    JMP PRINT_NEWLINE");
    emit("");
    emit("CONVERT_LOOP:");
    emit("    CMP AX, 0");
    emit("    JE PRINT_DIGITS");
    emit("    MOV DX, 0");
    emit("    DIV BX");
    emit("    PUSH DX");
    emit("    INC CX");
    emit("    JMP CONVERT_LOOP");
    emit("");
    emit("PRINT_DIGITS:");
    emit("    CMP CX, 0");
    emit("    JE PRINT_NEWLINE");
    emit("    POP DX");
    emit("    ADD DL, '0'");
    emit("    MOV AH, 2");
    emit("    INT 21H");
    emit("    DEC CX");
    emit("    JMP PRINT_DIGITS");
    emit("");
    emit("PRINT_NEWLINE:");
    emit("    MOV DX, OFFSET NEWLINE");
    emit("    MOV AH, 9");
    emit("    INT 21H");
    emit("");
    emit("    POP DX");
    emit("    POP CX");
    emit("    POP BX");
    emit("    POP AX");
    emit("    RET");
    emit("PRINTLN ENDP");
}

void CodeGenerator::generateEpilogue() {
    emit("");
    emit("    MOV AX, 4C00H");
    emit("    INT 21H");
    emit("MAIN ENDP");
    emit("END MAIN");
}

void CodeGenerator::enterStart(CParser::StartContext *ctx) {
    emitComment("Compiler Generated Assembly Code");
    emitComment("CSE 310 Assignment 4 - Intermediate Code Generation");
    generatePrologue();
}

void CodeGenerator::exitStart(CParser::StartContext *ctx) {
    generateEpilogue();
    writeToFiles();
}

void CodeGenerator::enterProgram(CParser::ProgramContext *ctx) {
    // Nothing specific to do here
}

void CodeGenerator::exitProgram(CParser::ProgramContext *ctx) {
    // Nothing specific to do here
}

void CodeGenerator::enterUnit(CParser::UnitContext *ctx) {
    // Nothing specific to do here
}

void CodeGenerator::exitUnit(CParser::UnitContext *ctx) {
    // Nothing specific to do here
}

void CodeGenerator::enterFunc_definition(CParser::Func_definitionContext *ctx) {
    currentFunction = ctx->ID()->getText();
    string returnType = ctx->type_specifier()->getText();
    
    emitComment("Function Definition: " + currentFunction);
    
    if (currentFunction != "main") {
        emit(currentFunction + " PROC");
        emit("    PUSH BP");
        emit("    MOV BP, SP");
    }
    
    // Initialize function info
    FunctionInfo funcInfo;
    funcInfo.returnType = returnType;
    funcInfo.stackSize = 0;
    functionTable[currentFunction] = funcInfo;
    
    scopeStack.push(currentScope++);
    stackOffset = 0;
}

void CodeGenerator::exitFunc_definition(CParser::Func_definitionContext *ctx) {
    if (currentFunction != "main") {
        emit("    MOV SP, BP");
        emit("    POP BP");
        emit("    RET");
        emit(currentFunction + " ENDP");
        emit("");
    }
    
    scopeStack.pop();
    currentFunction = "";
}

void CodeGenerator::enterFunc_declaration(CParser::Func_declarationContext *ctx) {
    string funcName = ctx->ID()->getText();
    string returnType = ctx->type_specifier()->getText();
    
    emitComment("Function Declaration: " + funcName);
    
    FunctionInfo funcInfo;
    funcInfo.returnType = returnType;
    functionTable[funcName] = funcInfo;
}

void CodeGenerator::exitFunc_declaration(CParser::Func_declarationContext *ctx) {
    // Nothing specific to do here
}

void CodeGenerator::enterVar_declaration(CParser::Var_declarationContext *ctx) {
    string type = ctx->type_specifier()->getText();
    emitComment("Variable Declaration - Type: " + type);
}

void CodeGenerator::exitVar_declaration(CParser::Var_declarationContext *ctx) {
    // Nothing specific to do here
}

void CodeGenerator::enterDeclaration_list(CParser::Declaration_listContext *ctx) {
    // Will handle individual declarations
}

void CodeGenerator::exitDeclaration_list(CParser::Declaration_listContext *ctx) {
    // Handle variable declarations
    if (ctx->ID()) {
        string varName = ctx->ID()->getText();
        SymbolInfo symbol;
        symbol.type = "int"; // Default to int, should get from parent context
        symbol.scope = getCurrentScope();
        symbol.lineNumber = lineNumber;
        
        if (ctx->CONST_INT()) {
            // Array declaration
            symbol.isArray = true;
            symbol.arraySize = stoi(ctx->CONST_INT()->getText());
            symbol.size = symbol.arraySize * 2; // 2 bytes per integer
            symbol.offset = stackOffset;
            stackOffset += symbol.size;
            
            emitComment("Array " + varName + "[" + to_string(symbol.arraySize) + "]");
            emit("    SUB SP, " + to_string(symbol.size));
        } else {
            // Simple variable
            symbol.isArray = false;
            symbol.arraySize = 1;
            symbol.size = 2; // 2 bytes for integer
            symbol.offset = stackOffset;
            stackOffset += symbol.size;
            
            emitComment("Variable " + varName);
            emit("    SUB SP, 2");
        }
        
        symbolTable[varName] = symbol;
    }
}

void CodeGenerator::enterCompound_statement(CParser::Compound_statementContext *ctx) {
    scopeStack.push(currentScope++);
    emitComment("Compound Statement Begin");
}

void CodeGenerator::exitCompound_statement(CParser::Compound_statementContext *ctx) {
    emitComment("Compound Statement End");
    scopeStack.pop();
}

void CodeGenerator::enterStatement(CParser::StatementContext *ctx) {
    // Check what type of statement this is
    if (ctx->IF()) {
        emitComment("IF Statement");
    } else if (ctx->WHILE()) {
        emitComment("WHILE Loop");
    } else if (ctx->FOR()) {
        emitComment("FOR Loop");
    } else if (ctx->PRINTLN()) {
        emitComment("PRINTLN Statement");
    } else if (ctx->RETURN()) {
        emitComment("RETURN Statement");
    }
}

void CodeGenerator::exitStatement(CParser::StatementContext *ctx) {
    // Handle different statement types
    if (ctx->IF()) {
        // IF statement handling
        if (ctx->ELSE()) {
            // IF-ELSE
            string elseLabel = newLabel();
            string endLabel = newLabel();
            
            emit("    CMP AX, 0");
            emit("    JE " + elseLabel);
            emit("    JMP " + endLabel);
            emit(elseLabel + ":");
            emit(endLabel + ":");
        } else {
            // Simple IF
            string endLabel = newLabel();
            
            emit("    CMP AX, 0");
            emit("    JE " + endLabel);
            emit(endLabel + ":");
        }
    } else if (ctx->WHILE()) {
        // WHILE loop handling
        string startLabel = newLabel();
        string endLabel = newLabel();
        
        emit(startLabel + ":");
        emit("    CMP AX, 0");
        emit("    JE " + endLabel);
        emit("    JMP " + startLabel);
        emit(endLabel + ":");
    } else if (ctx->PRINTLN()) {
        // PRINTLN handling
        string varName = ctx->ID()->getText();
        if (symbolTable.count(varName)) {
            SymbolInfo& symbol = symbolTable[varName];
            emit("    MOV AX, [BP-" + to_string(symbol.offset + 2) + "]");
            emit("    CALL PRINTLN");
        }
    } else if (ctx->RETURN()) {
        // RETURN statement
        if (currentFunction != "main") {
            emit("    MOV SP, BP");
            emit("    POP BP");
            emit("    RET");
        }
    }
}

void CodeGenerator::enterExpression(CParser::ExpressionContext *ctx) {
    inExpression = true;
    if (ctx->ASSIGNOP()) {
        emitComment("Assignment Expression");
    }
}

void CodeGenerator::exitExpression(CParser::ExpressionContext *ctx) {
    if (ctx->ASSIGNOP()) {
        // Handle assignment
        string varName = ctx->variable()->ID()->getText();
        if (symbolTable.count(varName)) {
            SymbolInfo& symbol = symbolTable[varName];
            emit("    MOV [BP-" + to_string(symbol.offset + 2) + "], AX");
        }
    }
    inExpression = false;
}

void CodeGenerator::enterLogic_expression(CParser::Logic_expressionContext *ctx) {
    if (ctx->LOGICOP()) {
        emitComment("Logical Expression");
    }
}

void CodeGenerator::exitLogic_expression(CParser::Logic_expressionContext *ctx) {
    if (ctx->LOGICOP()) {
        string op = ctx->LOGICOP()->getText();
        generateLogical(op);
    }
}

void CodeGenerator::enterRel_expression(CParser::Rel_expressionContext *ctx) {
    if (ctx->RELOP()) {
        emitComment("Relational Expression");
    }
}

void CodeGenerator::exitRel_expression(CParser::Rel_expressionContext *ctx) {
    if (ctx->RELOP()) {
        string op = ctx->RELOP()->getText();
        generateComparison(op);
    }
}

void CodeGenerator::enterSimple_expression(CParser::Simple_expressionContext *ctx) {
    if (ctx->ADDOP()) {
        emitComment("Addition/Subtraction Expression");
    }
}

void CodeGenerator::exitSimple_expression(CParser::Simple_expressionContext *ctx) {
    if (ctx->ADDOP()) {
        string op = ctx->ADDOP()->getText();
        generateArithmetic(op);
    }
}

void CodeGenerator::enterTerm(CParser::TermContext *ctx) {
    if (ctx->MULOP()) {
        emitComment("Multiplication/Division Expression");
    }
}

void CodeGenerator::exitTerm(CParser::TermContext *ctx) {
    if (ctx->MULOP()) {
        string op = ctx->MULOP()->getText();
        generateArithmetic(op);
    }
}

void CodeGenerator::enterUnary_expression(CParser::Unary_expressionContext *ctx) {
    if (ctx->ADDOP() || ctx->NOT()) {
        emitComment("Unary Expression");
    }
}

void CodeGenerator::exitUnary_expression(CParser::Unary_expressionContext *ctx) {
    if (ctx->ADDOP()) {
        string op = ctx->ADDOP()->getText();
        if (op == "-") {
            emit("    NEG AX");
        }
        // For positive, do nothing
    } else if (ctx->NOT()) {
        emit("    CMP AX, 0");
        emit("    MOV AX, 0");
        emit("    JNE SKIP_SET");
        emit("    MOV AX, 1");
        emit("SKIP_SET:");
    }
}

void CodeGenerator::enterFactor(CParser::FactorContext *ctx) {
    // Will handle in exit
}

void CodeGenerator::exitFactor(CParser::FactorContext *ctx) {
    if (ctx->CONST_INT()) {
        string value = ctx->CONST_INT()->getText();
        emit("    MOV AX, " + value);
    } else if (ctx->CONST_FLOAT()) {
        emitComment("Float constants not implemented");
    } else if (ctx->INCOP()) {
        emitComment("Increment operation");
        emit("    INC AX");
    } else if (ctx->DECOP()) {
        emitComment("Decrement operation");
        emit("    DEC AX");
    }
}

void CodeGenerator::enterVariable(CParser::VariableContext *ctx) {
    // Will handle in exit
}

void CodeGenerator::exitVariable(CParser::VariableContext *ctx) {
    string varName = ctx->ID()->getText();
    
    if (ctx->expression()) {
        // Array access
        emitComment("Array access: " + varName);
        if (symbolTable.count(varName)) {
            SymbolInfo& symbol = symbolTable[varName];
            emit("    MOV BX, AX"); // Array index in BX
            emit("    SHL BX, 1");  // Multiply by 2 (word size)
            emit("    MOV AX, BP");
            emit("    SUB AX, " + to_string(symbol.offset + 2));
            emit("    SUB AX, BX");
            emit("    MOV BX, AX");
            emit("    MOV AX, [BX]");
        }
    } else {
        // Simple variable access
        if (symbolTable.count(varName)) {
            SymbolInfo& symbol = symbolTable[varName];
            emit("    MOV AX, [BP-" + to_string(symbol.offset + 2) + "]");
        }
    }
}

void CodeGenerator::enterParameter_list(CParser::Parameter_listContext *ctx) {
    emitComment("Parameter List");
}

void CodeGenerator::exitParameter_list(CParser::Parameter_listContext *ctx) {
    // Handle parameters - add to symbol table
}

void CodeGenerator::generateArithmetic(const string& op) {
    emit("    POP BX");
    if (op == "+") {
        emit("    ADD AX, BX");
    } else if (op == "-") {
        emit("    SUB BX, AX");
        emit("    MOV AX, BX");
    } else if (op == "*") {
        emit("    MUL BX");
    } else if (op == "/") {
        emit("    MOV DX, 0");
        emit("    XCHG AX, BX");
        emit("    DIV BX");
    } else if (op == "%") {
        emit("    MOV DX, 0");
        emit("    XCHG AX, BX");
        emit("    DIV BX");
        emit("    MOV AX, DX");
    }
}

void CodeGenerator::generateComparison(const string& op) {
    emit("    POP BX");
    emit("    CMP BX, AX");
    emit("    MOV AX, 0");
    
    if (op == "<") {
        emit("    JL SET_TRUE");
    } else if (op == "<=") {
        emit("    JLE SET_TRUE");
    } else if (op == ">") {
        emit("    JG SET_TRUE");
    } else if (op == ">=") {
        emit("    JGE SET_TRUE");
    } else if (op == "==") {
        emit("    JE SET_TRUE");
    } else if (op == "!=") {
        emit("    JNE SET_TRUE");
    }
    
    emit("    JMP END_CMP");
    emit("SET_TRUE:");
    emit("    MOV AX, 1");
    emit("END_CMP:");
}

void CodeGenerator::generateLogical(const string& op) {
    emit("    POP BX");
    
    if (op == "&&") {
        emit("    CMP BX, 0");
        emit("    JE SET_FALSE");
        emit("    CMP AX, 0");
        emit("    JE SET_FALSE");
        emit("    MOV AX, 1");
        emit("    JMP END_LOGIC");
        emit("SET_FALSE:");
        emit("    MOV AX, 0");
        emit("END_LOGIC:");
    } else if (op == "||") {
        emit("    CMP BX, 0");
        emit("    JNE SET_TRUE");
        emit("    CMP AX, 0");
        emit("    JNE SET_TRUE");
        emit("    MOV AX, 0");
        emit("    JMP END_LOGIC");
        emit("SET_TRUE:");
        emit("    MOV AX, 1");
        emit("END_LOGIC:");
    }
}

void CodeGenerator::writeToFiles() {
    cout << "Writing assembly code to files..." << endl;
    
    // Write original code
    for (const string& instruction : instructions) {
        codeFile << instruction << endl;
    }
    
    // Perform optimizations
    vector<string> optimizedCode = performOptimizations(