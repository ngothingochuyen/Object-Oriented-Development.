package lab6.problem8;

import java.time.LocalDate;

public class Application {
	public static void main(String[] args) {
		Restaurant restaurant = new Restaurant();
		restaurant.setId("R001");
		restaurant.setName("Hehe");
		restaurant.setLocation("Binh Duong New City");
		restaurant.setRating(5);
		restaurant.setPhoneNumber("0123456");

		MenuItem bunbo = new MenuItem();
		bunbo.setId("M001");
		bunbo.setName("Bún Bò Huế");
		bunbo.setPrice(35);
		bunbo.setUnitsOnHand(20);
		bunbo.setDescription("Búm bòaaa neeee");

		MenuItem pho = new MenuItem();
		pho.setId("M002");
		pho.setName("Phở");
		pho.setPrice(30);
		pho.setUnitsOnHand(20);
		pho.setDescription("Phở Việt Nam là số 11111");

		restaurant.addMenuItem(bunbo);
		restaurant.addMenuItem(pho);
		restaurant.showDetails();

		Customer customer = new Customer();
		customer.setId("C001");
		customer.setName("Huyen");
		customer.setEmail("huyen@gmail.com");
		customer.setPhoneNumber("111111");

		Order order = new Order();
		order.setId("O001");
		order.setOrderDate(LocalDate.now());
		order.setCustomer(customer);
		order.addMenuItem(bunbo);
		order.addMenuItem(pho);
		order.showDetails();
		OrderService service = new OrderService();
		service.setId("S001");
		service.setProcessDate(LocalDate.now());
		service.setDiscount(new PercentageDiscount(10));
		service.setPayment(new CreditCard("12345"));
		service.setDelivery(new BikeDelivery());
		service.process(order);
	}
}
