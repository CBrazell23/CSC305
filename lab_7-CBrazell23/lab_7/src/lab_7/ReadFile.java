
public class ReadFile implements Command{

	private Document doc;
	
	public ReadFile(Document doc){
		this.doc = doc;
	}
	
	@Override
	public void execute() {
		doc.readFile();
	}

}
