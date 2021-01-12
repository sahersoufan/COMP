package AST.Elements.ElementsNodes.Expression;

import AST.Elements.ElementsNodes.Miscallenous.BooleanOperator;
import AST.Elements.ElementsNodes.Miscallenous.LiteralValue;
import AST.Elements.ElementsNodes.Miscallenous.Property;

public class BooleanExpression {

    private String leftVar;
    private String rightVar;
    private BooleanOperator booleanOperator = new BooleanOperator();
    private LiteralValue literalValue = new LiteralValue();
    private String objName;
    private Property property = new Property();

    public String getObjName() {
        return objName;
    }

    public void setObjName(String objName) {
        this.objName = objName;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

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

    public BooleanOperator getBooleanOperator() {
        return booleanOperator;
    }

    public void setBooleanOperator(BooleanOperator booleanOperator) {
        this.booleanOperator = booleanOperator;
    }

    public LiteralValue getLiteralValue() {
        return literalValue;
    }

    public void setLiteralValue(LiteralValue literalValue) {
        this.literalValue = literalValue;
    }
}
