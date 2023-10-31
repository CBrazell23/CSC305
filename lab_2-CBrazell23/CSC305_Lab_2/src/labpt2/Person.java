package labpt2;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

class Person {
	private ArrayList<String> knownFor;
	private String name;
	private ArrayList<Award> awards;

	@JsonCreator
	private Person(@JsonProperty("awards") ArrayList<Award> awards, @JsonProperty("name") String name, @JsonProperty("knownFor") ArrayList<String> knownFor) {
		this.awards = awards;
		this.name = name;
	    this.knownFor = knownFor;
	}

	String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	ArrayList<String> getKnownFor() {
		// TODO Auto-generated method stub
		return knownFor;
	}

	ArrayList<Award>  getAwards() {
		// TODO Auto-generated method stub
		return awards;
	}
}
