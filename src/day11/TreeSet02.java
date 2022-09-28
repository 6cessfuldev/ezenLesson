package day11;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet02 {

	public static void main(String[] args) {
		int[] score = {80, 95, 78, 32, 56, 12, 98, 66};

		TreeSet set = new TreeSet<>();
		for (int i : score) {
			set.add(i);
		}

		System.out.println(set);
		System.out.println(set.first());
		System.out.println(set.last());
		System.out.println(set.headSet(80));
		System.out.println(set.tailSet(80));
		
		TreeSet<String> set2 = new TreeSet<>();
		set2.add("aaa"); set2.add("abc"); set2.add("bbb");
		set2.add("awe"); set2.add("cow"); set2.add("cat");
		set2.add("aww"); set2.add("monkey"); set2.add("bee");
		set2.add("zzqw"); set2.add("dance"); set2.add("beetles");
		
		System.out.println(set2);
		
		String from = "b";
		String to = "d";
		
		System.out.println(set2.subSet(from, to));
	}

}
