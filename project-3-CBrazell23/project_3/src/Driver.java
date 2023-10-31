import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Stream;

class Driver {
  public static void main(String [] args) throws IOException {
	Visitor vis = new Visitor();
	int typeAndFormat = DriverHelper.determineType(); // 0: UN 1: FS 2: FN
//    String filePath = "/Users/colebrazell/Desktop/CSC305/project-2-CBrazell23/project_2/inputs/bad.json";
//    String filePath = "/Users/colebrazell/Desktop/CSC305/project-2-CBrazell23/project_2/inputs/newsapi.txt";
    String filePath = "/Users/colebrazell/Desktop/CSC305/project-2-CBrazell23/project_2/inputs/simple.txt";
//    String filePath = "https://newsapi.org/v2/top-headlines?country=us&apiKey=8afffdc937b54cc5b7393330b93f3029";
    File file = new File(filePath);
    String data = "";
    if(typeAndFormat == 1 || typeAndFormat == 2) {
    	if(file.exists()) {
        	data = DriverHelper.fromFile(filePath);
        }
    	else {
    		System.out.println("File not found. Program exiting...");
    		System.exit(0);
    	}
    }
    else {
    	data = DriverHelper.fromUrl(filePath);
    }
    if(typeAndFormat == 1) {
      SimpleParser parser = new SimpleParser(data, Logger.getLogger(Driver.class.getName()));
      vis.visit(parser);
    } else{
      NotSimpleParser parser = new NotSimpleParser(data, Logger.getLogger(Driver.class.getName()));
      vis.visit(parser);
    }
  }
}