package day08;

public class 참조변수형변환02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		P p1= new P();
		C c1;
		
		if(p1 instanceof C) {
			c1 = (C)p1;		
		}
		
		P p2 = new C();
		if(p2 instanceof C) {
			c1 = (C)p2;
		}
		
	}

}
