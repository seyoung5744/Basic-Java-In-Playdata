package day05;

class Person1{
	public Person1() {
		System.out.println("Person 생성자 호출");
	}
}

class Student1 extends Person1{
	public Student1() {
		System.out.println("Student 생성자 호출");
	}
}
public class Test {
	public static void main(String[] args) {
		Person1 student = new Student1();
	}
}
