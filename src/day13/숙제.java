package day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class 숙제 {

	public static void main(String[] args) {
		int[] data = {5,6,3,42,5,3,43,3,4,6,34,34,31,5,3,3,3,2,4,52,2,6,7,8};
		
		//data 배열 중복을 제거하고 출력
		//스트림 사용, 스트림 안쓰고 방법을 찾아보시오.
		
		/* --------------- 스트림을 쓰지 않고 중복 제거 정렬 -------*/
		Set<Integer> set = new HashSet<>();  
		
		for (int i = 0; i < data.length; i++) {
			set.add(data[i]);
		}
		
		
		// 리스트 소트
		
		ArrayList<Integer> list = new ArrayList<>();
		for (Integer integer : set) {
			list.add(integer);
		}

		list.sort(new Comparator<Integer>(){

			@Override
			public int compare(Integer o1, Integer o2) {
				// String : compareTo 1, -1 ,0;
				// int : - 
				return -(o1-o2);
			}
		});

		System.out.println(list);
	
		/*-------------- 스트림을 쓰고 중복 제거 정렬 --------------*/
		
		list.stream().sorted(new Comparator<Integer>(){

			@Override
			public int compare(Integer o1, Integer o2) {
				// String : compareTo 1, -1 ,0;
				// int : - 
				return -(o1-o2);
			}
		}).forEach(s -> System.out.println(s));
	
		
		//역순 정렬  (내림차순 정렬) sorted
		int[] resultStream = Arrays.stream(data)
				.boxed() // intStream => Stream<Integer>로 변경
				.filter(a -> a%2 ==0)
				.distinct() // 중복 제거
				.sorted(Comparator.reverseOrder()) // 내림차순 정렬
				.mapToInt(Integer::intValue) //Stream<Integer> => IntStream 변경
				.toArray();
		
	}
}
