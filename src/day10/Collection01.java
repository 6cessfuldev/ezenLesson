package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Collection01 {
	
	public static void main (String[] args) {
		/* 컬렉션 프레임웤 : 표준화된 방식의 자료구조
		 * List, Set, Map
		 * 데이터를 묶어서 관리할 때 사용
		 * 주로 배열 대신 사용
		 * 
		 * List 
		 * - 값을 하나씩 저장
		 * - 순서를 보장
		 * - 중복 허용
		 * - 일반적으로 배열 대신 가장 많이 사용
		 * 
		 * Set
		 * - 값을 하나씩 저장
		 * - 순서를 보장 X
		 * - 중복 허용 X
		 * 
		 * Map
		 * - 값을 2개 저장
		 * - 하나는 key 하나는 value
		 * - key는 중복 불가 value는 중복 가능
		 * - key가 중복 되면 덮어쓰게 됨
		 * - 아이디 / 패스워드 처럼 같이 묶어서 저장해야 할 때 사용
		 * 
		 * Collection framework는 어떤 데이터를 관리할 지 클래스로 지정해야 한다.
		 * ex ) 숫자 형식 => int(x) Integer(o), String(o) 
		 * 클래스를 지정해주지 않으면 Object가 자동으로 들어간다.
		 */
		
		//List 사용방법
		
		//List list = new List(); // 불가능 List는 인터페이스
		List list1 = new ArrayList(); //따로 담을 데이터의 자료형을 정하지 않으면 모든 객체 저장 가능
		
		ArrayList<String> list3 = new ArrayList<>();
		ArrayList<Integer> list4 = new ArrayList<>();
		
		list4.add(1);
		list4.add(5);
		list4.add(2);
		
		System.out.println(list4);
		
		list3.add("가나다");
		list3.add("라마바");
		
		System.out.println(list3);
		
		ArrayList<Integer> list5 = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			list5.add(i+1);
		}
		
		System.out.println(list5);
		
		for (int i = 0; i < 10; i++) {
			list5.add(i+1);
		}
		
		System.out.println(list5);
		System.out.println(list5.size());
		list5.remove(0);
		System.out.println(list5); //.remove(index) 삭제(index 번지의 요소 삭제)
		System.out.println(list5.size());
		
		Integer integer = 10;
		list5.remove(integer); //.remove(object) 객체를 넣으면 해당 값을 삭제
	  	System.out.println(list5);
	  	list5.set(0, integer);
	  	System.out.println(list5);
	  	System.out.println(list5.get(0));
	  	
	  	for (Integer integ : list5) {
			System.out.print(integ+ " ");
		}
	  	System.out.println();
	  	System.out.println("---------Iterator--------");
	  	/* Iterator를 이용한 list값 출력 (번지가 아닌 값을 이용해서 출력)
	  	 * List 는 순서를 보종하기 떄문에 get을 이용하여 원하는 번지에 값을 확인 가능
	  	 * set은 순서를 보장하지 않기 때문에 for문으로 접근할 수 없다.
	  	 * set은 Iterator를 이용해야만 출력이 가능
	  	 */
	  	Iterator<Integer> it = list5.iterator();
	  	while(it.hasNext()) {
	  		Integer tmp = it.next();
	  	}
	  	
	  	System.out.println();
	  	//indexOf(값) : 값의 위치를반환, 값이 없으면 -1반환
	  	integer = 9;
	  	System.out.println(list5.indexOf(integer));
	  	
	  	/*
	  	 * sort(객체)
	  	 * - 객체 : Comparator 인터페이스를 구현한 객체를 넣어야 함
	  	 * -비교(compare)메서드를 가진 객체를 이용하여 정렬
	  	 */
	  	list5.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2; //오름차순 (o2 - o1은 내림차순) 
			}
		});
	  	
	  	Collections.sort(list5);
	  	
	  	System.out.println(list5);
	  	
	  	
	}

}
