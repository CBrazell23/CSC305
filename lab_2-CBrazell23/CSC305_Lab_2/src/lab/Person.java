package lab;

import java.util.ArrayList;

class Person {
	private ArrayList<String> knownFor;
	private String name;
	private ArrayList<Award> awards;
	
	Person(ArrayList<String> knownFor, String name, ArrayList<Award> awards) {
		this.knownFor = knownFor;
		this.name = name;
		this.awards = awards;
	}
}
