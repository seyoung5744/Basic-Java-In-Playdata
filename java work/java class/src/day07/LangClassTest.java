package day07;

public class LangClassTest {
	public static void main(String[] args) {
		Point p = new Point(2, 3);
		
		System.out.println(p.getClass().getName());
		System.out.println(p.hashCode());
		System.out.println(p.toString());
		System.out.println(p);
		
		Point a = new Point(2,3);
		Point b = new Point(2,3);
		
		System.out.println(a == b);
		System.out.println(a.equals(b));
		
		String s1 = new String("hello");
		String s2 = new String("hello");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}
