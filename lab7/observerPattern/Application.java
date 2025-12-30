package lab7.observerPattern;

public class Application {
	public static void main(String[] args) {
		NewsAgency agency = new NewsAgency();

		Observer emailSubscriber = new EmailSubscriber();
		Observer smsSubscriber = new SMSSubscriber();

		agency.addObserver(emailSubscriber);
		agency.addObserver(smsSubscriber);

		agency.publishNews("Breaking News!");
	}

}
