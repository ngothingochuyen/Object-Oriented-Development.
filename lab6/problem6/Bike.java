package lab6.problem6;

public class Bike implements IDrivable, IPassengerCarrier {
	@Override
	public void drive() {
		System.out.println("Bike is being driven");
	}

	@Override
	public void carryPassengers() {
		System.out.println("Bike is carrying passengers");
	}
}
