package day09;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="100,200,300,400,500";
		StringTokenizer tokenizer = new StringTokenizer(str, ",");
		while(tokenizer.hasMoreTokens()) {
			System.out.println(tokenizer.nextToken());
			System.out.println(tokenizer.countTokens());
		}
		
		String exp = "X=100*(10-a)/3*2";
		StringTokenizer st2 = new StringTokenizer(exp, "=*(-)/*",true);
		
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken()+" ");
		}	
	}

}
