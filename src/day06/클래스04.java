package day06;

public class 클래스04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car("red", 4, 2, false);
		car.print();
	}

}

class Car{
	
	private String color;
	private int door;
	private int airback;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getDoor() {
		return door;
	}
	public void setDoor(int door) {
		this.door = door;
	}
	public int getAirback() {
		return airback;
	}
	public void setAirback(int airback) {
		this.airback = airback;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}

	private boolean power;
	
	public Car() {};
	public Car(String color) {
		this.color = color;
	}
	
	public Car(String color, int door) {
		this.color = color;
		this.door = door;
	}
	
	public Car(String color, int door, int airback) {
		this(color, door);
		this.airback = airback;
	}
	
	public Car(String color, int door, int airback, boolean power) {
		this(color, door, airback);
		this.power = power;
	}
	
	public void print() {
		System.out.println(color);
		System.out.println("door : "+ door);
		System.out.println("airback : "+ airback);
		System.out.println(power);
	}
}
	
