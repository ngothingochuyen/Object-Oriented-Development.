package lab7.decoratorPattern;

public class SimpleCoffee implements Coffee {
	public SimpleCoffee() {
	}

	@Override
	public int getCost() {
		return 10;
	}

	@Override
	public String getDescription() {
		return ("Description: Simple coffee ");
	}
}
