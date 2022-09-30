package day13;

import java.util.HashMap;
import java.util.Map;

public class lambda02 {

	public static void main(String[] args) {
		
		Number add1 = (x, y) -> {return x+y;};
		System.out.println(add1.add(10,20));
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("영이", 10);
		map.put("순이", 12);
		map.put("출수", 13);
		map.put("영철", 14);
		map.put("바둑", 11);
		
		map.forEach((k, v) -> {
			System.out.println(k + " : " + v);
		
		});

		//메서드 직접 참조 ::
		
	}	
}

//함수형 인터페이스는 메서드가 하나여야만 한다.
@FunctionalInterface
interface Number {
	// 리턴이 int 형식, 매개변수가 int 값 두개
	int add(int a, int b);
}


