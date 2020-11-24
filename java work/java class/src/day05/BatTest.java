package day05;

class Bat {
	public void method1() {
	    System.out.println("Bat 1");
	  }

	public void method2() {
	    System.out.println("Bat 2");
	  }

	public String toString() {
	    return "Bat";
	  }
}

class Cat extends Bat {
	public void method1() {
	    System.out.println("Cat 1");
	  }
}

class Eat extends Cat {
	public void method2() {
	    System.out.println("Eat 2");
	  }

	public String toString() {
	    return "Eat";
	  }
}

class Fat extends Bat {
	public void method2() {
	    System.out.println("Fat 2");
	  }

	public String toString() {
	    return "Fat";
	  }
}

public class BatTest {
	public static void main(String[] args) {
		Bat[] items = {new Bat(), new Cat(), new Eat(), new Fat()}; 
		for (int i = 0; i < items.length; i++) {
			items[i].method1();
			items[i].method2();
			System.out.println(items[i]+"\n");
		}

	}
}
