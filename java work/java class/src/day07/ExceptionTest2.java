package day07;

public class ExceptionTest2 {
	public static void main(String[] args) {
	
		int a = 2;
		double b;
		
		int[] iarr = new int[1] /* null */;
		
		System.out.println("���ܰ� �߻��Ǳ� ���� ������ �ڵ��!~!!");
		
		try {
			b = 100 / a; // java.lang.ArithmeticException �߻�
			iarr[1] = 10;
			System.out.println("try���� �ٸ� �ڵ��!!!!!");
		}catch (ArithmeticException e) {
			a = 1;
			b = 100/a;
			
			System.out.println(e);
		}catch (Exception e) {
			e.printStackTrace();
		}
		//	System.out.println(iarr[1]);
			System.out.println("Some more codes"); //�����ϰ� ���ܰ� ó���Ǹ� �����!!! 
	}
}