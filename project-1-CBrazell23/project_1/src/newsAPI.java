import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class newsAPI{
	String status;
	int totalResults;
	ArrayList<Article> articles;
	
	newsAPI(@JsonProperty("status") String status, @JsonProperty("totalResults") int totalResults, @JsonProperty("articles") ArrayList<Article> articles){
		this.status = status;
		this.totalResults = totalResults;
		this.articles = articles;
	}

	String getStatus() {
		return status;
	}

	int getTotalResults() {
		return totalResults;
	}

	ArrayList<Article> getArticles() {
		return articles;
	}
}