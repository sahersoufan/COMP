// Generated from E:/forth year/COMP/src\HTMLParser.g4 by ANTLR 4.8
package generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HTMLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HTMLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlDocument(HTMLParser.HtmlDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptletOrSeaWs(HTMLParser.ScriptletOrSeaWsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElements(HTMLParser.HtmlElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(HTMLParser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(HTMLParser.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttribute(HTMLParser.HtmlAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlChardata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlChardata(HTMLParser.HtmlChardataContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlMisc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlMisc(HTMLParser.HtmlMiscContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlComment(HTMLParser.HtmlCommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#mustacheExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMustacheExpression(HTMLParser.MustacheExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#ashmExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAshmExpression(HTMLParser.AshmExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#forExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForExpression(HTMLParser.ForExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#switchExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchExpression(HTMLParser.SwitchExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#switchCaseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchCaseExpression(HTMLParser.SwitchCaseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#ifExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpression(HTMLParser.IfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#annotationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationExpression(HTMLParser.AnnotationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(HTMLParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#variableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableName(HTMLParser.VariableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#objName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjName(HTMLParser.ObjNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#objBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjBody(HTMLParser.ObjBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#objArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjArray(HTMLParser.ObjArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#arrName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrName(HTMLParser.ArrNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(HTMLParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(HTMLParser.PairContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey(HTMLParser.KeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(HTMLParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(HTMLParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(HTMLParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(HTMLParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(HTMLParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#parameterName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterName(HTMLParser.ParameterNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#comparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(HTMLParser.ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpression(HTMLParser.BooleanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(HTMLParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#booleanOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanOperator(HTMLParser.BooleanOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(HTMLParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#oneLineCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOneLineCondition(HTMLParser.OneLineConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#mustacheComparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMustacheComparisonExpression(HTMLParser.MustacheComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#mustacheVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMustacheVariable(HTMLParser.MustacheVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#mustacheComparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMustacheComparisonOperator(HTMLParser.MustacheComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#mustacheValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMustacheValue(HTMLParser.MustacheValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#ifTrue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfTrue(HTMLParser.IfTrueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#ifFalse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfFalse(HTMLParser.IfFalseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter(HTMLParser.FilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#modelName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModelName(HTMLParser.ModelNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#formatName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormatName(HTMLParser.FormatNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#formatType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormatType(HTMLParser.FormatTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(HTMLParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#style}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyle(HTMLParser.StyleContext ctx);
}