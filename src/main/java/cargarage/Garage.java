package cargarage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

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

	public void fuellAllCars() {
		for (Car car : cars.values()) {
			car.addFuel();
		}
	}

	public Car getCar(String string) {
		return cars.get(string);
	}

	public Collection<Car> getCars() {
		return cars.values();
	}

}
