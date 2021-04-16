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
    : CP_APP CP_EQUALS CP_OPEN_DOUBLE_QUOTE appExpression CP_CONTENT_CLOSE_DOUBLE_QUOTE

    | CP_FOR CP_EQUALS CP_OPEN_DOUBLE_QUOTE forExpression CP_CONTENT_CLOSE_DOUBLE_QUOTE

    | CP_SHOW CP_EQUALS CP_OPEN_DOUBLE_QUOTE showHideExpression CP_CONTENT_CLOSE_DOUBLE_QUOTE
    | CP_HIDE CP_EQUALS CP_OPEN_DOUBLE_QUOTE showHideExpression CP_CONTENT_CLOSE_DOUBLE_QUOTE

    | CP_SWITCH CP_EQUALS CP_OPEN_DOUBLE_QUOTE switchExpression CP_CONTENT_CLOSE_DOUBLE_QUOTE
    | CP_SWITCH_CASE CP_EQUALS CP_OPEN_DOUBLE_QUOTE switchCaseExpression CP_CONTENT_CLOSE_DOUBLE_QUOTE
    | CP_SWITCH_DEF

    | CP_IF CP_EQUALS CP_OPEN_DOUBLE_QUOTE ifExpression CP_CONTENT_CLOSE_DOUBLE_QUOTE

    | CP_MODEL CP_EQUALS CP_OPEN_DOUBLE_QUOTE modelExpression CP_CONTENT_CLOSE_DOUBLE_QUOTE
//TODO check after @
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
        | oneLineArithCondithion
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

//for(true)
//for(i in "saher")
//for(i,j in a)
//for(i in a ; z = INDEX )
//(!a && b < c || c)
// FOR
forExpression
    : collection4For1 ( IN   collection4For2 (CP_CONTENT_SEMI_COLON collection4For1 CP_CONTENT_EQUALS INDEX)? )? //TODO check
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
    | CP_CONTENT_NUMBER (CP_CONTENT_ARITHMETIC collection4ARITHMETIC)?
    | subObj
    | objArray
    | array
    | functionCall
    | oneLine4For2Condition
    | oneLineArithCondithion
    ;
oneLine4For2Condition
: CP_CONTENT_OPEN_PAR (CP_CONTENT_NOT)? collection4oneLineCondition
( CP_CONTENT_AND (CP_CONTENT_NOT)? collection4oneLineCondition | CP_CONTENT_OR (CP_CONTENT_NOT)? collection4oneLineCondition)*
CP_CONTENT_QUESTION_MARK
collection4For2 CP_CONTENT_COLON
collection4For2 CP_CONTENT_CLOSE_PAR
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
: CP_CONTENT_OPEN_PAR (CP_CONTENT_NOT)? collection4oneLineCondition
( CP_CONTENT_AND (CP_CONTENT_NOT)? collection4oneLineCondition | CP_CONTENT_OR (CP_CONTENT_NOT)? collection4oneLineCondition)*
CP_CONTENT_QUESTION_MARK
collection4For3 CP_CONTENT_SEMI_COLON
collection4For3 CP_CONTENT_CLOSE_PAR
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
    | CP_CONTENT_NUMBER (CP_CONTENT_ARITHMETIC collection4ARITHMETIC)?
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

//<a cp-switch="c">
//
//<a1 cp-case="4">
//
//<a2 cp-default>
//</a>


// SWITCH
switchExpression
    : collection4Switch1
    ;

switchCaseExpression
    : collection4Switch1
    ;

collection4Switch1
    : variable
    | CP_CONTENT_STRING
    | CP_CONTENT_NUMBER (CP_CONTENT_ARITHMETIC collection4ARITHMETIC)?
    | objArray
    | subObj
    | oneLine4switch1
    | oneLineArithCondithion
    ;
