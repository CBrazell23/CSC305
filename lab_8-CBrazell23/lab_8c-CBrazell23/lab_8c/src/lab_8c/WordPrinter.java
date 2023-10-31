package lab8c;

public class WordPrinter implements Runnable{
	String str;
	int num;
	
	WordPrinter(String str, int num){
		this.str = str;
		this.num = num;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < num; i++) {
			System.out.println(str);
		}
	}
}
