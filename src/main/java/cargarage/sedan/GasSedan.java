package cargarage.sedan;

import cargarage.interfaces.Gas;

public class GasSedan extends Sedan implements Gas {

	public GasSedan(String vin, int speed, int fuel) {
		super(vin, speed, fuel);
	}

	@Override
	public void addGas() {
		this.addFuel();
	}

}
