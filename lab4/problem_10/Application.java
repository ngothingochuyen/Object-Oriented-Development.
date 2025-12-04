package cse203.lab4.problem_10;

import cse203.lab4.problem_10.cargoShip.CargoShip;
import cse203.lab4.problem_10.cruiseShip.CruiseShip;
import cse203.lab4.problem_10.ship.Ship;

public class Application {
	public static void main(String[] args) {
		Ship[] ships = new Ship[3];
		ships[0]=new Ship("Hehe", "2005");
		ships[2] = new CruiseShip("Hihi", "2006", 100);
		ships[1] = new CargoShip("Hoho", "2007", 150);
		for(Ship out: ships) {
			System.out.println(out);
			System.out.println("------------------------");
		}
	}
}