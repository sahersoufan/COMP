package AST.Elements.ElementsNodes.Miscallenous;

import java.util.ArrayList;

public class Property {
    private String variable;
    private String functionName;
    private ArrayList<ArrayBody> arrayBodies = new ArrayList<>();
    private ArrayList<FunctionParameters> functionParameters = new ArrayList<>();

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public ArrayList<ArrayBody> getArrayBodies() {
        return arrayBodies;
    }

    public void setArrayBodies(ArrayList<ArrayBody> arrayBodies) {
        this.arrayBodies = arrayBodies;
    }

    public ArrayList<FunctionParameters> getFunctionParameters() {
        return functionParameters;
    }

    public void setFunctionParameters(ArrayList<FunctionParameters> functionParameters) {
        this.functionParameters = functionParameters;
    }
}
