package day02;

public class ForExam {

	public static void main(String[] args) {
		//for(�ʱⰪ; ����; ������){  1.�ʱⰪ; 2. ����; 3. �ݺ��� ���� 4. ������ 5. ����
		// �ݺ��� ����� 
		//}
		for(int i = 0; i < 5; i++) {
			System.out.println("�ȳ�!!");
		}
		
		//1-100 ������ ¦���� ���� �����ּ���. 
		int evenSum = 0;
		int number = 100;
		for(int i = 1; i <=number; i++) {
			if(i % 2 ==0)
				evenSum += i;//evenSum = evenSum + i; 
		}
		
		System.out.println("¦���� ��:"+evenSum);
	}

}
