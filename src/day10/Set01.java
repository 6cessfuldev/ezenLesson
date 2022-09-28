package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class Set01 {

	public static void main(String[] args) {
		//Set은 순서보장X, 중복X
		//HashSet
		HashSet<String> set = new HashSet<String>();
		set.add("apple");
		set.add("banana");
		set.add("apple");
		set.add("peach");
		System.out.println(set);
		
		//정렬 : set은 순서X 정렬이 안됨. => set => list를 변경 후 출력
		List list = new ArrayList(set);
		Collections.sort(list);
		System.out.println(list);
	}
}
