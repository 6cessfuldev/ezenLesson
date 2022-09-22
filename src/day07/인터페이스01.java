package day07;

public class 인터페이스01 {

	public static void main(String[] args) {
		/* 인터페이스 : 추상메서드와 상수로만 이루어진 것
		 * 추상 메서드 : 메서드의 선언부만 있는 메서드
		 * 추상 클래스 : 추상 메서드 + 일반 메서드 + 변수 + 상수(final)
		 * 상속 받은 자식 클래스가 구현할 것을 기대
		 *
		 * 추상 메서드 : 선언만 도어있고, 구현이 안된 메서드 
		 * abstract 리턴타입 메서드명(매개변수); 
		 * -부모 클래스에서 상속 받았을 때 특정 메서드가 자식 클래스에서 자주 오버라이딩이 된다면 해당 메서드를 추상 메서드 작성
		 * -상속 받은 클래스에 추상 메서드가 있다면 반드시 구현해야 한다.
		 * 
		 * 인터페이스 : interface 
		 * -상수와 추상메서드만으로 구성
		 * -기능 요약서
		 * -자체적으로 사용할 수는 없고, 인터페이스를 구현한 클래스로 활용
		 * -(implements)
		 * -인터페이스는 기능을 메서드로 정리할 때  멤버 변수가 없다는 것을 염두에 두고 작성해야 한다. 
		 */

		Tv1 tv = new Tv1();
		tv.turnOff();
		tv.turnOn();
		
		
	}

}
interface remocon{ // 상속은 다중 구현이 안되지만 인터페이스는 다중 구현이 가능핟}}{
	
	public abstract void chUp();
	public abstract void chDonw();
}

interface Power {
	
	public abstract void turnOn();
	public abstract void turnOff();

}

class Tv1 implements Power, remocon {
	boolean power;
	int ch;

	@Override
	public void turnOn() {
		power = true;
		System.out.println("TV가 켜졌습니다.");
		
	}

	@Override
	public void turnOff() {
		power=false;
		System.out.println("TV가 꺼졌습니다.");
		
	}

	@Override
	public void chUp() {
		ch++;
		System.out.println("채널을 하나 올렸습니다.");
		
	}

	@Override
	public void chDonw() {
		ch--;
		System.out.println("채널을 하나 내렸습니다.");
		
	}
	
	
}