package day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapEx01 {

	public static void main(String[] args) {
		//과목과 점수를 입력받아 출력하고, 합계, 평균 출력
		//종료 키워드가 나올 때까지 반복(0)
		
		Scanner scan = new Scanner(System.in);
		
		int out = -1;
		HashMap<String, Integer> map = new HashMap<>();
		
		do {
			System.out.println("과목명 입력");
			String subject = scan.next();
			System.out.println("위 과목의 점수 입력");
			int score = scan.nextInt();
			map.put(subject, score);
			System.out.println("추가로 입력하시겠습니까?(Yes=1 /No=2)");
			out = scan.nextInt();
		} while (out != 2);
		
		System.out.println("---과목 리스트---");
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		
		int sum = 0;
		while(it.hasNext()) {
			String str =it.next();
			sum += map.get(str);
			System.out.println(str+ ":" + map.get(str));
		}
		System.out.println("합계 :" + sum);
		System.out.printf("평균 :%.2f", (double)sum/map.size());
		

	}

}
