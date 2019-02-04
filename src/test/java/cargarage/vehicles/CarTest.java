package cargarage.vehicles;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import cargarage.coupe.Coupe;
import cargarage.vehicles.Car;

public class CarTest {

	/**
	 * Code covered by this test:
	 * 
	 * Constructor that takes initial speed
	 * Accessor method (Getter) for speed (car.getSpeed())
	 * car.accelerate() method to add speed
	 * 
	 * Assertion: When the accelerate() method is called, the speed increases by provided parameter.
	 * In this case, 10
	 * 
	 */
	@Test
	public void shouldAccelerate() {
		// Tests the accelerate() method in Car
		// Arrange
		/**
		 * New constructor
		 */
		Car car = new Coupe("", 0, 100);
		
		// Act
		int initialSpeed = car.getSpeed();
		car.accelerate(10);
		int speedAfterAcceleration = car.getSpeed();
		
		// Assert
		assertEquals(initialSpeed + 10, speedAfterAcceleration);
	}
	
	/**
	 * Changes made to code:
	 * 
	 * 1. Update Constructor to take new fuel parameter
	 * 2. Test Drive getFuel()
	 * 3. Update the behavior of accelerate to reflect fuel usage
	 * 
	 */
	@Test
	public void shouldConsumeFuel() {
		// Tests accelerate()
		// Arrange
		Car car = new Coupe("", 0, 100);
		
		// Act
		int initialFuel = car.getFuel();
		car.accelerate(10);
		int fuelAfterAcceleration = car.getFuel();
		
		// Assert
		assertEquals(initialFuel - 5, fuelAfterAcceleration);
	}
	
	/**
	 * Changes made to code:
	 * 
	 * 1. Test Drives addFuel() method
	 * 
	 */
	@Test
	public void shouldRefuel() {
		// Tests addFuel()
		Car car = new Coupe("", 0, 100);
		
		car.accelerate(30); // removes 15 fuel units from car
		car.addFuel();
		int fuelLevelAfterRefueling = car.getFuel();
		
		assertEquals(100, fuelLevelAfterRefueling);
		
	}
	
	/**
	 * Changes to code:
	 * 
	 * 1. Test Drive brake() method
	 */
	@Test
	public void shouldSlowDown() {
		// Tests the brake() method in Car
		// Arrange
		Car car = new Coupe("", 0, 100);
		
		// Act
		int accelerateSpeed = 50;
		int brakeSpeed = 20;
		
		car.accelerate(accelerateSpeed); // get car moving
		car.brake(brakeSpeed); // slow car down
		int speedAfterBraking = car.getSpeed(); 
		
		// Assert
		assertEquals(accelerateSpeed - brakeSpeed, speedAfterBraking);
	}
	
	/**
	 * Changes to code:
	 * 
	 * 1. Test Drive creation of the isOn() method
	 * 2. Test Drive creation of toggleOn() method
	 *  
	 */
	@Test
	public void shouldStart() {
		// Tests toggleOn()
		Car car = new Coupe("",0,100);
		
		car.toggleOn();
		boolean carIsOn = car.isOn();
		
		assertEquals(true, carIsOn);
	}
	
	/**
	 * Changes to code:
	 * 
	 * 1. Build logic into toggleOn() method
	 * 2. Create on property
	 * 3. Finish building isOn() method
	 *  
	 */
	@Test
	public void shouldTurnOff() {
		// Tests toggleOn()
		Car car = new Coupe("",0,100);
		
		car.toggleOn(); // turns car on
		car.toggleOn(); // turns car off
		boolean carIsOn = car.isOn();
		
		assertEquals(false, carIsOn);
	}
	
}
