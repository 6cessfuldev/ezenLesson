package day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream01 {

	public static void main(String[] args) {
		/*
		 * Stream(스트림) : 한번 생성하면 재사용이 불가능하다.
		 * 한번 생성하면 재사용이 불가능
		 * 자료에 대한 스트림을 생성하여 연산을 수행하면 스트링은 소모가 됨 
		 * 스트림 연산은 기존 자료를 변경하지 않음
		 * 중간연산 : filter() : 조건에 맞는 요소를 추출, map() key에 대한 value을 반환
		 * 최종연산 : forEach(),sum()
		 * Arrays.stream => 배열의 값을 이용한 스트림 생성
		 */

		int[] arr = {1,2,3,4,5};
		
	// 최종 연산
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
		
		long cnt = Arrays.stream(arr).count();
		System.out.println(cnt);
		
		Double avg = Arrays.stream(arr).average().getAsDouble();
		System.out.println(avg);
	
	// 중간 연산
		//성적 배열 점수가 70점 이상만 합계
		int[] a = {20, 55, 89, 79 ,67, 47, 45, 77};
		
		int sum1 = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>=70) sum1 += a[i]; 
		}
		System.out.println(sum1);
		System.out.println("-------------");
		int total = Arrays.stream(a).filter((b) -> b>=70).sum();
		
		//컬렉션에서 stream 사용 방법
		ArrayList<Integer> list = new ArrayList<>();
		list.add(70);
		list.add(73);
		list.add(79);
		Stream<Integer> s = list.stream();
		s.forEach(System.out::println);
		s.filter((b) -> b>=73);
		
		//가변 매개변수
		Stream<Integer> s1 = Stream.of(10,20,30);
		s1.forEach(System.out::println);
		System.out.println("------------");
		
		//정수 스트림 생성
		IntStream s3 = IntStream.rangeClosed(1, 5);
		s3.forEach(System.out::println);
	
		

		
	}

}
