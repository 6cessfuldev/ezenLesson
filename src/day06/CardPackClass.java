package day06;

public class CardPackClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Card c = new Card();
		CardPack cp = new CardPack();
		cp.shuffle();

		for(int i=1; i<=4; i++) {
			for(int j=1; j<=13; j++) {
				Card tmp = cp.pick();
				tmp.print();
			}
			System.out.println();
			
			}
	}
}

/* CardPack클래스
 * -카드팩 : 52장의 카드들
 * -카드 섞는 기능
 * -카드 뺴내는 기능
 * -출력 기능 - Card클래스에서 사용
 * 카드 초기화 기능
 */

class CardPack {
	
	private Card[] pack = new Card[52]; //52장의 카드
	private int cnt;
	
	//카드 섞기 기능
	//shuffle
	//카드 팩 배열에 있는 카드 순서를 바꾼다.
	//매개변수 X, 리턴타입 X
	public void shuffle() {
		
		for(int i=0; i<pack.length; i++ ) {
			int r = (int)(Math.random()*51-0+1)+0; 
			Card tmp = new Card();
			tmp = pack[i];
			pack[i] = pack[r];
			pack[r] = tmp;
		}
	}
	
	//카드 빼내는 기능
	//pick()
	//리턴 타입 : 꺼낸 카드 => Card
	public Card pick () {
		if(cnt==0) {
			return null; 
		}
		cnt--;
		return pack[cnt]; // 해당하는 팩의 마지막 번지를 pick
	}

	public void init() {
		cnt = 52;
		shuffle();
	}
	
	//생성자 52장의 카드
	public CardPack() {
		char shape = '♥';
		for(int i=1; i<=4; i++) {
			switch(i) {
			case 1 : shape = '♥'; break; 
			case 2 : shape = '♣'; break;
			case 3 : shape = '♠'; break;
			case 4 : shape = '◆'; break;
			}
			for(int j=1; j<=13; j++) {
				Card tmp = new Card();
				tmp.setNum(j);
				tmp.setShape(shape);
				pack[cnt]=tmp;
				cnt++;
			}
		}	
	}
}