oneLine4switch1
: CP_CONTENT_OPEN_PAR(CP_CONTENT_NOT)? collection4oneLineCondition
( CP_CONTENT_AND (CP_CONTENT_NOT)? collection4oneLineCondition | CP_CONTENT_OR (CP_CONTENT_NOT)? collection4oneLineCondition)*
CP_CONTENT_QUESTION_MARK
  collection4Switch1 CP_CONTENT_SEMI_COLON
  collection4Switch1 CP_CONTENT_CLOSE_PAR
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
        | oneLineArithCondithion
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
    : functionCall4AnnotOneLine
    | arrName arrayFuncRet4AnnotOneLine
    | obj propFuncRet4AnnotOneLine
    | oneLine4Annotation
    ;
oneLine4Annotation
: CP_CONTENT_OPEN_PAR (CP_CONTENT_NOT)? collection4oneLineCondition
( CP_CONTENT_AND (CP_CONTENT_NOT)? collection4oneLineCondition | CP_CONTENT_OR (CP_CONTENT_NOT)? collection4oneLineCondition)*
CP_CONTENT_QUESTION_MARK
  collection4Annotation CP_CONTENT_COLON
  collection4Annotation CP_CONTENT_CLOSE_PAR
;
//func()[1][2][2].b().a()
//f()()[]()
//f()()[].a
//f()().a()
//f()().a[]

functionCall4AnnotOneLine
    : functionName funcEndRet4AnnotOneLine
    ;
arrayFuncRet4AnnotOneLine
    : (CP_CONTENT_OPEN_BRACKETS  collection4ARITHMETIC  CP_CONTENT_CLOSE_BRACKETS)+ (propFuncRet4AnnotOneLine | funcEndRet4AnnotOneLine)
    ;
propFuncRet4AnnotOneLine
    : (CP_CONTENT_DOT propertyValue)+ (arrayFuncRet4AnnotOneLine | funcEndRet4AnnotOneLine)
    ;
funcEndRet4AnnotOneLine
    :(CP_CONTENT_OPEN_PAR parameters? CP_CONTENT_CLOSE_PAR)+ (arrayFuncRet4AnnotOneLine | propFuncRet4AnnotOneLine)?
    ;
//


// VARIABLE
variable
    : variableName (CP_CONTENT_ARITHMETIC collection4ARITHMETIC)?
    ;

variableName
    : CP_CONTENT_IDENTIFIER
    ;
//


// ARRAY
objArray
    : arrName arrayCalling (CP_CONTENT_ARITHMETIC collection4ARITHMETIC)?
    ;
arrName
    : CP_CONTENT_IDENTIFIER
    ;

arrayCalling
    : (CP_CONTENT_OPEN_BRACKETS  collection4ARITHMETIC CP_CONTENT_CLOSE_BRACKETS)+ (functionCallFromVar | property)?
    ;
array
    : CP_CONTENT_OPEN_BRACKETS collection4everything (CP_CONTENT_COMMA collection4everything)* CP_CONTENT_CLOSE_BRACKETS
    ;


//


// OBJECT
obj
    : CP_CONTENT_IDENTIFIER
    ;
subObj
    : CP_CONTENT_IDENTIFIER property (CP_CONTENT_ARITHMETIC collection4ARITHMETIC)?
    ;
objBody
    : CP_CONTENT_OPEN_CURLY_BRACKETS (pair (CP_CONTENT_COMMA pair)*)* CP_CONTENT_CLOSE_CURLY_BRACKETS
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
    : functionName functionCallFromVar (CP_CONTENT_ARITHMETIC collection4ARITHMETIC)?
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

// TODO add par to expr
// comparison
comparisonExpression
    : collection4comparison comparisonOperator collection4comparison
    ;
//(a < x)
//( !(a < (c < d ? 1 : 5) )  && a < b || c < d    ? 1 : 3)
oneLineCondition
: CP_CONTENT_OPEN_PAR (CP_CONTENT_NOT)? collection4oneLineCondition
( CP_CONTENT_AND (CP_CONTENT_NOT)? collection4oneLineCondition | CP_CONTENT_OR (CP_CONTENT_NOT)? collection4oneLineCondition)*
    CP_CONTENT_QUESTION_MARK collection4everything CP_CONTENT_COLON collection4everything CP_CONTENT_CLOSE_PAR
    ;

