package AST.Elements.ElementsNodes.Expression;

import AST.Elements.ElementsNodes.Miscallenous.*;

import java.util.ArrayList;
import java.util.List;

public class IfExpression {

    private ComparisonExpression comparisonExpression = new ComparisonExpression();
    private BooleanExpression booleanExpression = new BooleanExpression();
    private String variableName;
    private FunctionCall functionCall = new FunctionCall();
    private objWithProperty OWP;
    private objArray OA;

    public ComparisonExpression getComparisonExpression() {
        return comparisonExpression;
    }

    public void setComparisonExpression(ComparisonExpression comparisonExpression) {
        this.comparisonExpression = comparisonExpression;
    }

    public BooleanExpression getBooleanExpression() {
        return booleanExpression;
    }

    public void setBooleanExpression(BooleanExpression booleanExpression) {
        this.booleanExpression = booleanExpression;
    }

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

    public objWithProperty getOWP() {
        return OWP;
    }

    public void setOWP(objWithProperty OWP) {
        this.OWP = OWP;
    }

    public objArray getOA() {
        return OA;
    }

    public void setOA(objArray OA) {
        this.OA = OA;
    }
}
