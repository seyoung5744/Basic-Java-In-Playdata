package day04;

public class Car {
	// �Ӽ� ( �ʵ�, ������� )
	private String name;
	private int speed;
	static int numberOfCars;
	
	public Car() {
//		this.name = "MyCar";
//		this.speed = 0;
//		numberOfCars++;
		this("MyCar");
		System.out.println("Car ����Ʈ ������ ����");
	}
	
	public Car(String name) {
		this.name = name;
		this.speed = 0;
		numberOfCars++;
		System.out.println("name�� �޾ƿ��� ������ ����");
	}
	
	public void setName(String name) { this.name = name; }
	
	public void setSpeed(int speed) { this.speed = speed; }
	
	public int getSpeed() { return this.speed; }
}