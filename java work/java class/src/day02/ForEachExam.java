package day02;

public class ForEachExam {
	public static void main(String[] args) {
		// 배열
		int[] arr = new int[10];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		// ...
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		
		System.out.println();
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println();
		
		// for-each문
		for (int a : arr){
			System.out.println(a);
		}
		
		int a = 10;
		int b = a; // 기본 데이터 타입이기 때문에 값을 복사.
		System.out.println(a + ", " + b);
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		
		a = 11;
		System.out.println(a + ", " + b);
		
	}
}
