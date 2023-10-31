import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.logging.Logger;

import com.fasterxml.jackson.databind.JsonNode;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;


class JsonParserTest {
	Logger logger = Logger.getLogger(JsonParser.class.getName());
	private final PrintStream standardOut = System.out; 
	private final ByteArrayOutputStream outputStreamCaptor = new  ByteArrayOutputStream(); 
	
	@BeforeEach
	 public void setUp() { 
	     System.setOut(new PrintStream(outputStreamCaptor)); 
	 } 
	
	@Test
	void testEmptyJson() {
		String filePath = "/Users/colebrazell/Desktop/CSC305/project-2-CBrazell23/project_2/inputs/empty.json";
		ArrayList<Article> articles = new ArrayList<>();
		Article articleMock = mock(Article.class);
		JsonNode jNodeMock = mock(JsonNode.class);
		articles.add(articleMock);
		NotSimpleParser parser = new NotSimpleParser(filePath, logger);
		parser.getDataTesting(articles, jNodeMock, logger);
		assertTrue(outputStreamCaptor.toString().trim().equals("NO WORK"));
	}
	
	@Test
	void testJsonNoSource() {
		String filePath = "/Users/colebrazell/Desktop/CSC305/project-2-CBrazell23/project_2/inputs/noSource.json";
		ArrayList<Article> articles = new ArrayList<>();
		Article articleMock = mock(Article.class);
		JsonNode jNodeMock = mock(JsonNode.class);
		articles.add(articleMock);
		NotSimpleParser parser = new NotSimpleParser(filePath, logger);
		parser.getDataTesting(articles, jNodeMock, logger);
		assertTrue(outputStreamCaptor.toString().trim().equals("NO WORK"));
	}
	
	@Test
	void testJsonNoAuthor() {
		String filePath = "/Users/colebrazell/Desktop/CSC305/project-2-CBrazell23/project_2/inputs/noAuthor.json";
		ArrayList<Article> articles = new ArrayList<>();
		Article articleMock = mock(Article.class);
		JsonNode jNodeMock = mock(JsonNode.class);
		articles.add(articleMock);
		NotSimpleParser parser = new NotSimpleParser(filePath, logger);
		parser.getDataTesting(articles, jNodeMock, logger);
		assertTrue(outputStreamCaptor.toString().trim().equals("NO WORK"));
	}
	
	@Test
	void testJsonNoTitle() {
		String filePath = "/Users/colebrazell/Desktop/CSC305/project-2-CBrazell23/project_2/inputs/noTitle.json";
		ArrayList<Article> articles = new ArrayList<>();
		Article articleMock = mock(Article.class);
		JsonNode jNodeMock = mock(JsonNode.class);
		articles.add(articleMock);
		NotSimpleParser parser = new NotSimpleParser(filePath, logger);
		parser.getDataTesting(articles, jNodeMock, logger);
		assertTrue(outputStreamCaptor.toString().trim().equals("NO WORK"));
	}
	
	@Test
	void testJsonNoDesc() {
		String filePath = "/Users/colebrazell/Desktop/CSC305/project-2-CBrazell23/project_2/inputs/noDesc.json";
		ArrayList<Article> articles = new ArrayList<>();
		Article articleMock = mock(Article.class);
		JsonNode jNodeMock = mock(JsonNode.class);
		articles.add(articleMock);
		NotSimpleParser parser = new NotSimpleParser(filePath, logger);
		parser.getDataTesting(articles, jNodeMock, logger);
		assertTrue(outputStreamCaptor.toString().trim().equals("NO WORK"));
	}
	
	@Test
	void testJsonNoUrl() {
		String filePath = "/Users/colebrazell/Desktop/CSC305/project-2-CBrazell23/project_2/inputs/noUrl.json";
		ArrayList<Article> articles = new ArrayList<>();
		Article articleMock = mock(Article.class);
		JsonNode jNodeMock = mock(JsonNode.class);
		articles.add(articleMock);
		NotSimpleParser parser = new NotSimpleParser(filePath, logger);
		parser.getDataTesting(articles, jNodeMock, logger);
		assertTrue(outputStreamCaptor.toString().trim().equals("NO WORK"));
	}
	
	@Test
	void testJsonNoUrlToImage() {
		String filePath = "/Users/colebrazell/Desktop/CSC305/project-2-CBrazell23/project_2/inputs/noUrlToImage.json";
		ArrayList<Article> articles = new ArrayList<>();
		Article articleMock = mock(Article.class);
		JsonNode jNodeMock = mock(JsonNode.class);
		articles.add(articleMock);
		NotSimpleParser parser = new NotSimpleParser(filePath, logger);
		parser.getDataTesting(articles, jNodeMock, logger);
		assertTrue(outputStreamCaptor.toString().trim().equals("NO WORK"));
	}
	
