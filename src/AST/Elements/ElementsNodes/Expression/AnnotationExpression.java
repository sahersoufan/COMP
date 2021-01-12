package AST.Elements.ElementsNodes.Expression;

import AST.Elements.ElementsNodes.Miscallenous.FunctionCall;

public class AnnotationExpression {

    private FunctionCall functionCall = new FunctionCall();

    public FunctionCall getFunctionCall() {
        return functionCall;
    }

    public void setFunctionCall(FunctionCall functionCall) {
        this.functionCall = functionCall;
    }
}
