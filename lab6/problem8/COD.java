package lab6.problem8;

public class COD implements PaymentMethod {
	public void pay(double amount) {
		System.out.println("Cash on Delivery: " + amount);
	}
}