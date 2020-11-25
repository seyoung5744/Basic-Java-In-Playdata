package day05;

class Person2{
	public String name;
	private String id;
	
	public Person2(String name) {
		this.name = name;
	}
	
	public String getName() {return name;}
}

class Student2 extends Person2 {
	private String grade;
	private String major;
	
	public Student2(String name) {
		super(name);
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
}
public class UpcastingTest {
	public static void main(String[] args) {
		Person2 p ;
		Student2 s = new Student2("����");
		p = s;
		System.out.println(p.name);
		((Student2) p).setGrade("A");
		
		Person2 p2 = new Student2("�ȴ���");
		Student2 s2;
		
		s2 = (Student2)p2;
		
		System.out.println(s2.getName());
		s2.setGrade("A");
	}
}