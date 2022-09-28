package day11;

import java.util.HashMap;
import java.util.Iterator;

public class Map02 {

	public static void main(String[] args) {
		//key/value
		//set번경 후 출력
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("국어", 89);
		map.put("영어", 78);
		map.put("수학", 84);
		System.out.println("국어:" + map.get("국어"));
		System.out.println("----------");
		System.out.println(map.entrySet()); //key = value 출력
		System.out.println("----------");
		System.out.println(map.keySet()); //key만 출력
		
		Iterator<String> it = map.keySet().iterator();
		int sum = 0;
		
		while (it.hasNext()) {
			String string = (String) it.next();
			System.out.println(string + ":" + map.get(string));
			sum += map.get(string);
		}
		System.out.println("합계: "+sum);
		System.out.printf("평균:%.2f ",(double)sum/map.size());
	}
}
