package lab6.problem8;

public class FixedAmountDiscount implements Discount {
	private double discountAmount;

	public FixedAmountDiscount(double discountAmount) {
		this.discountAmount = discountAmount;
	}

	public double getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(double discountAmount) {
		this.discountAmount = discountAmount;
	}

	public double execute(double amount) {
		return Math.max(0, amount - discountAmount);
	}
}
