package lab3b;

public class SMSService implements MessageService {

	@Override
	public void sendMessage(String message, String receiver){
		System.out.println("Email sent to "+receiver+ " with Message: "+message);
	}
}
