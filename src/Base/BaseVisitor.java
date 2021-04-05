package Base;

import AST.Elements.ElementsNodes.Expression.*;
import AST.Elements.ElementsNodes.HtmlAttribute;
import AST.Elements.ElementsNodes.HtmlCharData;
import AST.Elements.ElementsNodes.HtmlContent;
import AST.Elements.ElementsNodes.Miscallenous.*;
import AST.Elements.ElementsNodes.MustacheExpression.*;
import AST.Elements.HtmlElement;
import AST.Elements.HtmlElements;
import AST.HtmlDocument;
import com.sun.security.jgss.GSSUtil;
import generated.HTMLParser;
import generated.HTMLParserBaseVisitor;

import java.util.ArrayList;
import java.util.List;

public class BaseVisitor extends HTMLParserBaseVisitor {


    @Override
    public HtmlDocument visitHtmlDocument(HTMLParser.HtmlDocumentContext ctx) {
        System.out.println("visit htmlDocument");
        HtmlDocument doc = new HtmlDocument();
        List<HtmlElements> htmlElementsList = new ArrayList<>();
        List<String> scriptLetOrSeaWsList = new ArrayList<>();


        if(!ctx.scriptletOrSeaWs().isEmpty()){
            for(int i = 0; i < ctx.scriptletOrSeaWs().size(); i++){
                scriptLetOrSeaWsList.add(visitScriptletOrSeaWs(ctx.scriptletOrSeaWs(i)));
                doc.setScriptLetORSeaWs(scriptLetOrSeaWsList);
                doc.setLine(ctx.getStart().getLine());
                doc.setCol(ctx.getStart().getCharPositionInLine());
            }

        }
        if(!ctx.htmlElements().isEmpty()){
            for(int i = 0; i < ctx.htmlElements().size(); i++){
                htmlElementsList.add(visitHtmlElements(ctx.htmlElements(i)));
                doc.setLine(ctx.getStart().getLine());
                doc.setCol(ctx.getStart().getCharPositionInLine());
                doc.setHtmlElemList(htmlElementsList);

            }


        }
        return doc;
    }

    @Override
    public String visitScriptletOrSeaWs(HTMLParser.ScriptletOrSeaWsContext ctx) {

        System.out.println("visit ScriptLetOrSeaWs");

        if(ctx.SCRIPTLET() != null) {
            String scriptLetOrSeaWs;
            scriptLetOrSeaWs = ctx.SCRIPTLET().getSymbol().getText();
            return scriptLetOrSeaWs;
        }
        return "";
    }

    @Override
    public HtmlElements visitHtmlElements(HTMLParser.HtmlElementsContext ctx) {

        System.out.println("visit htmlElements");
        HtmlElements elements = new HtmlElements();
        HtmlElement element = new HtmlElement();
        List<String> misc = new ArrayList<>();



        if(!ctx.htmlMisc().isEmpty()){
            for(int i = 0; i < ctx.htmlMisc().size(); i++){
                misc.add(visitHtmlMisc(ctx.htmlMisc(i)));
                elements.setMisc(misc);

            }
        }

        if(ctx.htmlElement() != null){
            element = visitHtmlElement(ctx.htmlElement());
            elements.setHtmlElement(element);
        }

        return elements;
    }


    @Override
    public String visitHtmlMisc(HTMLParser.HtmlMiscContext ctx) {
        String misc = null;
        if(ctx.htmlComment() != null){
            misc = visitHtmlComment(ctx.htmlComment());
        }
        return misc;
    }

    @Override
    public String visitHtmlComment(HTMLParser.HtmlCommentContext ctx) {
        String comment = null;
        if (ctx.HTML_COMMENT() != null) {
            comment = ctx.HTML_COMMENT().getSymbol().getText();
            System.out.println("comment : " + comment + "/n");
        }
        if (ctx.HTML_CONDITIONAL_COMMENT() != null) {
            comment = ctx.HTML_CONDITIONAL_COMMENT().getSymbol().getText();
            System.out.println("comment : " + comment + "/n");
        }
        return comment;
    }

    @Override
    public HtmlElement visitHtmlElement(HTMLParser.HtmlElementContext ctx) {
        System.out.println("visit HtmlElement");
        HtmlElement element = new HtmlElement();
        String openTagName;
        String closeTagName;
        List<HtmlAttribute> attributeList = new ArrayList<>();
        HtmlContent htmlContent = new HtmlContent();
        MustacheExpression mustacheExpression = new MustacheExpression();


            if (!ctx.TAG_NAME().isEmpty()) {
                openTagName = ctx.TAG_NAME(0).getSymbol().getText();
                System.out.println("OPEN TagName : " + openTagName + "\t");
                //if(ctx.TAG_NAME(1) != null){
                closeTagName = ctx.TAG_NAME(1).getSymbol().getText();
                System.out.println("CLOSE TagName : " + closeTagName);
            }

        if(!ctx.htmlAttribute().isEmpty()){
            for(int i = 0; i < ctx.htmlAttribute().size(); i++){
                attributeList.add((HtmlAttribute) visitHtmlAttribute(ctx.htmlAttribute(i)));
                element.setHtmlAttributeList(attributeList);
            }
        }
        if(ctx.htmlContent() != null){
            htmlContent = visitHtmlContent(ctx.htmlContent());
            element.setHtmlContent(htmlContent);
        }

        if (ctx.mustacheExpression() != null) {
            mustacheExpression = (MustacheExpression) visitMustacheExpression(ctx.mustacheExpression());
            element.setMustacheExpression(mustacheExpression);
        }

        return element;
    }

