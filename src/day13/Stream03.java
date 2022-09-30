package day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream03 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("홍길동", 90));
		list.add(new Student("강감찬", 95));
		list.add(new Student("이순신", 85));
		
 		List<Student> list2 = Arrays.asList(
 				new Student("신사임당", 100),
 				new Student("정약용", 88),
 				new Student("퀴리부인", 79)
 				);
 				
 		Stream<Student> s = list2.stream();
 		s.forEach(a-> {
 			String name = a.getName();
 			int score = a.getScore();
 			System.out.println(name + " : " + score);
 		});
 		
 		Stream<Student> s1 = list.stream();
 		long cnt = s1.count();
 		System.out.println(cnt+"명");
 		
	}

}
