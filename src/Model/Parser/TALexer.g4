lexer grammar TALexer;

COMMENT         :   '/*' .*? '*/'       -> skip; //Skip multiple lines comment
COMMENT_LINE    :   '//' .*? '\r'? '\n' -> skip; //Skip one line comment
WS              :   [ \t\r\n]+          -> skip; //Skip spaces and new lines (White Spaces)




//____________________RESERVED WORDS (KEYWORDS)____________________//

AUTOMATON       :   'automaton' ;
LOCATIONS       :   'locations' ;
CLOCKS          :   'clocks' ;
ACTIONS         :   'actions' ;
L_C_BRACKET     :   '{' ;   //Left curly bracket
R_C_BRACKET     :   '}' ;   //Right curly bracket
L_PARENTHESIS   :   '(' ;   //left parenthesis
R_PARENTHESIS   :   ')' ;
EQUAL           :   '=' ;
COLON           :   ':' ;



MUL             :   '*' ;
DIV             :   '/' ;
SUM             :   '+' ;
SUB             :   '-' ;

TRUE            :   'true' ;
FALSE           :   'false' ;
AND             :   'and' ;
AND_SYMBOL      :   '&&' ;
OR              :   'or' ;
OR_SYMBOL       :   '||' ;
NEQ_MARK        :   '!' ;

IDENTIFIER      :   [a-zA-Z_]([a-zA-Z0-9_])* ;
fragment DIGIT  :   [0-9] ;
INT             :   DIGIT+ ;
DOUBLE          :   INT '.' DIGIT+
                |   '.' DIGIT+
                ;

COMMA           :   ',' ;