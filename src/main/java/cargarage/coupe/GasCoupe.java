package cargarage.coupe;

import cargarage.interfaces.Gas;

public class GasCoupe extends Coupe implements Gas {

	public GasCoupe(String vin, int speed, int fuel) {
		super(vin, speed, fuel);
	}

	@Override
	public void addGas() {
		this.addFuel();
	}

}
