package day08;

class Book2{
	String title;
	Book2(String title){
		this.title = title;
	}
}
public class StringExam {

	public static void main(String[] args) {
		String str = "test";
		
		/* Book b = */
		String str2 = new String("test");
		
		String str3 = "test";
		String str4 = new String("test");
		
		if(str == str2)
			System.out.println("str == str2");
		else
			System.out.println("str != str2");
		
		Book2 b = new Book2("java");
		Book2 b2 = new Book2("java");
		
		if(b == b2)
			System.out.println("b == b2");
		else
			System.out.println("b != b2");
		
		
		if(str.equals(str2))
			System.out.println("str.equals(str2)");
		else
			System.out.println("!!str.equals(str2)");
		
		System.out.println(str);
		System.out.println(str2);
		
		if(str == str3)
			System.out.println("str == str3");
		else
			System.out.println("str != str3");
		
	}

}
