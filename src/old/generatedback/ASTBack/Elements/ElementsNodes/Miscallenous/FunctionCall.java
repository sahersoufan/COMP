package old.generatedback.ASTBack.Elements.ElementsNodes.Miscallenous;

public class FunctionCall {
    private String functionName;
    private FunctionParametersList functionParameters = new FunctionParametersList();


    public FunctionParametersList getFunctionParameters() {
        return functionParameters;
    }

    public void setFunctionParameters(FunctionParametersList functionParameters) {
        this.functionParameters = functionParameters;
    }


    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }
}
