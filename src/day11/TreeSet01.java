package day11;

import java.util.TreeSet;

public class TreeSet01 {

	public static void main(String[] args) {
		//TreeSet을 생성하고, 로또번호 6자리 담기
		//1~45까지 랜덤으로 값을 넣고 출력
		
		TreeSet set = new TreeSet<>();
		
		while(set.size()!=6) {
			
			int r = (int)(Math.random()*45)+1;
			set.add(r);
		}
		
		System.out.println(set);
		
		System.out.println(set.first());
		System.out.println(set.last());

	}

}
