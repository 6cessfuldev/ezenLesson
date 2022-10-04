package day14;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriter01 {

	public static void main(String[] args) throws IOException {
		// 문자 기반 스트림
		FileWriter fw = new FileWriter("writer.txt");
		
		for (int i = 1; i <= 10; i++) {
			String data = i+" test\n";
			fw.write(data);
		}
		
		fw.close();
		
		//파일을 추가모드로 연다.
		FileWriter fw1 = new FileWriter("writer.txt", true); // 생성자 두번째 매개변수가 true면 뒤에 이어쓰기
		
		for (int i = 11; i <= 20; i++) {
			String data = i+" test\n";
			fw1.write(data);
		}
		fw1.close();

		PrintWriter pw = new PrintWriter("writer2.txt");
		
		for (int i = 1; i < 10; i++) {
			String data = i + "Test 입니다.";
			pw.println(data);
		}
		pw.close();
		
		PrintWriter pw2 = new PrintWriter(new FileWriter("Writer2.txt", true));
		
		for (int i = 11; i <= 20; i++) {
			pw2.println(i+" test입니다.");
		}
		pw2.close();
		
	}

}
