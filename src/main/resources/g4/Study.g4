grammar Study;

/**
 * Parser rule
*/
operation : NUMBER '+' NUMBER;



/*
 * Lexer Rules
 */
NUMBER     : [0-9]+ ;

WHITESPACE : ' ' -> skip ;