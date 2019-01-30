package cargarage;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

public class GarageTest {

	/**
	 * Changes to code:
	 * 
	 * 1. Test Drives creation of Garage Constructor
	 * 2. Drives out creation of getCarsSize() method
	 * 3. Alters Car Constructor to include vin
	 * 4. Drives out creation of getVin() method in Car
	 * 
	 */
	@Test
	public void shouldAddCarToGarage() {
		// Tests addCar()
		// Using constructor injection to pass the type of Map WHEN the object is created.
		Garage garage = new Garage(new HashMap<String, Car>());
		
		// Get size of Map before adding a value
		int carsSize = garage.getCarsSize();
		// Add a new car object
		// Also drives the addition of `vin` property in Car 
		garage.addCar(new Car("1", 0, 100));
		int carsSizeAfterAdding = garage.getCarsSize();
		
		assertEquals(carsSize + 1, carsSizeAfterAdding);
	}
	
	/**
	 * Changes to code:
	 * 
	 * 1. Drives out creation of removeCar() method
	 * 
	 */
	@Test
	public void shouldRemoveCarFromGarage() {
		// Tests removeCar()
		Garage garage = new Garage(new HashMap<String, Car>());
		
		// Add a car to remove
		garage.addCar(new Car("123", 0, 100));
		int carsSize = garage.getCarsSize();
		garage.removeCar("123");
		int carsSizeAfterRemovingCar = garage.getCarsSize();
		
		assertEquals(carsSizeAfterRemovingCar, carsSize - 1);
	}
	
	@Test
	public void shouldFuelAllCars() {
		// Tests fuelAllCars()
	}
	
	@Test
	public void shouldTestDriveOneCar() {
		// Tests driveCar()
		// Should select a single car
		// **APPLICATION** should then let you choose what to do with that car
	}
	
	@Test
	public void _createTestName_() {
		// Should be able to list stats of all cars
		// create necessary method(s)
		// GARAGE should provide cars
		// APPLICATION should list all stats
	}
}