    @Override
    public HtmlAttribute visitHtmlAttribute(HTMLParser.HtmlAttributeContext ctx) {

        System.out.println("visit htmlAttribute");
        HtmlAttribute htmlAttribute = new HtmlAttribute();
        String attributeName;
        String tagName;
        String attributeValue;
        ForExpression forExpression = new ForExpression();
        ashmExpression ashmExpression = new ashmExpression();
        SwitchCaseExpression switchCaseExpression = new SwitchCaseExpression();
        SwitchExpression switchExpression = new SwitchExpression();
        IfExpression ifExpression = new IfExpression();
        AnnotationExpression annotationExpression = new AnnotationExpression();


        if(ctx.CP_SWITCH_DEF() != null){
            attributeName = ctx.CP_SWITCH_DEF().getSymbol().getText();
            System.out.println("Attribute : " + attributeName + "\t");
            htmlAttribute.setName(attributeName);
        }

        if(ctx.CP_APP() != null){
            attributeName = ctx.CP_APP().getSymbol().getText();
            System.out.println("Attribute : " + attributeName + "\t");
            htmlAttribute.setName(attributeName);
            if(ctx.ashmExpression()!= null){
                ashmExpression = visitAshmExpression(ctx.ashmExpression());
                htmlAttribute.setAshmExpression(ashmExpression);
            }
        }

        if(ctx.CP_FOR() != null){
            attributeName = ctx.CP_FOR().getSymbol().getText();
            htmlAttribute.setName(attributeName);
            System.out.println("Attribute : " + attributeName + "\t");

            if(ctx.forExpression() != null){
                forExpression = visitForExpression(ctx.forExpression());
                htmlAttribute.setForExpression(forExpression);
            }
        }

        if(ctx.CP_SHOW() != null){
            attributeName = ctx.CP_SHOW().getSymbol().getText();
            System.out.println("Attribute : " + attributeName + "\t");
            htmlAttribute.setName(attributeName);
            if(ctx.ashmExpression() != null){
                ashmExpression = visitAshmExpression(ctx.ashmExpression());
                htmlAttribute.setAshmExpression(ashmExpression);
            }
        }

        if(ctx.CP_HIDE() != null){
            attributeName = ctx.CP_HIDE().getSymbol().getText();
            System.out.println("Attribute : " + attributeName + "\t");
            htmlAttribute.setName(attributeName);
            if(ctx.ashmExpression() != null){
                ashmExpression = visitAshmExpression(ctx.ashmExpression());
                htmlAttribute.setAshmExpression(ashmExpression);
            }
        }

        if(ctx.CP_SWITCH_CASE() != null){
            attributeName = ctx.CP_SWITCH_CASE().getSymbol().getText();
            System.out.println("Attribute : " + attributeName + "\t");
            htmlAttribute.setName(attributeName);
            if(ctx.switchCaseExpression() != null){
                switchCaseExpression = visitSwitchCaseExpression(ctx.switchCaseExpression());
                htmlAttribute.setSwitchCaseExpression(switchCaseExpression);
            }
        }

        if(ctx.CP_SWITCH() != null){
            attributeName = ctx.CP_SWITCH().getSymbol().getText();
            System.out.println("Attribute : " + attributeName + "\t");
            htmlAttribute.setName(attributeName);
            if(ctx.switchExpression()!= null){
                switchExpression = visitSwitchExpression(ctx.switchExpression());
                htmlAttribute.setSwitchExpression(switchExpression);
            }
        }

        if(ctx.CP_IF() != null){
            attributeName = ctx.CP_IF().getSymbol().getText();
            System.out.println("Attribute : " + attributeName + "\t");
            htmlAttribute.setName(attributeName);
            if(ctx.ifExpression()!= null){
                ifExpression = visitIfExpression(ctx.ifExpression());
                htmlAttribute.setIfExpression(ifExpression);

            }
        }

        if(ctx.CP_MODEL() != null){
            attributeName = ctx.CP_MODEL().getSymbol().getText();
            System.out.println("Attribute : " + attributeName + "\t");
            htmlAttribute.setName(attributeName);
            if(ctx.ashmExpression()!= null){
                ashmExpression = visitAshmExpression(ctx.ashmExpression());
                htmlAttribute.setAshmExpression(ashmExpression);
            }
        }

        if(ctx.CP_MOUSEOVER() != null){
            attributeName = ctx.CP_MOUSEOVER().getSymbol().getText();
            System.out.println("Attribute : " + attributeName + "\t");
            htmlAttribute.setName(attributeName);
            if (ctx.annotationExpression()!= null) {
                annotationExpression = visitAnnotationExpression(ctx.annotationExpression());
                htmlAttribute.setAnnotationExpression(annotationExpression);
            }
        }

        if(ctx.CP_CLICK() != null){
            attributeName = ctx.CP_CLICK().getSymbol().getText();
            System.out.println("Attribute : " + attributeName + "\t");
            htmlAttribute.setName(attributeName);
            if (ctx.annotationExpression() != null) {
                annotationExpression = visitAnnotationExpression(ctx.annotationExpression());
                htmlAttribute.setAnnotationExpression(annotationExpression);
            }
        }

        if(ctx.TAG_NAME() != null){
            tagName = ctx.TAG_NAME().getSymbol().getText();
            System.out.println("Attribute : " + tagName + "\t");
            htmlAttribute.setName(tagName);
            if (ctx.ATTVALUE_VALUE() != null) {
                attributeValue = ctx.ATTVALUE_VALUE().getSymbol().getText();
                System.out.println("Value : " + attributeValue + "\n");
                htmlAttribute.setValue(attributeValue);
            }
        }

        return htmlAttribute;
    }


