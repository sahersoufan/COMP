package old.generatedback.ASTBack.Elements.ElementsNodes.Expression;

import old.generatedback.ASTBack.Elements.ElementsNodes.Miscallenous.*;

public class SwitchExpression {
    private String variable;
    private LiteralValue value = new LiteralValue();
    private ObjArray objArray = new ObjArray();
    private String objName;
    private Property property = new Property();

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public LiteralValue getValue() {
        return value;
    }

    public void setValue(LiteralValue value) {
        this.value = value;
    }

    public ObjArray getObjArray() {
        return objArray;
    }

    public void setObjArray(ObjArray objArray) {
        this.objArray = objArray;
    }

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
}
