#!/bin/bash

java -jar /usr/local/lib/antlr-4.13.2-complete.jar -Dlanguage=Cpp -listener -visitor C8086Lexer.g4
java -jar /usr/local/lib/antlr-4.13.2-complete.jar -Dlanguage=Cpp -listener -visitor C8086Parser.g4
g++ -std=c++17 -w -I/usr/local/include/antlr4-runtime -c C8086Lexer.cpp C8086Parser.cpp CodeGenerator.cpp main.cpp 
g++ -std=c++17 -w C8086Lexer.o C8086Parser.o main.o -L/usr/local/lib/ -lantlr4-runtime -o main.out -pthread
LD_LIBRARY_PATH=/usr/local/lib ./main.out $1
