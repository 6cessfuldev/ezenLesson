package day09;

import java.util.Iterator;
import java.util.Random;

public class RandomEx01 {

	public static void main(String[] args) {
		
		Math.random(); // 0<= x < 1;
		/*random 클래스는 시스템의 현재 시간을 seed값으로 사용하여 객체를 생성, 랜덤 수를 생성
		 * nextInt(6)+1 //1~6까지의 수를 생성
		 */
		Random r = new Random();
		int r1 = r.nextInt(6)+1;
		//int random = new Random().nextInt(6)+1;

		int random[] = new int[5];
		for (int i = 0; i < random.length; i++) {
			random[i] = r.nextInt(6)+1;                          //시드 값이 같으면 같은 값이 나옴
			System.out.println(random[i]+" ");
		}
	}

}
