package lab6a;

public class Driver {
	public static void main(String[] args) {
		carInterest ci = (carInterest) InterestFactory.getInterestType("CAR", 30000, 0.05, 10);
		homeInterest hi = (homeInterest) InterestFactory.getInterestType("HOME", 300000, 0.05, 10);
		visitor vis = new visitor();
		vis.visit(ci);
		vis.visit(hi);
	}
}
