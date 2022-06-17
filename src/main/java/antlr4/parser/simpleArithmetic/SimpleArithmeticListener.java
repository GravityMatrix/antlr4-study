// Generated from D:/java-project/antlr4-study/src/main/resources/g4\SimpleArithmetic.g4 by ANTLR 4.10.1
package antlr4.parser.simpleArithmetic;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleArithmeticParser}.
 */
public interface SimpleArithmeticListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleArithmeticParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(SimpleArithmeticParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleArithmeticParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(SimpleArithmeticParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Add}
	 * labeled alternative in {@link SimpleArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd(SimpleArithmeticParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link SimpleArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd(SimpleArithmeticParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Div}
	 * labeled alternative in {@link SimpleArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDiv(SimpleArithmeticParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link SimpleArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDiv(SimpleArithmeticParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Min}
	 * labeled alternative in {@link SimpleArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMin(SimpleArithmeticParser.MinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Min}
	 * labeled alternative in {@link SimpleArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMin(SimpleArithmeticParser.MinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link SimpleArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMul(SimpleArithmeticParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link SimpleArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMul(SimpleArithmeticParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link SimpleArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(SimpleArithmeticParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link SimpleArithmeticParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(SimpleArithmeticParser.IntContext ctx);
}