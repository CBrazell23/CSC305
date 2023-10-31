
public interface ParserVisitor {
	/**
	 * Overloaded method that takes in both types of parsers and correctly parses the files
	 * @param simp
	 */
	public void visit(SimpleParser simp);
	
	/**
	 * Overloaded method that takes in both types of parsers and correctly parses the files
	 * @param notSimp
	 */
	public void visit(NotSimpleParser notSimp);
}