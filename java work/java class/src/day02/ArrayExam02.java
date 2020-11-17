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
		int i = Integer.parseInt(args[0]); // 형변환 and 객체가 아닌 것들을 객체로 만들어줌.
		int j = Integer.parseInt(args[1]); // 숫자로된 문자를 형변환 해준다!!
		
		PlusMachine pm = new PlusMachine();
		int sum = pm.evenSum(i , j);
		
		System.out.println(sum);
		
		System.out.println(Integer.parseInt("20"));
		System.out.println(10 + "20");
	}
}
