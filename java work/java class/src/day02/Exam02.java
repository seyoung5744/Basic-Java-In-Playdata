package day02;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1-100 까지의 짝수의 합을 구해주세요. 
		int number = 100;
		
		PlusMachine pm = new PlusMachine();
		int sum = pm.evenSum(number);
		System.out.println(sum);	
		System.out.println(pm.oddSum(number));
		System.out.println(pm.sum(number));
	}

}
