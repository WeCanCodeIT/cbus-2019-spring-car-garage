package cargarage.sedan;

import cargarage.vehicles.Car;

public abstract class Sedan extends Car {
	
	private boolean fluxCapacitor;
	
	public Sedan(String vin, int speed, int fuel) {
		super(vin, speed, fuel, 4);
	}

	public boolean isFluxCapacitor() {
		return fluxCapacitor;
	}
	
	public void engageFluxCapacitor() {
		// Create a specific mutator in Car to change fuel value as expected
		this.emptyFuelTank();
	}
	
	public void addFuel() {
		this.refuel();
	}

}
