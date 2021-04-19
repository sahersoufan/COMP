// Generated from E:/forth year/COMP/src\HTMLParser.g4 by ANTLR 4.8
package old.generatedback;
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
	 * Enter a parse tree produced by {@link HTMLParser#ashmExpression}.
	 * @param ctx the parse tree
	 */
	void enterAshmExpression(HTMLParser.AshmExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#ashmExpression}.
	 * @param ctx the parse tree
	 */
	void exitAshmExpression(HTMLParser.AshmExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link HTMLParser#objName}.
	 * @param ctx the parse tree
	 */
	void enterObjName(HTMLParser.ObjNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#objName}.
	 * @param ctx the parse tree
	 */
	void exitObjName(HTMLParser.ObjNameContext ctx);
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
	 * Enter a parse tree produced by {@link HTMLParser#parameterName}.
	 * @param ctx the parse tree
	 */
	void enterParameterName(HTMLParser.ParameterNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#parameterName}.
	 * @param ctx the parse tree
	 */
	void exitParameterName(HTMLParser.ParameterNameContext ctx);
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
	 * Enter a parse tree produced by {@link HTMLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpression(HTMLParser.BooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpression(HTMLParser.BooleanExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link HTMLParser#booleanOperator}.
	 * @param ctx the parse tree
	 */
	void enterBooleanOperator(HTMLParser.BooleanOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#booleanOperator}.
	 * @param ctx the parse tree
	 */
	void exitBooleanOperator(HTMLParser.BooleanOperatorContext ctx);
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
	 * Enter a parse tree produced by {@link HTMLParser#mustacheComparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterMustacheComparisonExpression(HTMLParser.MustacheComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#mustacheComparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitMustacheComparisonExpression(HTMLParser.MustacheComparisonExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link HTMLParser#ifTrue}.
	 * @param ctx the parse tree
	 */
	void enterIfTrue(HTMLParser.IfTrueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#ifTrue}.
	 * @param ctx the parse tree
	 */
	void exitIfTrue(HTMLParser.IfTrueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#ifFalse}.
	 * @param ctx the parse tree
	 */
	void enterIfFalse(HTMLParser.IfFalseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#ifFalse}.
	 * @param ctx the parse tree
	 */
	void exitIfFalse(HTMLParser.IfFalseContext ctx);
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
	 * Enter a parse tree produced by {@link HTMLParser#formatType}.
	 * @param ctx the parse tree
	 */
	void enterFormatType(HTMLParser.FormatTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#formatType}.
	 * @param ctx the parse tree
	 */
	void exitFormatType(HTMLParser.FormatTypeContext ctx);
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