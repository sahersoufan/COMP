package AST.Elements.ElementsNodes.Expression;

import AST.Elements.ElementsNodes.Miscallenous.ArrayBody;
import AST.Elements.ElementsNodes.Miscallenous.FunctionCall;
import AST.Elements.ElementsNodes.Miscallenous.FunctionParameters;
import AST.Elements.ElementsNodes.Miscallenous.Property;

import java.util.ArrayList;

public class IfExpression {

    private ComparisonExpression comparisonExpression = new ComparisonExpression();
    private BooleanExpression booleanExpression = new BooleanExpression();
    private String variable;
    private FunctionCall functionCall = new FunctionCall();
    private String objName;
    private ArrayList<ArrayBody> arrayBodies = new ArrayList<ArrayBody>();
    private ArrayList<FunctionParameters> parameters = new ArrayList<FunctionParameters>();
    private ArrayList<Property> properties = new ArrayList<Property>();

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

    public ArrayList<ArrayBody> getArrayBodies() {
        return arrayBodies;
    }

    public void setArrayBodies(ArrayList<ArrayBody> arrayBodies) {
        this.arrayBodies = arrayBodies;
    }

    public ArrayList<FunctionParameters> getParameters() {
        return parameters;
    }

    public void setParameters(ArrayList<FunctionParameters> parameters) {
        this.parameters = parameters;
    }

    public ArrayList<Property> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<Property> properties) {
        this.properties = properties;
    }
}
