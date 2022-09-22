package day08;

import java.util.Scanner;

public class 확장자찾기 {

	/* 기능 : 배열에서 찾는 문자열이 있는지 없는지 확인해서 알려주는 메서드
	 * 매개변수 : 배열, 찾는 값
	 * 리턴타입 : boolean
	 * 메서드명 : isContain
	 */
	public static boolean isContain(String[] strArr, String str) {
		for (int i = 0; i < strArr.length; i++) {
			if(strArr[i].contains(str)) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		/* 5개 문자열 배열을 생성한 후, 5개의 파일명을 입력받는 코드를 작성
		 * 입력받은 파일명 중에 이미지 파일을 검색하여 출력하는 코드를 작성
		 * 이미지 형식 파일 확장자 (jpg, png, gif, jpeg)
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		String[] strArr = new String[5];
		String[] imgEx = {"jpg", "png", "gif", "jpeg"};
		
		//1. main 메소드 내 반복문으로 String 배열 비교
		
		
	
		//입력 받는 코드
		for (int i = 0; i < strArr.length; i++) {
			strArr[i] = sc.nextLine();
		}
		
		//출력하는 코드
		for (int i = 0; i < imgEx.length; i++) {
			if(isContain(strArr,imgEx[i])){
				for (int j = 0; j < strArr.length; j++) {
					if(strArr[j].contains(imgEx[i])){
						System.out.println(strArr[j]);
					}
				}
			}			
		}
		
		System.out.println("------------");
		
		//2. Finder 클래스 사용
		
		Finder finder = new Finder(imgEx);
		finder.printResult(strArr);
		
		
	}
}

//2. Finder 객체 사용
class Finder {
	private String[] keyArr;

	public Finder(String[] keyArr) {
		this.keyArr = keyArr;
	}
	
	public String[] find(String[] strArr) {
		
		String[] res = new String[strArr.length];
		int count = 0;
		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < keyArr.length; j++) {
				if(strArr[i].contains(keyArr[j])) {
					res[count] = strArr[i];
					count++;
				}
			}	
		}
		return res;
	}
	
	public void printResult(String[] strArr) {
		String[] res = find(strArr);
		for (int i = 0; i < res.length; i++) {
			if(res[i] != null) {
				System.out.println(res[i]);
			}
		}
	}	
}