oneLineBoolCondition
: CP_CONTENT_OPEN_PAR (CP_CONTENT_NOT)? collection4oneLineCondition
( CP_CONTENT_AND (CP_CONTENT_NOT)? collection4oneLineCondition | CP_CONTENT_OR (CP_CONTENT_NOT)? collection4oneLineCondition)*
    CP_CONTENT_QUESTION_MARK CP_CONTENT_TRUE CP_CONTENT_COLON CP_CONTENT_FALSE CP_CONTENT_CLOSE_PAR
    ;
//v = (a < c ? 1 : 2) + a
//v = (a < c ? 1 : [1,2,3]) + a
oneLineArithCondithion
    : CP_CONTENT_OPEN_PAR (CP_CONTENT_NOT)? collection4oneLineCondition
         ( CP_CONTENT_AND (CP_CONTENT_NOT)? collection4oneLineCondition | CP_CONTENT_OR (CP_CONTENT_NOT)? collection4oneLineCondition)*
         CP_CONTENT_QUESTION_MARK
         collection4ARITHMETIC CP_CONTENT_COLON
         collection4ARITHMETIC CP_CONTENT_CLOSE_PAR
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
         | oneLineCondition
;
collection4oneLineCondition
         : variable
         | CP_CONTENT_TRUE
         | CP_CONTENT_FALSE
         | objArray
         | functionCall
         | subObj
         | comparisonExpression
    ;

//


value
    : CP_CONTENT_STRING
    | CP_CONTENT_NUMBER (CP_CONTENT_ARITHMETIC collection4ARITHMETIC)?
    | CP_CONTENT_TRUE
    | CP_CONTENT_FALSE
    | CP_CONTENT_NULL
    ;

collection4everything
        : variable
        | value
        | array
        | objArray
        | functionCall
        | subObj
        | oneLineCondition
        | oneLineArithCondithion
    ;
collection4ARITHMETIC
    : variable
    | CP_CONTENT_NUMBER (CP_CONTENT_ARITHMETIC collection4ARITHMETIC)?
    | objArray
    | functionCall
    | subObj
    | oneLineArithCondithion (CP_CONTENT_ARITHMETIC collection4ARITHMETIC)?
    ;
collection4boolRet
        : variable
        | CP_CONTENT_TRUE
        | CP_CONTENT_FALSE
        | objArray
        | functionCall
        | subObj
        | comparisonExpression
        | oneLineBoolCondition
    ;


 ///////////////////////// MUSTACHE /////////////////////////

mustacheExpression
    : OPEN_MUSTACHE collection4Mustache CLOSE_MUSTACHE
    | OPEN_MUSTACHE filter CLOSE_MUSTACHE
    ;

collection4Mustache
    : mustacheVariable
    | mustacheValue
    | objArray4Must
    | functionCall4Must
    | subObj4Must
    | oneLineCondition4Must
    | oneLineArithCondithion4Must
    ;

collection4OLCMust
    : mustacheVariable
    | MUSTACHE_TRUE
    | MUSTACHE_FALSE
    | objArray4Must
    | functionCall4Must
    | subObj4Must
    | comparisonExp4Must
    ;
collection4CompMust
    : mustacheVariable
    | MUSTACHE_NUMBER (MUSTAHCE_ARITHMETIC collection4MUSTARITHMETIC)?
    | MUSTACHE_STRING
    | objArray4Must
    | functionCall4Must
    | subObj4Must
    | oneLineCondition4Must
    ;

collection4MUSTARITHMETIC
    : mustacheVariable
    | MUSTACHE_NUMBER (MUSTAHCE_ARITHMETIC collection4MUSTARITHMETIC)?
    | objArray4Must
    | functionCall4Must
    | subObj4Must
    | oneLineArithCondithion4Must
    ;

// VAR
mustacheVariable
    : MUSTACHE_IDENTIFIER (MUSTAHCE_ARITHMETIC collection4MUSTARITHMETIC)?
    ;
