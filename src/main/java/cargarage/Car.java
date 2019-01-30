package cargarage;

public class Car {
	
	private int speed;
	private int fuel;

	public Car(int speed, int fuel) {
		this.speed = speed;
		this.fuel = fuel;
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

}
