package old.generatedback.ASTBack.Elements.ElementsNodes.Miscallenous;

import java.util.ArrayList;
import java.util.List;

public class ObjArray {
    private String arrayName;
    private List<ArrayBody> arrayBodyList = new ArrayList<>();
    private FunctionParametersList functionParametersList = new FunctionParametersList();
    private Property property = new Property();

    public String getArrayName() {
        return arrayName;
    }

    public void setArrayName(String arrayName) {
        this.arrayName = arrayName;
    }

    public List<ArrayBody> getArrayBodyList() {
        return arrayBodyList;
    }

    public void setArrayBodyList(List<ArrayBody> arrayBodyList) {
        this.arrayBodyList = arrayBodyList;
    }

    public FunctionParametersList getFunctionParametersList() {
        return functionParametersList;
    }

    public void setFunctionParametersList(FunctionParametersList functionParametersList) {
        this.functionParametersList = functionParametersList;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }
}
