package day08;

/*
	�߻� Ŭ������ �������̽��� �߻� �޼ҵ� ������ �����Ѵ�.
	
	�̰� �ΰ��� ��������
	
	ex) 
	�߻� Ŭ������
	
	����(���� Ŭ���� - �߻� Ŭ����) - ��� : �Ա�(�ƹ���ɵ� ����), ���

	Ȯ��, ��üȭ�� ��Ų��.
	����� Ȯ����...������ �޾Ƽ� �����ϴµ�
	���� Ŭ���� : ���� - �Ա�( ���� ), ���
			   �⸰ - �Ա�( �ʽ� ), ���
			  
	�������̽���
	
	interface action{
		����() // �߻� �޼ҵ�, ���� ��� (�޼ҵ尡 ����� �ϱ��ϴϱ�)
	}
	
	����� implements action - ���� (�������� ����) (���� �����ϴ� ����) - ���
	�� implements action - ���� (������ �������� ����) (���� �����ϴ� ����) - ����
	
	������ 
	�߻� Ŭ���� - ��ü�� ������ ������ �ִ�
	�������̽� - ���� �ٸ� ��ü���� ����� ���
 */

class Student2{ // ������ �Ⱥ������� �ڹ� �� ȥ�� object�� ��� �ް� �ִ� �ſ���.
	
}
public class test {
	public static void main(String[] args) {
		// object ���� ���� Ŭ����
		String a = new String("string");
		Student2 s = new Student2();
		StringBuffer sb = new StringBuffer();
		
		Object[] ob = {a, s, sb}; 
		// ����
		System.out.println(a);
		// �ɽ����� 
		System.out.println( (String)a);
		System.out.println( (Student2) s);
		System.out.println( (StringBuffer)sb);
	}
}
