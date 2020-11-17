package day02;

public class WhiltExam01 {
	public static void main(String[] args) {
		// while(조건){}
		int i = 0;
		while (true) {
			if (i > 5)
				break;
			System.out.println("hello~~!!");
			i++;
		}
		while(i < 3) {
			System.out.println("hhhhhhhhhhhhhhhhhh");
		}
		
		// 조건에 관계없이 반드시 1번은 실행
		i = 0;
		do {
			System.out.println("do while~~!!");
			i++;
		}while(i < 3);
	}
}
