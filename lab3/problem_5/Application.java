package cse203.lab3.problem_5;

import java.util.Scanner;	
import cse203.lab3.problem_5.parkedCar.ParkedCar;
import cse203.lab3.problem_5.parkingMeter.ParkingMeter;
import cse203.lab3.problem_5.parkingTicket.ParkingTicket;
import cse203.lab3.problem_5.policeOfficer.PoliceOfficer;

public class Application {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		ParkedCar car = new ParkedCar("Honda", "E1234", "Black", "Hehe123", 120);
		ParkingMeter meter = new ParkingMeter(60);
		PoliceOfficer officer = new PoliceOfficer("Huyen", "H1385");
		ParkingTicket ticket = officer.ticket(car, meter);
		if (ticket != null)
			System.out.println(ticket);
		else
			System.out.println("No crimes committed!");
	}

}
