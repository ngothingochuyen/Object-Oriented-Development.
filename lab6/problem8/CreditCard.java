package lab6.problem8;

public class CreditCard implements PaymentMethod {
	private String cardNumber;

	public CreditCard(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public void pay(double amount) {
		System.out.println("Paid " + amount + " using Credit Card: " + cardNumber);
	}
}