parser grammar TAParser;
options { tokenVocab=TALexer; }

model       :   automaton +;

automaton   :   'automaton' IDENTIFIER '{' loc+ clock? actions? edges?'}' ;

loc         :   'locations' '=' '{' IDENTIFIER (':' guard)? (',' IDENTIFIER (':' guard )?)* '}' ;

clock       :   'clocks' '=' '{' IDENTIFIER (',' IDENTIFIER)* '}' ;

actions     :   'actions' '=' '{' IDENTIFIER (',' IDENTIFIER)* '}' ;

edges       :   'edges' '=' '{' '}';

guard       :   expr (('and' | '&&') guard)*
            ;

boolean     :   boolean op=('and'|'&&') boolean
            |   expr op=('<=' | '>=' ) expr
            |   'true'
            |   'false'
            |   INT
            |   IDENTIFIER
            |   '(' boolean ')'
            |   '!' boolean
            ;

expr        :   expr op=('*'|'/') expr      # MulDiv
            |   expr op=('+'|'-') expr      # SumSub
            |   expr op=('<='|'>=') expr    #CompareExpr
            |   INT                         # IntegerExpr
            |   IDENTIFIER                  # IdExpr
            |   '(' expr ')'                # ParensExpr
            ;


