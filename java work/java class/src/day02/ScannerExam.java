package day02;

import java.util.Scanner;

public class ScannerExam {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int value = keyboard.nextInt(); // 정수 값을 받아들이겠다.
		
		PlusMachine pm = new PlusMachine();
		int oddSum = pm.oddSum(value);
		
		System.out.println(oddSum);		
		System.out.println(value);
		System.out.println("1부터" + value + " 까지의 홀수의 합은 " +  oddSum  + "입니다.");
		System.out.printf("1부터 %d 까지의 홀수의 합은 %d 입니다.",value, oddSum);
	}
}
