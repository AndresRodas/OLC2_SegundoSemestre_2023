lexer grammar SwiftLexer;

// --------------- Tokens
// types
INT:    'Int';
FLOAT:  'Float';
BOOL:   'Bool';
STR:    'String';

// reserved words
TRU:    'true';
FAL:    'false';
PRINT:  'print';
IF:     'if';
ELSE:   'else';
WHILE:  'while';
VAR:    'var';
FUNC:   'func';
STRUCT: 'struct';

// primitives
NUMBER : [0-9]+ ('.'[0-9]+)?;
STRING: '"'~["]*'"';
ID: ([a-zA-Z])[a-zA-Z0-9_]*;

// symbols

DIF:            '!=';
IG_IG:          '==';
NOT:            '!';
OR:             '||';
AND:            '&&';
IG:             '=';
MAY_IG:         '>=';
MEN_IG:         '<=';
MAYOR:          '>';
MENOR:          '<';
MUL:            '*';
DIV:            '/';
ADD:            '+';
SUB:            '-';
PARIZQ:         '(';
PARDER:         ')';
LLAVEIZQ:       '{';
LLAVEDER:       '}';
D_PTS:          ':';
CORIZQ:         '[';
CORDER:         ']';
COMA:           ',';
ARROW1:         '->';
PUNTO:          '.';

// skip
WHITESPACE: [ \\\r\n\t]+ -> skip;
COMMENT : '/*' .*? '*/' -> skip;
LINE_COMMENT : '//' ~[\r\n]* -> skip;

fragment
ESC_SEQ
    :   '\\' ('\\'|'@'|'['|']'|'.'|'#'|'+'|'-'|'!'|':'|' ')
    ;

