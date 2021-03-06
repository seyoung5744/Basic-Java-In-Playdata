package day02;

public class PlusMachine {
	// 메소드
	// 메소드 오버로딩(같은 이름의 메서드를 여러 개 정의 할 수 있다.)
	public int evenSum(int startNumber, int endNumber) {
		int sum = 0;
		for(int i = startNumber; i <= endNumber; i++) {
			if (i % 2 == 0)
				sum += i;
		}
		return sum;
	}
	
	// 접근제한자 리턴타입 메소드명(매개변수들...)
	public int evenSum(int number) {
//		int sum=0;
//		for(int i = 1; i <= number; i++) {
//			if (i % 2 == 0)
//				sum += i;
//		}
//		return sum;
		return evenSum(1, number);
	}
	
	// 홀수의 합을 구하는 메소드
	
	public int oddSum(int number) {
		int sum=0;
		for(int i = 1; i <= number; i++) {
			if (i % 2 != 0)
				sum += i;
		}
		return sum;
	}
	
	// 1부터 number까지의 합
	public int sum(int number) {
		int sum = 0;
		for (int i = 1; i <=number; i++) {
			sum += i;
		}
		return sum;
		
		// 이미 위에서 홀수, 짝수 합을 구했기 때문에
		// 전체 수 합 = 홀수 합 + 짝수 합
	}
	
	
}
