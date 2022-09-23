package day09;

public class Exception04 {

	public static void main(String[] args) {
		char op = '?';
		
		try {
			switch(op) {
				case '+' : case '-' : case '*' : case '/' :	case '%' :
					System.out.println(op + "는 산술연산자");
					break;
					default :
						//op가 산술연산자가 아닐 경우 예외 발생
						RuntimeException e= new RuntimeException(op+"는 산술연산자 X");
						throw e;
						
						//throw new RuntimeException(op+"는 산술연산자 X"); 와 같은 의미
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		 
		
		

	}

}
