import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Stream;

class Driver {
  public static void main(String [] args) throws IOException {
    JsonParser parser;
//    String filePath = "/Users/colebrazell/Desktop/CSC305/project-2-CBrazell23/project_2/inputs/bad.json";
//    String filePath = "/Users/colebrazell/Desktop/CSC305/project-2-CBrazell23/project_2/inputs/newsapi.txt";
//    String filePath = "/Users/colebrazell/Desktop/CSC305/project-2-CBrazell23/project_2/inputs/simple.txt";
    String filePath = "https://newsapi.org/v2/top-headlines?country=us&apiKey=8afffdc937b54cc5b7393330b93f3029";
    File file = new File(filePath);
    String data = "";
    if(file.exists()) {
    	data = fromFile(filePath);
    }
    else {
    	data = fromUrl(filePath);
    }
    if (filePath.contains("simple")) {
      parser = new SimpleParser(data, Logger.getLogger(Driver.class.getName()));
      printArticles(parser);
    } else{
      parser = new NotSimpleParser(data, Logger.getLogger(Driver.class.getName()));
      printArticles(parser);
    }
  }
  
  static void printArticles(JsonParser parser) {
      List<Article> articles = parser.parseArticles();
      for (Article article : articles) {
        System.out.println(article);
      }
  }

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
  
  static String fromFile(String filePath) throws IOException {
    Path path = Paths.get(filePath);
    StringBuilder sb = new StringBuilder();
	try (Stream<String> stream = Files.lines(path)) {
		stream.forEach(s -> sb.append(s + "\n"));
	}
	return sb.toString();
  }
}