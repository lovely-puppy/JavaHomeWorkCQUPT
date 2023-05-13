package experiment_5;

import java.util.Scanner;

abstract class Vehicles {
	abstract void wheel(String name);
}
interface MoneyFare {
	void charge(String name);
}

class Bus extends Vehicles implements MoneyFare {
	void wheel(String name) {
		System.out.println("The bus " + name + " has 6 wheels.");
	}
	public void charge(String name) {
		System.out.println("The bus " + name + " 2 yuan per people");
	}
}

class Taxi extends Vehicles implements MoneyFare {
	void wheel(String name) {
		System.out.println("The taxi " + name + " has 4 wheels.");
	}
	public void charge(String name) {
		System.out.println("The taxi " + name + " 2 yuan per km");
	}
}

class Car implements MoneyFare {
	public void charge(String name) {
		System.out.println("The car " + name + " is free if it is yours");
	}
}

public class Problem_2 {
	public static void main(String[] args) {
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		Car car = new Car();
		
		String busname, taxiname, carname;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please input the bus line: ");
		busname = sc.nextLine();
		System.out.println("Please input the taxi name: ");
		taxiname = sc.nextLine();
		System.out.println("Please input the car brand: ");
		carname = sc.nextLine();
		
		bus.wheel(busname);
		bus.charge(busname);
		taxi.wheel(taxiname);
		taxi.charge(taxiname);
		car.charge(carname);
	}
}
