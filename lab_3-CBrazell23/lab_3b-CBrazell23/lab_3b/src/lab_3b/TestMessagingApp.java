package lab3b;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestMessagingApp {
	
	private final PrintStream standardOut = System.out; 
	private final ByteArrayOutputStream outputStreamCaptor = new  ByteArrayOutputStream(); 
	 
	 @BeforeEach
	 public void setUp() { 
	     System.setOut(new PrintStream(outputStreamCaptor)); 
	 } 
	 
	 @Test
	 public void emailInjectorTest() {
		 EmailServiceInjector esi = new EmailServiceInjector();
		 String exp = "hi from email john";
		 esi.getConsumer().processMessages("hi", "john");
//		 assertEquals(outputStreamCaptor.toString(), "Email sent to Jacob with Message: Hello there");
		 assertTrue(outputStreamCaptor.toString().trim().equals(exp));
	 }
	 
	 
	 
	 @AfterEach
	 public void tearDown() { 
	     System.setOut(standardOut); 
	 } 


}