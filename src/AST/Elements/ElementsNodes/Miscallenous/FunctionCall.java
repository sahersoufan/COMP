package AST.Elements.ElementsNodes.Miscallenous;

import java.util.ArrayList;

public class FunctionCall {
    private String functionName;
    private ArrayList<FunctionParameters> functionParameters = new ArrayList<>();

    public ArrayList<FunctionParameters> getFunctionParameters() {
        return functionParameters;
    }

    public void setFunctionParameters(ArrayList<FunctionParameters> functionParameters) {
        this.functionParameters = functionParameters;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }
}
