package day04;

public class String02 {

	public static void main(String[] args) {
		/* String method */
		String str = "Hello World JAVA";
		
		//길이
	 	int  len = str.length();
	 	System.out.println(len);
		
	 	//indexOf
	 	System.out.println("-------indexOf-----------");
	 	int position = str.indexOf('W'); // 단일 문자 값의 index를 찾는 메소드
	 	System.out.println(position);
	 	System.out.println(str.indexOf("ll")); // 일치하는 문자열의 시작 인덱스 반환
	 	System.out.println(str.indexOf('l', 5)); // 지정한 위치부터 찾기
	 	System.out.println(str.lastIndexOf("l")); // 끝에서부터 찾기
	 	System.out.println(str.lastIndexOf("l",7)); // 끝에서부터 지정한 위치부터 찾기
	
	 	//charAt(index) : 특정 인덱스의 값 반환 return 값은 char 
	 	System.out.println("----------charAt---------");
	 	System.out.println(str.charAt(0));
	 	
	 	//contains : 특정 값의 존재여부
	 	System.out.println("------contains--------");
	 	System.out.println(str.contains("World"));
	 	
	 	//equals : 특정값과 동일한지 확인 [문자열을 비교할 때는 반드시 equals로 비교]!!
	 	//String은 참조 자료형이기 때문에 서로 다른 주소값을 가지고 있고 ==을 통해 주소값을 비교하면 false가 나오게 됨
	 	System.out.println("----equals-----");
	 	System.out.println(str.equals("Hello World JAVA"));
	 	System.out.println(str.equalsIgnoreCase("hello world java")); // 대소문자 구분하지 않고 비교
	 	
	 	//대소문자 변환 toLowerCase, toUpperCase
	 	System.out.println("------shift case---------");
	 	System.out.println(str.toLowerCase()); // 소문자로 변환
	 	System.out.println(str.toUpperCase()); // 대문자로 변환
	 	System.out.println("ABC".toLowerCase()); 
	 	
	 	//비어있는 객체인지 판단 isEmpty()
	 	System.out.println("------isEmpty-------");
	 	System.out.println(str.isEmpty()); 
	 	System.out.println("".isEmpty());
	 	
	 	//문자값 대체 replace
	 	System.out.println("-----replace-----");
	 	System.out.println(str.replace('l', '1'));
	 	
	 	//문자열 분리 split (분리 후 배열 리턴) 
	 	System.out.println("---split----");
	 	String[] strArr = str.split(" ");  // 만약 구분자를 ""로 주면 한글자씩 자른다.
	 	for(String st : strArr) {
	 		System.out.println(st);
	 	}
	 	
	 	//문자열 추출 subString 
	 	System.out.println("---subString---");
	 	System.out.println(str.substring(6,11)); //6번지부터 11번지 전까지
	 	System.out.println(str.substring(6)); // 6번지부터 끝까지
	 	
	 	//양쪽 공백 제거 trim 
	 	System.out.println("---trim----");
	 	System.out.println(str.trim());
	 	
	 	//문자값 비교 compareTo()
	 	System.out.println("---compareTo---");
	 	System.out.println("b".compareTo("a")); // 대상 값이 비교값보다 아스키 코드상 앞에 있으면 음수, 같으면 0, 뒤에 있으면 양수;
	 	System.out.println("z".compareTo("a"));

	 	//문자를 숫자로 변환
	 	System.out.println("---문자를 숫자로 변환---");
	 	String str1 = "12345";
	 	int num = Integer.parseInt(str1);
	 	System.out.println(str1 instanceof String);
	 	System.out.println(num);
	 	
	 	//숫자를 문자로 변환
	 	System.out.println("---숫자를 문자로 변환---");
	 	String str2 = String.valueOf(num);
	 	System.out.println(str2);
	 	
	}
	
}
