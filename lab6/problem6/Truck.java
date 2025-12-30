package lab6.problem6;

public class Truck implements IDrivable, ICargoCarrier {
    @Override
    public void drive() {
        System.out.println("Truck is being driven");
    }

    @Override
    public void carryCargo() {
        System.out.println("Truck is carrying cargo");
    }
}
