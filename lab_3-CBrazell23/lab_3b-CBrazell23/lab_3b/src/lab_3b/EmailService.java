package lab3b;

public class EmailService implements MessageService {

	EmailService(){};
	@Override
	public void sendMessage(String message, String receiver){
//		System.out.println("Email sent to "+receiver+ " with Message: "+message);
		 System.out.println(message+ " from email " + receiver);
	}
}