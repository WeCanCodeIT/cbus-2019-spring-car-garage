package cargarage.coupe;

import cargarage.vehicles.Car;

public abstract class Coupe extends Car {

	public Coupe(String vin, int speed, int fuel) {
		super(vin, speed, fuel, 2);
	}

	@Override
	public void addFuel() {
		this.refuel();
	}

}
