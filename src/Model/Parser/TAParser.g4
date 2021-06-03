parser grammar TAParser;
options { tokenVocab=TALexer; }

model       :   let? automaton;

let         :   'let' '{' declaration* '}';

declaration :   varDeclaration ;

varDeclaration: (type varId (',' varId)*) ;

type        :   'num' ;

varId       :   IDENTIFIER '=' initialiser ;

initialiser :   expr ;

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

cons_guard  :   expr op=('<=' | '>=' ) expr
            |   expr
            |   '(' cons_guard ')'
            ;

expr        :   op=('-' | '+') expr         # Unary
            |   op=('not' | '!') expr       # Negation
            |   expr op=('*'|'/') expr      # MulDiv
            |   expr op=('+'|'-') expr      # SumSub
            |   expr op=('<='|'>=') expr    # CompareExpr
            |   DOUBLE                      # DoubleExpr
            |   IDENTIFIER                  # IdExpr
            |   'true'                      # TrueExpr
            |   'false'                     # FalseExprq
            |   '(' expr ')'                # ParensExpr
            ;