    @Override
    public HtmlContent visitHtmlContent(HTMLParser.HtmlContentContext ctx) {
        System.out.println("visit HtmlContent");
        List<HtmlCharData> charDataList = new ArrayList<>();
        List<HtmlElement> htmlElementList = new ArrayList<>();
        List<String> comment = new ArrayList<>();
        HtmlContent htmlContent = new HtmlContent();


        if (!ctx.htmlChardata().isEmpty()) {
            for (int i = 0; i < ctx.htmlChardata().size(); i++) {
                charDataList.add(visitHtmlChardata(ctx.htmlChardata(i)));
                htmlContent.setHtmlCharDataList(charDataList);
            }
        }

        if (!ctx.htmlElement().isEmpty()) {
            for (int i = 0; i < ctx.htmlElement().size(); i++) {
                htmlElementList.add(visitHtmlElement(ctx.htmlElement(i)));
                htmlContent.setHtmlElement(htmlElementList);
            }
        }

        if (!ctx.htmlComment().isEmpty()) {
            for (int i = 0; i < ctx.htmlComment().size(); i++) {
                comment.add(visitHtmlComment(ctx.htmlComment(i)));
                htmlContent.setHtmlComment(comment);
            }
        }



        return htmlContent;
    }


    @Override
    public HtmlCharData visitHtmlChardata(HTMLParser.HtmlChardataContext ctx) {

        System.out.println("visit HtmlCharData");

        String htmlText;
        HtmlCharData charData = new HtmlCharData();

        if (ctx.HTML_TEXT() != null) {
            htmlText = ctx.HTML_TEXT().getSymbol().getText();
            System.out.println("html_text : " + htmlText);
            charData.setHtmlText(htmlText);
        }

        return charData;

    }


    @Override
    public ashmExpression visitAshmExpression(HTMLParser.AshmExpressionContext ctx) {
        System.out.println("visit ashmExpression");
        String variable;
        LiteralValue value = new LiteralValue();
        ObjArray objArray = new ObjArray();
        FunctionCall functionCall = new FunctionCall();
        String objName;
        Property property = new Property();
        ashmExpression ashmExpression = new ashmExpression();

        if (ctx.variable() != null) {
            variable = ctx.variable().variableName().CP_CONTENT_IDENTIFIER().getSymbol().getText();
            System.out.println("Variable : " + variable);
            ashmExpression.setVariable(variable);
        }

        if (ctx.value() != null) {
            value = visitValue(ctx.value());
            ashmExpression.setValue(value);
        }

        if (ctx.objArray() != null) {
            objArray = visitObjArray(ctx.objArray());
            ashmExpression.setObjArray(objArray);
        }

        if (ctx.functionCall() != null) {
            functionCall = visitFunctionCall(ctx.functionCall());
            ashmExpression.setFunctionCall(functionCall);
        }

        if (ctx.objName() != null) {
            objName = ctx.objName().CP_CONTENT_IDENTIFIER().getSymbol().getText();
            System.out.println("object name : " + objName);
            ashmExpression.setObjName(objName);
        }

        if (ctx.property() != null) {
            property = visitProperty(ctx.property());
            ashmExpression.setProperty(property);
        }
        return ashmExpression;
    }

    @Override
    public ForExpression visitForExpression(HTMLParser.ForExpressionContext ctx) {
        System.out.println("visit ForExpression");
        String leftVar;
        String rightVar;
        String iterator;
        ArrayBody arrayBody;
        ObjArray objArray;
        String objName;
        ObjectBody objectBody = new ObjectBody();
        ForExpression forExpression = new ForExpression();

        if (!ctx.variable().isEmpty()){
            leftVar = ctx.variable(0).variableName().CP_CONTENT_IDENTIFIER().getSymbol().getText();
            System.out.println("Variable : " + leftVar + "\t");
            forExpression.setLeftVariable(leftVar);

            rightVar= ctx.variable(1).variableName().CP_CONTENT_IDENTIFIER().getSymbol().getText();
            forExpression.setRightVariable(rightVar);
            System.out.println("Variable : " + rightVar + "\t");


        }

        if(ctx.array() != null){
            arrayBody = visitArray(ctx.array());
            forExpression.setArr(arrayBody);
        }

        if (ctx.objArray() != null) {
            objArray = visitObjArray(ctx.objArray());
            forExpression.setObjArray(objArray);
        }


        if(ctx.CP_CONTENT_SEMI_COLON() != null && !ctx.variable().isEmpty() && ctx.INDEX() != null){
            iterator = ctx.variable(2).variableName().CP_CONTENT_IDENTIFIER().getSymbol().getText();
            System.out.println("Variable : " + iterator + " = " + ctx.INDEX().getSymbol().getText());
            forExpression.setIterator(iterator);

        }

        if (ctx.objName() != null) {
            objName = ctx.objName().CP_CONTENT_IDENTIFIER().getSymbol().getText();
            System.out.println("objName : " + objName);
            forExpression.setObjName(objName);
        }

        if (ctx.objBody() != null) {
            objectBody = visitObjBody(ctx.objBody());
            forExpression.setObjBody(objectBody);
        }

        return forExpression;


    }



    @Override
    public SwitchCaseExpression visitSwitchCaseExpression(HTMLParser.SwitchCaseExpressionContext ctx) {
        System.out.println("visit SwitchCaseExpression");
        String caseString;
        String caseNumber;
        SwitchCaseExpression switchCaseExpression = new SwitchCaseExpression();

        if(ctx.CP_CONTENT_STRING() != null){
            caseString = ctx.CP_CONTENT_STRING().getSymbol().getText();
            switchCaseExpression.setCaseString(caseString);
        }
        if (ctx.CP_CONTENT_NUMBER() != null) {
            caseNumber = ctx.CP_CONTENT_NUMBER().getSymbol().getText();
            switchCaseExpression.setCaseNumber(caseNumber);
        }

        return switchCaseExpression;
    }

