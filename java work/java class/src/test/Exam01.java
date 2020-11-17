package test;

import test.Test;

public class Exam01 {
	public void 파티장(Object obj) {
		
	}

	public static void main(String[] args) {
		int i; //정수를 담는 변수 i 선언! 
		i = 10; 
		System.out.println(i);
		//i = 11.1; 선언된 타입과 다른 종류의 값을 담을 수 없다. 
	//	long i; //같은 이름의 변수를 두 번 선언 할 수 없다. 
		double ii = 11.1;
		
		Test t1;
		t1 = new Test();
		t1.m();
		String s1;
		s1 = new String("abc");
	//	s1 = t1;
		char c = s1.charAt(0);
		
		i = 20; //i는 변수이므로 값을 여러번 다시 담을 수 있다. 
		
		//상수 
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
