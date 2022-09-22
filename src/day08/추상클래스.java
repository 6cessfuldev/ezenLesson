package day08;

public class 추상클래스 {

	public static void main(String[] args) {
		/* 추상 클래스 : 추상 메서드를 포함하는 클래스
		 * 추상 메서드 : 선언부만 있고, 구현부가 없는 메서드
		 * 추상 클래스를 이용하여 객체를 생성할 수 없다.(상속한 클래스만 객체를 생성할 수 있다.)
		 * */
		
		Dog d = new Dog();
		d.name = "멍멍이";
		d.printInfo();
		d.howl();

	}

}

//추상 클래스 Animal
abstract class Animal {
	
	public String name;
	public String category;
	
	public void printInfo() {
		System.out.println("-------");
		System.out.println("이름:"+name);
		System.out.println("분류:"+category);
	}
	
	public abstract void howl(); // 추상 메서드
	
}

class Dog extends Animal{
	
	public Dog() {};
	
//	public Dog (String name) {
//		super.name = name;
//		super.category = "개과"; 
//	}
//	
	@Override
	public void howl() {
		System.out.println("-------");
		System.out.println("울음소리 : 왈왈");
	}
	
}