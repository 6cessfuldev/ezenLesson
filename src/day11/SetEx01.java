package day11;

import java.util.HashSet;
import java.util.Iterator;

public class SetEx01 {

	public static void main(String[] args) {
		// HashSet을 구성하고, a,b,c,a,b,c 
		
		HashSet<String> set = new HashSet<>();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("a");
		set.add("b");
		set.add("c");
		System.out.println(set);
		
		for (String string : set) {
			System.out.println(string);
		}

		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
			
		}
		
	}

}
