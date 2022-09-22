package day07;

public class 상속02 {

	public static void main(String[] args) {
		/*
		 * 오버라이딩 : 부모 클래스에게 물려받은 메서드를 재정의하는 것.
		 * -부모클래스의 메서드와 일치해야 한다. (선언부일치)
		 * -접근제한자는 같거나 넓은 접근제한자를 써야한다.
		 * => 범위를 축소할 수 없다.
		 */
		
		Cat cat = new Cat();
		cat.info();
		cat.howl();
		
		Dog dog = new Dog();
		dog.info();
		dog.howl();
		
		Tiger tiger = new Tiger();
		tiger.info();
		tiger.howl();
	}
}

class Animal {

	private String name;
	private String category;
	
	public Animal() {};
	
	public Animal(String name, String category) {
		super();
		this.name = name;
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void info() {
		System.out.println("----------");
		System.out.println("이름 : " + name);
		System.out.println("분류 : " + category);
		System.out.println("----------");
	}

	public void howl() {
		System.out.print(name+"의 울음소리 : ");
	}
}

class Dog extends Animal{

	public Dog() {
		super("강아지", "개과");
		
	}
	
	@Override
	public void howl() {
		super.howl();
		System.out.println("왈왈!");
	}
	
}

class Cat extends Animal{
	
	public Cat() {
		setName("냥이");
		setCategory("고양이과");
	}
	
	@Override
	public void howl() {
		super.howl();
		System.out.println("야옹!");
	}
	
}

class Tiger extends Animal{
	
	public Tiger() {
		super.setName("호랑이");
		super.setCategory("고양이과");
	}
	
	@Override
	public void howl() {
		super.howl();
		System.out.println("어흥!!!");
	}
	
}
