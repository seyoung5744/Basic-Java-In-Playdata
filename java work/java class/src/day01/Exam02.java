package day01;

public class Exam02 {

	public static void main(String[] args) {
		//����ȯ 
		int i = 20;
		long cup = i;
		
		i = (int)cup;
		
		float f = 11.1f;
		
		cup = (long)f;
		f = cup;
		System.out.println(f);
		
		char c = 'a';
		System.out.println(c);
		i = c;
		System.out.println(i);
		System.out.println((char)i);
		
	}

}
