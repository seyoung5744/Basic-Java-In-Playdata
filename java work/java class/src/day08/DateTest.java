package day08;

import java.util.Calendar;
import java.util.Date;

public class DateTest {
	public static  void printCalendar(int year, int month) {
		//�Էµ� ��, ���� �ش��ϴ� �޷��� ����� �ּ���......  
	}
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		
		System.out.println(d.getDay());
		System.out.println(d.getMonth());
		
		
		Calendar c = Calendar.getInstance();
		
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.HOUR));
		
//		c.set(2003, 3,18);
//		c.set
		System.out.println(c.get(Calendar.DAY_OF_WEEK));  //���� ���..   �Ͽ��� 1,  ������ 2 
		c.set(Calendar.DATE,28);
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		c.set(Calendar.DATE,29);
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		
		System.out.println(c.getActualMaximum(Calendar.DATE));
		
		c.set(Calendar.MONTH, 9);  //���� 10���� �ٲ�.   ���� 0�� ���� 11���� ǥ���ǹǷ�, +1 �� �ؾ� ���� ��!!  
		System.out.println(c.getActualMaximum(Calendar.DATE));
		
		printCalendar(2020, 12);
		
	}

}
