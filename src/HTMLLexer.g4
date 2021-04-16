lexer grammar  HTMLLexer;

OPEN_MUSTACHE
    : '{{' -> pushMode(MUSTACHE)
    ;

HTML_COMMENT
    : '<!--' .*? '-->'
    ;

HTML_CONDITIONAL_COMMENT
    : '<![' .*? ']>'
    ;

XML
    : '<?xml' .*? '>'
    ;

CDATA
    : '<![CDATA[' .*? ']]>'
    ;

DTD
    : '<!' .*? '>'
    ;

SCRIPTLET
    : '<?' .*? '?>'
    | '<%' .*? '%>'
    ;

SEA_WS
    :  (' '|'\t'|'\r'? '\n')+ -> channel(HIDDEN)
    ;

SCRIPT_OPEN
    : '<script' .*? '>' -> pushMode(SCRIPT)
    ;

STYLE_OPEN
    : '<style' .*? '>'  ->pushMode(STYLE)
    ;

TAG_OPEN
    : '<' -> pushMode(TAG)
    ;

//TODO check this
HTML_TEXT
    : ~('<' | '{')+
    ;

fragment EQUALS
    : '='
    ;

fragment GREATER_THAN
    : '>'
    ;

fragment LESS_THAN
    : '<'
    ;

fragment GREATER_EQ
    : '>='
    ;

fragment LESS_EQ
    : '<='
    ;

fragment EQUAL_TO
    : '=='
    ;

fragment NOT_EQUAL
    : '!='
    ;

fragment SEMI_COLON
    : ';'
    ;

fragment COLON
    : ':'
    ;

fragment COMMA
    : ','
    ;

fragment OPEN_PAR
    : '('
    ;

fragment CLOSE_PAR
    : ')'
    ;

fragment OPEN_CURLY_BRACKETS
    : '{'
    ;

fragment CLOSE_CURLY_BRACKETS
    : '}'
    ;

fragment OPEN_BRACKETS
    : '['
    ;

fragment CLOSE_BRACKETS
    : ']'
    ;

fragment DOT
    : '.'
    ;

fragment SINGLE_QUOTE
    : '\''
    ;

fragment QUESTION_MARK
    : '?'
    ;

fragment OR
    : '||'
    ;

fragment AND
    : '&&'
    ;

fragment NOT
    : '!'
    ;

fragment NUMBER
    : DIGIT+ ( '.' DIGIT* )?
    | '.' DIGIT+
    ;

fragment DIGIT
    : [0-9]
    ;

