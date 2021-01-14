package AST.Elements.ElementsNodes.Expression;

import AST.Elements.ElementsNodes.Miscallenous.*;

import java.util.ArrayList;
import java.util.List;

public class SwitchExpression {
    private String variableName;
    private LiteralValue value;
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
