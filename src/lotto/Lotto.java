package lotto;
import java.util.Arrays;
import java.util.Random;
public class Lotto {
	//user번호 생성 클래스, 부모 클래스(상속을 해줘야 함)
	//멤버변수
	protected int numbers[] = new int [6];
	
	//메서드
	//1. random번호 생성 => random() 1~45정수 반환
	protected int random() {
		return new Random().nextInt(45)+1;
	}
	
	//2. 랜덤번호 6개를 numbers에 저장하는 메서드 (중복X) => randomLotto()
	protected void randomLotto() {
		init(); //배열초기화
		int cnt=0;
		while(cnt < 6) {
			int r = random();
			if(!isContain(r)) { //중복확인 : 중복되지 않으면 추가.
				numbers[cnt] = r;
				cnt++;
			}
		}
	}
	
	//3. 중복번호가 있는지 체크 => isContain()
	protected boolean isContain(int num) {
		if(num <0 || num > 45) {
			throw new RuntimeException("숫자의 범위는 1~45까지 입니다.");
		}
		for(int tmp : numbers) {
			if(tmp == num) {
				return true;
			}
		}
		return false;
	}
	
	//4. 배열초기화 => init()
	protected void init() {
		numbers = new int[6];  //기존 배열 버리고 새배열로 연결
	}
	
	//5. 번호확인 => toString() 호출
	
	@Override
	public String toString() {
		return  Arrays.toString(numbers);
	}
	
	//6. 로또번호 수동생성 => insertNumber(int []arr)
	// 메인에서 입력받아서 임시 배열로 생성한 후 numbers배열로 복사
	protected void insertNumber(int []arr) {
		//입력받은 배열의 숫자가 모자르면
		if(arr.length < numbers.length) {
			throw new RuntimeException("배열의 길이가 작습니다.");
		}
		//처리 속도가 빠름.
		System.arraycopy(arr, 0, numbers, 0, numbers.length); 	
	}
	//7. Numbers getter
	public int[] getNumbers() {
		return numbers;
	}
	
}