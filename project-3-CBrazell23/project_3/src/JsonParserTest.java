import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;

import com.fasterxml.jackson.databind.JsonNode;

import junit.framework.ComparisonFailure;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
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
	
	//Tests that the visit functionality is correct and prints the correct output
	@Test
	void testSimpleVisit() throws IOException {
		String filePath = "/Users/colebrazell/Desktop/CSC305/project-3-CBrazell23/project_3/inputs/simple.txt";
		Visitor vis = new Visitor();
		String data = DriverHelper.fromFile(filePath);
		SimpleParser parser = new SimpleParser(data, Logger.getLogger(Driver.class.getName()));
		vis.visit(parser);
		String correctOutput = "Title: Assignment #2\n"
				+ "Description: Extend Assignment #1 to support multiple sources and to introduce source processor.\n"
				+ "Published at: 2021-04-16T09:53:23.709229\n"
				+ "Url: https://canvas.calpoly.edu/courses/55411/assignments/274503";
		assertEquals(correctOutput, outputStreamCaptor.toString().trim());
	}
	
	//Following 3 tests check the input config is correct and the right parser is created based off user input
	//To pass these tests, enter F then S for testInputConfigFS, F then N for testInputConfigFN, and U then N
	//for testInputConfigUN
		
	//Tests that the input config is correct for a File Input of Simple type
	//Asserting 1 will create a SimpleParser
	@Test
	void testInputConfigFS() throws IOException {
		int type = DriverHelper.determineType();
//		String simulatedUserInput = "F" + System.getProperty("line.separator") +
//			       "S";
//		System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));
		assertEquals(1, type);
	}
	
	//Tests that the input config is correct for a File Input of NotSimple type
	//Asserting 2 will create a NotSimpleParser
	@Test
	void testInputConfigFN() throws IOException {
		int type = DriverHelper.determineType();
//		String simulatedUserInput = "F" + System.getProperty("line.separator") +
//			       "N";
//		System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));
		assertEquals(2, type);
	}

	//Tests that the input config is correct for a URL Input of NotSimple type
	//Asserting 0 will create a NotSimpleParser
	@Test
	void testInputConfigUN() throws IOException {
		int type = DriverHelper.determineType();
//		String simulatedUserInput = "U" + System.getProperty("line.separator") +
//			       "N";
//		System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));
		assertEquals(0, type);
	}
	
	@AfterEach
	 public void tearDown() { 
	     System.setOut(standardOut); 
	 } 
}