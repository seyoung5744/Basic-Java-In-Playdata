package day08;

class Person{
	String name;
	String id;
	public Person(String name) {
		this.name = name;
	}
}

class Student3 extends Person{
	String grade;
	String major;
	
	public Student3(String name) {
		super(name);
		System.out.println(this.hashCode());
		System.out.println(super.hashCode());
		// TODO Auto-generated constructor stub
	}
}

public class test2 {
	public static void main(String[] args) {
		Person p;
		Student3 s = new Student3("���߳�");
		
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode((Person)s));
	}
}
