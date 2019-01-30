package cargarage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

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
		Car car = new Car(0, 100);
		
		// Act
		int initialSpeed = car.getSpeed();
		car.accelerate(10);
		int speedAfterAcceleration = car.getSpeed();
		
		// Assert
		assertEquals(initialSpeed + 10, speedAfterAcceleration);
	}
	
	@Test
	public void shouldConsumeFuel() {
		// Tests accelerate()
		// Arrange
		Car car = new Car(0, 100);
		
		// Act
		int initialFuel = car.getFuel();
		car.accelerate(10);
		int fuelAfterAcceleration = car.getFuel();
		
		// Assert
		assertEquals(initialFuel - 5, fuelAfterAcceleration);
	}
	
	@Test
	public void shouldRefuel() {
		// Tests addFuel()
	}
	
	@Test
	public void shouldSlowDown() {
		// Tests the brake() method in Car
		// Arrange
		// Act
		// Assert
	}
	
	@Test
	public void shouldStart() {
		// Tests toggleEngine()
	}
	
	@Test
	public void shouldTurnOff() {
		// Tests toggleEngine()
	}
	
}
