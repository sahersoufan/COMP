
parser grammar HTMLParser;

options { tokenVocab=HTMLLexer; }

htmlDocument
    : scriptletOrSeaWs* XML? scriptletOrSeaWs* DTD? scriptletOrSeaWs* htmlElements*
    ;

scriptletOrSeaWs
    : SCRIPTLET
    | SEA_WS
    ;

htmlElements
    : htmlMisc* htmlElement htmlMisc*
    ;

htmlElement
    : TAG_OPEN TAG_NAME htmlAttribute*
          (TAG_CLOSE (htmlContent TAG_OPEN TAG_SLASH TAG_NAME TAG_CLOSE)? | TAG_SLASH_CLOSE)
    | SCRIPTLET
    | script
    | style
    | mustacheExpression
    ;


htmlContent
    : htmlChardata? ((htmlElement | CDATA | htmlComment) htmlChardata?)*
    ;

                                   /* *********************************** */

htmlAttribute
    : CP_SWITCH_DEF
    | CP_APP CP_EQUALS CP_OPEN_DOUBLE_QUOTE appExpression CP_CONTENT_CLOSE_DOUBLE_QUOTE

    | CP_FOR CP_EQUALS CP_OPEN_DOUBLE_QUOTE forExpression CP_CONTENT_CLOSE_DOUBLE_QUOTE

    | CP_SHOW CP_EQUALS CP_OPEN_DOUBLE_QUOTE showHideExpression CP_CONTENT_CLOSE_DOUBLE_QUOTE
    | CP_HIDE CP_EQUALS CP_OPEN_DOUBLE_QUOTE showHideExpression CP_CONTENT_CLOSE_DOUBLE_QUOTE

    | CP_SWITCH CP_EQUALS CP_OPEN_DOUBLE_QUOTE switchExpression CP_CONTENT_CLOSE_DOUBLE_QUOTE
    | CP_SWITCH_CASE CP_EQUALS CP_OPEN_DOUBLE_QUOTE switchCaseExpression CP_CONTENT_CLOSE_DOUBLE_QUOTE

    | CP_IF CP_EQUALS CP_OPEN_DOUBLE_QUOTE ifExpression CP_CONTENT_CLOSE_DOUBLE_QUOTE

    | CP_MODEL CP_EQUALS CP_OPEN_DOUBLE_QUOTE modelExpression CP_CONTENT_CLOSE_DOUBLE_QUOTE

    | CP_CLICK CP_EQUALS CP_OPEN_DOUBLE_QUOTE annotationExpression CP_CONTENT_CLOSE_DOUBLE_QUOTE
    | CP_MOUSEOVER CP_EQUALS CP_OPEN_DOUBLE_QUOTE annotationExpression CP_CONTENT_CLOSE_DOUBLE_QUOTE
    //
    | TAG_NAME (TAG_EQUALS ATTVALUE_VALUE)?
    ;
                                 /* ************************************ */



htmlChardata
    : HTML_TEXT
    | SEA_WS
    ;

htmlMisc
    : htmlComment
    | SEA_WS
    ;

htmlComment
    : HTML_COMMENT
    | HTML_CONDITIONAL_COMMENT
    ;

mustacheExpression
    : OPEN_MUSTACHE mustacheVariable CLOSE_MUSTACHE
    | OPEN_MUSTACHE mustacheOneLineCondition CLOSE_MUSTACHE
    | OPEN_MUSTACHE filter CLOSE_MUSTACHE
    ;

// APP
appExpression
    : collection4everything
    | (CP_CONTENT_NOT)? collection4App2 ( CP_CONTENT_AND (CP_CONTENT_NOT)? collection4App2 | CP_CONTENT_OR (CP_CONTENT_NOT)? collection4App2)*
    ;
collection4App1
        : variable
        | value
        | array
        | objArray
        | functionCall
        | subObj
        | oneLineBoolCondition
    ;
