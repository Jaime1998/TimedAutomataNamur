parser grammar TAParser;
options { tokenVocab=TALexer; }

model       :   automaton +;

automaton   :   'automaton' IDENTIFIER '{' loc+ clock? actions? '}' ;

loc         :   'locations' '=' '{' IDENTIFIER (':' boolean)? (',' IDENTIFIER (':' boolean )?)* '}' ;

clock       :   'clocks' '=' '{' IDENTIFIER (',' IDENTIFIER)* '}' ;

actions     :   'actions' '=' '{' IDENTIFIER (',' IDENTIFIER)* '}' ;

boolean     :   boolean op=('and'|'&&') boolean
            |   'true'
            |   'false'
            |   INT
            |   IDENTIFIER
            |   '!' boolean
            ;

expr        :   expr op=('*'|'/') expr  # MulDiv
            |   expr op=('+'|'-') expr  # SumSub
            |   INT                     # IntegerExpr
            |   IDENTIFIER              # IdExpr
            |   '(' expr ')'            # ParensExpr
            ;


