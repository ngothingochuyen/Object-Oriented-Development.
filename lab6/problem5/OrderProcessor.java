package lab6.problem5;

public class OrderProcessor {
	private OrderValidator validator;
	private PaymentProcessor payment;
	private ShippingService shipping;

	public OrderProcessor(OrderValidator validator, PaymentProcessor payment, ShippingService shipping) {
		this.validator = validator;
		this.payment = payment;
		this.shipping = shipping;
	}

	public void process(Order order) {
		if (!validator.isValid(order)) {
			System.out.println("Invalid order. Cannot process.");
			return;
		}
		order.showDetails();
		payment.pay(order);
		shipping.ship(order);
	}
}
