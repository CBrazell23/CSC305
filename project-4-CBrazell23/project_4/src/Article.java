import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

class Article {
	Source source;
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

	/**
	 * Getter for the source
	 * @return the source
	 */
	Source getSource() {
		return source;
	}

	/**
	 * Getter for the author
	 * @return the author
	 */
	String getAuthor() {
		return author;
	}

	/**
	 * Getter for the title
	 * @return the title
	 */
	String getTitle() {
		return title;
	}

	/**
	 * Getter for the description
	 * @return the description
	 */
	String getDescription() {
		return description;
	}

	/**
	 * Getter for the url
	 * @return the url
	 */
	String getUrl() {
		return url;
	}

	/**
	 * Getter for the url to image
	 * @return the url to image
	 */
	String getUrlToImage() {
		return urlToImage;
	}

	/**
	 * getter for the published date
	 * @return the published date
	 */
	LocalDateTime getPublishedAt() {
		return publishedAt;
	}

	/**
	 * getter for the content
	 * @return the content
	 */
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