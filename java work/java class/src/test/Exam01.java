package test;

import test.Test;

public class Exam01 {
	public void ��Ƽ��(Object obj) {
		
	}

	public static void main(String[] args) {
		int i; //������ ��� ���� i ����! 
		i = 10; 
		System.out.println(i);
		//i = 11.1; ����� Ÿ�԰� �ٸ� ������ ���� ���� �� ����. 
	//	long i; //���� �̸��� ������ �� �� ���� �� �� ����. 
		double ii = 11.1;
		
		Test t1;
		t1 = new Test();
		t1.m();
		String s1;
		s1 = new String("abc");
	//	s1 = t1;
		char c = s1.charAt(0);
		
		i = 20; //i�� �����̹Ƿ� ���� ������ �ٽ� ���� �� �ִ�. 
		
		//��� 
		final int PRICE;
		PRICE = 20;
		
		final int PRICE2 = 1000;  
		
	//	price = 2000;
		
		String str = "abc";
		System.out.println(i);
		Integer i2 = new Integer(10);
		i2 = 30;
		
		int i3  = i2;
		
		
		
		
	}

}
