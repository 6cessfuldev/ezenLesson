package card3;

public class CardPackClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		Card c = new Card();
		CardPack cp = new CardPack();
		cp.printCard();
	}
}

/* CardPack클래스
 * -카드팩 : 52장의 카드들
 * -카드 섞는 기능
 * -카드 뺴내는 기능
 * -출력 기능 - Card클래스에서 사용
 * 카드 초기화 기능
 */

class CardPack{
	
	private Card[] pack = new Card[52]; //52장의 카드
	private int cnt;
	
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
	
	public void printCard() {
		for (Card card : pack) {
			card.print();
		}
	}
}