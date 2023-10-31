package lab3b;

public class MessagingApp implements Consumer {

	/**
	 * The MessagingApp class can currently only send email messages using
	 * an EmailService object that can send emails to a receiver email ID
	 */
	private MessageService service;
	
	MessagingApp(MessageService service) {
		this.service = service;
	}
		
	@Override
	public void processMessages(String msg, String rec) {
		service.sendMessage(msg, rec);
}
	
}


