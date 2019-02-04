package cargarage.sedan;

import cargarage.interfaces.Electric;

public class ElectricSedan extends Sedan implements Electric {

	public ElectricSedan(String vin, int speed, int fuel) {
		super(vin, speed, fuel);
	}

	@Override
	public void charge() {
		this.addFuel();
	}
	
}
