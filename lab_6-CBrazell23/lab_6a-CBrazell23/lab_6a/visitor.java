package lab6a;

public class visitor implements InterestVisitor {
	public void visit(carInterest car) {
		System.out.println("Interest occurred: " + (car.principal * Math.pow((1 + car.annual_rate / calculateInterest.N), calculateInterest.N * car.time) - car.principal));
	}
	public void visit(homeInterest home) {
		System.out.println("Interest occurred: " + (home.principal * (1 + home.annual_rate * home.time) - home.principal));
	}
}
