package day05;

class Person{
	int age;
	public String name;
	protected int height;
	private int weight;
}

class Student extends Person{
	public void set() {
		age = 30;
		name = "홍길동";
		height = 175;
//		setHight(99);
	}
}
public class 상속과_변수 {

}
