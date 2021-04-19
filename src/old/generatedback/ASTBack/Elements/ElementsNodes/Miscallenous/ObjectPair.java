package old.generatedback.ASTBack.Elements.ElementsNodes.Miscallenous;

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
