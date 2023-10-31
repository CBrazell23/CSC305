import java.util.ArrayList;

interface JsonParser {

	/**
	 * parseArticles returns a list of Article objects created by gathering the data from the provided file
	 * @return ArrayList containing Article 
	 */
	ArrayList<Article> parseArticles();
	
	/**
	 * Visitor acceptor
	 * @param vis
	 */
	void accept(ParserVisitor vis);
}