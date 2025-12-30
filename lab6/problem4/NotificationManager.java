package lab6.problem4;

public class NotificationManager {
	private INotificationService notificationService;

	public NotificationManager(INotificationService notificationService) {
		this.notificationService = notificationService;
	}

	public void sendNotification(String message) {
		notificationService.send(message);
	}
}
