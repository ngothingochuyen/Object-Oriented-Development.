package lab6.problem5;

public class PositiveAmountValidator implements OrderValidator {
	public boolean isValid(Order order) {
		return order.getAmount() > 0;
	}
}
