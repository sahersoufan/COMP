package AST.Elements.ElementsNodes.MustacheExpression;

import AST.Elements.ElementsNodes.Miscallenous.LiteralValue;

public class MustacheComparisonExpression {
    private String variable;
    private String op;
    private String Mustachevalue;

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

    public String getMustachevalue() {
        return Mustachevalue;
    }

    public void setMustachevalue(String mustachevalue) {
        Mustachevalue = mustachevalue;
    }
}
