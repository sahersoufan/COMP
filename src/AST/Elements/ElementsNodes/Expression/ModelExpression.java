package AST.Elements.ElementsNodes.Expression;

import AST.Elements.ElementsNodes.Miscallenous.ArrayBody;


import java.util.ArrayList;
import java.util.List;

public class ModelExpression {
    private String variable;
    private List<ArrayBody> arrayBodies = new ArrayList<ArrayBody>();

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public List<ArrayBody> getArrayBodies() {
        return arrayBodies;
    }

    public void setArrayBodies(List<ArrayBody> arrayBodies) {
        this.arrayBodies = arrayBodies;
    }
}
