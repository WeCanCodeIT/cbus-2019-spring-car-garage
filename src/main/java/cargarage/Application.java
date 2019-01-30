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
			
			String userSelection = input.nextLine();
			switch (userSelection) {
			case "1":
				System.out.println("Please enter a unique vin for the car:");
				String userVin = input.nextLine();
				// All cars will be added with a starting speed of 0
				// and an fuel level of 100
				garage.addCar(new Car(userVin, 0, 100));
			}
		}
	}
}
