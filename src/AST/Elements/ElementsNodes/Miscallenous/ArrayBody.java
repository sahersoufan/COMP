package AST.Elements.ElementsNodes.Miscallenous;

import java.util.ArrayList;
import java.util.List;

public class ArrayBody {
    private List<LiteralValue> literalValues = new ArrayList<>();

    public List<LiteralValue> getLiteralValues() {
        return literalValues;
    }

    public void setLiteralValues(List<LiteralValue> literalValues) {
        this.literalValues = literalValues;
    }
}
