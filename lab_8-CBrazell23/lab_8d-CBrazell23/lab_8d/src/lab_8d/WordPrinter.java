package lab8d;

import java.util.concurrent.Semaphore;

public class WordPrinter implements Runnable{
	String str;
	int num;
	Semaphore s1;
	Semaphore s2;
	
	WordPrinter(String str, int num, Semaphore s1, Semaphore s2){
		this.str = str;
		this.num = num;
		this.s1 = s1;
		this.s2 = s2;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < num; i++) {
			try {
				s1.acquire();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(str);
			s2.release();
		}
	}
}
