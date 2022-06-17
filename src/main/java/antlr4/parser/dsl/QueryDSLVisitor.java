// Generated from D:/java-project/antlr4-study/src/main/resources/g4\QueryDSL.g4 by ANTLR 4.10.1
package antlr4.parser.dsl;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link QueryDSLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface QueryDSLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link QueryDSLParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(QueryDSLParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code param}
	 * labeled alternative in {@link QueryDSLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(QueryDSLParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code like}
	 * labeled alternative in {@link QueryDSLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLike(QueryDSLParser.LikeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code in}
	 * labeled alternative in {@link QueryDSLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn(QueryDSLParser.InContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessThanEquals}
	 * labeled alternative in {@link QueryDSLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanEquals(QueryDSLParser.LessThanEqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equals}
	 * labeled alternative in {@link QueryDSLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquals(QueryDSLParser.EqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessThan}
	 * labeled alternative in {@link QueryDSLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThan(QueryDSLParser.LessThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sort}
	 * labeled alternative in {@link QueryDSLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSort(QueryDSLParser.SortContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterThanEquals}
	 * labeled alternative in {@link QueryDSLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanEquals(QueryDSLParser.GreaterThanEqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterThan}
	 * labeled alternative in {@link QueryDSLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThan(QueryDSLParser.GreaterThanContext ctx);
}