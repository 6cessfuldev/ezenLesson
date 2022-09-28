package lotto;
public class LottoE extends Lotto {
	//당첨번호 생성 클래스 Lotto를 상속받아서 보너스 번호만 처리
	//멤버변수
	private int bonus; //보너스번호
	
	//메서드
	//오버라이딩 메서드 randomLotto, init, toString, insertNumber
	@Override
	protected void randomLotto() {
		super.randomLotto(); //6자리 번호 랜덤생성 완료
		// 보너스 번호를 중복되지 않게 추가.
		while(true) {
			int r = random();
			if(!isContain(r)) {
				bonus = r;
				break; //없으면 무한루프
			}
		}
	}
	@Override
	protected void init() {
		super.init();
		// 보너스번호 초기화하기
		bonus = 0;
	}
	@Override
	public String toString() {
		//보너스번호 같이 출력
		return super.toString()+"["+bonus+"]"; //6자리번호출력 
		
	}
	@Override
	protected void insertNumber(int[] arr) { //7자리
		super.insertNumber(arr); //6자리 배열생성된것 가져오기
		//보너스번호를 추가
		bonus = arr[numbers.length]; //numbers.length = 6
	}
	
	//메서드 오버로딩.
	public void insertNumber(int[] arr, int bonus) { //arr=6자리, 보너스
		super.insertNumber(arr); //6자리 배열 생성된것 가져오기
		//보너스 번호 추가
		this.bonus = bonus;
	}
	
	//getBonus()
	public int getBonus() {
		return bonus;
	}
	
}