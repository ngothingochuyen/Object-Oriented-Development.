package lab6.problem8;

public class RocketDelivery implements DeliveryMethod {
	public void process(String orderID) {
		System.out.println("Delivering order " + orderID + " by rocket!");
	}
}