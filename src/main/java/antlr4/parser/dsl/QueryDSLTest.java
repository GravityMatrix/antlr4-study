package antlr4.parser.dsl;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 * @author WangChen
 * @since 2022-06-17 16:16
 **/
public class QueryDSLTest {


    public static void main(String[] args) {

        CodePointCharStream codePointCharStream = CharStreams.fromString("name==qc;");
        QueryDSLLexer queryDSLLexer = new QueryDSLLexer(codePointCharStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(queryDSLLexer);
        QueryDSLParser queryDSLParser = new QueryDSLParser(commonTokenStream);
        QueryDSLParser.ParseContext statement = queryDSLParser.parse();
        QueryDSLBaseVisitor<String> queryDSLBaseVisitor = new QueryDSLBaseVisitor<String>() {

            @Override
            public String visitParse(QueryDSLParser.ParseContext ctx) {
                return super.visitParse(ctx);
            }

            @Override
            public String visitParam(QueryDSLParser.ParamContext ctx) {
                String text = ctx.PARAM().getText();
                System.out.println("Param: " + text);
                return text;
            }

            @Override
            public String visitLike(QueryDSLParser.LikeContext ctx) {
                System.out.println("like操作符:" + ctx.getText());
                System.out.println("like值:" + ctx.LIKE().getText());
                return super.visitLike(ctx);
            }

            @Override
            public String visitIn(QueryDSLParser.InContext ctx) {
                return super.visitIn(ctx);
            }

            @Override
            public String visitLessThanEquals(QueryDSLParser.LessThanEqualsContext ctx) {
                System.out.println("LessThanEquals操作符:" + ctx.getText());
                System.out.println("LessThanEquals值:" + ctx.LE().getText());
                return super.visitLessThanEquals(ctx);
            }

            @Override
            public String visitEquals(QueryDSLParser.EqualsContext ctx) {
                System.out.println("Equals操作符:" + ctx.getText());
                System.out.println("Equals值:" + ctx.EQ().getText());
                return super.visitEquals(ctx);
            }

            @Override
            public String visitLessThan(QueryDSLParser.LessThanContext ctx) {
                return super.visitLessThan(ctx);
            }

            @Override
            public String visitSort(QueryDSLParser.SortContext ctx) {
                return super.visitSort(ctx);
            }

            @Override
            public String visitGreaterThanEquals(QueryDSLParser.GreaterThanEqualsContext ctx) {
                System.out.println("GreaterThanEquals操作符:" + ctx.getText());
                System.out.println("GreaterThanEquals值:" + ctx.GE().getText());
                return super.visitGreaterThanEquals(ctx);
            }

            @Override
            public String visitGreaterThan(QueryDSLParser.GreaterThanContext ctx) {
                return super.visitGreaterThan(ctx);
            }
        };
        queryDSLBaseVisitor.visit(statement);

    }
}
