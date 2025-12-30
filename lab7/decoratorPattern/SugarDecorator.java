package lab7.decoratorPattern;

public class SugarDecorator extends BaseDecorator {
	public SugarDecorator(Coffee coffee) {
		super(coffee);
	}

	@Override
	public int getCost() {
		return coffee.getCost() + 2;
	}

	@Override
	public String getDescription() {
		return coffee.getDescription() + "+ Sugar ";
	}
}
