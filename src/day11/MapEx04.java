package day11;

import java.util.HashMap;
import java.util.Iterator;

public class MapEx04 {
	
	private static HashMap<String, Integer> memberMap = new HashMap<>();

	public static void main(String[] args) {

		HashMap<String, Integer> map ;
		
		//1번 메서드 사용하기
		map = make1();
		make2(map);
		System.out.println("----주문 목록----");
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		make3();
	}
	
	/* map에 상품 이름과 값을 추가
	 * map.put("가위", 2500)
	 * map.put("크레파스", 5000) 
	 *...
	 *1. 해당 맵을 만들어서 리턴 => main에서 받아서 출력 (합계도 같이)
	 */
	public static HashMap<String, Integer> make1() {
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("가위", 3000);
		map.put("크레파스", 5000);
		
		return map;
	}


	/*
	 *2. 메인에서 map을 생성 후 매개변수로 map을 받아와서 
	 * 상품 이름과 값을 추가
	 */
	public static void make2(HashMap<String, Integer> map) {
		
		map.put("딱풀", 300);
		map.put("본드", 1000);

	}

	/* 
	 * 3. 멤버 변수에 map을 추가
	 */
	public static void make3() {
		memberMap.put("자", 1000);
		memberMap.put("각도기", 1000);
	}
}
