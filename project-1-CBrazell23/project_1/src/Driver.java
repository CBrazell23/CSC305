import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class Driver{
	public static void main(String[] args) throws IOException {
		String filePath = "/Users/colebrazell/Desktop/CSC305/project-1-CBrazell23/project_1/inputs/bad.json";
		StringBuilder sb = new StringBuilder();
		Path path = Paths.get(filePath);
		try (Stream<String> stream = Files.lines(path)) {
			stream.forEach(s -> sb.append(s + "\n"));
		}
		filePath = sb.toString();
		JsonParser jparse = new JsonParser(filePath, Logger.getLogger(Driver.class.getName()));
		ArrayList<Article> articles = jparse.parseArticles();
		for(Article article : articles) {
			System.out.println(article);
		}
	}
}