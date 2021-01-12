package AST.Elements.ElementsNodes;


import AST.Elements.ElementsNodes.Expression.*;

public class HtmlAttribute {


    private String name;
    private String value;
    private AnnotationExpression annotationExpression;
    private AppExpression appExpression;
    private ForExpression forExpression;
    private IfExpression ifExpression;
    private ModelExpression modelExpression;
    private ShowHideExpression showHideExpression;
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

    public AppExpression getAppExpression() {
        return appExpression;
    }

    public void setAppExpression(AppExpression appExpression) {
        this.appExpression = appExpression;
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

    public ModelExpression getModelExpression() {
        return modelExpression;
    }

    public void setModelExpression(ModelExpression modelExpression) {
        this.modelExpression = modelExpression;
    }

    public ShowHideExpression getShowHideExpression() {
        return showHideExpression;
    }

    public void setShowHideExpression(ShowHideExpression showHideExpression) {
        this.showHideExpression = showHideExpression;
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
