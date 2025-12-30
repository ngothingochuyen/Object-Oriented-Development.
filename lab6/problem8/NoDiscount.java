package lab6.problem8;

public class NoDiscount implements Discount {
	public double execute(double amount) {
		return amount;
	}
}
