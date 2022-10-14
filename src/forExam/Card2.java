package forExam;

public class Card2 {

	private char shape = '◆';
	private char num;

	public char getShape() {
		return shape;
	}

	public void setShape(char shape) {
		this.shape = shape;
	}

	public int getNum() {
		return num;
	}

	public void setNum(char num) {
		this.num = num;
	}

	public Card2(char shape, char num) {
		super();
		this.shape = shape;
		this.num = num;
	}
	
	public void printCard() {
		if(1<num && 11>num ) {
			System.out.print(shape+""+(int)num+" ");
		} else {
			System.out.print(shape +""+num+" ");
		}
	}
	
}
