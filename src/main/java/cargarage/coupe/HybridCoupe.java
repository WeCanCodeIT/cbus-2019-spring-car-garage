package cargarage.coupe;

import cargarage.interfaces.Electric;
import cargarage.interfaces.Gas;

public class HybridCoupe extends Coupe implements Electric, Gas {

	public HybridCoupe(String vin, int speed, int fuel) {
		super(vin, speed, fuel);
	}

	@Override
	public void addGas() {
		this.addFuel();
	}

	@Override
	public void charge() {
		this.addFuel();
	}

}
