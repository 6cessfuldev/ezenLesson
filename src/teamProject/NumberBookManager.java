package teamProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class NumberBookManager {

	private ArrayList<Company> list = new ArrayList<>();
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private int cnt = 1;
	
	//생성자(string,string)로 객체 생성하기  
	public void create() throws IOException {
	      System.out.println("저장하실 이름을 입력해주세요.");
	      String name = br.readLine();
	      System.out.println("저장하실 전화번호를 입력해주세요.");
	      String phoneNum = br.readLine();
	      Company a = new Company(name,phoneNum, cnt++);
	      list.add(a);
	      System.out.println("저장이 완료되었습니다.");
	   }
	
	//검색 기능 (한글자, 두글..), 번호 검색
	// 글자로 검색 시 
	public ArrayList<Company> read() throws IOException {
		System.out.println("찾으실 단어를 입력해주세요.");
		String input = br.readLine();
		boolean flag = false;
		ArrayList<Company> arr = new ArrayList<>();
		
		for (int i = 0; i < list.size(); i++) {
			Company a = list.get(i);
			if(a.getName().contains(input))
			{
				System.out.println("고유번호 " +a.getCnt()+ " 이름: "+a.getName()+" 전화번호: "+a.getPhone());
				flag = true;
				arr.add(a);
			}
		}
		for(int i=0; i<list.size(); i++)
		{
			Company a = list.get(i);
			if(a.getPhone().contains(input))
			{
				System.out.println("고유번호 " +a.getCnt()+" 이름: "+a.getName()+" 전화번호: "+a.getPhone());
				flag = true;
				arr.add(a);
			}
		}
		if(!flag)
		{
			System.out.println("찾으시는 연락처가 존재하지 않습니다.");			
		}
		return arr;
	}
	
	//검색 -> cnt로 선택 -> 업체명, 번호 둘다 수정 가능
	public void update() throws IOException {
		ArrayList<Company> readlist = read();
		
		System.out.println("수정하고 싶은 고유번호를 입력하세요.");
		int cnt = Integer.parseInt(br.readLine());
		
		for (Company com : readlist) {
			if(cnt==com.getCnt()) {
				System.out.println("수정할 내용을 입력해주세요.");
				System.out.println("1. 업체명 / 2. 전화번호");
				int choice = Integer.parseInt(br.readLine());
				
				if(choice == 1) {
					System.out.println("어떤 이름으로 수정하시겠습니까?");
					String name = br.readLine();
					com.setName(name);
					System.out.println(com.getName() + " : " + com.getPhone());
					System.out.println("수정되었습니다.");
				} else if(choice ==2) {
					System.out.println("어떤 번호로 수정하시겠습니까?");
					String num = br.readLine();
					com.setPhone(num);
					System.out.println(com.getName() + " : " + com.getPhone());
					System.out.println("수정되었습니다.");
				} else {
					System.out.println("잘못된 입력입니다.");
				}
				return;
			}
		}
		System.out.println("해당되는 고유 번호가 없습니다.");
			
	}
	
	// 전체 조회 -> company.cnt 입력하면 삭제 
	   public void delete() throws NumberFormatException, IOException {
		      
		      for(int i=0; i<list.size(); i++) {
		         System.out.println("고유번호:"+list.get(i).getCnt());
		         System.out.println("이름:"+list.get(i).getName());
		         System.out.println("전화번호:"+list.get(i).getPhone());
		      }
		      
		      System.out.println("삭제 할 고유번호를 입력해주세요.");
		      int cnt=Integer.parseInt(br.readLine());
		      
		      for(int i=0; i<list.size(); i++) {
		         if(cnt==list.get(i).getCnt()) {
		            list.remove(list.get(i));
		            System.out.println("삭제되었습니다.");
		            return;
		         }
		      }
		      System.out.println("잘못된 입력입니다.");
	   }
	   
	   public void menu() throws IOException {
			int menu = 0;
			do {
				System.out.println("------------");
				System.out.println("1. 번호 추가");
				System.out.println("2. 번호 검색");
				System.out.println("3. 번호 수정");
				System.out.println("4. 번호 삭제");
				System.out.println("5. 종료");

				menu = Integer.parseInt(br.readLine());
				switch(menu) {
				case 1 : create(); break;
				case 2 : read(); break;
				case 3 : update(); break;
				case 4 : delete(); break;
				case 5 : System.out.println("종료~~~"); break;
					default : System.out.println("잘못된 입력입니다."); break;
				}
			} while(menu != 5);
	   }
}



