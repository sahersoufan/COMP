package AST.Elements;

import AST.Elements.ElementsNodes.*;
import AST.Elements.ElementsNodes.MustacheExpression.MustacheExpression;

import java.util.ArrayList;
import java.util.List;

public class HtmlElement {


    private String tagName;
    private List<HtmlAttribute> htmlAttributeList = new ArrayList<>();
    private HtmlContent htmlContent = new HtmlContent();
    private MustacheExpression mustacheExpression = new MustacheExpression();


    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public List<HtmlAttribute> getHtmlAttributeList() {
        return htmlAttributeList;
    }

    public void setHtmlAttributeList(List<HtmlAttribute> htmlAttributeList) {
        this.htmlAttributeList = htmlAttributeList;
    }


    public HtmlContent getHtmlContent() {
        return htmlContent;
    }

    public void setHtmlContent(HtmlContent htmlContent) {
        this.htmlContent = htmlContent;
    }

    public MustacheExpression getMustacheExpression() {
        return mustacheExpression;
    }

    public void setMustacheExpression(MustacheExpression mustacheExpression) {
        this.mustacheExpression = mustacheExpression;
    }
}
