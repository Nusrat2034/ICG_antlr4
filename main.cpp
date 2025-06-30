#include <iostream>
#include <fstream>
#include "antlr4-runtime.h"
#include "CLexer.h"
#include "CParser.h"
#include "CodeGenerator.h"

using namespace std;
using namespace antlr4;
using namespace antlr4::tree;

int main(int argc, char* argv[]) {
    if (argc != 2) {
        cerr << "Usage: " << argv[0] << " <input_file.c>" << endl;
        return 1;
    }
    
    string inputFile = argv[1];
    
    try {
        // Read input file
        ifstream stream(inputFile);
        if (!stream.is_open()) {
            cerr << "Error: Could not open input file: " << inputFile << endl;
            return 1;
        }
        
        // Create ANTLR input stream
        ANTLRInputStream input(stream);
        
        // Create lexer
        CLexer lexer(&input);
        CommonTokenStream tokens(&lexer);
        
        // Create parser
        CParser parser(&tokens);
        
        // Parse and create parse tree
        cout << "Parsing input file..." << endl;
        tree::ParseTree* tree = parser.program();
        
        if (parser.getNumberOfSyntaxErrors() > 0) {
            cerr << "Syntax errors found. Cannot generate code." << endl;
            return 1;
        }
        
        cout << "Parse tree created successfully!" << endl;
        
        // Create code generator (listener)
        CodeGenerator codeGen;
        
        // Walk the parse tree with the listener
        cout << "Generating assembly code..." << endl;
        tree::ParseTreeWalker walker;
        walker.walk(&codeGen, tree);
        
        cout << "Code generation completed!" << endl;
        cout << "Output files: code.asm, optimized_code.asm" << endl;
        
    } catch (const exception& e) {
        cerr << "Error: " << e.what() << endl;
        return 1;
    }
    
    return 0;
}