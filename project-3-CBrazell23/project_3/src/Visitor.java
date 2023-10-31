
public class Visitor {
	void visit(SimpleParser simpParser){
		DriverHelper.printArticles(simpParser);
	}
  void visit(NotSimpleParser notSimpParser){
	  DriverHelper.printArticles(notSimpParser);
	}
}
