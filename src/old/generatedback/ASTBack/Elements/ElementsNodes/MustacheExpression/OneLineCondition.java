package old.generatedback.ASTBack.Elements.ElementsNodes.MustacheExpression;

public class OneLineCondition {

    private MustacheComparisonExpression mustacheComparisonExpression = new MustacheComparisonExpression();
    private IfTrue ifTrueStmt = new IfTrue();
    private IfFalse ifFalseStmt = new IfFalse();

    public MustacheComparisonExpression getMustacheComparisonExpression() {
        return mustacheComparisonExpression;
    }

    public void setMustacheComparisonExpression(MustacheComparisonExpression mustacheComparisonExpression) {
        this.mustacheComparisonExpression = mustacheComparisonExpression;
    }

    public IfTrue getIfTrueStmt() {
        return ifTrueStmt;
    }

    public void setIfTrueStmt(IfTrue ifTrueStmt) {
        this.ifTrueStmt = ifTrueStmt;
    }

    public IfFalse getIfFalseStmt() {
        return ifFalseStmt;
    }

    public void setIfFalseStmt(IfFalse ifFalseStmt) {
        this.ifFalseStmt = ifFalseStmt;
    }
}
