//package antlr4.parser.simpleArithmetic;
//
//import org.antlr.v4.runtime.CharStream;
//import org.antlr.v4.runtime.CharStreams;
//import org.antlr.v4.runtime.CommonTokenStream;
//
//import java.io.IOException;
//import java.util.List;
//
///**
// * @author WangChen
// * @since 2022-06-17 10:12
// **/
//public class SimpleArithmeticTest {
//
//
//    public static void main(String[] args) throws IOException {
//        CharStream input = CharStreams.fromString("1 + 2");
//        SimpleArithmeticLexer simpleArithmeticLexer = new SimpleArithmeticLexer(input);
//        CommonTokenStream tokens = new CommonTokenStream(simpleArithmeticLexer);
//        SimpleArithmeticParser simpleArithmeticParser = new SimpleArithmeticParser(tokens);
//        SimpleArithmeticParser.StmtContext tree = simpleArithmeticParser.stmt();
//        SimpleVisitor simpleVisitor = new SimpleVisitor();
//        simpleVisitor.visit(tree);
//    }
//
//
//    static class SimpleVisitor extends SimpleArithmeticBaseVisitor<Integer> {
//        @Override
//        public Integer visitStmt(SimpleArithmeticParser.StmtContext ctx) {
//            System.out.println("StmtContext:" + ctx.toString());
//            return super.visitStmt(ctx);
//        }
//
//        @Override
//        public Integer visitAdd(SimpleArithmeticParser.AddContext ctx) {
//            List<SimpleArithmeticParser.ExprContext> expr = ctx.expr();
//            for (SimpleArithmeticParser.ExprContext exprContext : expr) {
//                Integer val = visit(exprContext);
//                System.out.println("加法值:" + val);
//            }
//            System.out.println(expr.toString());
//            System.out.println("加法:" + ctx.toString());
//            return super.visitAdd(ctx);
//        }
//
//        @Override
//        public Integer visitDiv(SimpleArithmeticParser.DivContext ctx) {
//            System.out.println("除法:" + ctx.toString());
//            return super.visitDiv(ctx);
//        }
//
//        @Override
//        public Integer visitMin(SimpleArithmeticParser.MinContext ctx) {
//            System.out.println("减法:" + ctx.toString());
//            return super.visitMin(ctx);
//        }
//
//        @Override
//        public Integer visitMul(SimpleArithmeticParser.MulContext ctx) {
//            System.out.println("乘法:" + ctx.toString());
//            return super.visitMul(ctx);
//        }
//
//        @Override
//        public Integer visitInt(SimpleArithmeticParser.IntContext ctx) {
//            return Integer.valueOf(ctx.INT().getText());
//        }
//    }
//}
