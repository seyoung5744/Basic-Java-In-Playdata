package day02;

public class WhiltExam01 {
	public static void main(String[] args) {
		// while(����){}
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
		
		// ���ǿ� ������� �ݵ�� 1���� ����
		i = 0;
		do {
			System.out.println("do while~~!!");
			i++;
		}while(i < 3);
	}
}
