package day05;

public class Method07_lotto {

	public static void main(String[] args) {
		/* 로또 번호 생성(1~45까지 랜덤으로 번호 생성, 같은 숫자는 없도록)
		 * 당첨 확인
		 */

		int[] arr = new int[7]; // 당첨 번호(6개)와 보너스 번호(마지막 번호)
		int[] user = new int[6];
		int ranking = 7;
		int tryCount = 0;
		int wannabeRank = 2;
		
		//원하는 등수가 나올 때까지 로또 참여하기
		do {
			tryCount++;
			randomArray(arr);
			randomArray(user);
			System.out.println("로또번호");
			printArray(arr);
			System.out.println("내 번호");
			printArray(user);
			ranking = lottoRank(user,arr);
			System.out.println(ranking + "등입니다");
			System.out.println("------------------");
		} while (ranking >wannabeRank);
		
		System.out.println("총 시도 횟수 : " + tryCount++);
	}
	
	/* 1. 번호를 랜덤으로 생성하는 기능. 
	 * 1~45까지 랜덤 생성
	 * 매개 변수 : x
	 * 리턴 타입 : int
	 * 메서드 명 : random
	 * */
	public static int random () {
		return (int)(Math.random()*45)+1;
	}
	
	
	/* 2. random 메소드를 사용하여 배열에 번호를 저장하는 기능 
	 * 리턴 타입 : int[]
	 * 메서드명 : randomArray
	 */
	public static int[] randomArray(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			
			int random = 0; 
			
			do { 
				random = random();
			} while (isContain(random,arr));
			arr[i] = random;
			//System.out.println(arr[i]);
		}
		return arr;
	}
	
	
	/* 3. 배열을 콘솔에 출력하는 기능
	 * 매개변수 : int arr[]
	 * 리턴 타입 : void
	 * 메서드명 : printArray 
	 */
	public static void printArray(int[] arr) {
		for(int a : arr) {
			System.out.print(a+" ");
		}
		System.out.println();
	}
	
	/* 4. 같은 값이 있는지 확인
	 * 매개 변수 : int num, int[] arr
	 * 리턴 타입 : boolean
	 * 메서드 명 : isContain
	 */
	public static boolean isContain (int num, int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==num) {
				return true;
			}
		}
		return false;
	}
	
	/* 5. 등수를 알려주는 메서드
	 * 매개변수 : int[] user, int[] lotto
	 * 리턴타입 : int or String
	 * 메서드명 : lottoRank
	 * 당첨 기준 : 
	 * 6개 일치면 : 1등
	 * 5개 일치 + 보너스 일치 : 2등
	 * 5개 일치 : 3등
	 * 4개 일치 : 4등
	 * 3개 일치 : 5등
	 * 나머지는 꽝
	 */
	
	public static int lottoRank (int[] user, int[] lotto) {

		if(user.length >= lotto.length) return -1;
		
		int[] winningNum = new int[6]; 					//보너스 점수를 제외한 6자리 숫자
		for(int i=0; i<winningNum.length; i++) {
			winningNum[i] = lotto[i]; 
		}
		
		int winCount = 0;
		boolean bonus = false;
		
		for(int i=0; i<user.length; i++) {
			if(isContain(user[i],winningNum)){
				winCount++;
			}
			
			if(user[i] == lotto[6]) bonus = true;
		}

		switch (winCount) {
		case 6 : return 1;
		case 5 : if(bonus) {
						return 2;
					} else {
						return 3;
					}
		case 4 : return 4;
		case 3 : return 5;
			default : return 6;
		}
	}
}