    @Override
    public SwitchExpression visitSwitchExpression(HTMLParser.SwitchExpressionContext ctx) {
        System.out.println("visit SwitchExpression");
        String variable;
        LiteralValue value = new LiteralValue();
        ObjArray objArray = new ObjArray();
        String objName;
        Property property = new Property();
        SwitchExpression switchExpression = new SwitchExpression();

        if (ctx.value() != null) {
            value = visitValue(ctx.value());
            switchExpression.setValue(value);
        }

        if (ctx.variable() != null) {
            variable = ctx.variable().variableName().CP_CONTENT_IDENTIFIER().getSymbol().getText();
            System.out.println("Variable : " + variable + "\n");
            switchExpression.setVariable(variable);
        }

        if (ctx.objArray() != null) {
            objArray = visitObjArray(ctx.objArray());
            switchExpression.setObjArray(objArray);
        }

        if(ctx.objName() != null){
            objName  = ctx.objName().CP_CONTENT_IDENTIFIER().getSymbol().getText();
            switchExpression.setObjName(objName);
        }

        if (ctx.property() != null) {
            property = visitProperty(ctx.property());
            switchExpression.setProperty(property);
        }

        return switchExpression;
    }

    @Override
    public IfExpression visitIfExpression(HTMLParser.IfExpressionContext ctx) {
        System.out.println("visit IfExpression");
        ComparisonExpression comparisonExpression = new ComparisonExpression();
        BooleanExpression booleanExpression = new BooleanExpression();
        String variable;
        FunctionCall functionCall = new FunctionCall();
        ObjArray objArray = new ObjArray();
        String objName;
        Property property = new Property();
        IfExpression ifExpression = new IfExpression();

        if (ctx.comparisonExpression() != null) {
            comparisonExpression = visitComparisonExpression(ctx.comparisonExpression());
            ifExpression.setComparisonExpression(comparisonExpression);
        }

        if (ctx.booleanExpression() != null) {
            booleanExpression = visitBooleanExpression(ctx.booleanExpression());
            ifExpression.setBooleanExpression(booleanExpression);
        }

        if (ctx.functionCall() != null) {
            functionCall = visitFunctionCall(ctx.functionCall());
            ifExpression.setFunctionCall(functionCall);
        }

        if (ctx.variable() != null) {
            variable = ctx.variable().variableName().CP_CONTENT_IDENTIFIER().getSymbol().getText();
            System.out.println("Variable : " + variable + "\n");
            ifExpression.setVariableName(variable);
        }

        if (ctx.objArray() != null) {
            objArray = visitObjArray(ctx.objArray());
            ifExpression.setObjArray(objArray);
        }

        if (ctx.objName() != null) {
            objName = ctx.objName().CP_CONTENT_IDENTIFIER().getSymbol().getText();
            System.out.println("ObjectName : " + objName + "\t");
            ifExpression.setObjName(objName);
        }

        if (ctx.property() != null) {
            property = visitProperty(ctx.property());
            ifExpression.setProperty(property);
        }

        return ifExpression;

    }


    @Override
    public AnnotationExpression visitAnnotationExpression(HTMLParser.AnnotationExpressionContext ctx) {
        System.out.println("visit AnnotationExpression");

        String variable;
        FunctionCall functionCall = new FunctionCall();
        ObjArray objArray = new ObjArray();
        AnnotationExpression annotationExpression = new AnnotationExpression();

        if (ctx.variable() != null) {
            variable = ctx.variable().variableName().CP_CONTENT_IDENTIFIER().getSymbol().getText();
            System.out.println("Variable : " + variable);
            annotationExpression.setVariableName(variable);
        }

        if (ctx.functionCall() != null) {
            functionCall = visitFunctionCall(ctx.functionCall());
            annotationExpression.setFunctionCall(functionCall);
        }

        if (ctx.objArray() != null) {
            objArray = visitObjArray(ctx.objArray());
            annotationExpression.setObjArray(objArray);
        }

        return annotationExpression;
    }

    @Override
    public ObjArray visitObjArray(HTMLParser.ObjArrayContext ctx) {
        String arrayName;
        List<ArrayBody> arrayBodyList = new ArrayList<>();
        FunctionParametersList functionParametersList = new FunctionParametersList();
        Property property = new Property();
        ObjArray objArray = new ObjArray();

        if (ctx.arrName() != null) {
            arrayName = ctx.arrName().CP_CONTENT_IDENTIFIER().getSymbol().getText();
            System.out.println("Array Name : " + arrayName);
            objArray.setArrayName(arrayName);
        }

        if (!ctx.array().isEmpty()) {
            for (int i = 0; i < ctx.array().size(); i++) {
                arrayBodyList.add(visitArray(ctx.array(i)));
                objArray.setArrayBodyList(arrayBodyList);
            }
        }

        if (ctx.parameters()!= null) {
            functionParametersList = visitParameters(ctx.parameters());
            objArray.setFunctionParametersList(functionParametersList);
        }

        if (ctx.property() != null) {
            property = visitProperty(ctx.property());
            objArray.setProperty(property);
        }
        return objArray;
    }

    @Override
    public ArrayBody visitArray(HTMLParser.ArrayContext ctx) {
        System.out.println("visit Array");
        List<LiteralValue> literalValues = new ArrayList<>();
        ArrayBody arrayBody = new ArrayBody();

        if (!ctx.value().isEmpty()) {
            for (int i = 0; i < ctx.value().size(); i++) {
                literalValues.add(visitValue(ctx.value(i)));
                arrayBody.setLiteralValues(literalValues);
            }
        }else System.out.println("[ ]");
        return arrayBody;
    }

