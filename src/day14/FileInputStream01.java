package day14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream01 {

	public static void main(String[] args) throws IOException {
		//바이트 단위의 스트림
		byte[] b = new byte[1024];
		FileInputStream input = new FileInputStream("out.txt");
		input.read(b);
		System.out.println(new String(b)); //btye 배열을 문자열로 변경하여 출력
	}

}
