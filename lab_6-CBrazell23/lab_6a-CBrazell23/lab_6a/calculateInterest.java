package lab6a;

public abstract class calculateInterest {
	
	/**
	   * principal denotes the loan taken in dollars
	   * annual_rate denotes the annual rate of interest in decimals (5%=0.05)
	   * N denotes the number of times interest is compounded yearly
	   * time denotes the time in years for which interest is calculated
	   */
	static double principal; 
    static double annual_rate; 
	static final int N = 12; 
	static int time; 
	
	public abstract void accept(InterestVisitor obj);

	public static double getPrincipal() {
		return principal;
	}

	public static double getAnnual_rate() {
		return annual_rate;
	}

	public static int getN() {
		return N;
	}

	public static int getTime() {
		return time;
	}
}