	@Test
	void testJsonNoPublishedAt() {
		String filePath = "/Users/colebrazell/Desktop/CSC305/project-2-CBrazell23/project_2/inputs/noPublishedAt.json";
		ArrayList<Article> articles = new ArrayList<>();
		Article articleMock = mock(Article.class);
		JsonNode jNodeMock = mock(JsonNode.class);
		articles.add(articleMock);
		NotSimpleParser parser = new NotSimpleParser(filePath, logger);
		parser.getDataTesting(articles, jNodeMock, logger);
		assertTrue(outputStreamCaptor.toString().trim().equals("NO WORK"));
	}
	
	@Test
	void testSimpleNoContent() {
		String filePath = "/Users/colebrazell/Desktop/CSC305/project-2-CBrazell23/project_2/inputs/simpleEmpty.txt";
		ArrayList<Article> articles = new ArrayList<>();
		Article articleMock = mock(Article.class);
		JsonNode jNodeMock = mock(JsonNode.class);
		articles.add(articleMock);
		NotSimpleParser parser = new NotSimpleParser(filePath, logger);
		parser.getDataTesting(articles, jNodeMock, logger);
		assertTrue(outputStreamCaptor.toString().trim().equals("NO WORK"));
	}
	
	@Test
	void testSimpleNoDescription() {
		String filePath = "/Users/colebrazell/Desktop/CSC305/project-2-CBrazell23/project_2/inputs/simpleNoDesc.txt";
		ArrayList<Article> articles = new ArrayList<>();
		Article articleMock = mock(Article.class);
		JsonNode jNodeMock = mock(JsonNode.class);
		articles.add(articleMock);
		NotSimpleParser parser = new NotSimpleParser(filePath, logger);
		parser.getDataTesting(articles, jNodeMock, logger);
		assertTrue(outputStreamCaptor.toString().trim().equals("NO WORK"));
	}
	
	@Test
	void testSimpleNoPublishedAt() {
		String filePath = "/Users/colebrazell/Desktop/CSC305/project-2-CBrazell23/project_2/inputs/simpleNoPublishedAt.txt";
		ArrayList<Article> articles = new ArrayList<>();
		Article articleMock = mock(Article.class);
		JsonNode jNodeMock = mock(JsonNode.class);
		articles.add(articleMock);
		NotSimpleParser parser = new NotSimpleParser(filePath, logger);
		parser.getDataTesting(articles, jNodeMock, logger);
		assertTrue(outputStreamCaptor.toString().trim().equals("NO WORK"));
	}
	
	@Test
	void testSimpleNoTitle() {
		String filePath = "/Users/colebrazell/Desktop/CSC305/project-2-CBrazell23/project_2/inputs/simpleNoTitle.txt";
		ArrayList<Article> articles = new ArrayList<>();
		Article articleMock = mock(Article.class);
		JsonNode jNodeMock = mock(JsonNode.class);
		articles.add(articleMock);
		NotSimpleParser parser = new NotSimpleParser(filePath, logger);
		parser.getDataTesting(articles, jNodeMock, logger);
		assertTrue(outputStreamCaptor.toString().trim().equals("NO WORK"));
	}
	
	@Test
	void testSimpleNoURL() {
		String filePath = "/Users/colebrazell/Desktop/CSC305/project-2-CBrazell23/project_2/inputs/simpleNoUrl.txt";
		ArrayList<Article> articles = new ArrayList<>();
		Article articleMock = mock(Article.class);
		JsonNode jNodeMock = mock(JsonNode.class);
		articles.add(articleMock);
		NotSimpleParser parser = new NotSimpleParser(filePath, logger);
		parser.getDataTesting(articles, jNodeMock, logger);
		assertTrue(outputStreamCaptor.toString().trim().equals("NO WORK"));
	}

	@Test
	void testURL() {
		String filePath = "https://newsapi.org/v2/top-headlines?country=us&apiKey=8afffdc937b54cc5b7393330b93f3029";
		ArrayList<Article> articles = new ArrayList<>();
		Article articleMock = mock(Article.class);
		JsonNode jNodeMock = mock(JsonNode.class);
		articles.add(articleMock);
		NotSimpleParser parser = new NotSimpleParser(filePath, logger);
		parser.getDataTesting(articles, jNodeMock, logger);
		assertTrue(outputStreamCaptor.toString().trim().equals("NO WORK"));
	}
	
	@AfterEach
	 public void tearDown() { 
	     System.setOut(standardOut); 
	 } 
}