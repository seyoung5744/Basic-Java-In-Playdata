package day07;

public class ExceptionExam01 {
	
	public static  void testM(int[] iarr) {
		
		iarr[3] = 30;
	}

	public static void main(String[] args) {
//		int i = 10.0;
		
		testM(new int[2]);
		
		System.out.println("다음 할일 ~~~~!!!   여기도 실행해~~~ ");
 	}

}
