package day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapEx02 {

	public static void main(String[] args) {
		/*
		 * 단어장 단어: 의미 => hello:안녕
		 * 5 => 5개의 단어를 입력
		 */
	
		Scanner scan = new Scanner(System.in);
		
		int size = scan.nextInt();
		
		HashMap<String, String> map = new HashMap<>();
		
		for (int i = 0; i < size; i++) {
			
			System.out.println("영단어를 입력해주세요.");
			String eng = scan.next();
			System.out.println("뜻을 입력해주세요.");
			String kor = scan.next();
			map.put(eng, kor);
		}
		
		System.out.println("----단어장 목록----");
		Set<Map.Entry<String, String>> set = map.entrySet();
		Iterator<Map.Entry<String, String>> it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry<String, String> entry = (Map.Entry<String, String>)it.next();
			System.out.println(entry.getKey()+ ":"+entry.getValue());
		}
				
	}
}
