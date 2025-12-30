package lab6.problem4;


public class PushNotificationService implements INotificationService {
	@Override
	public void send(String message) {
		System.out.println("Sending Push Notification: " + message);
	}
}

