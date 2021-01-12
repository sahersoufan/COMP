package AST.Elements.ElementsNodes.MustacheExpression;

public class MustacheExpression {

    private String mustahceVariable;
    private MustacheFilter mustacheFilter;
    private OneLineCondition oneLineCondition;

    public String getMustahceVariable() {
        return mustahceVariable;
    }

    public void setMustahceVariable(String mustahceVariable) {
        this.mustahceVariable = mustahceVariable;
    }

    public MustacheFilter getMustacheFilter() {
        return mustacheFilter;
    }

    public void setMustacheFilter(MustacheFilter mustacheFilter) {
        this.mustacheFilter = mustacheFilter;
    }

    public OneLineCondition getOneLineCondition() {
        return oneLineCondition;
    }

    public void setOneLineCondition(OneLineCondition oneLineCondition) {
        this.oneLineCondition = oneLineCondition;
    }
}
