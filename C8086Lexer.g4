lexer grammar C8086Lexer;
// Keywords
IF: 'if';
ELSE: 'else';
FOR: 'for';
WHILE: 'while';
INT: 'int';
FLOAT: 'float';
VOID: 'void';
RETURN: 'return';
PRINTLN: 'println';

// Operators
ASSIGNOP: '=';
LOGICOP: '&&' | '||';
RELOP: '<' | '<=' | '>' | '>=' | '==' | '!=';
ADDOP: '+' | '-';
MULOP: '*' | '/' | '%';
INCOP: '++';
DECOP: '--';
NOT: '!';

// Delimiters
LPAREN: '(';
RPAREN: ')';
LCURL: '{';
RCURL: '}';
LTHIRD: '[';
RTHIRD: ']';
COMMA: ',';
SEMICOLON: ';';

// Literals
CONST_INT: [0-9]+;
CONST_FLOAT: [0-9]+ '.' [0-9]+;

// Identifiers
ID: [a-zA-Z_][a-zA-Z0-9_]*;

// Whitespace and Comments
WS: [ \t\r\n]+ -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;