package AST.Elements.ElementsNodes.Expression;

import AST.Elements.ElementsNodes.Miscallenous.ArrayBody;
import AST.Elements.ElementsNodes.Miscallenous.ObjArray;
import AST.Elements.ElementsNodes.Miscallenous.ObjectBody;

public class ForExpression {
    private String leftVariable;
    private String rightVariable;
    private String iterator;
    private ArrayBody arr = new ArrayBody();
    private ObjArray objArray = new ObjArray();
    private String objName;
    private ObjectBody objBody = new ObjectBody();

    public String getLeftVariable() {
        return leftVariable;
    }

    public void setLeftVariable(String leftVariable) {
        this.leftVariable = leftVariable;
    }

    public String getRightVariable() {
        return rightVariable;
    }

    public void setRightVariable(String rightVariable) {
        this.rightVariable = rightVariable;
    }

    public String getIterator() { return iterator; }

    public void setIterator(String iterator) {
        this.iterator = iterator;
    }

    public ArrayBody getArr() {
        return arr;
    }

    public void setArr(ArrayBody arr) {
        this.arr = arr;
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

    public ObjectBody getObjBody() {
        return objBody;
    }

    public void setObjBody(ObjectBody objBody) {
        this.objBody = objBody;
    }
}
