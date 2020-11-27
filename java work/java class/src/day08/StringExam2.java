package day08;

public class StringExam2 {
	public static void m1(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) {
		String greet ="Hello java!!!";
		
		System.out.println(greet.charAt(6));
		
		greet = greet.substring(4);
		
		System.out.println(greet);
		
		int i = 10;
		int j = 20;
		
		System.out.println("i + j "+ i+j);
		
		m1(i+"");
		
		System.out.println("안녕"+i + "는 "+j+"입니다.");
	}

}
