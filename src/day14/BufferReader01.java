package day14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader01 {

	public static void main(String[] args) throws IOException {
		//BufferedReader : 보조스트림
		//라인 단위로 읽기
		//더 이상 읽을 라인이 없을 경우 null을 리턴
		/*
		 * 입출력 스트림 구분
		 * 대상 기준 : 입력 스트림 / 출력 스트림
		 * 자료 종류 : 바이트 스트림 / 문자 스트림
		 * 기능 : 기반 스트림 / 보조 스트림
		 * 
		 * 기반 스트림 : 대상에 직접 자료를 ㅇ릭고 쓰는 기능의 스트림
		 * => XXIntput/OutputStream, XXreader/Writer
		 * 보조 스트림 : 직접 읽고 쓰는 기능 없이 추가적인 기능을 더해주는 스트림
		 * 보조스트림은 항상 기반 스트림이나 또 다른 스트림을 생성자의 매개변수로 포함한다.
		 */
		BufferedReader br = new BufferedReader(
				new FileReader("out.txt"));
		
		//더 이상 읽을 라인이 없을 경우 null을 리턴
		while(true) {
			String line = br.readLine();
			if(line == null) break;
			System.out.println(line);
		}
		br.close();

	}

}
