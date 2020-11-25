package day07;

public class ExceptionTest2 {
	public static void main(String[] args) {
	
		int a = 2;
		double b;
		
		int[] iarr = new int[1] /* null */;
		
		System.out.println("예외가 발생되기 전에 수행할 코드들!~!!");
		
		try {
			b = 100 / a; // java.lang.ArithmeticException 발생
			iarr[1] = 10;
			System.out.println("try블럭의 다른 코드들!!!!!");
		}catch (ArithmeticException e) {
			a = 1;
			b = 100/a;
			
			System.out.println(e);
		}catch (Exception e) {
			e.printStackTrace();
		}
		//	System.out.println(iarr[1]);
			System.out.println("Some more codes"); //적절하게 예외가 처리되면 수행됨!!! 
	}
}