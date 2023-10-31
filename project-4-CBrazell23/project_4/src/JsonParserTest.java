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
		JsonParser parser = new SimpleParser(data, Logger.getLogger(Driver.class.getName()));
		vis.visit(parser, 1);
		String correctOutput = "Title: Assignment #2\n"
				+ "Description: Extend Assignment #1 to support multiple sources and to introduce source processor.\n"
				+ "Published at: 2021-04-16T09:53:23.709229\n"
				+ "Url: https://canvas.calpoly.edu/courses/55411/assignments/274503";
		assertEquals(correctOutput, outputStreamCaptor.toString().trim());
	}
	
	// Following 4 tests check the input config is correct and the right parser is created based off user input
	// To pass these tests, enter F then S for testInputConfigFS, F then N for testInputConfigFN, U then N
	// then y then CNN for testInputConfigUNy, U then N then n for testInputConfigUNn
		
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
	void testInputConfigUNy() throws IOException {
		int type = DriverHelper.determineType();
//		String simulatedUserInput = "U" + System.getProperty("line.separator") +
//			       "N";
//		System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));
		assertEquals(3, type);
	}
	
	@Test
	void testInputConfigUNn() throws IOException {
		int type = DriverHelper.determineType();
//		String simulatedUserInput = "U" + System.getProperty("line.separator") +
//			       "N";
//		System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));
		assertEquals(0, type);
	}
	
	// This test tests the filter "CNN". You need to manually input "CNN" to perform this test"
	// As can be seen from correctOutput, only the CNN articles are returned
	@Test
	void testFilterCNN() throws IOException {
		String filePath = "https://newsapi.org/v2/top-headlines?country=us&apiKey=8afffdc937b54cc5b7393330b93f3029";
		Visitor vis = new Visitor();
		String data = DriverHelper.fromUrl(filePath);
		JsonParser parser = new NotSimpleParser(data, Logger.getLogger(Driver.class.getName()));
	    Scanner scanner = new Scanner(System.in);
	    String filter = scanner.nextLine();
	    JsonParser filterParser = new Filter(parser, filter);
	    vis.visit(filterParser, 3);
		String correctOutput = "Title: Keystone Pipeline shuts down after oil leak, halting flow of 600,000 barrels a day - CNN\n"
				+ "Description: The Keystone Pipeline has been shut down following a leak discovered near the border of Kansas and Nebraska.\n"
				+ "Published at: 2022-12-09T05:39\n"
				+ "Url: https://www.cnn.com/2022/12/08/economy/oil-prices-rise-after-keystone-pipeline-leak/index.html\n"
				+ "\n"
				+ "Title: FedEx driver charged in 7-year-old Athena Strand's death delivered her Christmas present before abducting her, mother says - CNN\n"
				+ "Description: Athena Strand's mother, Maitlyn Gandy, called for stricter screening policies for delivery drivers at a news conference Thursday. On an easel beside her was the package she said the FedEx driver had delivered: a box of \"You can be anything\" Barbie dolls.\n"
				+ "Published at: 2022-12-09T02:42\n"
				+ "Url: https://www.cnn.com/2022/12/08/us/texas-athena-strand-kidnapping-christmas-present/index.html\n"
				+ "\n"
				+ "Title: Exclusive: Paul Whelan tells CNN he is 'disappointed' that more has not been done to secure his release - CNN\n"
				+ "Description: Detained American Paul Whelan expressed his frustration that more has not been done to secure his release in an exclusive CNN interview hours after another detained American, Brittney Griner, was freed.\n"
				+ "Published at: 2022-12-09T01:43\n"
				+ "Url: https://www.cnn.com/2022/12/08/politics/paul-whelan-cnn-interview-brittney-griner/index.html\n"
				+ "\n"
				+ "Title: 'The world changed overnight': Zero-Covid overhaul brings joy — and fears — in China - CNN\n"
				+ "Description: Workers across China have dismantled some of the physical signs of the country's zero-Covid controls, peeling health code scanning signs off metro station walls and closing some checkpoints after the government unveiled an overhaul of its pandemic policy.\n"
				+ "Published at: 2022-12-09T00:46:41\n"
				+ "Url: https://www.cnn.com/2022/12/08/china/china-zero-covid-relaxation-reaction-intl-hnk/index.html";
		assertEquals(correctOutput, outputStreamCaptor.toString().trim());
	}
	
	// This test tests the filter "The Washington Post". You need to manually input "The Washington Post" to perform this test"
	// As can be seen from correctOutput, only the CNN articles are returned
	@Test
	void testFilterTWP() throws IOException {
		String filePath = "https://newsapi.org/v2/top-headlines?country=us&apiKey=8afffdc937b54cc5b7393330b93f3029";
		Visitor vis = new Visitor();
		String data = DriverHelper.fromUrl(filePath);
		JsonParser parser = new NotSimpleParser(data, Logger.getLogger(Driver.class.getName()));
	    Scanner scanner = new Scanner(System.in);
	    String filter = scanner.nextLine();
	    JsonParser filterParser = new Filter(parser, filter);
	    vis.visit(filterParser, 3);
		String correctOutput = "Title: Justice Department asks judge to hold Trump team in contempt over Mar-a-Lago case - The Washington Post\n"
				+ "Description: The request came after months of mounting frustration from the Justice Department with the former president’s lawyers.\n"
				+ "Published at: 2022-12-09T00:25\n"
				+ "Url: https://www.washingtonpost.com/nation/2022/12/08/trump-contempt-mar-a-lago-records/";
		assertEquals(correctOutput, outputStreamCaptor.toString().trim());
	}
	
	// This test tests the filter for any erroneous filters. You need to manually input any input that is not a real source
	// to perform this test As can be seen from correctOutput, no articles are returned
	@Test
	void testFilterError() throws IOException {
		String filePath = "https://newsapi.org/v2/top-headlines?country=us&apiKey=8afffdc937b54cc5b7393330b93f3029";
		Visitor vis = new Visitor();
		String data = DriverHelper.fromUrl(filePath);
		JsonParser parser = new NotSimpleParser(data, Logger.getLogger(Driver.class.getName()));
	    Scanner scanner = new Scanner(System.in);
	    String filter = scanner.nextLine();
	    JsonParser filterParser = new Filter(parser, filter);
	    vis.visit(filterParser, 3);
		String correctOutput = "";
		assertEquals(correctOutput, outputStreamCaptor.toString().trim());
	}
	
	@AfterEach
	 public void tearDown() { 
	     System.setOut(standardOut); 
	 } 
}