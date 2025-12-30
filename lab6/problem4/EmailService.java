package lab6.problem4;

public class EmailService implements INotificationService {
	@Override
	public void send(String message) {
		System.out.println("Sending Email: " + message);
	}
}
