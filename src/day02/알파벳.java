package day02;

public class 알파벳 {

	public static void main(String[] args) {
		/* char : 유니코드표에 따라 글자에 코드가 매겨져 있음
		 */
		
		char ch = 'B';
		System.out.println((int)ch);

		//A~Z 반복문을 활용하여 표시

		for(int i=65; i<=90; i++){
			System.out.print((char)i + " ");
		}
		
		System.out.println();
		System.out.println("--------------------");
		
		for(char ch1='A'; ch1<='Z'; ch1++) {
			System.out.print(ch1 + " ");
		}
		
		/* a
		 * ab
		 * abc
		 * abcd
		 * abcde
		 *  .
		 *  .
		 *  .
		 *  .
		 *  abcde.....z
		 */
		
		System.out.println();
		
		for(int i=1; i<=((int)'z'-(int)'a'); i++) {
			for(char ch1='a'; ch1<'a'+i;ch1++) {
				System.out.print(ch1);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(char i='a'; i<='z'; i++) {
			
			for(char j='a'; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}
