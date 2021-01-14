package AST.Elements.ElementsNodes.Expression;

import AST.Elements.ElementsNodes.Miscallenous.*;


import java.util.ArrayList;
import java.util.List;

public class ModelExpression {
    private String variableName;
    private LiteralValue value;
    private FunctionCall funcCall;
    private objWithProperty OWP;
    private objArray OA;

    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    public LiteralValue getValue() {
        return value;
    }

    public void setValue(LiteralValue value) {
        this.value = value;
    }

    public FunctionCall getFuncCall() {
        return funcCall;
    }

    public void setFuncCall(FunctionCall funcCall) {
        this.funcCall = funcCall;
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
    }}
