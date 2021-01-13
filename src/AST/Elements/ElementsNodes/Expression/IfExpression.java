package AST.Elements.ElementsNodes.Expression;

import AST.Elements.ElementsNodes.Miscallenous.*;

import java.util.ArrayList;
import java.util.List;

public class IfExpression {

    private ComparisonExpression comparisonExpression = new ComparisonExpression();
    private BooleanExpression booleanExpression = new BooleanExpression();
    private String variable;
    private FunctionCall functionCall = new FunctionCall();
    private String objName;
    private List<ArrayBody> arrayBodies = new ArrayList<ArrayBody>();
    private FunctionParametersList parametersList = new FunctionParametersList();
    private Property property = new Property();

    public ComparisonExpression getComparsionExpression() {
        return comparisonExpression;
    }

    public void setComparsionExpression(ComparisonExpression comparisonExpression) {
        this.comparisonExpression = comparisonExpression;
    }

    public BooleanExpression getBooleanExpression() {
        return booleanExpression;
    }

    public void setBooleanExpression(BooleanExpression booleanExpression) {
        this.booleanExpression = booleanExpression;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public FunctionCall getFunctionCall() {
        return functionCall;
    }

    public void setFunctionCall(FunctionCall functionCall) {
        this.functionCall = functionCall;
    }

    public String getObjName() {
        return objName;
    }

    public void setObjName(String objName) {
        this.objName = objName;
    }

    public ComparisonExpression getComparisonExpression() {
        return comparisonExpression;
    }

    public void setComparisonExpression(ComparisonExpression comparisonExpression) {
        this.comparisonExpression = comparisonExpression;
    }

    public List<ArrayBody> getArrayBodies() {
        return arrayBodies;
    }

    public void setArrayBodies(List<ArrayBody> arrayBodies) {
        this.arrayBodies = arrayBodies;
    }

    public FunctionParametersList getParametersList() {
        return parametersList;
    }

    public void setParametersList(FunctionParametersList parametersList) {
        this.parametersList = parametersList;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }
}
