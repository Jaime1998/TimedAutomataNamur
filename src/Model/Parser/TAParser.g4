parser grammar TAParser;
options { tokenVocab=TALexer; }

model       :   let automaton;

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

automaton   :   'automaton' IDENTIFIER '{' typesTA* '}' ;

typesTA    :   'locations' '=' '{' location (',' location)* '}'        # locationType
            |   'clocks' '=' '{' IDENTIFIER (',' IDENTIFIER)* '}'       # clockType
            |   'actions' '=' '{' IDENTIFIER (',' IDENTIFIER)* '}'      # actionsType
            |   'edges' '=' '{' edge* '}'                               # edgesType
            ;

location    :   IDENTIFIER ('invariant' ':' guard)? ;

edge        :   '(' source = IDENTIFIER ','
                    ('guard' ':' guard ',')?
                    action = IDENTIFIER ','
                    ('reset' ':' '{'  '}')?
                    target = IDENTIFIER')' ;

guard       :   consGuard (('and' | '&&') guard)?
            ;

consGuard   :   expr op=('<=' | '>=' ) expr
            |   expr
            |   '(' consGuard ')'
            ;

funcExpr    :   'function' IDENTIFIER '(' funcParameters ')' 'returns' 'function' '{' block '}'
            |   'function' IDENTIFIER '(' funcParameters ')' 'returns' 'num' '{' block '}'
            |   IDENTIFIER
            |   IDENTIFIER '(' arguments ')'
            ;
funcParameters: (funcParameter (',' funcParameter)*)? ;

funcParameter:  type IDENTIFIER ;

arguments   :   (expr  (',' expr)*)? ;

expr     :   op=('+' | '-') expr          # Unary
            |   expr op=('*'|'/') expr    # MulDiv
            |   expr op=('+'|'-') expr    # AddSub
            |   expr op=('<='|'>=') expr  # CompareExpr
            |   DOUBLE                          # DoubleExpr
            |   IDENTIFIER                      # IdExpr
            |   '(' expr ')'                 # ParensExpr
            |   IDENTIFIER '=' expr          # AssignExpr
            ;


