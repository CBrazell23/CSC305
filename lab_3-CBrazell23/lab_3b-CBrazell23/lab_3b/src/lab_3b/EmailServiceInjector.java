package lab3b;

public class EmailServiceInjector implements MessageServiceInjector{

	MessagingApp ma;
	
	@Override
	public Consumer getConsumer() {
		return new MessagingApp(new EmailService());
	}
	
}