    @Override
    public LiteralValue visitValue(HTMLParser.ValueContext ctx) {
        System.out.println("visit Value");
        String string;
        String number;
        String aboolean;
        ArrayBody arrayBody = new ArrayBody();
        ObjectBody objectBody = new ObjectBody();
        LiteralValue literalValue = new LiteralValue();

        if (ctx.CP_CONTENT_STRING() != null) {
            string = ctx.CP_CONTENT_STRING().getSymbol().getText();
            System.out.println(string + "\t");
            literalValue.setString(string);
        }

        if (ctx.CP_CONTENT_NUMBER() != null) {
            number = ctx.CP_CONTENT_NUMBER().getSymbol().getText();
            System.out.println(number + "\t");
            literalValue.setNumber(number);
        }

        if (ctx.CP_CONTENT_NULL() != null) {
            aboolean = ctx.CP_CONTENT_NULL().getSymbol().getText();
            literalValue.setBoolean(aboolean);
        }

        if (ctx.CP_CONTENT_TRUE() != null) {
            aboolean = ctx.CP_CONTENT_TRUE().getSymbol().getText();
            literalValue.setBoolean(aboolean);
        }

        if (ctx.CP_CONTENT_FALSE() != null) {
            aboolean = ctx.CP_CONTENT_FALSE().getSymbol().getText();
            literalValue.setBoolean(aboolean);
        }

        if (ctx.array()!=null ) {
            arrayBody = visitArray(ctx.array());
            literalValue.setArrayBody(arrayBody);
        }

        if (ctx.objBody() != null) {
         objectBody = visitObjBody(ctx.objBody());
            literalValue.setObjBody(objectBody);
        }
        return literalValue;
    }

    @Override
    public Property visitProperty(HTMLParser.PropertyContext ctx) {
        System.out.println("visit property");
        String variable;
        Property property = new Property();

        if (ctx.CP_CONTENT_IDENTIFIER() != null) {
            variable = ctx.CP_CONTENT_IDENTIFIER().getSymbol().getText();
            System.out.println("property : " + variable);
            property.setVariable(variable);
        }

        return property;
    }

    @Override
    public FunctionCall visitFunctionCall(HTMLParser.FunctionCallContext ctx) {
        System.out.println("visit FunctionCall");
        String functionName;
        FunctionParametersList functionParametersList = new FunctionParametersList();
        FunctionCall functionCall = new FunctionCall();

        if (ctx.functionName()!=null) {
            functionName = ctx.functionName().CP_CONTENT_IDENTIFIER().getSymbol().getText();
            System.out.println("functionName : " + functionName);
            functionCall.setFunctionName(functionName);
        }

        if (ctx.parameters()!=null) {
            functionParametersList = visitParameters(ctx.parameters());
            functionCall.setFunctionParameters(functionParametersList);
        }
        return functionCall;
    }

    @Override
    public FunctionParametersList visitParameters(HTMLParser.ParametersContext ctx) {
        System.out.println("visit parameters");
        List<FunctionParameters> functionParameters = new ArrayList<>();
        FunctionParametersList functionParametersList = new FunctionParametersList();

        if (!ctx.parameter().isEmpty()) {
            for (int i = 0; i < ctx.parameter().size(); i++) {
                functionParameters.add(visitParameter(ctx.parameter(i)));
                functionParametersList.setFunctionParameters(functionParameters);
            }
        }
        return functionParametersList;
    }

    @Override
    public FunctionParameters visitParameter(HTMLParser.ParameterContext ctx) {
        System.out.println("visit Parameter");
        String parameterName;
        FunctionParameters functionParameters = new FunctionParameters();

        if (ctx.parameterName() != null) {
            if(ctx.parameterName().CP_CONTENT_IDENTIFIER() != null){
                parameterName = ctx.parameterName().CP_CONTENT_IDENTIFIER().getSymbol().getText();
                System.out.println(parameterName + "\t");
                functionParameters.setParameterName(parameterName);
            }

            if(ctx.parameterName().CP_CONTENT_STRING() != null){
                parameterName = ctx.parameterName().CP_CONTENT_STRING().getSymbol().getText();
                System.out.println(parameterName + "\t");
                functionParameters.setParameterName(parameterName);
            }

            if (ctx.parameterName().CP_CONTENT_NUMBER() != null) {
                parameterName = ctx.parameterName().CP_CONTENT_NUMBER().getSymbol().getText();
                System.out.println(parameterName + "\t");
                functionParameters.setParameterName(parameterName);
            }
        }
        return functionParameters;
    }

    @Override
    public ComparisonExpression visitComparisonExpression(HTMLParser.ComparisonExpressionContext ctx) {
        System.out.println("visit ComparisonExpression");
        String leftVariable;
        ComparisonOpeartor operator = new ComparisonOpeartor();
        LiteralValue value = new LiteralValue();
        String rightVariable;

        String objName;
        Property property = new Property();

        ComparisonExpression comparisonExpression = new ComparisonExpression();

        if(!ctx.variable().isEmpty()){
            if(ctx.variable(0) != null) {
                leftVariable = ctx.variable(0).variableName().CP_CONTENT_IDENTIFIER().getSymbol().getText();
                System.out.println("variable : " + leftVariable + "\t");
                comparisonExpression.setLeftVar(leftVariable);
            }
        }

        if (ctx.comparisonOperator()!=null) {
            operator = visitComparisonOperator(ctx.comparisonOperator());
            comparisonExpression.setComparisonOperator(operator);
        }

        if(!ctx.variable().isEmpty()){
            if(ctx.variable(1) != null){
                rightVariable = ctx.variable(1).variableName().CP_CONTENT_IDENTIFIER().getSymbol().getText();
                System.out.println("variable : " + rightVariable + "\n");
                comparisonExpression.setRightVar(rightVariable);
            }
        }

        if (ctx.value() != null) {
            value = visitValue(ctx.value());
            comparisonExpression.setLiteralValue(value);
        }

        if (ctx.objName() != null) {
            objName = ctx.objName().CP_CONTENT_IDENTIFIER().getSymbol().getText();
            System.out.println("object name : " + objName);
            comparisonExpression.setObjName(objName);

            if (ctx.property()!=null) {
                property = visitProperty(ctx.property());
                comparisonExpression.setProperty(property);
            }

            if (ctx.comparisonOperator()!=null) {
                operator = visitComparisonOperator(ctx.comparisonOperator());
                comparisonExpression.setComparisonOperator(operator);
            }

            if (!ctx.variable().isEmpty()) {
                if(ctx.variable(0) != null){
                    rightVariable = ctx.variable(0).variableName().CP_CONTENT_IDENTIFIER().getSymbol().getText();
                    System.out.println("variable : " + rightVariable);
                    comparisonExpression.setRightVar(rightVariable);
                }

            }
            if (ctx.value()!=null) {
                value = visitValue(ctx.value());
                comparisonExpression.setLiteralValue(value);
            }
        }

    return comparisonExpression;
    }

