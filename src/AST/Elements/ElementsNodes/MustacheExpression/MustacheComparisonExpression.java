package AST.Elements.ElementsNodes.MustacheExpression;

import AST.Elements.ElementsNodes.Miscallenous.LiteralValue;

public class MustacheComparisonExpression {
    private String variable;
    private String op;
    private LiteralValue literalValue = new LiteralValue();

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public LiteralValue getLiteralValue() {
        return literalValue;
    }

    public void setLiteralValue(LiteralValue literalValue) {
        this.literalValue = literalValue;
    }
}
