package day08;

import java.util.Calendar;
import java.util.Date;

public class DateTest {
	public static  void printCalendar(int year, int month) {
		//입력된 연, 월에 해당하는 달력을 출력해 주세요......  
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
		System.out.println(c.get(Calendar.DAY_OF_WEEK));  //요일 출력..   일요일 1,  월요일 2 
		c.set(Calendar.DATE,28);
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		c.set(Calendar.DATE,29);
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		
		System.out.println(c.getActualMaximum(Calendar.DATE));
		
		c.set(Calendar.MONTH, 9);  //월을 10월로 바꿈.   월이 0월 부터 11월로 표현되므로, +1 을 해야 실제 월!!  
		System.out.println(c.getActualMaximum(Calendar.DATE));
		
		printCalendar(2020, 12);
		
	}

}
