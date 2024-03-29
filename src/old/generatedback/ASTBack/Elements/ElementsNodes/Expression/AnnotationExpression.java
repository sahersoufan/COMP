package old.generatedback.ASTBack.Elements.ElementsNodes.Expression;

import old.generatedback.ASTBack.Elements.ElementsNodes.Miscallenous.FunctionCall;
import old.generatedback.ASTBack.Elements.ElementsNodes.Miscallenous.ObjArray;


public class AnnotationExpression {

    private String variableName;
    private FunctionCall functionCall = new FunctionCall();
    private ObjArray objArray = new ObjArray();

    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    public FunctionCall getFunctionCall() {
        return functionCall;
    }

    public void setFunctionCall(FunctionCall functionCall) {
        this.functionCall = functionCall;
    }

    public ObjArray getObjArray() {
        return objArray;
    }

    public void setObjArray(ObjArray objArray) {
        this.objArray = objArray;
    }
}
