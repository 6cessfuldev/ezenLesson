package day06;

public class 클래스05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tv tv = new Tv();
		tv.printPower();
		tv.power();
		tv.printPower();
		tv.chDown();
		tv.chDown();
		tv.volDown();
		tv.volUp();
		
	}

}

/*클래스 생성
 * TV
 * -power(전원의 상태)
 * -printPower(전원의 상태를 출력)
 * -ch (up: 1씩 증가 출력/down : 1씩 감소 출력)
 * -vol (up / down 출력)
 * -
 * */
class Tv {
	
	private boolean power;
	private int ch;
	private int vol;
	
	public int getCh() {
		return ch;
	}

	public void setCh(int ch) {
		this.ch = ch;
	}

	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}

	public void power() {
		power = !power; 
	}
	
	public void printPower() {
		if(power) {
			System.out.println("Power On");
		} else {
			System.out.println("Power Off");
		}
	}
	
	public void chUp() {
		ch++;
		System.out.println("채널을 한칸 올렸습니다.");
	}
	
	public void chDown() {
		ch--;
		System.out.println("채널을 한칸 내렸습니다.");
	}
	
	public void volUp() {
		vol++;
		System.out.println("볼륨을 한칸 올렸습니다.");
	}
	
	public void volDown() {
		vol--;
		System.out.println("볼륨을 한칸 내렸습니다.");
	}
	
	
}