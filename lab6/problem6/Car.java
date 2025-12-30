package lab6.problem6;


public class Car implements IDrivable, IPassengerCarrier {
    @Override
    public void drive() {
        System.out.println("Car is being driven");
    }

    @Override
    public void carryPassengers() {
        System.out.println("Car is carrying passengers");
    }
}

