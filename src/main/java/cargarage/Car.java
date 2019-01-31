package cargarage;

public abstract class Car {
	
	private String vin;
	private int speed;
	private int fuel;
	private boolean on;
	private int numDoors;

	public Car(String vin, int speed, int fuel, int numDoors) {
		this.vin = vin;
		this.speed = speed;
		this.fuel = fuel;
		this.on = false;
		this.numDoors = numDoors;
	}

	public String getVin() {
		return vin;
	}

	public int getSpeed() {
		return speed;
	}

	public void accelerate(int speed) {
		this.speed += speed;
		this.fuel -= speed/2;
	}

	public int getFuel() {
		return fuel;
	}

	public void addFuel() {
		this.fuel = 100;
	}

	public void brake(int brakeSpeed) {
		this.speed -= brakeSpeed;
	}

	public void toggleOn() {
		this.on = !this.on;
	}

	public boolean isOn() {
		return on;
	}
	
	@Override
	public String toString() {
		return "Car vin: " + vin + ", current fuel: " + fuel + "\n";
	}

	public int getNumDoors() {
		return numDoors;
	}
	
	public void emptyFuelTank() {
		this.fuel = 0;
	}

}
