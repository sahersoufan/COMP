package AST.Elements.ElementsNodes.Expression;

import AST.Elements.ElementsNodes.Miscallenous.ArrayBody;
import AST.Elements.ElementsNodes.Miscallenous.FunctionCall;
import AST.Elements.ElementsNodes.Miscallenous.LiteralValue;
import AST.Elements.ElementsNodes.Miscallenous.Property;

import java.util.ArrayList;
import java.util.List;

public class ShowHideExpression {

    private LiteralValue value = new LiteralValue();
    private String objName;
    private List<ArrayBody> arr = new ArrayList<ArrayBody>();
    private Property property = new Property();
    private FunctionCall funcCall = new FunctionCall();
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

    public List<ArrayBody> getArr() {
        return arr;
    }

    public void setArr(List<ArrayBody> arr) {
        this.arr = arr;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public FunctionCall getFuncCall() {
        return funcCall;
    }

    public void setFuncCall(FunctionCall funcCall) {
        this.funcCall = funcCall;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }





}
