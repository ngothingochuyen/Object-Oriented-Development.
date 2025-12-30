package lab6.problem5;
public class Application {
    public static void main(String[] args) {
        Order order = new Order("ORD123", 150.0);

        OrderValidator validator = new PositiveAmountValidator();
        PaymentProcessor payment = new CreditCardProcessor();
        ShippingService shipping = new FastShipping();

        OrderProcessor processor = new OrderProcessor(validator, payment, shipping);
        processor.process(order);
    }
}
