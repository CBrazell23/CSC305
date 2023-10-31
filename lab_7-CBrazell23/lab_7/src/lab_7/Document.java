import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Document {
	ArrayList<String> arr = new ArrayList<String>();

	/**
	 * document filename from which to read from and write into
	 */
	public static final String filename="src/text.txt";
	
	/**
	 * reads content from the file and displays to the terminal
	 * @throws IOException 
	 */
	void readFile() {
		arr.add("Reading!");
		try {
			File file = new File(filename);
		        BufferedReader br
		            = new BufferedReader(new FileReader(file));
		        String st;
		        while ((st = br.readLine()) != null)
		            System.out.println(st);
				}
		catch(Exception e) {  
				e.printStackTrace();  
		}  
    }
	
	/**
	 * writes the String "CSE 305, Cal Poly" into the file
	 */
	void writeFile() {
		arr.add("Writing!");
		try {
		      FileWriter myWriter = new FileWriter(filename);
		      myWriter.write("CSE 305, Cal Poly");
		      myWriter.close();
		} catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		}
	}

	public ArrayList<String> getArr() {
		return arr;
	}
	
}
