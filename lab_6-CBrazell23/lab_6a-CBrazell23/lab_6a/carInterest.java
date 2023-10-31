package lab6a;


public class carInterest extends calculateInterest implements InterestType{
	double principal;
	double annual_rate;
	int time;
	
	carInterest(double principal, double annual_rate, int time){
		this.principal = principal;
		this.annual_rate = annual_rate;
		this.time = time;
	}

	@Override
	public void accept(InterestVisitor obj) {
		obj.visit(this);
	}

}
