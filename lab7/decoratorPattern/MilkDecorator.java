package lab7.decoratorPattern;

public class MilkDecorator extends BaseDecorator {
	public MilkDecorator(Coffee coffee) {
		super(coffee);
	}

	@Override
	public int getCost() {
		return coffee.getCost() + 5;
	}

	@Override
	public String getDescription() {
		return coffee.getDescription() + "+ Milk ";
	}
}
