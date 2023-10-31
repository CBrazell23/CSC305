package lab6a;

public class InterestFactory {
	public static InterestType getInterestType(String type, double principal, double annual_rate, int time) {
		if(type == null){
	        return null;
	     }		
	     if(type.equalsIgnoreCase("CAR")){
	        return new carInterest(principal, annual_rate, time);
	        
	     } else if(type.equalsIgnoreCase("HOME")){
	        return new homeInterest(principal, annual_rate, time);
	     }
	     return null;
	}
}
