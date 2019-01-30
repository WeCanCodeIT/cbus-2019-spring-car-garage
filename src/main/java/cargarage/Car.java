package cargarage;

public class Car {
	
	private int speed;
	private int fuel;
	private boolean on;

	public Car(int speed, int fuel) {
		this.speed = speed;
		this.fuel = fuel;
		this.on = false;
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
