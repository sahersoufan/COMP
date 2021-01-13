package AST.Elements.ElementsNodes.Miscallenous;

import java.util.ArrayList;
import java.util.List;

public class Property {
    private String variable;
    private String functionName;
    private List<ArrayBody> arrayBodies = new ArrayList<>();
    private FunctionParametersList functionParametersList = new FunctionParametersList();

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

    public List<ArrayBody> getArrayBodies() {
        return arrayBodies;
    }

    public void setArrayBodies(List<ArrayBody> arrayBodies) {
        this.arrayBodies = arrayBodies;
    }

    public FunctionParametersList getFunctionParametersList() {
        return functionParametersList;
    }

    public void setFunctionParametersList(FunctionParametersList functionParametersList) {
        this.functionParametersList = functionParametersList;
    }
}
