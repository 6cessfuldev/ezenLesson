package day08;
import java.util.Scanner;

public class Product출력 {

	public static void main(String[] args) {
		/* 앞에서만든 Product class를 이용하여 상품을 등록/출력
		 * 상품을 등록하시겠습니까? (y/n) y
		 * 상품명 : 가방
		 * 가격 : 20000
		 * 상품을 등록하시겠습니까? (y/n) y
		 * 상품명 : 신발
		 * 
		 * 가격 : 3000
		 */

		Product[] pro = new Product[10];
		Scanner scan = new Scanner(System.in);
		char menu = 'y';
		int cnt=0;
		
		while(menu != 'n') {
			System.out.println("상품을 등록하시겠습니까? (y/n)");
			menu = scan.next().charAt(0);
			
			if(menu =='y') {
				System.out.println("상품명: ");
				String name = scan.next();
				System.out.println("가격: ");
				int price = scan.nextInt();
				pro[cnt] = new Product(name, price);
				cnt++;
			} else {
				System.out.println("y/n만 입력 가능합니다.");
			}
		}
		System.out.println("--등록된 제품 리스트--");
		for(int i=0; i<cnt; i++) {
			System.out.println((i+1)+"."+pro[i]);
		}
	}
}


