package lab7.strategyPattern;

public class Application {
	public static void main(String[] args) {
		 ShoppingCart cart = new ShoppingCart();

	        cart.addItem(new ShoppingItem("Hehe", 12.00));
	        cart.addItem(new ShoppingItem("Hihi", 13.00));
	        cart.addItem(new ShoppingItem("Haha", 15.00));
	        cart.setPaymentStrategy(new CreditCardPayment());
	        cart.checkout();
	        cart.setPaymentStrategy(new PaypalPayment());
	        cart.checkout();
	        cart.setPaymentStrategy(new CashPayment());
	        cart.checkout();

	}
}
