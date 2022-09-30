package day13;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Lambda {

	public static void main(String[] args) {
		/* 람다식(Lambda)
		 * 함수의 구현과 호출만으로 프로그램이 수행되는 방식
		 * 외부자료에 부수적인 영향이 가지 않도록 구현하는 방식
		 * 매개변수가 하나인 경우 자료형과 괄호를 생략할 수 있다. 
		 * (int x, int y) => {return x+y}; 가능
		 * int x => {return x+y}; 가능
		 * int x, int y -> {return x+y}; 오류
		 * (int x, int y) -> return x+y; 오류 
		 * return이 있으면 중괄호 생력 불가.
		 * 실행문이 하나면 괄호 생략 가능
		 * str -> system.out.println(str); 가능
		 *   
		 */

		//ArrayList 10, 20, 30, 40, 50 을 입력 후 출력
		ArrayList<Integer> number = new ArrayList<>();
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(40);
		number.add(50);
		
		for (Integer integer : number) {
			System.out.println(integer);
		}
		System.out.println("-----------------");
		
		//Lambda 형태로 출력
		number.forEach((n) -> {
			System.out.println(n);
		});
		System.out.println("---------------");
		
		// 메서드 직접 참조
		System.out.println("메서드 직접 참조");
		number.forEach(System.out::println);
		
		//람다에서 사용하는 함수형 인터페이스
		Consumer<Integer> method = 
				(n) -> {System.out.println(n);};
				
		number.forEach(method);
		System.out.println("---------------");
		
		//BiConsumer 매개변수가 2개인 함수형 인터페이스
		BiConsumer<String, Integer> bis = (a,b) -> {
			System.out.println("name" + a + ", age"+b);
		};
		
		bis.accept("영이", 10);
		System.out.println("---------------");
		
	}

}
