grammar QueryDSL;


parse
    : expression+
    ;

expression : expression EQ expression SEPARATOR  #equals
           | expression LT expression SEPARATOR  #lessThan
           | expression LE expression SEPARATOR  #lessThanEquals
           | expression GT expression SEPARATOR  #greaterThan
           | expression GE expression SEPARATOR  #greaterThanEquals
           | expression SORT expression SEPARATOR #sort
           | expression LIKE expression SEPARATOR #like
           | expression IN expression   SEPARATOR #in
           | PARAM                      #param
           ;


fragment  LETTERS    : [0-9a-zA-Z(),] ;

SEPARATOR: ';';

EQ: '=eq=' | '==';
LT: '=lt=' | '<';
LE: '=le=' | '<=';
GT: '=gt=' | '>';
GE: '=ge=' | '>=';
SORT: '=sort=';
LIKE: '=like=';
IN: '=in=';

PARAM: LETTERS+ ;

WS : [ \t\u000C\r\n]+ -> skip;

SHEBANG : '#' '!' ~('\n'|'\r')* -> channel(HIDDEN);