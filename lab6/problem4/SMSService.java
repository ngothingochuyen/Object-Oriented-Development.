package lab6.problem4;


public class SMSService implements INotificationService {
	@Override
	public void send(String message) {
		System.out.println("Sending SMS: " + message);
	}
}
