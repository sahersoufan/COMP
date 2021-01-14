package AST.Elements.ElementsNodes.Expression;

import AST.Elements.ElementsNodes.Miscallenous.FunctionCall;
import AST.Elements.ElementsNodes.Miscallenous.objArray;

public class AnnotationExpression {

    private FunctionCall functionCall = new FunctionCall();
    private String variableName;
    private objArray OA;
    public FunctionCall getFunctionCall() {
        return functionCall;
    }

    public void setFunctionCall(FunctionCall functionCall) {
        this.functionCall = functionCall;
    }

    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    public objArray getOA() {
        return OA;
    }

    public void setOA(objArray OA) {
        this.OA = OA;
    }
}
