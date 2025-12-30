package lab6.problem4;

public class Application {
	public static void main(String[] args) {
		NotificationManager emailManager = new NotificationManager(new EmailService());
		emailManager.sendNotification("Welcome to our platform!");

		NotificationManager smsManager = new NotificationManager(new SMSService());
		smsManager.sendNotification("Your OTP is 123456");

		NotificationManager pushManager = new NotificationManager(new PushNotificationService());
		pushManager.sendNotification("You have a new message!");
	}
}
