import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

class Source{
	String id;
	String name;
	
	@JsonCreator
	Source(@JsonProperty("id") String id, @JsonProperty("name") String name){
		this.id = id;
		this.name = name;
	}
}