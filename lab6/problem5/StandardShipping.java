package lab6.problem5;

public class StandardShipping implements ShippingService {
	public void ship(Order order) {
		System.out.println("Order " + order.getId() + " shipped via Standard Shipping.");
	}
}
