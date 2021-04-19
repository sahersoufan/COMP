// Generated from E:/forth year/1/COMP/gen\HTMLParser.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HTMLParser}.
 */
public interface HTMLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void enterHtmlDocument(HTMLParser.HtmlDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void exitHtmlDocument(HTMLParser.HtmlDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 */
	void enterScriptletOrSeaWs(HTMLParser.ScriptletOrSeaWsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 */
	void exitScriptletOrSeaWs(HTMLParser.ScriptletOrSeaWsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElements(HTMLParser.HtmlElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElements(HTMLParser.HtmlElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(HTMLParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(HTMLParser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(HTMLParser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(HTMLParser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute(HTMLParser.HtmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute(HTMLParser.HtmlAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void enterHtmlChardata(HTMLParser.HtmlChardataContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void exitHtmlChardata(HTMLParser.HtmlChardataContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void enterHtmlMisc(HTMLParser.HtmlMiscContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void exitHtmlMisc(HTMLParser.HtmlMiscContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void enterHtmlComment(HTMLParser.HtmlCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void exitHtmlComment(HTMLParser.HtmlCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#appExpression}.
	 * @param ctx the parse tree
	 */
	void enterAppExpression(HTMLParser.AppExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#appExpression}.
	 * @param ctx the parse tree
	 */
	void exitAppExpression(HTMLParser.AppExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#collection4App1}.
	 * @param ctx the parse tree
	 */
	void enterCollection4App1(HTMLParser.Collection4App1Context ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#collection4App1}.
	 * @param ctx the parse tree
	 */
	void exitCollection4App1(HTMLParser.Collection4App1Context ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#collection4App2}.
	 * @param ctx the parse tree
	 */
	void enterCollection4App2(HTMLParser.Collection4App2Context ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#collection4App2}.
	 * @param ctx the parse tree
	 */
	void exitCollection4App2(HTMLParser.Collection4App2Context ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void enterForExpression(HTMLParser.ForExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void exitForExpression(HTMLParser.ForExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#collection4For1}.
	 * @param ctx the parse tree
	 */
	void enterCollection4For1(HTMLParser.Collection4For1Context ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#collection4For1}.
	 * @param ctx the parse tree
	 */
	void exitCollection4For1(HTMLParser.Collection4For1Context ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#collection4For2}.
	 * @param ctx the parse tree
	 */
	void enterCollection4For2(HTMLParser.Collection4For2Context ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#collection4For2}.
	 * @param ctx the parse tree
	 */
	void exitCollection4For2(HTMLParser.Collection4For2Context ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#oneLine4For2Condition}.
	 * @param ctx the parse tree
	 */
	void enterOneLine4For2Condition(HTMLParser.OneLine4For2ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#oneLine4For2Condition}.
	 * @param ctx the parse tree
	 */
	void exitOneLine4For2Condition(HTMLParser.OneLine4For2ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#collection4For3}.
	 * @param ctx the parse tree
	 */
	void enterCollection4For3(HTMLParser.Collection4For3Context ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#collection4For3}.
	 * @param ctx the parse tree
	 */
	void exitCollection4For3(HTMLParser.Collection4For3Context ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#oneLine4For3Condition}.
	 * @param ctx the parse tree
	 */
	void enterOneLine4For3Condition(HTMLParser.OneLine4For3ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#oneLine4For3Condition}.
	 * @param ctx the parse tree
	 */
	void exitOneLine4For3Condition(HTMLParser.OneLine4For3ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#collection4For4}.
	 * @param ctx the parse tree
	 */
	void enterCollection4For4(HTMLParser.Collection4For4Context ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#collection4For4}.
	 * @param ctx the parse tree
	 */
	void exitCollection4For4(HTMLParser.Collection4For4Context ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#collection4For5}.
	 * @param ctx the parse tree
	 */
	void enterCollection4For5(HTMLParser.Collection4For5Context ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#collection4For5}.
	 * @param ctx the parse tree
	 */
	void exitCollection4For5(HTMLParser.Collection4For5Context ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#showHideExpression}.
	 * @param ctx the parse tree
	 */
	void enterShowHideExpression(HTMLParser.ShowHideExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#showHideExpression}.
	 * @param ctx the parse tree
	 */
	void exitShowHideExpression(HTMLParser.ShowHideExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#collection4ShowHide1}.
	 * @param ctx the parse tree
	 */
	void enterCollection4ShowHide1(HTMLParser.Collection4ShowHide1Context ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#collection4ShowHide1}.
	 * @param ctx the parse tree
	 */
	void exitCollection4ShowHide1(HTMLParser.Collection4ShowHide1Context ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#switchExpression}.
	 * @param ctx the parse tree
	 */
	void enterSwitchExpression(HTMLParser.SwitchExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#switchExpression}.
	 * @param ctx the parse tree
	 */
	void exitSwitchExpression(HTMLParser.SwitchExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#switchCaseExpression}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCaseExpression(HTMLParser.SwitchCaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#switchCaseExpression}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCaseExpression(HTMLParser.SwitchCaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#collection4Switch1}.
	 * @param ctx the parse tree
	 */
	void enterCollection4Switch1(HTMLParser.Collection4Switch1Context ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#collection4Switch1}.
	 * @param ctx the parse tree
	 */
	void exitCollection4Switch1(HTMLParser.Collection4Switch1Context ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#oneLine4switch1}.
	 * @param ctx the parse tree
	 */
	void enterOneLine4switch1(HTMLParser.OneLine4switch1Context ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#oneLine4switch1}.
	 * @param ctx the parse tree
	 */
	void exitOneLine4switch1(HTMLParser.OneLine4switch1Context ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#ifExpression}.
	 * @param ctx the parse tree
	 */
	void enterIfExpression(HTMLParser.IfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#ifExpression}.
	 * @param ctx the parse tree
	 */
	void exitIfExpression(HTMLParser.IfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#collection4If}.
	 * @param ctx the parse tree
	 */
	void enterCollection4If(HTMLParser.Collection4IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#collection4If}.
	 * @param ctx the parse tree
	 */
	void exitCollection4If(HTMLParser.Collection4IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#modelExpression}.
	 * @param ctx the parse tree
	 */
	void enterModelExpression(HTMLParser.ModelExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#modelExpression}.
	 * @param ctx the parse tree
	 */
	void exitModelExpression(HTMLParser.ModelExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#collection4Model1}.
	 * @param ctx the parse tree
	 */
	void enterCollection4Model1(HTMLParser.Collection4Model1Context ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#collection4Model1}.
	 * @param ctx the parse tree
	 */
	void exitCollection4Model1(HTMLParser.Collection4Model1Context ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#collection4Model2}.
	 * @param ctx the parse tree
	 */
	void enterCollection4Model2(HTMLParser.Collection4Model2Context ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#collection4Model2}.
	 * @param ctx the parse tree
	 */
	void exitCollection4Model2(HTMLParser.Collection4Model2Context ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#annotationExpression}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationExpression(HTMLParser.AnnotationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#annotationExpression}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationExpression(HTMLParser.AnnotationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#collection4Annotation}.
	 * @param ctx the parse tree
	 */
	void enterCollection4Annotation(HTMLParser.Collection4AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#collection4Annotation}.
	 * @param ctx the parse tree
	 */
	void exitCollection4Annotation(HTMLParser.Collection4AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#oneLine4Annotation}.
	 * @param ctx the parse tree
	 */
	void enterOneLine4Annotation(HTMLParser.OneLine4AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#oneLine4Annotation}.
	 * @param ctx the parse tree
	 */
	void exitOneLine4Annotation(HTMLParser.OneLine4AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#functionCall4AnnotOneLine}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall4AnnotOneLine(HTMLParser.FunctionCall4AnnotOneLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#functionCall4AnnotOneLine}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall4AnnotOneLine(HTMLParser.FunctionCall4AnnotOneLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#arrayFuncRet4AnnotOneLine}.
	 * @param ctx the parse tree
	 */
	void enterArrayFuncRet4AnnotOneLine(HTMLParser.ArrayFuncRet4AnnotOneLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#arrayFuncRet4AnnotOneLine}.
	 * @param ctx the parse tree
	 */
	void exitArrayFuncRet4AnnotOneLine(HTMLParser.ArrayFuncRet4AnnotOneLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#propFuncRet4AnnotOneLine}.
	 * @param ctx the parse tree
	 */
	void enterPropFuncRet4AnnotOneLine(HTMLParser.PropFuncRet4AnnotOneLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#propFuncRet4AnnotOneLine}.
	 * @param ctx the parse tree
	 */
	void exitPropFuncRet4AnnotOneLine(HTMLParser.PropFuncRet4AnnotOneLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#funcEndRet4AnnotOneLine}.
	 * @param ctx the parse tree
	 */
	void enterFuncEndRet4AnnotOneLine(HTMLParser.FuncEndRet4AnnotOneLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#funcEndRet4AnnotOneLine}.
	 * @param ctx the parse tree
	 */
	void exitFuncEndRet4AnnotOneLine(HTMLParser.FuncEndRet4AnnotOneLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(HTMLParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(HTMLParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(HTMLParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(HTMLParser.VariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#objArray}.
	 * @param ctx the parse tree
	 */
	void enterObjArray(HTMLParser.ObjArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#objArray}.
	 * @param ctx the parse tree
	 */
	void exitObjArray(HTMLParser.ObjArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#arrName}.
	 * @param ctx the parse tree
	 */
	void enterArrName(HTMLParser.ArrNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#arrName}.
	 * @param ctx the parse tree
	 */
	void exitArrName(HTMLParser.ArrNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#arrayCalling}.
	 * @param ctx the parse tree
	 */
	void enterArrayCalling(HTMLParser.ArrayCallingContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#arrayCalling}.
	 * @param ctx the parse tree
	 */
	void exitArrayCalling(HTMLParser.ArrayCallingContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(HTMLParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(HTMLParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#obj}.
	 * @param ctx the parse tree
	 */
	void enterObj(HTMLParser.ObjContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#obj}.
	 * @param ctx the parse tree
	 */
	void exitObj(HTMLParser.ObjContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#subObj}.
	 * @param ctx the parse tree
	 */
	void enterSubObj(HTMLParser.SubObjContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#subObj}.
	 * @param ctx the parse tree
	 */
	void exitSubObj(HTMLParser.SubObjContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#objBody}.
	 * @param ctx the parse tree
	 */
	void enterObjBody(HTMLParser.ObjBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#objBody}.
	 * @param ctx the parse tree
	 */
	void exitObjBody(HTMLParser.ObjBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(HTMLParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(HTMLParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(HTMLParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(HTMLParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(HTMLParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(HTMLParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#propertyValue}.
	 * @param ctx the parse tree
	 */
	void enterPropertyValue(HTMLParser.PropertyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#propertyValue}.
	 * @param ctx the parse tree
	 */
	void exitPropertyValue(HTMLParser.PropertyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(HTMLParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(HTMLParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#functionCallFromVar}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallFromVar(HTMLParser.FunctionCallFromVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#functionCallFromVar}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallFromVar(HTMLParser.FunctionCallFromVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(HTMLParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(HTMLParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(HTMLParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(HTMLParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(HTMLParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(HTMLParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(HTMLParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(HTMLParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#oneLineCondition}.
	 * @param ctx the parse tree
	 */
	void enterOneLineCondition(HTMLParser.OneLineConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#oneLineCondition}.
	 * @param ctx the parse tree
	 */
	void exitOneLineCondition(HTMLParser.OneLineConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#oneLineBoolCondition}.
	 * @param ctx the parse tree
	 */
	void enterOneLineBoolCondition(HTMLParser.OneLineBoolConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#oneLineBoolCondition}.
	 * @param ctx the parse tree
	 */
	void exitOneLineBoolCondition(HTMLParser.OneLineBoolConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#oneLineArithCondithion}.
	 * @param ctx the parse tree
	 */
	void enterOneLineArithCondithion(HTMLParser.OneLineArithCondithionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#oneLineArithCondithion}.
	 * @param ctx the parse tree
	 */
	void exitOneLineArithCondithion(HTMLParser.OneLineArithCondithionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(HTMLParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(HTMLParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#collection4comparison}.
	 * @param ctx the parse tree
	 */
	void enterCollection4comparison(HTMLParser.Collection4comparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#collection4comparison}.
	 * @param ctx the parse tree
	 */
	void exitCollection4comparison(HTMLParser.Collection4comparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#collection4oneLineCondition}.
	 * @param ctx the parse tree
	 */
	void enterCollection4oneLineCondition(HTMLParser.Collection4oneLineConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#collection4oneLineCondition}.
	 * @param ctx the parse tree
	 */
	void exitCollection4oneLineCondition(HTMLParser.Collection4oneLineConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(HTMLParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(HTMLParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#collection4everything}.
	 * @param ctx the parse tree
	 */
	void enterCollection4everything(HTMLParser.Collection4everythingContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#collection4everything}.
	 * @param ctx the parse tree
	 */
	void exitCollection4everything(HTMLParser.Collection4everythingContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#collection4ARITHMETIC}.
	 * @param ctx the parse tree
	 */
	void enterCollection4ARITHMETIC(HTMLParser.Collection4ARITHMETICContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#collection4ARITHMETIC}.
	 * @param ctx the parse tree
	 */
	void exitCollection4ARITHMETIC(HTMLParser.Collection4ARITHMETICContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#collection4boolRet}.
	 * @param ctx the parse tree
	 */
	void enterCollection4boolRet(HTMLParser.Collection4boolRetContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#collection4boolRet}.
	 * @param ctx the parse tree
	 */
	void exitCollection4boolRet(HTMLParser.Collection4boolRetContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#mustacheExpression}.
	 * @param ctx the parse tree
	 */
	void enterMustacheExpression(HTMLParser.MustacheExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#mustacheExpression}.
	 * @param ctx the parse tree
	 */
	void exitMustacheExpression(HTMLParser.MustacheExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#collection4Mustache}.
	 * @param ctx the parse tree
	 */
	void enterCollection4Mustache(HTMLParser.Collection4MustacheContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#collection4Mustache}.
	 * @param ctx the parse tree
	 */
	void exitCollection4Mustache(HTMLParser.Collection4MustacheContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#collection4OLCMust}.
	 * @param ctx the parse tree
	 */
	void enterCollection4OLCMust(HTMLParser.Collection4OLCMustContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#collection4OLCMust}.
	 * @param ctx the parse tree
	 */
	void exitCollection4OLCMust(HTMLParser.Collection4OLCMustContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#collection4CompMust}.
	 * @param ctx the parse tree
	 */
	void enterCollection4CompMust(HTMLParser.Collection4CompMustContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#collection4CompMust}.
	 * @param ctx the parse tree
	 */
	void exitCollection4CompMust(HTMLParser.Collection4CompMustContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#collection4MUSTARITHMETIC}.
	 * @param ctx the parse tree
	 */
	void enterCollection4MUSTARITHMETIC(HTMLParser.Collection4MUSTARITHMETICContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#collection4MUSTARITHMETIC}.
	 * @param ctx the parse tree
	 */
	void exitCollection4MUSTARITHMETIC(HTMLParser.Collection4MUSTARITHMETICContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#mustacheVariable}.
	 * @param ctx the parse tree
	 */
	void enterMustacheVariable(HTMLParser.MustacheVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#mustacheVariable}.
	 * @param ctx the parse tree
	 */
	void exitMustacheVariable(HTMLParser.MustacheVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#mustacheValue}.
	 * @param ctx the parse tree
	 */
	void enterMustacheValue(HTMLParser.MustacheValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#mustacheValue}.
	 * @param ctx the parse tree
	 */
	void exitMustacheValue(HTMLParser.MustacheValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#objArray4Must}.
	 * @param ctx the parse tree
	 */
	void enterObjArray4Must(HTMLParser.ObjArray4MustContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#objArray4Must}.
	 * @param ctx the parse tree
	 */
	void exitObjArray4Must(HTMLParser.ObjArray4MustContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#arrName4Must}.
	 * @param ctx the parse tree
	 */
	void enterArrName4Must(HTMLParser.ArrName4MustContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#arrName4Must}.
	 * @param ctx the parse tree
	 */
	void exitArrName4Must(HTMLParser.ArrName4MustContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#arrayCalling4Must}.
	 * @param ctx the parse tree
	 */
	void enterArrayCalling4Must(HTMLParser.ArrayCalling4MustContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#arrayCalling4Must}.
	 * @param ctx the parse tree
	 */
	void exitArrayCalling4Must(HTMLParser.ArrayCalling4MustContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#functionCall4Must}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall4Must(HTMLParser.FunctionCall4MustContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#functionCall4Must}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall4Must(HTMLParser.FunctionCall4MustContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#functionCallFromVar4Must}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallFromVar4Must(HTMLParser.FunctionCallFromVar4MustContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#functionCallFromVar4Must}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallFromVar4Must(HTMLParser.FunctionCallFromVar4MustContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#functionName4Must}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName4Must(HTMLParser.FunctionName4MustContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#functionName4Must}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName4Must(HTMLParser.FunctionName4MustContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#parameters4Must}.
	 * @param ctx the parse tree
	 */
	void enterParameters4Must(HTMLParser.Parameters4MustContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#parameters4Must}.
	 * @param ctx the parse tree
	 */
	void exitParameters4Must(HTMLParser.Parameters4MustContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#parameter4Must}.
	 * @param ctx the parse tree
	 */
	void enterParameter4Must(HTMLParser.Parameter4MustContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#parameter4Must}.
	 * @param ctx the parse tree
	 */
	void exitParameter4Must(HTMLParser.Parameter4MustContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#subObj4Must}.
	 * @param ctx the parse tree
	 */
	void enterSubObj4Must(HTMLParser.SubObj4MustContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#subObj4Must}.
	 * @param ctx the parse tree
	 */
	void exitSubObj4Must(HTMLParser.SubObj4MustContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#property4Must}.
	 * @param ctx the parse tree
	 */
	void enterProperty4Must(HTMLParser.Property4MustContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#property4Must}.
	 * @param ctx the parse tree
	 */
	void exitProperty4Must(HTMLParser.Property4MustContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#propertyValue4Must}.
	 * @param ctx the parse tree
	 */
	void enterPropertyValue4Must(HTMLParser.PropertyValue4MustContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#propertyValue4Must}.
	 * @param ctx the parse tree
	 */
	void exitPropertyValue4Must(HTMLParser.PropertyValue4MustContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#oneLineCondition4Must}.
	 * @param ctx the parse tree
	 */
	void enterOneLineCondition4Must(HTMLParser.OneLineCondition4MustContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#oneLineCondition4Must}.
	 * @param ctx the parse tree
	 */
	void exitOneLineCondition4Must(HTMLParser.OneLineCondition4MustContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#oneLineArithCondithion4Must}.
	 * @param ctx the parse tree
	 */
	void enterOneLineArithCondithion4Must(HTMLParser.OneLineArithCondithion4MustContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#oneLineArithCondithion4Must}.
	 * @param ctx the parse tree
	 */
	void exitOneLineArithCondithion4Must(HTMLParser.OneLineArithCondithion4MustContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#comparisonExp4Must}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExp4Must(HTMLParser.ComparisonExp4MustContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#comparisonExp4Must}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExp4Must(HTMLParser.ComparisonExp4MustContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#mustacheComparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterMustacheComparisonOperator(HTMLParser.MustacheComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#mustacheComparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitMustacheComparisonOperator(HTMLParser.MustacheComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter(HTMLParser.FilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter(HTMLParser.FilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#modelName}.
	 * @param ctx the parse tree
	 */
	void enterModelName(HTMLParser.ModelNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#modelName}.
	 * @param ctx the parse tree
	 */
	void exitModelName(HTMLParser.ModelNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#formatName}.
	 * @param ctx the parse tree
	 */
	void enterFormatName(HTMLParser.FormatNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#formatName}.
	 * @param ctx the parse tree
	 */
	void exitFormatName(HTMLParser.FormatNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(HTMLParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(HTMLParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#style}.
	 * @param ctx the parse tree
	 */
	void enterStyle(HTMLParser.StyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#style}.
	 * @param ctx the parse tree
	 */
	void exitStyle(HTMLParser.StyleContext ctx);
}