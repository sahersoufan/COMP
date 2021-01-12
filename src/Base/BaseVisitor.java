package Base;

import AST.Elements.ElementsNodes.Expression.AppExpression;
import AST.Elements.ElementsNodes.Expression.ForExpression;
import AST.Elements.ElementsNodes.HtmlAttribute;
import AST.Elements.ElementsNodes.Miscallenous.LiteralValue;
import AST.Elements.ElementsNodes.MustacheExpression.*;
import AST.Elements.HtmlElement;
import AST.Elements.HtmlElements;
import AST.HtmlDocument;
import generated.HTMLParser;
import generated.HTMLParserBaseVisitor;
import org.w3c.dom.html.HTMLAreaElement;

import java.util.ArrayList;
import java.util.List;

public class BaseVisitor extends HTMLParserBaseVisitor {

    // SAHER WORK //

    // MUSTACHE
    @Override
    public Object visitMustacheExpression(HTMLParser.MustacheExpressionContext ctx) {
        System.out.println("visit MustacheExpression");
        MustacheExpression Mus = new MustacheExpression();

        if(ctx.mustacheVariable() != null){
            Mus.setMustahceVariable(ctx.mustacheVariable().getText());
        }

        if(ctx.oneLineCondition() != null){
            Mus.setOneLineCondition((OneLineCondition) visitOneLineCondition(ctx.oneLineCondition()));
        }

        if(ctx.filter() != null){
            Mus.setMustacheFilter((MustacheFilter) visitFilter(ctx.filter()));
        }


        return super.visitMustacheExpression(ctx);
    }

    //ONE LINE CONDITION
    @Override
    public Object visitOneLineCondition(HTMLParser.OneLineConditionContext ctx) {
        System.out.println("visits OneLineCondition");
        OneLineCondition OLC = new OneLineCondition();

        if(ctx.mustacheComparisonExpression() != null){
            OLC.setMustacheComparisonExpression((MustacheComparisonExpression) visitMustacheComparisonExpression(ctx.mustacheComparisonExpression()));
        }

        if(ctx.ifTrue() != null){
            OLC.setIfTrueStmt((IfTrue) visitIfTrue(ctx.ifTrue()));
        }

        if(ctx.ifFalse() != null){
            OLC.setIfFalseStmt((IfFalse) visitIfFalse(ctx.ifFalse()));
        }

        return super.visitOneLineCondition(ctx);
    }

    @Override
    public Object visitMustacheComparisonExpression(HTMLParser.MustacheComparisonExpressionContext ctx) {
        System.out.println("visit MustacheComparisonExpression");
        MustacheComparisonExpression MCE = new MustacheComparisonExpression();

        if(ctx.mustacheVariable() != null){
            MCE.setVariable((String) ctx.mustacheVariable().getText());
        }

        if(ctx.mustacheComparisonOperator() != null){
            MCE.setOp((String) ctx.mustacheComparisonOperator().getText());
        }
        if(ctx.mustacheValue() != null){
            MCE.setLiteralValue((LiteralValue) visitMustacheValue(ctx.mustacheValue()));
        }

        return super.visitMustacheComparisonExpression(ctx);
    }

    @Override
    public Object visitMustacheValue(HTMLParser.MustacheValueContext ctx) {
        System.out.println("visit MustacheValue");
        //TODO i don't know
        return super.visitMustacheValue(ctx);
    }

    // TODO CHECK
    @Override
    public Object visitIfTrue(HTMLParser.IfTrueContext ctx) {
        System.out.println("visit IfTrue");
        IfTrue IT = new IfTrue();
        LiteralValue LV = new LiteralValue();
        IT.setLiteralValue(LV);

        if(ctx.MUSTACHE_FALSE() != null){
         IT.getLiteralValue().setaBoolean(Boolean.FALSE);
        }
        if(ctx.MUSTACHE_TRUE() != null){
            IT.getLiteralValue().setaBoolean(Boolean.TRUE);
        }
        if(ctx.MUSTACHE_NUMBER() != null){
            IT.getLiteralValue().setNumber(0.0);
        }
        if(ctx.MUSTACHE_STRING() != null){
            IT.getLiteralValue().setString("");
        }
        if(ctx.MUSTACHE_NULL() != null){

        }

        return super.visitIfTrue(ctx);
    }

    @Override
    public Object visitIfFalse(HTMLParser.IfFalseContext ctx) {
        System.out.println("visit IfFalse");
        IfFalse IT = new IfFalse();
        LiteralValue LV = new LiteralValue();
        IT.setLiteralValue(LV);

        if(ctx.MUSTACHE_FALSE() != null){
            IT.getLiteralValue().setaBoolean(Boolean.FALSE);
        }
        if(ctx.MUSTACHE_TRUE() != null){
            IT.getLiteralValue().setaBoolean(Boolean.TRUE);
        }
        if(ctx.MUSTACHE_NUMBER() != null){
            IT.getLiteralValue().setNumber(0.0);
        }
        if(ctx.MUSTACHE_STRING() != null){
            IT.getLiteralValue().setString("");
        }
        if(ctx.MUSTACHE_NULL() != null){

        }
        return super.visitIfFalse(ctx);
    }


    // FILTER
    @Override
    public Object visitFilter(HTMLParser.FilterContext ctx) {
        System.out.println("visit Filter");

        MustacheFilter MF = new MustacheFilter();

        if(ctx.modelName() != null){
            MF.setModelName((String) ctx.modelName().getText());
        }
        if(ctx.formatName() != null){
            MF.setFormatName((String) ctx.formatName().getText());
        }
        if(ctx.formatType() != null){
            MF.setFormatType((String) ctx.formatType().getText());
        }

        return super.visitFilter(ctx);
    }

    // SAHER WORK //
}
