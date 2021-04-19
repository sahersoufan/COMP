package MyCompiler;

import old.generatedback.ASTBack.HtmlDocument;
import old.generatedback.Baseback.BaseVisitor;
import old.generatedback.HTMLLexer;
import old.generatedback.HTMLParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;


import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {


    public static void main(String[] args) {
        try {
            String source = "E:\\forth year\\COMP\\src\\sample.txt";
            CharStream cs = fromFileName(source);
            HTMLLexer lexer = new HTMLLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            HTMLParser parser = new HTMLParser(token);
            ParseTree tree = parser.htmlDocument();
            HtmlDocument doc = (HtmlDocument) new BaseVisitor().visit(tree);
            System.out.println(doc);


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
