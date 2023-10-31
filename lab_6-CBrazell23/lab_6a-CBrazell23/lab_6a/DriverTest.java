package lab6a;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DriverTest {

	private final PrintStream standardOut = System.out; 
	private final ByteArrayOutputStream outputStreamCaptor = new  ByteArrayOutputStream(); 
	 
	 @BeforeEach
	 public void setUp() { 
	     System.setOut(new PrintStream(outputStreamCaptor)); 
	 }

	@Test
	void testCarInterest() {
		carInterest ci = new carInterest(30000, 0.05, 10);
		visitor vis = new visitor();
		vis.visit(ci);
		assertEquals(outputStreamCaptor.toString().trim(), "Interest occurred: 19410.284930708403");
	}
	
	@Test
	void testHomeInterest() {
		homeInterest hi = new homeInterest(300000, 0.05, 10);
		visitor vis = new visitor();
		vis.visit(hi);
		assertEquals(outputStreamCaptor.toString().trim(), "Interest occurred: 150000.0");
	}
	
	@AfterEach
	 public void tearDown() { 
	     System.setOut(standardOut); 
	 }
}
