package AST.Elements.ElementsNodes.Expression;

import AST.Elements.ElementsNodes.Miscallenous.ComparisonOperator;
import AST.Elements.ElementsNodes.Miscallenous.LiteralValue;
import AST.Elements.ElementsNodes.Miscallenous.Property;

public class ComparisonExpression {

    private String leftVar;
    private String rightVar;
    private ComparisonOperator comparisonOperator = new ComparisonOperator();
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

    public ComparisonOperator getComparsionOperator() {
        return comparisonOperator;
    }

    public void setComparsionOperator(ComparisonOperator comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }
}
