package Pocketmon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class PocketmonManager {

	ArrayList<Monsterball> list = new ArrayList<>();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	
	public void main() throws IOException {
		
		int menu = 0;
		do {
			
			System.out.println("----메뉴-----");
			System.out.println("1. 포켓몬 생성");
			System.out.println("2. 포켓몬 검색");
			System.out.println("3. 포켓몬 수정");
			System.out.println("4. 포켓몬 삭제");
			try {
				menu = Integer.parseInt(br.readLine());
			} catch (Exception e) {
				System.out.println("잘못된 입력입니다.");
			}
			
			switch (menu) {
				case 1 : create(); break;
				case 2 : read(); break;
				case 3 : update(); break;
				case 4 : delete(); break;
				case 5 : System.out.println("종료합니다."); break;
			}
		} while(menu != 5);
		
	}
	
	//생성자 써서 스탯 랜덤값은 create메서드 안에서 생성 후 생성자에 넣어주기
	public void create() throws IOException {
		System.out.println("생성할 포켓몬의 이름을 적어주세요.");
		Monsterball mon = new Monsterball(br.readLine(), randomStat(), randomStat(), randomStat(), randomStat(), randomType());
		list.add(mon);
		
		System.out.println(mon);
	}

	public int randomStat() {
		int rdm = (int)(Math.random()*40)+1;
		return rdm;
	}
	
	public String randomType() {
		String[] types = {"노말", "불꽃", "물", "풀", "전기", "얼음", "격투", "독", "땅", "비행", "에스퍼", "벌례", "바위", "고스트", "드래곤"}; 
		return types[(int)(Math.random()*15)];
	}
	
	//검색 입력 값을 다양하게 받아보기
	public ArrayList<Monsterball> read() throws IOException {
		System.out.println("검색어를 입력하세요");
		System.out.println("---검색 예시---");
		System.out.println("힘 10 이상");
		System.out.println("타입 노말");
		System.out.println("이름 피카츄");
		System.out.println("스킬 몸통박치기");
		System.out.println("다중 검색 시 ','으로 구분");
		String key = br.readLine();
		
		ArrayList<Monsterball> balls = multiSearch(key);
		
		for (Monsterball monsterball : balls) {
			System.out.println(monsterball.toString());
		}
		
		return balls;
	}
	
	public ArrayList<Monsterball> multiSearch(String key){
	
		ArrayList<Monsterball> balls = (ArrayList<Monsterball>)list.clone();
		
		StringTokenizer stk = new StringTokenizer(key, ",");
		while(stk.hasMoreTokens()) {
			String str = stk.nextToken();
			balls = search(balls, str);
		}
		
		return balls;
	}
	
	public ArrayList<Monsterball> search(ArrayList<Monsterball> balls, String str) {

		ArrayList<Monsterball> result = new ArrayList<>();
		
		str = str.trim(); 
		
		switch(str.substring(0, 2)) {
			case "이름" :
				String name = str.substring(3).trim();
				for (Monsterball ball : balls) {
					if(ball.getName().contains(name)){
						result.add(ball);
					}
				} break;
			case "힘 " :
				String strong = str.substring(2).trim();
				strong = strong.substring(0, strong.indexOf(" "));
				if(str.contains("이상")) {
					for (Monsterball ball : balls) {
						if(ball.getStr() >= Integer.parseInt(strong)) {
							result.add(ball);
						}
					}
				} else if(str.contains("이하")) {
					for (Monsterball ball : balls) {
						if(ball.getStr() <= Integer.parseInt(strong)) {
							result.add(ball);
						}
					}
				}
				break;
			case "민첩" :
				String dex = str.substring(3).trim();
				dex = dex.substring(0, dex.indexOf(" "));
				if(str.contains("이상")) {
					for (Monsterball ball : balls) {
						if(ball.getDex() >= Integer.parseInt(dex)) {
							result.add(ball);
						}
					}
				} else if(str.contains("이하")) {
					for (Monsterball ball : balls) {
						if(ball.getDex() <= Integer.parseInt(dex)) {
							result.add(ball);
						}
					}
				}
				break;
			case "행운" :
				String luk = str.substring(3).trim();
				luk = luk.substring(0, luk.indexOf(" "));
				if(str.contains("이상")) {
					for (Monsterball ball : balls) {
						if(ball.getLuk() >= Integer.parseInt(luk)) {
							result.add(ball);
						}
					}
				} else if(str.contains("이하")) {
					for (Monsterball ball : balls) {
						if(ball.getLuk() <= Integer.parseInt(luk)) {
							result.add(ball);
						}
					}
				}
				break;
			case "지능" :
				String intel = str.substring(3).trim();
				intel = intel.substring(0, intel.indexOf(" "));
				if(str.contains("이상")) {
					for (Monsterball ball : balls) {
						if(ball.getIntel() >= Integer.parseInt(intel)) {
							result.add(ball);
						}
					}
				} else if(str.contains("이하")) {
					for (Monsterball ball : balls) {
						if(ball.getIntel() <= Integer.parseInt(intel)) {
							result.add(ball);
						}
					}
				}
				break;
			case "타입" :
				for (Monsterball ball : balls) {
					if(str.contains(ball.getType())) {
						result.add(ball);
					}
				}
				break;
			case "기술" :
				for (Monsterball ball : balls) {
					if(ball.getSkill().contains(str.substring(3))) {
						result.add(ball);
					}
				}
		}
		return result;
	}
	
	//단체 변경 /이름 받아서 변경
	public void update() throws IOException {
		
		System.out.println("수정할 포켓몬을 검색합니다.");
		ArrayList<Monsterball> balls = read();
		
		if(balls == null) {
			System.out.println("수정할 포켓몬이 없습니다.");
			return;
		}
		
		System.out.println("무엇을 수정하겠습니까?");
		
		String str = br.readLine();
		str= str.trim();
	
		for (Monsterball mon : balls) {
			
			switch(str.substring(0,2)) {
			
			case "이름" :
				mon.setName(str.substring(3).trim());
				break;
				
			case "힘 " :
				String strong = str.substring(2).trim();
				mon.setStr(Integer.parseInt(strong));
				break;
				
			case "민첩" :
				String dex = str.substring(3).trim();
				mon.setDex(Integer.parseInt(dex));
				break;
				
			case "행운" :
				String luk = str.substring(3).trim();
				mon.setLuk(Integer.parseInt(luk));
				break;
				
			case "지능" :
				String intel = str.substring(3).trim();
				mon.setIntel(Integer.parseInt(intel));
				break;
			
			case "타입" :
				String type = str.substring(3).trim();
				mon.setType(type);
				break;
			
			case "기술" :
				String skill = str.substring(3).trim();
				HashSet<String> set = mon.getSkill();
				if(!set.contains(skill)) {
					set.add(skill);
					mon.setSkill(set);
				}		
				break;
				
				default : 
					System.out.println("잘못된 입력입니다.");
					break;
			}
		}
	}
	
	//1. 포켓목 삭제 (단체/개인) /2. 포켓몬의 스킬 삭제
	public void delete() throws NumberFormatException, IOException {
		
		System.out.println("포켓몬 삭제는 1/ 스킬 삭제는 2");
		int menu = Integer.parseInt(br.readLine());
		
		if(menu == 1) {
			System.out.println("삭제할 포켓몬을 검색해주세요.");
			ArrayList<Monsterball> balls = read();
			list.removeAll(balls);
		} else if(menu ==2 ){
			System.out.println("스킬을 삭제할 포켓몬을 검색해주세요.");
			ArrayList<Monsterball> balls = read();
			System.out.println("삭제할 스킬 명을 입력해주세요.");
			String skill = br.readLine();
			for (Monsterball monsterball : balls) {
				HashSet<String> set = monsterball.getSkill();
				if(set.contains(skill)){
					set.remove(skill);
				}
			}
		} else {
			System.out.println("잘못된 입력입니다.");
		}	
	}
}
