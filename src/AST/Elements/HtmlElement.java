package AST.Elements;

import AST.Elements.ElementsNodes.*;
import AST.Elements.ElementsNodes.MustacheExpression.MustacheExpression;

import java.util.ArrayList;
import java.util.List;

public class HtmlElement {


    private String tagName;
    private List<HtmlAttribute> htmlAttributeList = new ArrayList<>();
    private HtmlContent htmlContentList = new HtmlContent();
    private List<MustacheExpression> mustacheExpressionList = new ArrayList<>();


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

    public HtmlContent getHtmlContentList() {
        return htmlContentList;
    }

    public void setHtmlContentList(HtmlContent htmlContentList) {
        this.htmlContentList = htmlContentList;
    }

    public List<MustacheExpression> getMustacheExpressionList() {
        return mustacheExpressionList;
    }

    public void setMustacheExpressionList(List<MustacheExpression> mustacheExpressionList) {
        this.mustacheExpressionList = mustacheExpressionList;
    }
}
