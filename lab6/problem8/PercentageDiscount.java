package lab6.problem8;

public class PercentageDiscount implements Discount {
	private double discountPercentage;

	public PercentageDiscount(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	public double getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	public double execute(double amount) {
		return amount * (1 - discountPercentage / 100);
	}
}