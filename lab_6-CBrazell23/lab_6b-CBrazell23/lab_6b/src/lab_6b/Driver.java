package lab6b;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Driver {
	public static void main(String[] args) throws IOException {
		File file = new File("src/lab6b/info.txt");
		InputStream stream = new FileInputStream(file);
		LowerCaseInputStream lowerStream = new LowerCaseInputStream(stream);
		int data = lowerStream.read();
		while(data != -1) {
			  System.out.print((char)data);
			  data = lowerStream.read();
		}
		lowerStream.close();
	}
}
