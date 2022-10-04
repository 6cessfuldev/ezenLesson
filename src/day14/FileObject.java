package day14;

import java.io.File;

public class FileObject {

	public static void main(String[] args) {

		File f = new File("D:\\java_workspace\\java_Project\\out.txt");
		String fileName = f.getName();
//		System.out.println("경로를 제외한 파일 이름 : "+fileName);
//		System.out.println("경로를 포함한 파일 이름 : "+f.getPath());
//		System.out.println("경로를 포함한 파일 이름 : "+f.getAbsolutePath());
//		System.out.println("파일이 속한 폴더(경로만) : "+ f.getParent());
//		System.out.println("----------------------");
//		System.out.println("파일 구분자 : "+File.separator); // 자주 사용
//		System.out.println("파일 구분 문자 : "+File.separatorChar);
		
		//f에 대한 경로 (드라이브, 경로, 파일명, 확장자) - 다 쪼개기
		
		//드라이브
		System.out.println(f.toString());
		char drive = f.getPath().charAt(0);
		System.out.println(drive+"드라이브");
		String path = f.getParent();
		System.out.println("경로는 " + path);
		String name = f.getName();
		System.out.println("파일 이름은 " + name.substring(0, name.indexOf('.')));
		String[] strArr= name.split("\\.");
		System.out.println("확장자는 " +strArr[1]);
		
		
		//시스템에서 직접 알아낸 사용자 파일의 경로
//		System.out.println(System.getProperty("user.dir"));
		
	}

}
