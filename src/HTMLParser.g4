
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
    //TODO everything for APP
    | CP_APP CP_EQUALS CP_OPEN_DOUBLE_QUOTE ashmExpression CP_CONTENT_CLOSE_DOUBLE_QUOTE
    ///TODO everything without boolean (true, false ..)
    | CP_FOR CP_EQUALS CP_OPEN_DOUBLE_QUOTE forExpression CP_CONTENT_CLOSE_DOUBLE_QUOTE
    //TODO every boolean just boolean
    | CP_SHOW CP_EQUALS CP_OPEN_DOUBLE_QUOTE ashmExpression CP_CONTENT_CLOSE_DOUBLE_QUOTE
    | CP_HIDE CP_EQUALS CP_OPEN_DOUBLE_QUOTE ashmExpression CP_CONTENT_CLOSE_DOUBLE_QUOTE
    //TODO just one symbol without array or objBody or function
    | CP_SWITCH CP_EQUALS CP_OPEN_DOUBLE_QUOTE switchExpression CP_CONTENT_CLOSE_DOUBLE_QUOTE
    | CP_SWITCH_CASE CP_EQUALS CP_OPEN_DOUBLE_QUOTE switchCaseExpression CP_CONTENT_CLOSE_DOUBLE_QUOTE
    //TODO everuthing without arraybody or objbody
    | CP_IF CP_EQUALS CP_OPEN_DOUBLE_QUOTE ifExpression CP_CONTENT_CLOSE_DOUBLE_QUOTE
    //TODO everything for MODEL
    | CP_MODEL CP_EQUALS CP_OPEN_DOUBLE_QUOTE ashmExpression CP_CONTENT_CLOSE_DOUBLE_QUOTE
    //TODO function or arrFunction or objFunction
    | CP_CLICK CP_EQUALS CP_OPEN_DOUBLE_QUOTE annotationExpression CP_CONTENT_CLOSE_DOUBLE_QUOTE
    | CP_MOUSEOVER CP_EQUALS CP_OPEN_DOUBLE_QUOTE annotationExpression CP_CONTENT_CLOSE_DOUBLE_QUOTE
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
    | OPEN_MUSTACHE oneLineCondition CLOSE_MUSTACHE
    | OPEN_MUSTACHE filter CLOSE_MUSTACHE
    ;


// TODO
//app show hide model -> ashm
ashmExpression
    : variable
    | value
    | objArray
    | functionCall
    //TODO pr
    // operty
    | objName CP_CONTENT_DOT property
    | (NOT)?Collection ( AND (NOT)? Collection| OR (NOT)? Collection)*

    ;


forExpression
    : variable ( IN   (variable | array | objArray ) (CP_CONTENT_SEMI_COLON variable CP_CONTENT_EQUALS INDEX)? )?
    | variable CP_CONTENT_COMMA variable IN (objName | objBody)
    ;

switchExpression
    : value
    | variable
    | objArray
    | objName CP_CONTENT_DOT property
    ;

switchCaseExpression
    : CP_CONTENT_STRING
    | CP_CONTENT_NUMBER
    ;

ifExpression
    : comparisonExpression
    | booleanExpression
    | variable
    | functionCall
    | objArray
    | objName CP_CONTENT_DOT property
    ;

annotationExpression
    : functionCall
    | objArray
    | variable
    ;









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
    : arrName (array)+ (CP_CONTENT_OPEN_PAR parameters? CP_CONTENT_CLOSE_PAR)? (CP_CONTENT_DOT property)?
    ;

arrName
    : CP_CONTENT_IDENTIFIER
    ;
array
    : CP_CONTENT_OPEN_BRACKETS value (CP_CONTENT_COMMA value)* CP_CONTENT_CLOSE_BRACKETS
    | CP_CONTENT_OPEN_BRACKETS CP_CONTENT_CLOSE_BRACKETS
    ;
//


// OBJECT
objName
    : CP_CONTENT_IDENTIFIER
    ;
objBody
    : CP_CONTENT_OPEN_CURLY_BRACKETS (pair (CP_CONTENT_COMMA pair)*)* CP_CONTENT_CLOSE_CURLY_BRACKETS
    ;
pair
// TODO collection
    : key CP_CONTENT_COLON value
    ;
key
    : CP_CONTENT_IDENTIFIER
    ;
//

//PROPERTY
property
: CP_CONTENT_DOT propertyValue
;

propertyValue
    : CP_CONTENT_IDENTIFIER (property)?
    ;
//


//FUNCTION
//TODO function need more than this
functionCall
    : functionName CP_CONTENT_OPEN_PAR parameters? CP_CONTENT_CLOSE_PAR
    ;

functionName
    : CP_CONTENT_IDENTIFIER
    ;

parameters
    : parameter (CP_CONTENT_COMMA parameter)*
    ;

parameter
    : (NOT)? Collection ( AND (NOT)? Collection| OR (NOT)? Collection)*
    ;
//



comparisonExpression
    : (variable | value) comparisonOperator (value | variable)
    | objName CP_CONTENT_DOT property comparisonOperator (value | variable)
    ;

//TODO check this
booleanExpression
    : booleanOperator? variable booleanOperator (value | booleanOperator? variable)
    | objName CP_CONTENT_DOT property booleanOperator (value | variable)
    ;

comparisonOperator
    : CP_CONTENT_GREATER_THAN
    | CP_CONTENT_GREATER_EQ
    | CP_CONTENT_LESS_THAN
    | CP_CONTENT_LESS_EQ
    | CP_CONTENT_EQUAL_TO
    | CP_CONTENT_NOT_EQUAL
    ;

booleanOperator
    : CP_CONTENT_OR
    | CP_CONTENT_AND
    | CP_CONTENT_NOT
    ;


//TODO add it to many things
oneLineCondition
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


////////////////////
value
    : CP_CONTENT_STRING
    | CP_CONTENT_NUMBER
    | objBody
    | array
    | CP_CONTENT_TRUE
    | CP_CONTENT_FALSE
    | CP_CONTENT_NULL
    ;
///////////////////

    // 6/4/2021
collection
        : variable
        | value
        | array
        | objArray
        | functionCall
        | objName (CP_CONTENT_DOT property)+
    ;

//*****************************************************************************************************************


script
    : SCRIPT_OPEN ( SCRIPT_BODY | SCRIPT_SHORT_BODY)
    ;

style
    : STYLE_OPEN (STYLE_BODY | STYLE_SHORT_BODY)
    ;
