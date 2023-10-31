import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

class SimpleParser implements JsonParser {
  String filePath;
  Logger logger;

  SimpleParser(String filePath, Logger logger) {
    this.filePath = filePath;
    this.logger = logger;
  }
  
  /**
   * Override parseArticles and returns a list of Article objects created by gathering the data from the provided file
   * 
   * @return ArrayList containing Article 
   */
  public ArrayList<Article> parseArticles() {
	  try {
		  ObjectMapper mapper = new ObjectMapper();
		  JsonNode jNode = mapper.readValue(filePath, JsonNode.class);
		  ArrayList<Article> articles = new ArrayList<>();
		  getData(articles, jNode, logger);
		  return articles;
	  } catch (Exception e) {
		  logger.log(Level.INFO, e.getMessage());
		  return new ArrayList<>();
	  }
  }
  
  static void getData(ArrayList<Article> articles, JsonNode jNode, Logger logger) {
		if(jNode.get("description") == null || jNode.get("publishedAt") == null || jNode.get("title") == null || jNode.get("url") == null){
			logger.warning("Article is missing component(s)\n");
		}
		else {
			Article article = new Article(jNode.get("title").asText(), jNode.get("description").asText(), jNode.get("url").asText(), LocalDateTime.parse(jNode.get("publishedAt").asText(), DateTimeFormatter.ofPattern("y-M-d H:m:s[.SSSSSS]")));
			articles.add(article);
		}
	}
  
  static void getDataTesting(ArrayList<Article> articles, JsonNode jNode, Logger logger) {
	  if(jNode.get("description") == null || jNode.get("publishedAt") == null || jNode.get("title") == null || jNode.get("url") == null){
		  System.out.println("NO WORK");
	  }
	  else {
		  System.out.println("WORK");
	  }
  }

  /**
   * Accepts a ParserVisitor object and performs its visit
   */
  public void accept(ParserVisitor vis) {
	vis.visit(this);
  }
}