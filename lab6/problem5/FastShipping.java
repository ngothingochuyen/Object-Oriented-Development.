package lab6.problem5;

public class FastShipping implements ShippingService {
	public void ship(Order order) {
		System.out.println("Order " + order.getId() + " shipped via Fast Shipping.");
	}
}
