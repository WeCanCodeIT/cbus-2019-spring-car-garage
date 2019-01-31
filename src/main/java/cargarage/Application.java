package cargarage;

import java.util.HashMap;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Garage garage = new Garage(new HashMap<>());
		boolean isActive = true;

		Car mySedan = new Sedan("123", 0, 100);
		Car myCoupe = new Coupe("456", 0, 100);

		garage.addCar(mySedan);
		garage.addCar(myCoupe);

		System.out.println("Hello! Please select what you would like to do:");
		while (isActive) {
			System.out.println("1. Add a Car to the Garage");
			System.out.println("2. Remove a Car from the Garage");
			System.out.println("3. List all Cars");
			System.out.println("4. Test drive a car");
			System.out.println("5. Refuel all cars");

			String userSelection = input.nextLine();
			switch (userSelection) {
			case "1":
				System.out.println("Existing vins are as follows");
				printAllCars(garage);
				System.out.println("Please enter a unique vin for the car:");
				String userVin = input.nextLine();
				// All cars will be added with a starting speed of 0
				// and an fuel level of 100
				garage.addCar(new Coupe(userVin, 0, 100));
				break;
			case "2":
				System.out.println("Which car would you like to remove?:");
				printAllCars(garage);
				System.out.println("Enter vin of car to remove");
				userVin = input.nextLine();
				garage.removeCar(userVin);
				System.out.println("Vin " + userVin + " was removed.");
				break;
			case "3":
				System.out.println("Cars in garage are as follows");
				printAllCars(garage);
				break;
			case "4":
				boolean isTestDriving = true;
				System.out.println("Which car would you like to test drive?");
				printAllCars(garage);
				userVin = input.nextLine();
				// Declaring userCar as an instanceof Car
				Car userCar = garage.getCar(userVin);
				System.out.println("You chose car: " + userCar.getVin());

				while (isTestDriving) {
					System.out.println("What would you like to do next?:");
					System.out.println("1. Turn on car");
					System.out.println("2. Accelerate");
					System.out.println("3. Brake");
					System.out.println("4. Turn off car");
					System.out.println("5. Return car");
					String userResponse = input.nextLine();

					switch (userResponse) {
					case "1":
						if (userCar.isOn()) {
							System.out.println("Car is already on...");
						} else {
							userCar.toggleOn();
							System.out.println("Car is on!");
						}
						break;
					case "2":
						if (!userCar.isOn()) {
							System.out.println("Car must first be on...");
						} else {
							// If the chosen Car is also a Sedan
							if (userCar instanceof Sedan) {
								System.out.println("Use flux capacitor??");
								userResponse = input.nextLine();
								if (userResponse.equals("yes")) {
									// Casting the instanceof Car SPECIFICALLY to a Sedan
									((Sedan) userCar).engageFluxCapacitor();
									System.out.println(userCar);
								} else {
									userCar.accelerate(20);
									System.out.println("You accelerate by 20");
									System.out.println(userCar);
								}
							} else {
								userCar.accelerate(20);
								System.out.println("You accelerate by 20");
								System.out.println(userCar);
							}
						}
						break;
					case "3":
						if (!userCar.isOn()) {
							System.out.println("Car must first be on...");
						} else {
							// Stops car by applying brakes as much as the speed currently is
							userCar.brake(userCar.getSpeed());
							System.out.println("You stop the car");
						}
						break;
					case "4":
						if (!userCar.isOn()) {
							System.out.println("Car is already off...");
						} else {
							userCar.toggleOn();
							System.out.println("You turn off the car");
						}
						break;
					case "5":
						if (userCar.isOn()) {
							System.out.println("Car must be off to return...");
						} else {
							isTestDriving = false;
							System.out.println("You returned car: " + userCar.getVin());
						}
					}
				}
				break;
			case "5":
				garage.fuellAllCars();
				printAllCars(garage);
				System.out.println("You have refueled all cars");
				break;
			}
		}
	}

	/**
	 * Refactored out for abstractions sake
	 * 
	 * prints vins and current fuel level of all cars
	 * 
	 */
	private static void printAllCars(Garage garage) {
		System.out.println(garage.getCars());
	}
}