    @Override
    public ComparisonOpeartor visitComparisonOperator(HTMLParser.ComparisonOperatorContext ctx) {
        System.out.println("visit ComparisonOperator");
        String operator;
        ComparisonOpeartor comparisonOpeartor = new ComparisonOpeartor();


        if(ctx.CP_CONTENT_EQUAL_TO() != null){
            operator = ctx.CP_CONTENT_EQUAL_TO().getSymbol().getText();
            System.out.println("op : " + operator + "\t");
            comparisonOpeartor.setComparisonOperator(operator);
        }
        if (ctx.CP_CONTENT_GREATER_EQ() != null) {
            operator = ctx.CP_CONTENT_GREATER_EQ().getSymbol().getText();
            System.out.println("op : " + operator + "\t");
            comparisonOpeartor.setComparisonOperator(operator);
        }
        if (ctx.CP_CONTENT_GREATER_THAN() != null) {
            operator = ctx.CP_CONTENT_GREATER_THAN().getSymbol().getText();
            System.out.println("op : " + operator + "\t");
            comparisonOpeartor.setComparisonOperator(operator);
        }
        if (ctx.CP_CONTENT_LESS_EQ() != null) {
            operator = ctx.CP_CONTENT_LESS_EQ().getSymbol().getText();
            System.out.println("op : " + operator + "\t");
            comparisonOpeartor.setComparisonOperator(operator);
        }
        if (ctx.CP_CONTENT_LESS_THAN() != null) {
            operator = ctx.CP_CONTENT_LESS_THAN().getSymbol().getText();
            System.out.println("op : " + operator + "\t");
            comparisonOpeartor.setComparisonOperator(operator);
        }
        if (ctx.CP_CONTENT_NOT_EQUAL() != null) {
            operator = ctx.CP_CONTENT_NOT_EQUAL().getSymbol().getText();
            System.out.println("op : " + operator + "\t");
            comparisonOpeartor.setComparisonOperator(operator);
        }
    return comparisonOpeartor;
    }

    @Override
    public BooleanExpression visitBooleanExpression(HTMLParser.BooleanExpressionContext ctx) {
        System.out.println("visit BooleanExpression");
        String leftVariable;
        BooleanOperator operator = new BooleanOperator();
        LiteralValue value = new LiteralValue();
        String rightVariable;

        String objName;
        Property property = new Property();

        BooleanExpression booleanExpression = new BooleanExpression();

        if(!ctx.variable().isEmpty()) {
            if (ctx.variable(0) != null) {
                leftVariable = ctx.variable(0).variableName().CP_CONTENT_IDENTIFIER().getSymbol().getText();
                System.out.println("variable : " + leftVariable + "\t");
                booleanExpression.setLeftVar(leftVariable);
            }
        }

        if (ctx.booleanOperator() != null) {
            operator = visitBooleanOperator(ctx.booleanOperator());
            booleanExpression.setBooleanOperator(operator);
        }

        if(!ctx.variable().isEmpty()) {
            if (ctx.variable(1) != null) {
                rightVariable = ctx.variable(1).variableName().CP_CONTENT_IDENTIFIER().getSymbol().getText();
                System.out.println("variable : " + rightVariable + "\n");
                booleanExpression.setRightVar(rightVariable);
            }
        }
        if (ctx.value() != null) {
            value = visitValue(ctx.value());
            booleanExpression.setLiteralValue(value);
        }

        if (ctx.objName() != null) {
            objName = ctx.objName().CP_CONTENT_IDENTIFIER().getSymbol().getText();
            System.out.println("object name : " + objName);
            booleanExpression.setObjName(objName);

            if (ctx.property() != null) {
                property = visitProperty(ctx.property());
                booleanExpression.setProperty(property);
            }

            if (ctx.booleanOperator() != null) {
                operator = visitBooleanOperator(ctx.booleanOperator());
                booleanExpression.setBooleanOperator(operator);
            }

            if (!ctx.variable().isEmpty()) {
                if (ctx.variable(0) != null) {
                    rightVariable = ctx.variable(0).variableName().CP_CONTENT_IDENTIFIER().getSymbol().getText();
                    System.out.println("variable : " + rightVariable);
                    booleanExpression.setRightVar(rightVariable);
                }
            }
            if (ctx.value() != null) {
                value = visitValue(ctx.value());
                booleanExpression.setLiteralValue(value);
            }
        }
        return booleanExpression;
    }

    @Override
    public BooleanOperator visitBooleanOperator(HTMLParser.BooleanOperatorContext ctx) {
        System.out.println("visit BooleanOperator");
        String operator;
        BooleanOperator booleanOperator = new BooleanOperator();

        if (ctx.CP_CONTENT_AND() != null) {
            operator = ctx.CP_CONTENT_AND().getSymbol().getText();
            System.out.println("op : " + operator + "\t");
            booleanOperator.setBooleanOperator(operator);
        }

        if (ctx.CP_CONTENT_OR() != null) {
            operator = ctx.CP_CONTENT_OR().getSymbol().getText();
            System.out.println("op : " + operator + "\t");
            booleanOperator.setBooleanOperator(operator);
        }
        if (ctx.CP_CONTENT_NOT() != null) {
            operator = ctx.CP_CONTENT_NOT().getSymbol().getText();
            System.out.println("op : " + operator + "\t");
            booleanOperator.setBooleanOperator(operator);
        }
        return booleanOperator;
    }

