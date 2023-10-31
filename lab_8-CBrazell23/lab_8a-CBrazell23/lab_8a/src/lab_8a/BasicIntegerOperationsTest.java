package lab8a;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.function.Consumer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BasicIntegerOperationsTest {
	
	private final PrintStream standardOut = System.out; 
	private final ByteArrayOutputStream outputStreamCaptor = new  ByteArrayOutputStream(); 
	
	@BeforeEach
	 public void setUp() { 
	     System.setOut(new PrintStream(outputStreamCaptor)); 
	 } 

    @Test
    public void testDisplaySquare(){
    	int num = 10;
    	BasicIntegerOperations.displaySquare(num, x -> System.out.print(x * x));
    	assertEquals("100", outputStreamCaptor.toString().trim());
    }

    @Test
    public void testIsNegative(){
    	int num = -10;
    	assertTrue(BasicIntegerOperations.isNegative(num, x -> x < 0));
    }

    @Test
    public void testSquareRoot(){
    	int num = 16;
    	assertEquals(4.0, BasicIntegerOperations.squareRoot(num, x -> Math.sqrt(x)));
    }
    
	@AfterEach
	 public void tearDown() { 
	     System.setOut(standardOut); 
	 } 

}
