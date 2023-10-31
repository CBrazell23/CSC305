package lab3b;

public class SMSServiceInjector implements MessageServiceInjector{
	
	MessagingApp ma;
	
	@Override
	public Consumer getConsumer() {
		return new MessagingApp(new SMSService());
	}
}
