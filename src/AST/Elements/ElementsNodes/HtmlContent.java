package AST.Elements.ElementsNodes;

import AST.Elements.HtmlElement;

import java.util.ArrayList;
import java.util.List;


public class HtmlContent {


    private HtmlCharData charData = new HtmlCharData();
    private List<HtmlCharData> htmlCharDataList = new ArrayList<>();
    private List<HtmlElement> htmlElement = new ArrayList<>();


    public HtmlCharData getCharData() {
        return charData;
    }

    public void setCharData(HtmlCharData charData) {
        this.charData = charData;
    }

    public List<HtmlCharData> getHtmlCharDataList() {
        return htmlCharDataList;
    }

    public void setHtmlCharDataList(List<HtmlCharData> htmlCharDataList) {
        this.htmlCharDataList = htmlCharDataList;
    }

    public List<HtmlElement> getHtmlElement() {
        return htmlElement;
    }

    public void setHtmlElement(List<HtmlElement> htmlElement) {
        this.htmlElement = htmlElement;
    }
}
