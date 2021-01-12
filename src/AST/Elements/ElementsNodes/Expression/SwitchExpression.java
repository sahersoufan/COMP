package AST.Elements.ElementsNodes.Expression;

import AST.Elements.ElementsNodes.Miscallenous.ArrayBody;
import AST.Elements.ElementsNodes.Miscallenous.LiteralValue;
import AST.Elements.ElementsNodes.Miscallenous.Property;

import java.util.ArrayList;

public class SwitchExpression {

    private LiteralValue value = new LiteralValue();
    private String objName;
    private ArrayList<ArrayBody> arr = new ArrayList<ArrayBody>();
    private ArrayList<Property> properties = new ArrayList<Property>();
    private String variable;

    public LiteralValue getValue() {
        return value;
    }

    public void setValue(LiteralValue value) {
        this.value = value;
    }

    public String getObjName() {
        return objName;
    }

    public void setObjName(String objName) {
        this.objName = objName;
    }

    public ArrayList<ArrayBody> getArr() {
        return arr;
    }

    public void setArr(ArrayList<ArrayBody> arr) {
        this.arr = arr;
    }

    public ArrayList<Property> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<Property> properties) {
        this.properties = properties;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }
}
