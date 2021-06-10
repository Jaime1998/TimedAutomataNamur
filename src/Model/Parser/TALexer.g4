lexer grammar TALexer;

COMMENT         :   '/*' .*? '*/'       -> skip; //Skip multiple lines comment
COMMENT_LINE    :   '//' .*? '\r'? '\n' -> skip; //Skip one line comment
WS              :   [ \t\r\n]+          -> skip; //Skip spaces and new lines (White Spaces)




//____________________RESERVED WORDS (KEYWORDS)____________________//

LET             :   'let' ;
PRINT           :   'print' ;
NUM             :   'num' ;
FUNCTION        :   'function' ;
RETURNS         :   'returns' ;
RETURN          :   'return' ;
AUTOMATON       :   'automaton' ;
LOCATION        :   'locations' ;
INIT            :   'init' ;
CLOCK           :   'clocks' ;
ACTIONS         :   'actions' ;
ACTION          :   'action' ;
EDGES           :   'edges' ;
SOURCE          :   'source' ;
TARGET          :   'target' ;
INVARIANT       :   'invariant' ;
RATES           :   'rates' ;
GUARD           :   'guard' ;
RESET           :   'reset' ;
L_C_BRACKET     :   '{' ;   //Left curly bracket
R_C_BRACKET     :   '}' ;   //Right curly bracket
L_PARENTHESIS   :   '(' ;   //left parenthesis
R_PARENTHESIS   :   ')' ;
EQUAL           :   '=' ;
COLON           :   ':' ;


MUL             :   '*' ;
DIV             :   '/' ;
ADD             :   '+' ;
SUB             :   '-' ;


LESS_EQ         :   '<=' ;
GREATER_EQ      :   '>=' ;
TRUE            :   'true' ;
FALSE           :   'false' ;
AND             :   'and' ;
AND_SYMBOL      :   '&&' ;
OR              :   'or' ;
OR_SYMBOL       :   '||' ;
NEQ_MARK        :   '!' ;
NEQ_LOG         :   'not' ;

IDENTIFIER      :   [a-zA-Z_]([a-zA-Z0-9_])* ;
fragment DIGIT  :   [0-9] ;
//INT             :   DIGIT+ ;
DOUBLE          :   DIGIT+
                |   DIGIT+ '.' DIGIT+
                |   '.' DIGIT+
                ;

COMMA           :   ',' ;