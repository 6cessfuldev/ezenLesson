package day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class MapEx03 {

	public static void main(String[] args) {
		/* 단어장 단어:의미 => hello:안녕
		 * 5 => 5개의 단어를 입력
		 */
		
		// 메서드에서 호출 후 맵을 리턴 받아 출력
		System.out.println("단어장 프로그램입니다.");
		
		HashMap<String, String> map = new HashMap<>();
		map = make();
		printMap(map);
		
		

	}

	/* 기능 : 단어 : 의미 값을 입력받아 map으로 구성하여 map을 반환
	 * 리턴 타입 : map, HashMap<String, String>
	 * 매개변수 : X
	 * 메서드명 : make
	 */
	
	public static HashMap<String, String> make() {
		Scanner scan = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<>(); 
		
		int exit = -1;
		do {
			System.out.println("영단어를 입력해주세요.");
			String word = scan.next();
			System.out.println("뜻을 입력해주세요.");
			String mean = scan.next();
			map.put(word, mean);
			
			System.out.println("더 입력하시겠습니까? (Yes=1/No=2)");
			exit = scan.nextInt();
		} while (exit != 2);		
		
		return map;
	}
	
	public static void printMap(HashMap<String, String> map) {
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key + ":" + map.get(key));
		}
	}
}
