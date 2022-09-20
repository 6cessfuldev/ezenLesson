package day05;

public class 클래스01 {

	/* 클래스 - 설계도
	 * 객체 - 제품
	 * 메서드 - 기능
	 * 
	 * 클래스
	 * -속성(정보) : 멤버 변수
	 * -기능 : 메서드
	 * 프린터 클래스
	 * -속성(정보) : 크기, 제조사, 이름, 컬러 여부
	 * -기능 : 인쇄, 스캔, 복사, 팩스
	 * 
	 * 멤버 변수는 클래스 안에 작성. 메서드 밖 위쪽 (4번 라인)
	 * 멤버 변수는 클래스 안에서 사용할 수 있다. (클래스 내 모든 메서드를 포함)
	 * 
	 * -객체 선언
	 * 클래스명 객체명;
	 * 
	 * -객체 초기화(생성)
	 * 객체명 = new 클래스명();
	 * 
	 * -객체 선언/초기화
	 * 클래스명 객체명 = new 클래스명();
	 * 
	 * 객체명.메서드명();
	 * 같은 클래스 안의 메서드를 호출할 때는 그냥 사용가능.
	 * 다른 클래스에서는 객체를 이용해서 (객체.메서드명) 사용가능.
	 * 
	 * 접근 제한자(제어자)
	 * public : 모두 사용 가능.
	 * protected : 클래스 + 패키지 + 자식 클래스
	 * (default) : 클래스 + 패키지
	 * private : 클래스 내
	 * 
	 * 클래스에 public을 붙이는 건 파일명과 같은 클래스만 가능
	 * 맴버 변수와 멈베 메서드 public은 문제없이 사용 가능. 하지만 클래스는 위와 같이 주의
	 * 
	 * private : 멤버 변수/ 멤버 메서드는 다른 클래스에서 사용할  ㅜ없음.
	 * (일반적으로 멤버 변수는 private 메서드는 public)
	 * 일반적으로 private으로 선언된 멤버 변수는 getter/setter를 만들어서 해당 변수에 접근할 수 있도록 한
	 */
	public static void main(String[] args) {
		
		Point p = new Point();
		p.print();
		p.move(3, 2);
	
		
		p.x2 = 10;
		p.y2 = 20;
		
		p.print();
		
		p.setX(0);
		p.setY(10);
		p.print();
		
	}	

}

//public 접근 제한자인 Class는 파일명과 클래스명이 같을 때만 가능
//다른 클래스 밖에서 클래스 생성
//접근 제한자 class 클래스명{
//}
class Point { 
	
	private int x;
	private int y;
	
	//getter/setter 생성
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int x2;
	public int y2;
	
	public void print() {
		System.out.println("(" + x + "," + y + ")");
		System.out.println("(" + x2 + "," + y2 + ")");
	}
	
	/* x, y 의 값을 변경하는 move
	* 매개변수로 값을 받아 x, y 값을 변경
	*/
	public void move(int x1, int y1) {
		this.x= x1;
		this.y= y1;
		this.x2 = x1;
		this.y2 = y1;
	}
	
}
