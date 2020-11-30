package day10;

import java.util.StringTokenizer;

public class StringExam {
	public static void main(String[] args) {
		String str = "°­°æ¹Ì , 1111, 50000";

		String[] strArr = str.split(", ");
		for (String string : strArr) {
			System.out.println(string);
		}

		int money = Integer.parseInt(strArr[2].trim());
		
		System.out.println(money);
		
		
		StringTokenizer st = new StringTokenizer(str, ",");
		while (st.hasMoreElements()) {
			System.out.println( st.nextElement());
			
		}
		
		
	}
}
