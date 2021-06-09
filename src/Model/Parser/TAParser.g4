parser grammar TAParser;
options { tokenVocab=TALexer; }

model       :   let? automaton;

block       :   statement*;

let         :   'let' '{' statement* '}';

statement   :   varDeclaration          # VarDeclarationSt
            |   expr                    # ExprSt
            |   printStatement          # PrintSt
            ;

printStatement: 'print' expr ;
//let         :   'let' '{' declaration* '}';

//declaration :   varDeclaration ;

varDeclaration: (type varId (',' varId)*) ;

type        :   'num' ;

varId       :   IDENTIFIER ('=' initialiser)? ;

initialiser :   expr ;

automaton   :   'automaton' IDENTIFIER '{' (locationType | clockType | actionType | edgesType)* '}' ;


locationType:   'locations' '=' '{' location (',' location)* '}' ;

clockType   :   'clocks' '=' '{' IDENTIFIER (',' IDENTIFIER)* '}' ;

actionType  :   'actions' '=' '{' IDENTIFIER (',' IDENTIFIER)* '}' ;

edgesType   :   'edges' '=' '{' edge* '}' ;

location    :   IDENTIFIER ('invariant' '=' guard)? ;

edge        :   '(' 'source' '=' IDENTIFIER ','
                    ('guard' '=' guard ',')?
                    'action' '=' IDENTIFIER ','
                    ('reset' '=' '{' IDENTIFIER* '}')?
                    'target' '=' IDENTIFIER')' ;

guard       :   consGuard (('and' | '&&') guard)?
            ;

consGuard   :   expr ;

funcExpr    :   'function' IDENTIFIER '(' funcParameters ')' 'returns' 'function' '{' block '}'
            |   'function' IDENTIFIER '(' funcParameters ')' 'returns' 'num' '{' block '}'
            |   IDENTIFIER
            |   IDENTIFIER '(' arguments ')'
            ;
funcParameters: (funcParameter (',' funcParameter)*)? ;

funcParameter:  type IDENTIFIER ;

arguments   :   (expr  (',' expr)*)? ;

expr        :   expr op=('<='|'>=') expr    # CompareExpr
            |   op=('+' | '-') expr         # Unary
            |   expr op=('*'|'/') expr      # MulDiv
            |   expr op=('+'|'-') expr      # AddSub
            |   DOUBLE                      # DoubleExpr
            |   IDENTIFIER                  # IdExpr
            |   '(' expr ')'                # ParensExpr
            |   IDENTIFIER '=' expr         # AssignExpr
            ;


