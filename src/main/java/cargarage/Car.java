package cargarage;

public class Car {
	
	private String vin;
	private int speed;
	private int fuel;
	private boolean on;

	public Car(String vin, int speed, int fuel) {
		this.vin = vin;
		this.speed = speed;
		this.fuel = fuel;
		this.on = false;
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

}
