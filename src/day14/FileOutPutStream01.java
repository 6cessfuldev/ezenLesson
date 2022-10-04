package day14;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStream01 {

	public static void main(String[] args) throws IOException {
		//파일 쓰기 : 바이트 기반 출력 스트림
		//상대 경로 
		FileOutputStream output = new FileOutputStream("out.txt");
		//10번 반복해서 test 쓰기
		
		for (int i = 0; i < 10; i++) {
			String data = "test" +i+ "\r\n"; 
			output.write(data.getBytes()); // 파일에 쓰기
		}
		
		output.close();	
	}
}