collection4App2
        : variable
        | CP_CONTENT_TRUE
        | CP_CONTENT_FALSE
        | objArray
        | functionCall
        | subObj
        | comparisonExpression
        | oneLineBoolCondition
    ;

//


// FOR
forExpression
    : collection4For1 ( IN   collection4For2 (CP_CONTENT_SEMI_COLON collection4For1 CP_CONTENT_EQUALS INDEX)? )?
    | collection4For1 CP_CONTENT_COMMA collection4For1 IN collection4For3
    | collection4For5
    | (CP_CONTENT_NOT)? collection4For4 ( CP_CONTENT_AND (CP_CONTENT_NOT)? collection4For4 | CP_CONTENT_OR (CP_CONTENT_NOT)? collection4For4)*
    ;

collection4For1
    :variable
    |subObj
    |objArray
    ;
collection4For2
    : variable
    | CP_CONTENT_STRING
    | CP_CONTENT_NUMBER
    | subObj
    |objArray
    |array
    |oneLine4For2Condition
    ;
oneLine4For2Condition
: collection4oneLineCondition CP_CONTENT_QUESTION_MARK
(variable | subObj | objArray | array | CP_CONTENT_NUMBER | CP_CONTENT_STRING) CP_CONTENT_SEMI_COLON
(variable | subObj | objArray | array | CP_CONTENT_NUMBER | CP_CONTENT_STRING)
;
collection4For3
    :obj
    |objBody
    |subObj
    |objArray
    |functionCall
    |oneLine4For3Condition
    ;

oneLine4For3Condition
: collection4oneLineCondition CP_CONTENT_QUESTION_MARK
(obj | objBody | subObj | objArray | functionCall) CP_CONTENT_SEMI_COLON
(obj | objBody | subObj | objArray | functionCall)
;




collection4For4
    : variable
    | CP_CONTENT_TRUE
    | CP_CONTENT_FALSE
    | objArray
    | functionCall
    | subObj
    | comparisonExpression
    | oneLineBoolCondition
    ;
collection4For5
    : variable
    | CP_CONTENT_NUMBER
    | CP_CONTENT_TRUE
    | CP_CONTENT_FALSE
    | objArray
    | functionCall
    | subObj
    | comparisonExpression
    | oneLineBoolCondition
    ;
//


//SHOW
//HIDE
showHideExpression
    : (CP_CONTENT_NOT)? collection4ShowHide1 ( CP_CONTENT_AND (CP_CONTENT_NOT)? collection4ShowHide1 | CP_CONTENT_OR (CP_CONTENT_NOT)? collection4ShowHide1)*
    ;
collection4ShowHide1
        : variable
        | CP_CONTENT_TRUE
        | CP_CONTENT_FALSE
        | objArray
        | functionCall
        | subObj
        | comparisonExpression
        | oneLineBoolCondition
    ;
//


// SWITCH
switchExpression
    : collection4Switch1
    ;

switchCaseExpression
    : collection4Switch1
    ;

collection4Switch1
    :variable
    | CP_CONTENT_STRING
    | CP_CONTENT_NUMBER
    |objArray
    |subObj
    |oneLine4switch1
    ;
oneLine4switch1
: collection4oneLineCondition CP_CONTENT_QUESTION_MARK
  (variable | CP_CONTENT_STRING | CP_CONTENT_NUMBER | objArray | subObj) CP_CONTENT_SEMI_COLON
  (variable | CP_CONTENT_STRING | CP_CONTENT_NUMBER | objArray | subObj)
;
//


// IF
ifExpression
    : (CP_CONTENT_NOT)? collection4If ( CP_CONTENT_AND (CP_CONTENT_NOT)? collection4If | CP_CONTENT_OR (CP_CONTENT_NOT)? collection4If)*
    ;

collection4If
    : variable
    | CP_CONTETNT_TRUE
    | CP_CONTENT_FALSE
    | objArray
    | functionCall
    | subObj
    | comparisonExpression
    | oneLineBoolCondition
    ;
