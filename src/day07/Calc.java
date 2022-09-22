package day07;

public class Calc {

	public static void main(String[] args) {
		/* 메서드 오버로딩을 이용해서 메서드 작성
		 * 메서드 오버로딩 규칙 
		 * 1. 메서드의 매개변수 형태가 달라야 한다.
		 * 2. 메서드의 매개변수 개수가 달라야 한다.
		 * 리턴 타입은 아무 영향을 주지 않는다.
		 * 메서드의 이름이 같아도 매개변수의 형태가 다르면
		 * 다른 메서드로 인식 매핑
		 */
	
		//1. 삼각형의 면적(가로 * 세로 /2)
		int width = 100;
		double height = 40;
		System.out.println(area(width,height));
		
		//2. 사각형의 면적(가로 * 세로)
		int w = 100;
		int h = 40; 
		System.out.println(area(w,h));
		
		//3. 원의 면적( r^2 * 파이 )
		int r = 3;
		System.out.println(area(r));
		
		
	}
	
	/* 메서드명 : area
	 */
	
	public static double area (int width, double height) {
		return width*height/2;
	}
	
	public static int area (int width, int height) {
		return width*height;
	}
	
	public static double area(int r) {
		return r*r*Math.PI;
	}
	
	
			

}
