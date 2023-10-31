import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NotSimpleParser implements JsonParser {
  String filePath;
  Logger logger;

  NotSimpleParser(String filePath, Logger logger) {
    this.filePath = filePath;
    this.logger = logger;
  }

  /**
   * Override parseArticles and returns a list of Article objects created by gathering the data from the provided file
   * 
   * @return ArrayList containing Article 
   */
  public ArrayList<Article> parseArticles(){
		try {
			ObjectMapper mapper = new ObjectMapper();
			JsonNode articleNodes = mapper.readValue(filePath, JsonNode.class).get("articles");
			ArrayList<Article> articles = new ArrayList<>();
			for(JsonNode jNode : articleNodes) {
				getData(articles, jNode, logger);
			}
			return articles;
		}
		catch(Exception e) {
			logger.log(Level.INFO, e.getMessage());
			return new ArrayList<>();
		}
	}

  /**
   * Gives the data in a legible manner from a standard file
   * @param articles
   * @param jNode
   * @param logger
   */
  static void getData(List<Article> articles, JsonNode jNode, Logger logger) {
	  if(jNode.get("description") == null || jNode.get("publishedAt") == null || jNode.get("title") == null || jNode.get("url") == null){
		  logger.warning("Article is missing component(s)\n");
	  }
	  else {
		  Article article = new Article(jNode.get("title").asText(), jNode.get("description").asText(), jNode.get("url").asText(), LocalDateTime.parse(jNode.get("publishedAt").asText(), DateTimeFormatter.ISO_OFFSET_DATE_TIME));
		  articles.add(article);
	  }
  }
  
  /**
   * Used for testing purposes - Determines whether the file is complete or not
   * @param articles
   * @param jNode
   * @param logger
   */
  static void getDataTesting(List<Article> articles, JsonNode jNode, Logger logger) {
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