import java.util.ArrayList;

public abstract class ParserDecorator implements JsonParser{
	JsonParser parser;
	
	public ParserDecorator(JsonParser parser) {
		this.parser = parser;
	}
	
	/**
	 * Method that Decorates the parser so that it can be properly parsed
	 * @return the parsed articles
	 */
	@Override
	public ArrayList<Article> parseArticles(){
		return parser.parseArticles();
	}
}
