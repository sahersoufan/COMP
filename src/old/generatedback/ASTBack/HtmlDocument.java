package old.generatedback.ASTBack;

import old.generatedback.ASTBack.Elements.HtmlElements;
import java.util.ArrayList;
import java.util.List;

public class HtmlDocument extends Node {


    private String XML;
    private String DTD;
    private List<String> scriptLetORSeaWs = new ArrayList<>();
    private List<HtmlElements> htmlElemList = new ArrayList<>();


    public String getXML() {
        return XML;
    }

    public void setXML(String XML) {
        this.XML = XML;
    }

    public String getDTD() {
        return DTD;
    }

    public void setDTD(String DTD) {
        this.DTD = DTD;
    }

    public List<String> getScriptLetORSeaWs() {
        return scriptLetORSeaWs;
    }

    public void setScriptLetORSeaWs(List<String> scriptLetORSeaWs) {
        this.scriptLetORSeaWs = scriptLetORSeaWs;
    }

    public List<HtmlElements> getHtmlElemList() {
        return htmlElemList;
    }

    public void setHtmlElemList(List<HtmlElements> htmlElemList) {
        this.htmlElemList = htmlElemList;
    }
}
