parser grammar TAParser;
options { tokenVocab=TALexer; }


/**
automaton a{
	locations= {a invariant=x<=10,b,c}
	clocks={x,y,z}
	init=a
}



num varNum = 2
automaton a {
	locations = {a : invariant = x<=varNum,b,c}
	clocks = {x,y,z}
	actions = {a1,a2,a3}
	edges = {(a,a1,b)}
	init = a

}
*/

model       :   block automaton+;

block       :   statement*;

statement   :   varDeclaration          # VarDeclarationSt
            |   expr                    # ExprSt
            |   'print' expr            # PrintSt
            |   'return' expr           # ReturnSt
            ;


//let         :   'let' '{' declaration* '}';

//declaration :   varDeclaration ;

varDeclaration: ('num' varId (',' varId)*)      # NumVarDecl
            |   ('function' varId (',' varId)*) # FuncVarDecl
            ;

type        :   'num' ;

varId       :   IDENTIFIER ('=' initialiser)? ;

initialiser :   expr ;

automaton   :   'automaton' IDENTIFIER
                        '{' (locationType | clockType | actionType | edgesType)*
                            initLocation
                            block
                            '}' ;


locationType:   'locations' '=' '{' location (',' location)* '}' ;

clockType   :   'clocks' '=' '{' IDENTIFIER (',' IDENTIFIER)* '}' ;

actionType  :   'actions' '=' '{' IDENTIFIER (',' IDENTIFIER)* '}' ;

edgesType   :   'edges' '=' '{' edge (',' edge)* '}' ;

location    :   IDENTIFIER (':' 'invariant' '=' guard)?

                           (':' 'rates' '=' '{' IDENTIFIER '=' expr (',' IDENTIFIER '=' expr)* '}')?;

initLocation:   'init' '=' IDENTIFIER ;

edge        :   '(' ('source' '=')? IDENTIFIER ','
                    ('guard' '=' guard ',')?
                    ('action' '=')? IDENTIFIER ','
                    ('reset' '=' '{' IDENTIFIER (',' IDENTIFIER)* '}' ',' )?
                    ('target' '=')? IDENTIFIER')' ;

guard       :   consGuard (('and' | '&&') consGuard)*
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

expr        :   op=('+' | '-') expr         # Unary
            |   expr '*' expr               # Mul
            |   expr op=('+'|'-') expr      # AddSub
            |   expr op=('<='|'>=') expr    # CompareExpr
            |   DOUBLE                      # DoubleExpr
            |   IDENTIFIER                  # IdExpr
            |   '(' expr ')'                # ParensExpr
            |   IDENTIFIER '=' expr         # AssignExpr
            ;


