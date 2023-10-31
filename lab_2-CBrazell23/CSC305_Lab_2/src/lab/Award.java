package lab;

class Award {
	private String name = "";
	private int year;
	
	 Award(String name, int year){
		this.name = name;
		this.year = year;
	}
	
	@Override
	public String toString() {
		return new StringBuilder(name + ", " + year).toString();
	}
}
