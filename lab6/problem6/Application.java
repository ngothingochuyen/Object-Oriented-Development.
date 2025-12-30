package lab6.problem6;

public class Application {
	public static void main(String[] args) {
		IDrivable car = new Car();
		IDrivable truck = new Truck();
		IDrivable bike = new Bike();
		car.drive();
		((Car) car).carryPassengers();
		System.out.println("-------------------");
		truck.drive();
		((Truck) truck).carryCargo();
		System.out.println("-------------------");
		bike.drive();
		((Bike) bike).carryPassengers();
		System.out.println("-------------------");

	}
}