//


// VALUE
mustacheValue
    : MUSTACHE_NUMBER (MUSTAHCE_ARITHMETIC collection4MUSTARITHMETIC)?
    | MUSTACHE_STRING
    | MUSTACHE_NULL
    | MUSTACHE_FALSE
    | MUSTACHE_TRUE
    ;
//


// ARRAY
objArray4Must
    : arrName4Must arrayCalling4Must (MUSTAHCE_ARITHMETIC collection4MUSTARITHMETIC)?
    ;
arrName4Must
    : MUSTACHE_IDENTIFIER
    ;
arrayCalling4Must
    : (MUSTACHE_OPEN_BRACKETS collection4MUSTARITHMETIC (MUSTAHCE_ARITHMETIC collection4MUSTARITHMETIC)?
    MUSTACHE_CLOSE_BRACKETS)+ (functionCallFromVar4Must | property4Must)?
    ;
//


// FUNCTION
functionCall4Must
    : functionName4Must functionCallFromVar4Must (MUSTAHCE_ARITHMETIC collection4MUSTARITHMETIC)?
    ;
functionCallFromVar4Must
    : (MUSTACHE_OPEN_PAR parameters4Must? MUSTACHE_CLOSE_PAR)+ (arrayCalling4Must | property4Must)?
    ;
functionName4Must
    : MUSTACHE_IDENTIFIER
    ;

parameters4Must
    : parameter4Must (MUSTACHE_COMMA parameter4Must)*
    ;

parameter4Must
    : collection4Mustache
    ;
//

// OBJECT
subObj4Must
    : MUSTACHE_IDENTIFIER property4Must (MUSTAHCE_ARITHMETIC collection4MUSTARITHMETIC)?
    ;
//


//PROPERTY
property4Must
: (MUSTACHE_DOT propertyValue4Must)+ (arrayCalling4Must | functionCallFromVar4Must)?
;

propertyValue4Must
    : MUSTACHE_IDENTIFIER
    ;
//

// COMPARISON
oneLineCondition4Must
    : MUSTACHE_OPEN_PAR(MUSTACHE_NOT)? collection4OLCMust
    ( MUSTACHE_AND (MUSTACHE_NOT)? collection4OLCMust | MUSTACHE_OR (MUSTACHE_NOT)? collection4OLCMust)*
    MUSTACHE_QUESTION_MARK collection4Mustache MUSTACHE_COLON collection4Mustache MUSTACHE_CLOSE_PAR
    ;
oneLineArithCondithion4Must
    : MUSTACHE_OPEN_PAR (MUSTACHE_NOT)? collection4OLCMust
         ( MUSTACHE_AND (MUSTACHE_NOT)? collection4OLCMust | MUSTACHE_OR (MUSTACHE_NOT)? collection4OLCMust)*
         MUSTACHE_QUESTION_MARK
         collection4MUSTARITHMETIC MUSTACHE_COLON
         collection4MUSTARITHMETIC MUSTACHE_CLOSE_PAR
    ;
comparisonExp4Must
    : collection4CompMust mustacheComparisonOperator collection4CompMust
    ;

mustacheComparisonOperator
    : MUSTACHE_GREATER_THAN
    | MUSTACHE_GREATER_EQ
    | MUSTACHE_LESS_THAN
    | MUSTACHE_LESS_EQ
    | MUSTACHE_EQUAL_TO
    | MUSTACHE_NOT_EQUAL
    ;
//


// FILTER
filter
    : modelName MUSTACHE_FILTER formatName (MUSTACHE_COLON collection4Mustache)?
    ;

modelName
    : MUSTACHE_IDENTIFIER
    ;

formatName
    : MUSTACHE_IDENTIFIER
    ;
//


//*****************************************************************************************************************


script
    : SCRIPT_OPEN ( SCRIPT_BODY | SCRIPT_SHORT_BODY)
    ;

style
    : STYLE_OPEN (STYLE_BODY | STYLE_SHORT_BODY)
    ;
