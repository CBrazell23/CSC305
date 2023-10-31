package lab8c;

public class SimpleThreadExample {
	  private static final int MAX_TIMES = 100;

	  /**
	   * Demonstration of the use of Threads.
	   *
	   * @param args command-line arguments, not used
	   */
	  public static void main(String[] args) {
	    new Thread(new WordPrinter("OOOOOOOOOO", MAX_TIMES)).start();
	    new Thread(new WordPrinter("XXXXXXXXXX", MAX_TIMES * 3)).start();
	  }
	}