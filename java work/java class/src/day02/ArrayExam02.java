package day02;

public class ArrayExam02 {
	public static void main(String[] args) {
		for(String s : args) {
			System.out.println(s);
		}
		
		for (int i = 0; i < args.length; i++) {
			String str = args[i];
			System.out.println(str);
		}
		int i = Integer.parseInt(args[0]); // ����ȯ and ��ü�� �ƴ� �͵��� ��ü�� �������.
		int j = Integer.parseInt(args[1]); // ���ڷε� ���ڸ� ����ȯ ���ش�!!
		
		PlusMachine pm = new PlusMachine();
		int sum = pm.evenSum(i , j);
		
		System.out.println(sum);
		
		System.out.println(Integer.parseInt("20"));
		System.out.println(10 + "20");
	}
}
