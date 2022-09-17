package day04;

public class String03 {

	public static void main(String[] args) {
		/*
		 * 이메일에서 ID를 추출
		 * */
		
		String email = "6cessfuldev@gmail.com";
		String id = email.substring(0, email.indexOf('@'));
		System.out.println(id);
		
		String domain = email.substring(email.indexOf('@')+1);
		System.out.println(domain);
		
		String filename = "String메서드.jpg";
		
		String name = filename.substring(0,filename.indexOf("."));
		
		String exe = filename.substring(filename.indexOf(".")+1);
		
		System.out.println("파일 이름은 |" + name + "| 이고 확장자 이름은 |" + exe + "| 입니다.");
		
		

	}

}
