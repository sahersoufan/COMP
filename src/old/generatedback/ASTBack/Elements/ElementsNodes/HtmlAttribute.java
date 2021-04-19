package old.generatedback.ASTBack.Elements.ElementsNodes;


import old.generatedback.ASTBack.Elements.ElementsNodes.Expression.*;

public class HtmlAttribute {


    private String name;
    private String value;
    private AnnotationExpression annotationExpression;
    private ForExpression forExpression;
    private IfExpression ifExpression;
    private ashmExpression ashmExpression;
    private SwitchCaseExpression switchCaseExpression;
    private SwitchExpression switchExpression;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public AnnotationExpression getAnnotationExpression() {
        return annotationExpression;
    }

    public void setAnnotationExpression(AnnotationExpression annotationExpression) {
        this.annotationExpression = annotationExpression;
    }

    public ForExpression getForExpression() {
        return forExpression;
    }

    public void setForExpression(ForExpression forExpression) {
        this.forExpression = forExpression;
    }

    public IfExpression getIfExpression() {
        return ifExpression;
    }

    public void setIfExpression(IfExpression ifExpression) {
        this.ifExpression = ifExpression;
    }

    public old.generatedback.ASTBack.Elements.ElementsNodes.Expression.ashmExpression getAshmExpression() {
        return ashmExpression;
    }

    public void setAshmExpression(old.generatedback.ASTBack.Elements.ElementsNodes.Expression.ashmExpression ashmExpression) {
        this.ashmExpression = ashmExpression;
    }

    public SwitchCaseExpression getSwitchCaseExpression() {
        return switchCaseExpression;
    }

    public void setSwitchCaseExpression(SwitchCaseExpression switchCaseExpression) {
        this.switchCaseExpression = switchCaseExpression;
    }

    public SwitchExpression getSwitchExpression() {
        return switchExpression;
    }

    public void setSwitchExpression(SwitchExpression switchExpression) {
        this.switchExpression = switchExpression;
    }
}
