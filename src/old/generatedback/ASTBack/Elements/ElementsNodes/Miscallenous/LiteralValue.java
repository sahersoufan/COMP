package old.generatedback.ASTBack.Elements.ElementsNodes.Miscallenous;

public class LiteralValue {
    private String string;
    private String number;
    private String Boolean;
    private ObjectBody objBody = new ObjectBody();
    private ArrayBody arrayBody = new ArrayBody();

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBoolean() {
        return Boolean;
    }

    public void setBoolean(String aBoolean) {
        Boolean = aBoolean;
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
}
