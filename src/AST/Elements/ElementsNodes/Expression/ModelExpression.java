package AST.Elements.ElementsNodes.Expression;

import AST.Elements.ElementsNodes.Miscallenous.ArrayBody;

import java.util.ArrayList;

public class ModelExpression {
    private String variable;
    private ArrayList<ArrayBody> arrayBodies = new ArrayList<ArrayBody>();

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public ArrayList<ArrayBody> getArrayBodies() {
        return arrayBodies;
    }

    public void setArrayBodies(ArrayList<ArrayBody> arrayBodies) {
        this.arrayBodies = arrayBodies;
    }
}
