package day07;

public class MyClassTest {
	public static void main(String[] args) {
		MyClass my = new MyClass();
		System.out.println(my.getClass());
		System.out.println(my.getClass().getName());
		System.out.println(my.toString());
		
		Person kang = new Person("¿ø¼¼¿µ","010-111-1111");
		System.out.println(kang);
		
		String str = new String("kang");
		System.out.println(str);
	}
}
