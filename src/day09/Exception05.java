package day09;

public class Exception05 {

	public static void main(String[] args) {
		
//		try {
//			for(int i : createRandomArray(0, 5, 0)) {
//				System.out.println(i);
//			}
//		} catch (NegativeArraySizeException | NullPointerException e) {
//			System.out.println(e.getMessage());
//		}
		try {
			int[] arr1 = new int[0];
			createRandomArray2(arr1, 5 ,1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//System.out.println(arr1);
//		int[] arr2 = null;
//		
//		try {
//			createRandomArray2(arr1, 5, 1);
//			for(int i : arr1) {
//				System.out.println(i);
//			}
////			createRandomArray2(arr2, 5, 1);
////			for(int i : arr2) {
////				System.out.println(i);
////			}
//		} catch (NegativeArraySizeException | NullPointerException e) {
//			System.out.println(e.getMessage());
//		} 
//	}
	}
	/* 기능 : 배열의 길이(size)가 주어지면 길이만큼 배열을 생성해서 값을 돌려주는 메서드
	 * 값은 랜덤으로 생성해서 반환 (max, min)
	 * 매개변수 :
	 * 리턴타입 : 배열[]
	 * 매서드명 : createRandomArray
	 * size의 값이 0보다 작다면 예외발생
	 */
	public static int[] createRandomArray (int size, int max, int min){
 
		if(size<0) throw new NegativeArraySizeException("배열의 길이가 0보다 작습니다.");
		if(size==0) throw new NullPointerException("배열의 값이 없습니다.");
		
		int[] arr = new int[size];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=(int)(Math.random()*(max-min+1))+min;
		}
		
		return arr;
		
	}
	
	/*배열이 주어지면, 주어진 배열에 랜덤값을 채우는 메서드
	 * 매개변수 : 배열, max, min
	 * 리턴타입 : void
	 * 메서드명 : createRandomArray2
	 * 예외는 매개변수 배열이 null일 때, 배열의 길이가 0보다 작을 경우
	 **/
	public static void createRandomArray2 (int[] arr, int max, int min) {
		if(arr == null) throw new NullPointerException("입력받은 배열의 값이 null입니다.");
		if(arr.length==0) throw new NegativeArraySizeException("배열의 길이가 0입니다.");
 
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*(max-min+1))+min;
		}
	}
}
