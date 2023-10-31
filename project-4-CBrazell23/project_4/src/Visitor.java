
public class Visitor {
	/**
	 * The visiting method that the parsers visit
	 * @param parser
	 * @param typeAndFormat
	 */
  void visit(JsonParser parser, int typeAndFormat){
	if(typeAndFormat == 1) {
		DriverHelper.printArticles((SimpleParser)parser);
	} else if(typeAndFormat == 3) {
		DriverHelper.printArticles(parser);
	}
	else {
		DriverHelper.printArticles((NotSimpleParser)parser);
	}
  }
}
