package lab7.decoratorPattern;

public abstract class BaseDecorator implements Coffee {
	protected Coffee coffee;
	public BaseDecorator(Coffee coffee) {
		this.coffee = coffee;
	}

}
