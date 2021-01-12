package AST.Elements.ElementsNodes.Miscallenous;

import java.util.ArrayList;

public class ObjectPair {
    private String key;
    private LiteralValue literalValue = new LiteralValue();

    public LiteralValue getLiteralValue() {
        return literalValue;
    }

    public void setLiteralValue(LiteralValue literalValue) {
        this.literalValue = literalValue;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
