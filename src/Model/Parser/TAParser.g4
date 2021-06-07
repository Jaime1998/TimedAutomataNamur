parser grammar TAParser;
options { tokenVocab=TALexer; }

model       :   let automaton;

block       :   statement*;

let         :   'let' '{' statement* '}';

statement   :   varDeclaration          # VarDeclarationSt
            |   numExpr                 # NumExprSt
            |   printStatement          # PrintSt
            ;

printStatement: 'print' numExpr ;
//let         :   'let' '{' declaration* '}';

//declaration :   varDeclaration ;

varDeclaration: (type varId (',' varId)*) ;

type        :   'num' ;

varId       :   IDENTIFIER ('=' initialiser)? ;

initialiser :   numExpr ;

automaton   :   'automaton' IDENTIFIER '{' types_TA* '}' ;

types_TA    :   'locations' '=' '{' location (',' location)* '}'        # locationType
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

guard       :   cons_guard (('and' | '&&') guard)*
            ;

cons_guard  :   numExpr op=('<=' | '>=' ) numExpr
            |   numExpr
            |   '(' cons_guard ')'
            ;

funcExpr    :   'function' IDENTIFIER '(' funcParameters ')' 'returns' 'function' '{' block '}'
            |   'function' IDENTIFIER '(' funcParameters ')' 'returns' 'num' '{' block '}'
            |   IDENTIFIER
            |   IDENTIFIER '(' arguments ')'
            ;
funcParameters: (funcParameter (',' funcParameter)*)? ;

funcParameter:  type IDENTIFIER ;

arguments   :   (numExpr  (',' numExpr)*)? ;

numExpr     :   op=('+' | '-') numExpr          # Unary
            |   numExpr op=('*'|'/') numExpr    # MulDiv
            |   numExpr op=('+'|'-') numExpr    # AddSub
            |   numExpr op=('<='|'>=') numExpr  # CompareExpr
            |   DOUBLE                          # DoubleExpr
            |   IDENTIFIER                      # IdExpr
            |   '(' numExpr ')'                 # ParensExpr
            |   IDENTIFIER '=' numExpr          # AssignExpr
            ;