    @Override
    public ObjectBody visitObjBody(HTMLParser.ObjBodyContext ctx) {
        System.out.println("visit ObjBody");
        List<ObjectPair> objectPairList = new ArrayList<>();
        ObjectBody objectBody = new ObjectBody();

        if (!ctx.pair().isEmpty()) {
            for (int i = 0; i < ctx.pair().size(); i++) {
                objectPairList.add(visitPair(ctx.pair(i)));
                objectBody.setObjPairs(objectPairList);
            }
        }
        return objectBody;
    }

    @Override
    public ObjectPair visitPair(HTMLParser.PairContext ctx) {
        System.out.println("visit Pair");
        String key;
        LiteralValue value = new LiteralValue();
        ObjectPair pair = new ObjectPair();

        if (ctx.key() != null) {
            key = ctx.key().CP_CONTENT_IDENTIFIER().getSymbol().getText();
            System.out.println("Key : " + key + "\t");
            pair.setKey(key);
        }

        if (ctx.value() != null) {
            value = visitValue(ctx.value());
            pair.setLiteralValue(value);
        }
        return pair;
    }

    // SAHER WORK //

    // MUSTACHE
    @Override
    public Object visitMustacheExpression(HTMLParser.MustacheExpressionContext ctx) {
        System.out.println("visit MustacheExpression");
        MustacheExpression Mus = new MustacheExpression();

        if(ctx.mustacheVariable() != null){
            Mus.setMustahceVariable(ctx.mustacheVariable().MUSTACHE_IDENTIFIER().getSymbol().getText());
            System.out.println("mustacheVariable : " + ctx.mustacheVariable().MUSTACHE_IDENTIFIER().getSymbol().getText() );
        }

        if(ctx.oneLineCondition() != null){
            Mus.setOneLineCondition((OneLineCondition) visitOneLineCondition(ctx.oneLineCondition()));
        }

        if(ctx.filter() != null){
            Mus.setMustacheFilter((MustacheFilter) visitFilter(ctx.filter()));
        }


        return Mus;
    }

    //ONE LINE CONDITION
    @Override
    public Object visitOneLineCondition(HTMLParser.OneLineConditionContext ctx) {
        System.out.println("visits OneLineCondition");
        OneLineCondition OLC = new OneLineCondition();

        if(ctx.mustacheComparisonExpression() != null){
            OLC.setMustacheComparisonExpression((MustacheComparisonExpression) visitMustacheComparisonExpression(ctx.mustacheComparisonExpression()));
        }

        if(ctx.ifTrue() != null){
            OLC.setIfTrueStmt((IfTrue) visitIfTrue(ctx.ifTrue()));
        }

        if(ctx.ifFalse() != null){
            OLC.setIfFalseStmt((IfFalse) visitIfFalse(ctx.ifFalse()));
        }

        return OLC;
    }

    @Override
    public Object visitMustacheComparisonExpression(HTMLParser.MustacheComparisonExpressionContext ctx) {
        System.out.println("visit MustacheComparisonExpression");
        MustacheComparisonExpression MCE = new MustacheComparisonExpression();

        if(ctx.mustacheVariable() != null){
            MCE.setVariable((String) ctx.mustacheVariable().MUSTACHE_IDENTIFIER().getSymbol().getText());
            System.out.println("{{ " + ctx.mustacheVariable().MUSTACHE_IDENTIFIER().getSymbol().getText() + " }}" );

        }

        if(ctx.mustacheComparisonOperator() != null){
            if(ctx.mustacheComparisonOperator().MUSTACHE_EQUAL_TO() != null){
                MCE.setOp(ctx.mustacheComparisonOperator().MUSTACHE_EQUAL_TO().getSymbol().getText());
                System.out.println("mustacheComparisonOp : " + ctx.mustacheComparisonOperator().MUSTACHE_EQUAL_TO().getSymbol().getText());
            }else if(ctx.mustacheComparisonOperator().MUSTACHE_GREATER_EQ() != null){
                MCE.setOp(ctx.mustacheComparisonOperator().MUSTACHE_GREATER_EQ().getSymbol().getText());
                System.out.println("mustacheComparisonOp : " + ctx.mustacheComparisonOperator().MUSTACHE_GREATER_EQ().getSymbol().getText());
            }else if(ctx.mustacheComparisonOperator().MUSTACHE_LESS_EQ() != null){
            MCE.setOp(ctx.mustacheComparisonOperator().MUSTACHE_LESS_EQ().getSymbol().getText());
                System.out.println("mustacheComparisonOp : " + ctx.mustacheComparisonOperator().MUSTACHE_LESS_EQ().getSymbol().getText());
            }else if(ctx.mustacheComparisonOperator().MUSTACHE_NOT_EQUAL() != null){
                MCE.setOp(ctx.mustacheComparisonOperator().MUSTACHE_NOT_EQUAL().getSymbol().getText());
                System.out.println("mustacheComparisonOp : " + ctx.mustacheComparisonOperator().MUSTACHE_NOT_EQUAL().getSymbol().getText());
            }else if(ctx.mustacheComparisonOperator().MUSTACHE_LESS_THAN() != null){
                MCE.setOp(ctx.mustacheComparisonOperator().MUSTACHE_LESS_THAN().getSymbol().getText());
                System.out.println("mustacheComparisonOp : " + ctx.mustacheComparisonOperator().MUSTACHE_LESS_THAN().getSymbol().getText());
            }else if(ctx.mustacheComparisonOperator().MUSTACHE_GREATER_THAN() != null){
                MCE.setOp(ctx.mustacheComparisonOperator().MUSTACHE_GREATER_THAN().getSymbol().getText());
                System.out.println("mustacheComparisonOp : " + ctx.mustacheComparisonOperator().MUSTACHE_GREATER_THAN().getSymbol().getText());
            }
        }
        if(ctx.mustacheValue() != null){
            if(ctx.mustacheValue().MUSTACHE_FALSE() != null){
                    MCE.setMustachevalue(ctx.mustacheValue().MUSTACHE_FALSE().getSymbol().getText());
                    System.out.println("mustacheVA : " + ctx.mustacheValue().MUSTACHE_FALSE().getSymbol().getText());
            }else if(ctx.mustacheValue().MUSTACHE_TRUE() != null) {
                MCE.setMustachevalue(ctx.mustacheValue().MUSTACHE_TRUE().getSymbol().getText());
                System.out.println("mustacheVA : " + ctx.mustacheValue().MUSTACHE_TRUE().getSymbol().getText());
            }else if(ctx.mustacheValue().MUSTACHE_NULL() != null) {
                MCE.setMustachevalue(ctx.mustacheValue().MUSTACHE_NULL().getSymbol().getText());
                System.out.println("mustacheVA : " + ctx.mustacheValue().MUSTACHE_NULL().getSymbol().getText());
            }else if(ctx.mustacheValue().MUSTACHE_NUMBER() != null) {
                MCE.setMustachevalue(ctx.mustacheValue().MUSTACHE_NUMBER().getSymbol().getText());
                System.out.println("mustacheVA : " + ctx.mustacheValue().MUSTACHE_NUMBER().getSymbol().getText());
            }else if(ctx.mustacheValue().MUSTACHE_STRING() != null){
                MCE.setMustachevalue(ctx.mustacheValue().MUSTACHE_STRING().getSymbol().getText());
                System.out.println("mustacheVA : " + ctx.mustacheValue().MUSTACHE_STRING().getSymbol().getText());
            }
        }

        return MCE;
    }

