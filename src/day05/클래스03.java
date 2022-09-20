package day05;

public class 클래스03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Card c = new Card();
		
		c.print();
		
		c.setNum(5);
		c.setShape('♠');
		c.print();
		
		c.setNum(20);
		c.print();
	}
	
	/* 오버로딩의 조건
	 * 매개변수의 개수가 다른 경우
	 * 매개변수의 자료형이 다른 경우
	 */
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	public static int sum(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}

}
/* Card 클래스 : 포커 게임에서 카드를 나타내는 클래스
 * 모양 : 하트, 클로버, 다이아, 스페이드
 * 숫자 : 1~10, j, q, k
 * 
 * 클래스의 구성
 * - 멤버 변수 : int num, char shape
 * - 메서드 : print
 * - 생성자 : 클래스의 멤버변수를 초기화 하는 메서드
 * -클래스의 생성자가 하나도 없으면 기본 생성자가 자동으로 생성
 * -생성자를 하나라도 선언학 ㅔ되면 기본 생성자는 만들어지지 않음
 * 
 * -생성자 선언 방법
 * public 클래스명(){
 * 초기값;
 * }
 * -메서드 오버로딩 : 매개변수가 다른 같은 이름의 메서드를 만들어주는 것
 */
class Card {
	
	private char shape; //모양
	private int num; //숫자

	// 생성자 : 객체의 초기값을 결정
	public Card() {
		shape='♥';
		num = 1;
	}
	
	public void print () {
		System.out.print(shape);
		switch (num) {
		case 11: 
			System.out.println("J");
			break;
		case 12:
			System.out.println("Q");
			break;
		case 13:
			System.out.println("K");
			break;
			default : System.out.println(num);
		}
	}

	public char getShape() {
		return shape;
	}

	public void setShape(char shape) {
		switch (shape) {
			case '♥' : case '♣' : case '♠' : case '◆' : 
				this.shape = shape; 
				break;
				default : this.shape = '♥';
		}
		
		
		
		this.shape = shape;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		if(num < 1 || num > 13) {
			this.num = 1;
		} else {
			this.num = num;
		}
	}

	
	
	
}
