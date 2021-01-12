package AST.Elements.ElementsNodes;

import AST.Elements.HtmlElement;

import java.util.ArrayList;
import java.util.List;


public class HtmlContent {

    private String CDATA;
    private HtmlCharData charData = new HtmlCharData();
    private List<HtmlElement> htmlElement = new ArrayList<>();


    public String getCDATA() {
        return CDATA;
    }

    public void setCDATA(String CDATA) {
        this.CDATA = CDATA;
    }

    public HtmlCharData getCharData() {
        return charData;
    }

    public void setCharData(HtmlCharData charData) {
        this.charData = charData;
    }

    public List<HtmlElement> getHtmlElement() {
        return htmlElement;
    }

    public void setHtmlElement(List<HtmlElement> htmlElement) {
        this.htmlElement = htmlElement;
    }
}