//


// MODEL
modelExpression
    : collection4Model1
    | (CP_CONTENT_NOT)? collection4Model2 ( CP_CONTENT_AND (CP_CONTENT_NOT)? collection4Model2 | CP_CONTENT_OR (CP_CONTENT_NOT)? collection4Model2)*
    ;
collection4Model1
        : variable
        | value
        | array
        | objArray
        | functionCall
        | subObj
        | oneLineBoolCondition
    ;
collection4Model2
        : variable
        | CP_CONTENT_TRUE
        | CP_CONTENT_FALSE
        | objArray
        | functionCall
        | subObj
        | comparisonExpression
        | oneLineBoolCondition
    ;
//


// ANNOTATION
annotationExpression
    : collection4Annotation
    ;
collection4Annotation
    :functionCall
    |objArray
    |subObj
    |oneLine4Annotation
    ;
oneLine4Annotation
: collection4oneLineCondition CP_CONTENT_QUESTION_MARK
  (arrName arrayFuncRet4AnnotOneLine | functionName functionCall4AnnotOneLine | obj propFuncRet4AnnotOneLine) CP_CONTENT_COLON
  (arrName arrayFuncRet4AnnotOneLine | functionName functionCall4AnnotOneLine | obj propFuncRet4AnnotOneLine)
;
functionCall4AnnotOneLine
    : funcEndRet4AnnotOneLine (arrayFuncRet4AnnotOneLine | propFuncRet4AnnotOneLine)?
    ;
bridgeFAP4AnnotOneLine
    : (ArrayFuncRet4AnnotOneLine | propFuncRet4AnnotOneLine)
    ;
arrayFuncRet4AnnotOneLine
    : (CP_CONTENT_OPEN_BRACKETS CP_CONTENT_NUMBER CP_CONTENT_CLOSE_BRACKETS)+
    funcEndRet4AnnotOneLine bridgeFAP4AnnotOneLine?
;
propFuncRet4AnnotOneLine
    : (CP_CONTENT_DOT propertyValue)+
    funcEndRet4AnnotOneLine bridgeFAP4AnnotOneLine?
    ;
funcEndRet4AnnotOneLine
:(CP_CONTENT_OPEN_PAR parameters? CP_CONTENT_CLOSE_PAR)+
;
//








// VARIABLE
variable
    : variableName
    ;

variableName
    : CP_CONTENT_IDENTIFIER
    ;
//


// ARRAY
objArray
    : arrName arrayCalling
    ;
arrName
    : CP_CONTENT_IDENTIFIER
    ;
array
    : CP_CONTENT_OPEN_BRACKETS (collection4everything (CP_CONTENT_COMMA value)*)* CP_CONTENT_CLOSE_BRACKETS
    ;
arrayCalling
    : (CP_CONTENT_OPEN_BRACKETS CP_CONTENT_NUMBER CP_CONTENT_CLOSE_BRACKETS)+ (functionCallFromVar | (property)?)?
    ;
//


// OBJECT
obj
    : CP_CONTENT_IDENTIFIER
    ;
subObj
    : CP_CONTENT_IDENTIFIER property
    ;
objBody
    : CP_CONTENT_OPEN_CURLY_BRACKETS (pair (CP_CONTENT_COMMA pair)*)* CP_CONTENT_CLOSE_CURLY_BRACKETS
    |
    ;
pair
    : key CP_CONTENT_COLON collection4everything
    ;
key
    : CP_CONTENT_IDENTIFIER
    ;
//


//PROPERTY
property
: (CP_CONTENT_DOT propertyValue)+ (arrayCalling | functionCallFromVar)?
;

propertyValue
    : CP_CONTENT_IDENTIFIER
    ;
//


//FUNCTION
functionCall
    : functionName functionCallFromVar
    ;
