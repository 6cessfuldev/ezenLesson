package day09;

import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionEx01 {

	public static void main(String[] args) {
		/* \d 숫자 
		 * * 문자가 0번 이상 발생
		 * [a-z] 영문자 1글자
		 * (02|010)-\d{3,4}-\d{4} 전화번호 정규식
		 */

		String[] strArr = {"bat", "cat", "fat", "cap", "can", "cam", "camp","baby"};
		Arrays.sort(strArr);
		
		Pattern pattern = Pattern.compile("[a-z]*a[a-z]*");
		for (String string : strArr) {
			Matcher matcher = pattern.matcher(string);
			if(matcher.matches()) {
				System.out.println(string);
			}
		}
		
		
	}

}
