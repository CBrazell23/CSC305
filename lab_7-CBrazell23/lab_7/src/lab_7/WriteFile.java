
public class WriteFile implements Command{

	private Document doc;
	
	public WriteFile(Document doc){
		this.doc = doc;
	}
	
	@Override
	public void execute() {
		doc.writeFile();
	}

}
