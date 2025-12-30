package lab7.decoratorPattern;

public class WhippedCreamDecorator extends BaseDecorator {
	public WhippedCreamDecorator(Coffee coffee) {
		super(coffee);
	}

	@Override
	public int getCost() {
		return coffee.getCost() + 15;
	}

	@Override
	public String getDescription() {
		return coffee.getDescription() + "+ Whipped Cream ";
	}
}
