package day04;

class Parent{
	int i = 5;
	
	public int getI() {
		return i;
	}
}

class Child extends Parent{
	int j = 10;
	public int getJ() {
		return j;
	}
}
public class Exam02 {
	// ���
	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.i);
		System.out.println(p.getI());
		
		Child c = new Child();
		System.out.println(c.i);
		System.out.println(c.getI());
	}
}
