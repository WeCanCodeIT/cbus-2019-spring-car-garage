package cargarage;

import java.util.HashMap;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Garage garage = new Garage(new HashMap<>());
		boolean isActive = true;
		
		System.out.println("Hello! Please select what you would like to do:");
		while (isActive) {
			System.out.println("1. Add a Car to the Garage");
			System.out.println("2. Remove a Car from the Garage");
			
			String userSelection = input.nextLine();
			switch (userSelection) {
			case "1":
				System.out.println("Existing vins are as follows");
				System.out.println(garage.getCars());
				System.out.println("Please enter a unique vin for the car:");
				String userVin = input.nextLine();
				// All cars will be added with a starting speed of 0
				// and an fuel level of 100
				garage.addCar(new Car(userVin, 0, 100));
				break;
			case "2":
				System.out.println("Which car would you like to remove?:");
				System.out.println(garage.getCars());
				System.out.println("Enter vin of car to remove");
				userVin = input.nextLine();
				garage.removeCar(userVin);
				System.out.println("Vin " + userVin + " was removed.");
			}
		}
	}
}
