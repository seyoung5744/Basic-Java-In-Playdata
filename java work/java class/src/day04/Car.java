package day04;

public class Car {
	// 속성 ( 필드, 멤버젼수 )
	private String name;
	private int speed;
	static int numberOfCars;
	
	public Car() {
//		this.name = "MyCar";
//		this.speed = 0;
//		numberOfCars++;
		this("MyCar");
		System.out.println("Car 디폴트 생성자 실행");
	}
	
	public Car(String name) {
		this.name = name;
		this.speed = 0;
		numberOfCars++;
		System.out.println("name을 받아오는 생성자 실행");
	}
	
	public void setName(String name) { this.name = name; }
	
	public void setSpeed(int speed) { this.speed = speed; }
	
	public int getSpeed() { return this.speed; }
}
