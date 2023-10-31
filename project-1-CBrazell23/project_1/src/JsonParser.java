import java.util.logging.Level;
import java.util.logging.Logger;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;

public class JsonParser{
	String filePath;
	Logger logger;
	
	JsonParser(String filePath, Logger logger) {
		this.filePath = filePath;
		this.logger = logger;
	}
	
	ArrayList<Article> parseArticles(){
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
	static void getData(ArrayList<Article> articles, JsonNode jNode, Logger logger) {
		if(jNode.get("source") == null || jNode.get("title") == null || jNode.get("description") == null || jNode.get("url") == null || jNode.get("urlToImage") == null || jNode.get("publishedAt") == null || jNode.get("content") == null) {
			logger.warning("Article is missing component(s)\n");
		}
		else {
			Article article = new Article(jNode.get("title").asText(), jNode.get("description").asText(), jNode.get("url").asText(), jNode.get("publishedAt").asText());
			articles.add(article);
		}
	}
	
	static void getDataTesting(ArrayList<Article> articles, JsonNode jNode, Logger logger) {
		if(jNode.get("source") == null || jNode.get("title") == null || jNode.get("description") == null || jNode.get("url") == null || jNode.get("urlToImage") == null || jNode.get("publishedAt") == null || jNode.get("content") == null) {
			System.out.println("NO WORK");
		}
		else {
			System.out.println("WORK");
		}
	}
}