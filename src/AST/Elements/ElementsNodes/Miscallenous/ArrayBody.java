package AST.Elements.ElementsNodes.Miscallenous;

import java.util.ArrayList;

public class ArrayBody {
    private ArrayList<LiteralValue> literalValues = new ArrayList<>();

    public ArrayList<LiteralValue> getLiteralValues() {
        return literalValues;
    }

    public void setLiteralValues(ArrayList<LiteralValue> literalValues) {
        this.literalValues = literalValues;
    }
}
