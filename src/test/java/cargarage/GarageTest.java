package cargarage;

import static org.junit.Assert.assertEquals;

import java.util.Collection;
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
		Garage garage = new Garage(new HashMap<>());
		
		// Get size of Map before adding a value
		int carsSize = garage.getCarsSize();
		// Add a new car object
		// Also drives the addition of `vin` property in Car 
		garage.addCar(new Coupe("1", 0, 100));
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
		Garage garage = new Garage(new HashMap<>());
		
		// Add a car to remove
		garage.addCar(new Coupe("123", 0, 100));
		int carsSize = garage.getCarsSize();
		garage.removeCar("123");
		int carsSizeAfterRemovingCar = garage.getCarsSize();
		
		assertEquals(carsSizeAfterRemovingCar, carsSize - 1);
	}
	
	/**
	 * Changes to code:
	 * 
	 * 1.
	 */
	@Test
	public void shouldFuelAllCars() {
		// Tests fuelAllCars()
		Garage garage = new Garage(new HashMap<>());
		
		// Add two cars to check that ALL are fueled
		garage.addCar(new Coupe("123", 0, 50));
		garage.addCar(new Coupe("456", 0, 50));
		
		garage.fuellAllCars();
		
		assertEquals(garage.getCar("123").getFuel(), 100);
		assertEquals(garage.getCar("456").getFuel(), 100);
	}
	
	@Test
	public void shouldTestDriveOneCar() {
		// Tests driveCar()
		// Should select a single car
		// **APPLICATION** should then let you choose what to do with that car
	}
	
	/**
	 * Changes to code:
	 * 
	 * 1. Drives out creation of getCars()
	 * 2. Causes toString() to be over-ridden in Car
	 */
	@Test
	public void shouldGetAllCars() {
		// Should be able to list stats of all cars
		// create necessary method(s)
		// GARAGE should provide cars
		// APPLICATION should list all stats
		Garage garage = new Garage(new HashMap<>());
		
		// add a couple cars
		garage.addCar(new Coupe("1", 0, 100));
		garage.addCar(new Coupe("2", 0, 100));
		garage.addCar(new Coupe("3", 0, 100));
		
		assertEquals(garage.getCars() instanceof Collection<?>, true);
	}
}
