package AST.Elements.ElementsNodes;

import AST.Elements.ElementsNodes.MustacheExpression.MustacheFilter;
import AST.Elements.ElementsNodes.MustacheExpression.OneLineCondition;

public class ElementMustache {
    private String variable;
    private OneLineCondition oneLineCond = new OneLineCondition();
    private MustacheFilter mFilter = new MustacheFilter();

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public OneLineCondition getOneLineCond() {
        return oneLineCond;
    }

    public void setOneLineCond(OneLineCondition oneLineCond) {
        this.oneLineCond = oneLineCond;
    }

    public MustacheFilter getmFilter() {
        return mFilter;
    }

    public void setmFilter(MustacheFilter mFilter) {
        this.mFilter = mFilter;
    }
}
