package day05;

public class 클래스02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c = new Car();
		
		c.color = "red";
		c.power = true;
		c.speedUp();
		System.out.println(c.color);
		System.out.println(c.power);
		System.out.println(c.speed);
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		System.out.println(c.speed);
	}

}

class Car {
	
	String color;
	boolean power;
	int speed;
	
	//메서드
	void power() {
		power = !power;
	}
	
	void speedUp() {
		speed += 10;
	}
	
	void speedDown() {
		speed -= 10;
	}
}