package lab;

import java.io.*;  
import java.util.*;
import org.json.*;
import java.io.FileNotFoundException;
import java.io.IOException;

class Driver {
	public static void main(String[] args) throws IOException, JSONException {
		JSONTokener jsonToken = openFile("/Users/colebrazell/Desktop/CSC305/lab_2-CBrazell23/CSC305_Lab_2/input1.json");
		JSONObject jsonObj = new JSONObject(jsonToken);
		JSONArray knownForArr = jsonObj.getJSONArray("knownFor");
        JSONArray awardsArr = jsonObj.getJSONArray("awards");
        ArrayList<String> knownForList = new ArrayList<>();
        ArrayList<Award> awardsList = new ArrayList<>();
        populateKnownForList(knownForList, knownForArr);
        populateAwardsList(awardsList, awardsArr);
        
        printResults(jsonObj, knownForList, awardsList);

	}
	private static JSONTokener openFile(String path) throws IOException {
		StringBuilder str = new StringBuilder();
		try {
		      File myObj = new File(path);
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		    	  str.append(myReader.nextLine());
		      }
		      myReader.close();
		} catch (FileNotFoundException e) {
			 System.out.println("An error occurred.");
			 e.printStackTrace();
		}	
		JSONTokener jsonToken = new JSONTokener(str.toString());
		return jsonToken;
	}
	
	private static ArrayList<String>  populateKnownForList(ArrayList<String> list, JSONArray arr) throws JSONException {
		for (int i = 0; i < arr.length(); i++) {
			list.add(arr.getString(i));
		}
		return list;
	}
	
	private static ArrayList<Award> populateAwardsList(ArrayList<Award> list, JSONArray arr) throws JSONException {
		for (int i = 0; i < arr.length(); i++) {
            JSONObject obj = (JSONObject) arr.get(i);
            Award award = new Award(obj.getString("name"), obj.getInt("year"));
            list.add(award);
		}
		return list;
	}
	
	private static void printResults(JSONObject jsonObj, ArrayList<String> knownForList, ArrayList<Award> awardsList) throws JSONException {
		System.out.println(jsonObj.getString("name"));
        System.out.println("Known For: ");
        for (String str : knownForList) {
          System.out.println("\t" + str);
        }
        System.out.println("\n" + "Awards: ");
        for (Award award : awardsList) {
          System.out.println("\t" + award);
        }
	}
	
}
