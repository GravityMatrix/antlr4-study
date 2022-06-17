// Generated from D:/java-project/antlr4-study/src/main/resources/g4\QueryDSL.g4 by ANTLR 4.10.1
package antlr4.parser.dsl;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QueryDSLParser}.
 */
public interface QueryDSLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link QueryDSLParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(QueryDSLParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryDSLParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(QueryDSLParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code param}
	 * labeled alternative in {@link QueryDSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParam(QueryDSLParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code param}
	 * labeled alternative in {@link QueryDSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParam(QueryDSLParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code like}
	 * labeled alternative in {@link QueryDSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLike(QueryDSLParser.LikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code like}
	 * labeled alternative in {@link QueryDSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLike(QueryDSLParser.LikeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code in}
	 * labeled alternative in {@link QueryDSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIn(QueryDSLParser.InContext ctx);
	/**
	 * Exit a parse tree produced by the {@code in}
	 * labeled alternative in {@link QueryDSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIn(QueryDSLParser.InContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessThanEquals}
	 * labeled alternative in {@link QueryDSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLessThanEquals(QueryDSLParser.LessThanEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessThanEquals}
	 * labeled alternative in {@link QueryDSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLessThanEquals(QueryDSLParser.LessThanEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equals}
	 * labeled alternative in {@link QueryDSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEquals(QueryDSLParser.EqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equals}
	 * labeled alternative in {@link QueryDSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEquals(QueryDSLParser.EqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessThan}
	 * labeled alternative in {@link QueryDSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLessThan(QueryDSLParser.LessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessThan}
	 * labeled alternative in {@link QueryDSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLessThan(QueryDSLParser.LessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sort}
	 * labeled alternative in {@link QueryDSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSort(QueryDSLParser.SortContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sort}
	 * labeled alternative in {@link QueryDSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSort(QueryDSLParser.SortContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterThanEquals}
	 * labeled alternative in {@link QueryDSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanEquals(QueryDSLParser.GreaterThanEqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterThanEquals}
	 * labeled alternative in {@link QueryDSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanEquals(QueryDSLParser.GreaterThanEqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterThan}
	 * labeled alternative in {@link QueryDSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThan(QueryDSLParser.GreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterThan}
	 * labeled alternative in {@link QueryDSLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThan(QueryDSLParser.GreaterThanContext ctx);
}