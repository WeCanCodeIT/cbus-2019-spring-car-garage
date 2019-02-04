package cargarage.garage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import cargarage.interfaces.Electric;
import cargarage.interfaces.Gas;
import cargarage.vehicles.Car;

public class Garage {
	
	private Map<String, Car> cars;

	public Garage(HashMap<String, Car> cars) {
		this.cars = cars;
	}

	public int getCarsSize() {
		return cars.size();
	}

	public void addCar(Car car) {
		cars.put(car.getVin(), car);
	}

	public void removeCar(String vin) {
		cars.remove(vin);
	}

	public void fuelAllCars() {
		for (Car car : cars.values()) {
			if (car instanceof Electric) {
				((Electric) car).charge();
			}
			if (car instanceof Gas) {
				((Gas) car).addGas();
			}
			
		}
	}

	public Car getCar(String vin) {
		return cars.get(vin);
	}

	public Collection<Car> getCars() {
		return cars.values();
	}

}
