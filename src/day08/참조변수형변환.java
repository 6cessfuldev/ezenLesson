package day08;

public class 참조변수형변환 {

	public static void main(String[] args) {
//		int num =5;
//		int num2 = 3;
//		double num3 =(double)num/ num2;
//		double num4 = num2;
		
		//자식을 부모로 형 변환하는 경우 무조건 가능
		C c = new C();
		P p = new P();
		P c1 = new C();
		System.out.println(c1.num1);
		P p2 = c;
//		System.out.println(c1.num2);// 부모로 형 변환한 경우 자식 고유의 멤버는 못 가져옴
		
		//부모를 자식으로 형변환하는 경우 형 변환을 생략할 수 없다. 조건부로 에러가 발생할 가능성 있다.
		//1. 에러가 발생하지 않는 경우
		// 부모의 참조변수가 자식의 객체랑 연결되어 있는 경우
		// 이 부모의 객체를 다시 자식의 객체로 형변환 가능
		P p3 = new C();
		System.out.println(p3.num1);
		C c3 = (C)p3;
		System.out.println(c3.num2);
		
		//2. 에러가 발생하는 경우
		P p1 = new P();
		
		if (p1 instanceof C) {
			C c4 = (C)p1;
			System.out.println(c4.num1);
		};

	}
}

class P {
	int num1 = 10;
}

class C extends P {
	int num2 = 20;
}
