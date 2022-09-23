package day09;

public class Exception03 {

	public static void main(String[] args) {
		/* 
		 * 
		 * 예외발생시점부터 실행은 안됨.
		 * 
		 * try{
		 * 	예외가 발생할 수 있는 실행문;
		 * }catch(예외클래스명1 객체){
		 * 처리문;
		 * }catch(예외클래스명2 객체){
		 * 처리문;
		 * }
		 * 
		 * 가장 마지막에 Exception 을 넣어서 모든 예외를 받을 수 있게
		 * 앞에 놓으면 뒤에 catch문이 의미가 없어짐
		 */

		double res = 0;
		try {
			//res = 0/1;
			int arr[] = null;
			arr[5]=10;
		} catch (ArithmeticException | NullPointerException e) {
			System.out.println("예외발생");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("배열의 범위가 넘어갔습니다. 예외발생");
		} catch (Exception e) {
			System.out.println("Exception 발생");
		}
		System.out.println("수고하셨습니다.");
	}

}
