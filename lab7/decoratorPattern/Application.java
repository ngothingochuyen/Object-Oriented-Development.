package lab7.decoratorPattern;

public class Application {
	public static void main(String[] args) {
		Coffee coffee = new SimpleCoffee();
		coffee = new MilkDecorator(coffee);
		coffee = new SugarDecorator(coffee);
		coffee = new WhippedCreamDecorator(coffee);
		System.out.println(coffee.getDescription());
		System.out.println("Cost: "+coffee.getCost());

	}
}
