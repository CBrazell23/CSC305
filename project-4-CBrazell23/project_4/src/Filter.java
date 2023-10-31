import java.util.ArrayList;

public class Filter extends ParserDecorator{
	String filter;

	public Filter(JsonParser parser, String filter) {
		super(parser);
		this.filter = filter;
	}
	
	/**
	 * Parses the articles with the added filter
	 * @return the filtered list of articles
	 */
	@Override
    public ArrayList<Article> parseArticles(){
		return filter(super.parseArticles());
	}
	
	/**
	 * Filters the articles to only show the ones that fit the filter
	 * @param articleList
	 * @return the new arraylist of articles
	 */
	ArrayList<Article> filter(ArrayList<Article> articleList){
		ArrayList<Article> list = new ArrayList<>();
		for(Article a : articleList) {
			String str = a.getTitle();
			String nstr = "";
			for(int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				nstr = ch+nstr;
			}
			int idx = nstr.indexOf("-");
			String source = nstr.substring(0, idx);
			String sourceName = "";
			for(int i = 0; i < source.length(); i++) {
				char ch = source.charAt(i);
				sourceName = ch+sourceName;
			}
			if(sourceName.trim().equals(filter)) {
				list.add(a);
			}
		}
		return list;
	}

	/**
	 * Overridden accept method for the visitor
	 */
	@Override
	public void accept(ParserVisitor vis) {
		vis.visit((NotSimpleParser)this.parser);
	}
}
