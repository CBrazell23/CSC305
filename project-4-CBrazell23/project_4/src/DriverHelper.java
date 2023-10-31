import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class DriverHelper {
	static String filter;
	static int determineType() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello there! I am here to help you parse your articles :)");
		System.out.println("To begin, please indicate whether your article is from a file or from a url. Type");
		System.out.println("(F) if your article is in the form of a file or");
		System.out.println("(U) if your article is in the form of a URL");
		String fileType = scanner.nextLine();
		if(fileType.equals("F")) {
			System.out.println("So your article is in the form of a file. Thanks!");
		}
		else if(fileType.equals("U")) {
			System.out.println("So your article is in the form of a URL. Thanks!");
		}
		else {
			System.out.println("Please reply with either an 'F' or a 'U'. Input not recognized. Program exiting...");
			System.exit(0);
		}
		System.out.println("Now, please indicate whether your article is of the simple format or not. Type");
		System.out.println("(S) if your article is of the simple format or");
		System.out.println("(N) ifd your article is not of the simple format. Note: URL articles cannot be in simple format");
		String simpleType = scanner.nextLine();
		if(simpleType.equals("S")) {
			System.out.println("So your article is of the simple format. Thanks!");
		}
		else if(simpleType.equals("N")) {
			System.out.println("So your article is not of the simple format. Thanks!");
		}
		else {
			System.out.println("Please reply with either an 'S' or an 'N'. Input not recognized. Program exiting...");
		}
		if(fileType.equals("U") && simpleType.equals("S")) {
			System.out.println("File cannot be from a URL with a simple format. Selection not accepted. Program exiting...");
			System.exit(0);
		}
		else if(fileType.equals("U") && simpleType.equals("N")) {
			System.out.println("You have selected a URL input of the not simple format.");
			System.out.println("Would you like to include a filter for article source names? (y/n)");
			String filteryn = scanner.nextLine();
			if(filteryn.equals("y")) {
				System.out.println("What article source would you like to view?");
				filter = scanner.nextLine();
				return 3;
			}
			else if(filteryn.equals("n")) {
				System.out.println("Parsing beginning...");
			}
			else {
				System.out.println("Response invalid. Please enter (y) or (n). Program exiting...");
				System.exit(0);
			}
			return 0;
		}
		else if(fileType.equals("F") && simpleType.equals("S")) {
			System.out.println("You have selected a File input of the simple format. Parsing beginning...");
			return 1;
		}
		System.out.println("You have selected a File input of the not simple format. Parsing beginning...");
		return 2;
	}
	/**
	 * Getter for the filter
	 * @return the filter
	 */
 	static String getFilter() {
		return filter;
	}
 	/**
 	 * Converts to string the data from a url file
 	 * @param filePath
 	 * @return the data from the url file
 	 * @throws IOException
 	 */
	static String fromUrl(String filePath) throws IOException {
	    StringBuilder sb = new StringBuilder();
	      URL url = new URL(filePath);
	      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openConnection().getInputStream()));
	      String line;
	      while ((line = bufferedReader.readLine()) != null) {
	    	  sb.append(line + "\n");
	      }
	    return sb.toString();
	  }
 	/**
 	 * Converts to string the data from a standard file
 	 * @param filePath
 	 * @return the data from the standard file
 	 * @throws IOException
 	 */
	  static String fromFile(String filePath) throws IOException {
	    Path path = Paths.get(filePath);
	    StringBuilder sb = new StringBuilder();
		try (Stream<String> stream = Files.lines(path)) {
			stream.forEach(s -> sb.append(s + "\n"));
		}
	  return sb.toString();
   }
  /**
   * Overloaded method that parses the articles and then prints it to the console
   * @param simpParser
   */
  static void printArticles(SimpleParser simpParser) {
      List<Article> articles = simpParser.parseArticles();
      for (Article article : articles) {
        System.out.println(article);
      }
  }
  /**
   * Overloaded method that parses the articles and then prints it to the console
   * @param simpParser
   */
  static void printArticles(NotSimpleParser NotSimpParser) {
      List<Article> articles = NotSimpParser.parseArticles();
      for (Article article : articles) {
        System.out.println(article);
      }
  }
  /**
   * Overloaded method that parses the articles and then prints it to the console
   * @param simpParser
   */
  static void printArticles(JsonParser parser) {
      List<Article> articles = parser.parseArticles();
      for (Article article : articles) {
        System.out.println(article);
      }
  }
}
