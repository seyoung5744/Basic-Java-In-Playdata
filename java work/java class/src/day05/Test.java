package day05;

class Person1{
	public Person1() {
		System.out.println("Person ������ ȣ��");
	}
}

class Student1 extends Person1{
	public Student1() {
		System.out.println("Student ������ ȣ��");
	}
}
public class Test {
	public static void main(String[] args) {
		Person1 student = new Student1();
	}
}
