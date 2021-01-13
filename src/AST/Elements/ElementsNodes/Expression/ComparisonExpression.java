package AST.Elements.ElementsNodes.Expression;

import AST.Elements.ElementsNodes.Miscallenous.ComparisonOpeartor;
import AST.Elements.ElementsNodes.Miscallenous.LiteralValue;
import AST.Elements.ElementsNodes.Miscallenous.Property;

public class ComparisonExpression {

    private String leftVar;
    private String rightVar;
    private ComparisonOpeartor comparisonOperator = new ComparisonOpeartor();
    private LiteralValue literalValue = new LiteralValue();
    private String objName;
    private Property property = new Property();

    public String getLeftVar() {
        return leftVar;
    }

    public void setLeftVar(String leftVar) {
        this.leftVar = leftVar;
    }

    public String getRightVar() {
        return rightVar;
    }

    public void setRightVar(String rightVar) {
        this.rightVar = rightVar;
    }


    public LiteralValue getLiteralValue() {
        return literalValue;
    }

    public void setLiteralValue(LiteralValue literalValue) {
        this.literalValue = literalValue;
    }

    public String getObjName() {
        return objName;
    }

    public void setObjName(String objName) {
        this.objName = objName;
    }

    public ComparisonOpeartor getComparisonOperator() {
        return comparisonOperator;
    }

    public void setComparisonOperator(ComparisonOpeartor comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }
}