    @Override
    public Object visitIfTrue(HTMLParser.IfTrueContext ctx) {
        System.out.println("visit IfTrue");
        IfTrue IT = new IfTrue();
        if (ctx.MUSTACHE_NULL() != null){
            IT.setIfTrue(ctx.MUSTACHE_NULL().getSymbol().getText());
            System.out.println("mustacheIT : " + ctx.MUSTACHE_NULL().getSymbol().getText());
        }else if(ctx.MUSTACHE_TRUE() != null){
            IT.setIfTrue(ctx.MUSTACHE_TRUE().getSymbol().getText());
            System.out.println("mustacheIT : " + ctx.MUSTACHE_TRUE().getSymbol().getText());
        }else if(ctx.MUSTACHE_FALSE() != null){
            IT.setIfTrue(ctx.MUSTACHE_FALSE().getSymbol().getText());
            System.out.println("mustacheIT : " + ctx.MUSTACHE_FALSE().getSymbol().getText());
        }else if(ctx.MUSTACHE_STRING() != null){
            IT.setIfTrue(ctx.MUSTACHE_STRING().getSymbol().getText());
            System.out.println("mustacheIT : " + ctx.MUSTACHE_STRING().getSymbol().getText());
        }else if(ctx.MUSTACHE_NUMBER() != null){
            IT.setIfTrue(ctx.MUSTACHE_NUMBER().getSymbol().getText());
            System.out.println("mustacheIT : " + ctx.MUSTACHE_NUMBER().getSymbol().getText());
        }

        return IT;
    }

    @Override
    public Object visitIfFalse(HTMLParser.IfFalseContext ctx) {
        System.out.println("visit IfFalse");
        IfFalse IF = new IfFalse();
        if (ctx.MUSTACHE_NULL() != null){
            IF.setIfFalse(ctx.MUSTACHE_NULL().getSymbol().getText());
            System.out.println("mustacheIF : " + ctx.MUSTACHE_NULL().getSymbol().getText());
        }else if(ctx.MUSTACHE_TRUE() != null){
            IF.setIfFalse(ctx.MUSTACHE_TRUE().getSymbol().getText());
            System.out.println("mustacheIF : " + ctx.MUSTACHE_TRUE().getSymbol().getText());
        }else if(ctx.MUSTACHE_FALSE() != null){
            IF.setIfFalse(ctx.MUSTACHE_FALSE().getSymbol().getText());
            System.out.println("mustacheIF : " + ctx.MUSTACHE_FALSE().getSymbol().getText());
        }else if(ctx.MUSTACHE_STRING() != null){
            IF.setIfFalse(ctx.MUSTACHE_STRING().getSymbol().getText());
            System.out.println("mustacheIF : " + ctx.MUSTACHE_STRING().getSymbol().getText());
        }else if(ctx.MUSTACHE_NUMBER() != null){
            IF.setIfFalse(ctx.MUSTACHE_NUMBER().getSymbol().getText());
            System.out.println("mustacheIF : " + ctx.MUSTACHE_NUMBER().getSymbol().getText());
        }

        return IF;
    }

    // FILTER
    @Override
    public Object visitFilter(HTMLParser.FilterContext ctx) {
        System.out.println("visit Filter");

        MustacheFilter MF = new MustacheFilter();

        if(ctx.modelName() != null){
            MF.setModelName((String) ctx.modelName().MUSTACHE_IDENTIFIER().getSymbol().getText());
            System.out.println("`mustache modelName : " + ctx.modelName().MUSTACHE_IDENTIFIER().getSymbol().getText());
        }
        if(ctx.formatName() != null){
            MF.setFormatName((String) ctx.formatName().MUSTACHE_IDENTIFIER().getSymbol().getText());
            System.out.println("`mustache formatName : " + ctx.formatName().MUSTACHE_IDENTIFIER().getSymbol().getText());
        }
        if(ctx.formatType() != null){
            MF.setFormatType((String) ctx.formatType().MUSTACHE_STRING().getSymbol().getText());
            System.out.println("`mustache formatType : " + ctx.formatType().MUSTACHE_STRING().getSymbol().getText());
        }
        return MF;

    }

// SAHER WORK //



}











































