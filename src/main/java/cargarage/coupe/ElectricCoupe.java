package cargarage.coupe;

import cargarage.interfaces.Electric;

public class ElectricCoupe extends Coupe implements Electric {
	
	private int battery = Electric.BATTERY_LIFE;

	public ElectricCoupe(String vin, int speed, int fuel) {
		super(vin, speed, fuel);
	}

	public int getBattery() {
		return battery;
	}

	@Override
	public void charge() {
		this.addFuel();
	}
	
	@Override
	public String toString() {
		return "Car type: " + this.getClass() + " vin: " + getVin() + ", current battery life: " + Electric.BATTERY_LIFE + "\n";
	}

}
