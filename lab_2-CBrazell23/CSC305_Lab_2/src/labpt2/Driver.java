package labpt2;

import java.io.*;  
import org.json.*;

import com.fasterxml.jackson.databind.ObjectMapper;

class Driver {
	public static void main(String[] args) throws IOException, JSONException {
		File myObj = new File("/Users/colebrazell/Desktop/CSC305/lab_2-CBrazell23/CSC305_Lab_2/input3.json");
		ObjectMapper mapper = new ObjectMapper();
        FileInputStream inFile = new FileInputStream(myObj);
        Person person = mapper.readValue(inFile, Person.class);
        printResults(person);
	}
	
	private static void printResults(Person person) throws JSONException {
		System.out.println(person.getName());
        System.out.println("Known For: ");
        for (String str : person.getKnownFor()) {
          System.out.println("\t" + str);
        }
        System.out.println("\n" + "Awards: ");
        for (Award award : person.getAwards()) {
          System.out.println("\t" + award);
        }
	}
	
}
