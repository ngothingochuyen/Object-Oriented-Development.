package lab6.problem3;

public class Application {
	public static void main(String[] args) {
		ICreditCardPayment creditCardPayment = new CreditCardPayment();
		IPayPalPayment payPalPayment = new PayPalPayment();

		creditCardPayment.payWithCreditCard();
		payPalPayment.payWithPayPal();
	}
}
