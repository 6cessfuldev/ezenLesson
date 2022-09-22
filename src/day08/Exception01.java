package day08;

public class Exception01 {

	public static void main(String[] args) {
		try{
			System.out.println(calc(4, 0,'+'));
			System.out.println(calc(4, 0, '%')); // 예외발생
			System.out.println(calc(4, 0, '?')); //메소드 내의 예외처리가 없으면 예외처리 필요
			System.out.println(calc(4, 0, '-'));
			System.out.println(calc(4, 0, '/'));
			System.out.println(calc(4, 0, '-')); //예외발생
		} catch(Exception e) {
			//예외가 발생시 실행할 구문
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			//예외와 상관없이 실행할 구문
			System.out.println("계산기 종료");
		}
	}
	
	//기능 : 두 정수와 산술연산자가 주어졌을 때 산술연산의 결과를 알려주는 메서드
	// 매개변수 : 
	// 메서드명 : calc
	// 리턴타입 : double
	// 메서드에서 throw를 발생시키게 되면 메서드 선언부에 throws를 이용하여 발생할 수 있는 예외를 적어주어야 한다.
	public static double calc(int num1, int num2, char c) throws RuntimeException {
		//throws는 RuntimeException일 때만 생력 가능
		
		if ((c=='/' || c=='%') && num2 == 0 ) throw new RuntimeException("num2는  0이 될 수 없습니다.");		
		switch(c) {
		case '+' : return num1+num2;
		case '-' : return num1-num2;
		case '*' : return num1*num2;
		case '/' : return num1/num2;
		case '%' : return num1%num2;
		default:
			throw new RuntimeException(c+ "는 산술 연산자가 아닙니다.");
		}
	}

}
