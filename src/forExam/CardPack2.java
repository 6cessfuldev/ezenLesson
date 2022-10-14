package forExam;

public class CardPack2 {

	private Card2[] carArr = new Card2[52];
	private int cnt = 0;

	public CardPack2() {

		for (int i = 0; i < 4; i++) {
			char shape ='◆';
			switch(i) {
			case 0 : shape = '◆'; break;
			case 1 : shape = '♠'; break;
			case 2 : shape = '♥'; break;
			case 3 : shape = '♣'; break;
			}
			for (char j = 1; j <= 13; j++) {
				char num;
				if(j == 1) num = 'A';
				else if(j == 11) num = 'j';
				else if(j == 12) num = 'Q';
				else if(j == 13) num = 'k';
				else num =j;
				
				Card2 card = new Card2(shape, num);
				carArr[cnt++] = card;
			}
		}
	}

	public Card2[] getCarArr() {
		return carArr;
	}

	public void setCarArr(Card2[] carArr) {
		this.carArr = carArr;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	public void printCardPack() {
		for (Card2 card2 : carArr) {
			card2.printCard();
		}
		System.out.println();
	}
	
}