functionCallFromVar
    : (CP_CONTENT_OPEN_PAR parameters? CP_CONTENT_CLOSE_PAR)+ (arrayCalling | property)?
    ;
functionName
    : CP_CONTENT_IDENTIFIER
    ;

parameters
    : parameter (CP_CONTENT_COMMA parameter)*
    ;

parameter
    : collection4everything
    ;
//


// comparison
comparisonExpression
    : collection4comparison comparisonOperator collection4comparison
    ;
oneLineCondition
    : collection4oneLineCondition CP_CONTENT_QUESTION_MARK collection4everything CP_CONTENT_COLON collection4everything
    ;
oneLineBoolCondition
    : collection4oneLineCondition CP_CONTENT_QUESTION_MARK CP_CONTENT_TRUE CP_CONTENT_COLON CP_CONTENT_FALSE
    ;





comparisonOperator
    : CP_CONTENT_GREATER_THAN
    | CP_CONTENT_GREATER_EQ
    | CP_CONTENT_LESS_THAN
    | CP_CONTENT_LESS_EQ
    | CP_CONTENT_EQUAL_TO
    | CP_CONTENT_NOT_EQUAL
    ;
collection4comparison
         : variable
         | value
         | objArray
         | functionCall
         | subObj
;
collection4oneLineCondition
         : variable
         | value4bool
         | objArray
         | functionCall
         | subObj
         | comparisonExpression
    ;

//


value
    : CP_CONTENT_STRING
    | CP_CONTENT_NUMBER
    | CP_CONTENT_TRUE
    | CP_CONTENT_FALSE
    | CP_CONTENT_NULL
    ;
value4bool
    : CP_CONTENT_TRUE
    | CP_CONTENT_FALSE
    ;

collection4everything
        : variable
        | value
        | array
        | objArray
        | functionCall
        | subObj
        | oneLineCondition
    ;
collection4boolRet
        : variable
        | value4bool
        | objArray
        | functionCall
        | subObj
        | comparisonExpression
        | oneLineBoolCondition
    ;








//TODO everything in MUSTACHE
mustacheOneLineCondition
    :  mustacheComparisonExpression MUSTACHE_QUESTION_MARK ifTrue MUSTACHE_COLON ifFalse
    ;

mustacheComparisonExpression
    : mustacheVariable (mustacheComparisonOperator mustacheValue)?
    ;

mustacheVariable
    : MUSTACHE_IDENTIFIER
    ;

mustacheComparisonOperator
    : MUSTACHE_GREATER_THAN
    | MUSTACHE_GREATER_EQ
    | MUSTACHE_LESS_THAN
    | MUSTACHE_LESS_EQ
    | MUSTACHE_EQUAL_TO
    | MUSTACHE_NOT_EQUAL
    ;

mustacheValue
    : MUSTACHE_TRUE
    | MUSTACHE_FALSE
    | MUSTACHE_NULL
    | MUSTACHE_STRING
    | MUSTACHE_NUMBER
    ;




ifTrue
    : MUSTACHE_TRUE
    | MUSTACHE_FALSE
    | MUSTACHE_NULL
    | MUSTACHE_STRING
    | MUSTACHE_NUMBER
    ;

ifFalse
    : MUSTACHE_TRUE
    | MUSTACHE_FALSE
    | MUSTACHE_NULL
    | MUSTACHE_STRING
    | MUSTACHE_NUMBER
    ;






filter
    : modelName MUSTACHE_FILTER formatName (MUSTACHE_COLON formatType)?
    ;

modelName
    : MUSTACHE_IDENTIFIER
    ;

formatName
    : MUSTACHE_IDENTIFIER
    ;

formatType
    : MUSTACHE_STRING
    ;



//*****************************************************************************************************************


script
    : SCRIPT_OPEN ( SCRIPT_BODY | SCRIPT_SHORT_BODY)
    ;

style
    : STYLE_OPEN (STYLE_BODY | STYLE_SHORT_BODY)
    ;