fragment STRING
//    : '"' ~["]* '"'
    : '\'' ~[<']* '\''
    ;

fragment STRING4MUSTACHE
    : '"' ~["]* '"'
    | '\'' ~[<']* '\''
    ;

fragment TRUE
    : 'true'
    ;

fragment FALSE
    : 'false'
    ;

fragment NULL
    : 'null'
    ;

fragment IDENTIFIER
    : [a-zA-Z_] [a-zA-Z_0-9]*
    ;
fragment Arithmetic
    :[+-/*]
    ;

// tag declarations

mode TAG;

 CP_APP
    : 'cp-app' ->pushMode(CP)
    ;

 CP_SHOW
    : 'cp-show'->pushMode(CP)
    ;

 CP_HIDE
    : 'cp-hide'->pushMode(CP)
    ;

 CP_FOR
    : 'cp-for'->pushMode(CP)
    ;

 CP_SWITCH
    : 'cp-switch'->pushMode(CP)
    ;

 CP_SWITCH_CASE
    : 'cp-switch-case'->pushMode(CP)
    ;

 CP_IF
    : 'cp-if'->pushMode(CP)
    ;

 CP_MODEL
    : 'cp-model'->pushMode(CP)
    ;

// TODO i don't think so
 CP_CLICK
    : '@click'->pushMode(CP)
    ;

 CP_MOUSEOVER
    : '@mouseover'->pushMode(CP)
    ;

CP_SWITCH_DEF
    : 'cp-switchDefault'
    ;

TAG_CLOSE
    : '>' -> popMode
    ;

TAG_SLASH_CLOSE
    : '/>' -> popMode
    ;

TAG_SLASH
    : '/'
    ;


// lexing mode for attribute values

TAG_EQUALS
    : EQUALS -> pushMode(ATTVALUE)
    ;

TAG_NAME
    : TAG_NameStartChar TAG_NameChar*
    ;

TAG_WHITESPACE
    : [ \t\r\n] -> channel(HIDDEN)
    ;

fragment
HEXDIGIT
    : [a-fA-F0-9]
    ;


fragment
TAG_NameChar
    : TAG_NameStartChar
    | '-'
    | '_'
    | '.'
    | DIGIT
    | '\u00B7'
    | '\u0300'..'\u036F'
    | '\u203F'..'\u2040'
    ;

fragment
TAG_NameStartChar
    : [:a-zA-Z]
    | '\u2070'..'\u218F'
    | '\u2C00'..'\u2FEF'
    | '\u3001'..'\uD7FF'
    | '\uF900'..'\uFDCF'
    | '\uFDF0'..'\uFFFD'
    ;





// <scripts>

mode SCRIPT;

SCRIPT_BODY
    :  .*? '</script>' -> popMode
    ;

SCRIPT_SHORT_BODY
    : .*? '</>' -> popMode
    ;


// <styles>

mode STYLE;

STYLE_BODY
    : .*? '</style>' -> popMode
    ;

STYLE_SHORT_BODY
    : .*? '</>' -> popMode
    ;


// attribute values

mode ATTVALUE;

// an attribute value may have spaces b/t the '=' and the value
ATTVALUE_VALUE
    : ' '* ATTRIBUTE -> popMode
    ;

ATTRIBUTE
    : DOUBLE_QUOTE_STRING
    | SINGLE_QUOTE_STRING
    | ATTCHARS
    | HEXCHARS
    | DECCHARS
    ;

fragment ATTCHARS
    : ATTCHAR+ ' '?
    ;

fragment ATTCHAR
    : '-'
    | '_'
    | '.'
    | '/'
    | '+'
    | ','
    | '?'
    | '='
    | ':'
    | ';'
    | '#'
    | [0-9a-zA-Z]
    ;

fragment HEXCHARS
    : '#' [0-9a-fA-F]+
    ;

fragment DECCHARS
    : [0-9]+ '%'?
    ;

fragment DOUBLE_QUOTE_STRING
    : '"' ~[<"]* '"'
    ;

fragment SINGLE_QUOTE_STRING
    : '\'' ~[<']* '\''
    ;


//                                         *****************************


mode CP;


CP_EQUALS
    : EQUALS
    ;

CP_OPEN_DOUBLE_QUOTE
    : '"' -> pushMode(CP_CONTENT)
    ;

CP_WS
    : [ \t\r\n] -> channel(HIDDEN)
    ;


mode CP_CONTENT;

CP_CONTENT_CLOSE_DOUBLE_QUOTE
    : '"' -> popMode , popMode
    ;

CP_CONTENT_EQUALS
    : EQUALS
    ;

CP_CONTENT_SEMI_COLON
    : SEMI_COLON
    ;

CP_CONTENT_COLON
    : COLON
    ;

CP_CONTENT_COMMA
    : COMMA
    ;

CP_CONTENT_OPEN_PAR
    : OPEN_PAR
    ;

CP_CONTENT_CLOSE_PAR
    : CLOSE_PAR
    ;

CP_CONTENT_OPEN_CURLY_BRACKETS
    : OPEN_CURLY_BRACKETS
    ;

CP_CONTENT_CLOSE_CURLY_BRACKETS
    : CLOSE_CURLY_BRACKETS
    ;

CP_CONTENT_OPEN_BRACKETS
    : OPEN_BRACKETS
    ;

CP_CONTENT_CLOSE_BRACKETS
    : CLOSE_BRACKETS
    ;

CP_CONTENT_DOT
    : DOT
    ;

CP_CONTENT_SINGLE_QUOTE
    : '\''
    ;

CP_CONTENT_QUESTION_MARK
    : QUESTION_MARK
    ;

CP_CONTENT_OR
    : OR
    ;

CP_CONTENT_AND
    : AND
    ;

CP_CONTENT_NOT
    : NOT
    ;

IN
    : 'in'
    ;

INDEX
    : 'index'
    ;

CP_CONTENT_TRUE
    : TRUE
    ;

CP_CONTENT_FALSE
    : FALSE
    ;

CP_CONTENT_NULL
    : NULL
    ;

CP_CONTENT_IDENTIFIER
    : [a-zA-Z_] [a-zA-Z_0-9]*
    ;

CP_CONTENT_NUMBER
    : NUMBER
    ;
CP_CONTENT_STRING
    : STRING
    ;

CP_CONTENT_GREATER_THAN
    : GREATER_THAN
    ;

CP_CONTENT_LESS_THAN
    : LESS_THAN
    ;

CP_CONTENT_GREATER_EQ
    : GREATER_EQ
    ;

CP_CONTENT_LESS_EQ
    : LESS_EQ
    ;

CP_CONTENT_EQUAL_TO
    : EQUAL_TO
    ;

CP_CONTENT_NOT_EQUAL
    : NOT_EQUAL
    ;
CP_CONTENT_ARITHMETIC
    : Arithmetic
    ;
CP_CONTENT_WS
    : [ \t\r\n] -> channel(HIDDEN)
    ;



mode MUSTACHE;

CLOSE_MUSTACHE
    : '}}' -> popMode
    ;

MUSTACHE_FILTER
    : '|'
    ;

MUSTACHE_EUQALS
    : EQUALS
    ;

MUSTACHE_COLON
    : COLON
    ;

MUSTACHE_QUESTION_MARK
    : QUESTION_MARK
    ;

MUSTACHE_GREATER_THAN
    : GREATER_THAN
    ;

MUSTACHE_LESS_THAN
    : LESS_THAN
    ;

MUSTACHE_GREATER_EQ
    : GREATER_EQ
    ;

MUSTACHE_LESS_EQ
    : LESS_EQ
    ;

MUSTACHE_EQUAL_TO
    : EQUAL_TO
    ;

MUSTACHE_NOT_EQUAL
    : NOT_EQUAL
    ;

MUSTACHE_TRUE
    : TRUE
    ;

MUSTACHE_FALSE
    : FALSE
    ;

MUSTACHE_NULL
    : NULL
    ;

MUSTACHE_STRING
    : STRING4MUSTACHE
    ;

MUSTACHE_NUMBER
    : NUMBER
    ;

MUSTACHE_IDENTIFIER
    : IDENTIFIER
    ;

MUSTACHE_WS
    : (' '|'\t'|'\r'? '\n')+ -> channel(HIDDEN)
    ;

MUSTACHE_SEMI_COLON
    : ';'
    ;


MUSTACHE_COMMA
    : ','
    ;

MUSTACHE_OPEN_PAR
    : '('
    ;

MUSTACHE_CLOSE_PAR
    : ')'
    ;

MUSTACHE_OPEN_CURLY_BRACKETS
    : '{'
    ;

MUSTACHE_CLOSE_CURLY_BRACKETS
    : '}'
    ;

MUSTACHE_OPEN_BRACKETS
    : '['
    ;

MUSTACHE_CLOSE_BRACKETS
    : ']'
    ;

MUSTACHE_DOT
    : '.'
    ;

MUSTACHE_SINGLE_QUOTE
    : '\''
    ;


MUSTACHE_OR
    : '||'
    ;

MUSTACHE_AND
    : '&&'
    ;

MUSTACHE_NOT
    : '!'
    ;
MUSTAHCE_ARITHMETIC
    : Arithmetic
    ;
//MUSTACHE_IDENTIFIER // THIS TOKEN IS SPECIFIC TO MUSTACHE, EVEN THOUGH IT"S THE SAME AS IDENTIFIER
//    : [a-zA-Z_] [a-zA-Z_0-9]*
//    ;
//








