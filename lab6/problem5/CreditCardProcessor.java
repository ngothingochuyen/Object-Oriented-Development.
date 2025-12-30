package lab6.problem5;

public class CreditCardProcessor implements PaymentProcessor {
	public void pay(Order order) {
		System.out.println("Paid " + order.getAmount() + " using Credit Card.");
	}
}