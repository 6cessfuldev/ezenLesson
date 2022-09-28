package lotto;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		LottoManager mg = new LottoManager();
		int menu =0;
		do {
			mg.printMenu();
			menu = scan.nextInt();
			
			switch (menu) {
			case 1 : mg.createLotto(scan); break;
			case 2 : mg.createLottoAuto(); break;
			case 3 : mg.insertLotto(scan); break;
			case 4 : mg.insertLottoAuto(); break;
			case 5 : mg.checkLotto(); break;
			case 6 : mg.printLotto(); break;
			case 7 : break; 
				default: 
					System.out.println("잘못된 메뉴!");
			}
		} while(menu != 7);
		System.out.println("프로그램 종료~");
		scan.close();
	}

}
