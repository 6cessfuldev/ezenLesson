package day09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception06 {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String name = br.readLine();
		
		System.out.println(name);
		
		br.close();
	}

}
