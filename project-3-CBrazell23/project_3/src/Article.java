import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

class Article {
	@JsonIgnore Source source;
	@JsonIgnore String author;
	String title;
	String description;
	String url;
	@JsonIgnore String urlToImage;
	LocalDateTime publishedAt;
	@JsonIgnore String content;

	Article(@JsonProperty("title") String title, @JsonProperty("description") String description, @JsonProperty("url") String url, @JsonProperty("date") LocalDateTime publishedAt) {
	  this.title = title;
	  this.description = description;
	  this.publishedAt = publishedAt;
	  this.url = url;
	}

	Source getSource() {
		return source;
	}

	String getAuthor() {
		return author;
	}

	String getTitle() {
		return title;
	}

	String getDescription() {
		return description;
	}

	String getUrl() {
		return url;
	}

	String getUrlToImage() {
		return urlToImage;
	}

	LocalDateTime getPublishedAt() {
		return publishedAt;
	}

	String getContent() {
		return content;
	}

  /**
	 * Overrides toString for formatting articles
	 * 
	 * @return String containing required article data
	 */
	@Override
	public
	  String toString() {
	    return "Title: " + title + '\n' + "Description: " + description + "\n" + "Published at: " + publishedAt + "\n" + "Url: " + url + "\n";
	}
}