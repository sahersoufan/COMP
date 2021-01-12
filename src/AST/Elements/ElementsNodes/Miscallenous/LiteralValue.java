package AST.Elements.ElementsNodes.Miscallenous;

public class LiteralValue {
    private String string;
    private Double number;
    private Boolean aBoolean;
    private ObjectBody objBody = new ObjectBody();
    private ArrayBody arrayBody = new ArrayBody();

    public Double getNumber() {
        return number;
    }

    public void setNumber(Double number) {
        this.number = number;
    }

    public Boolean getaBoolean() {
        return aBoolean;
    }

    public void setaBoolean(Boolean aBoolean) {
        this.aBoolean = aBoolean;
    }

    public ObjectBody getObjBody() {
        return objBody;
    }

    public void setObjBody(ObjectBody objBody) {
        this.objBody = objBody;
    }

    public ArrayBody getArrayBody() {
        return arrayBody;
    }

    public void setArrayBody(ArrayBody arrayBody) {
        this.arrayBody = arrayBody;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
