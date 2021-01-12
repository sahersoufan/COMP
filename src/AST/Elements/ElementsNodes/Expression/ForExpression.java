package AST.Elements.ElementsNodes.Expression;

import AST.Elements.ElementsNodes.Miscallenous.ArrayBody;
import AST.Elements.ElementsNodes.Miscallenous.ObjectBody;

public class ForExpression {
    private String[] variable;
    private ArrayBody arr = new ArrayBody();
    private String objName;
    private ObjectBody objBody = new ObjectBody();

    public String[] getVariable() {
        return variable;
    }

    public void setVariable(String[] variable) {
        this.variable = variable;
    }

    public ArrayBody getArr() {
        return arr;
    }

    public void setArr(ArrayBody arr) {
        this.arr = arr;
    }

    public String getObjName() {
        return objName;
    }

    public void setObjName(String objName) {
        this.objName = objName;
    }

    public ObjectBody getObjBody() {
        return objBody;
    }

    public void setObjBody(ObjectBody objBody) {
        this.objBody = objBody;
    }
}
