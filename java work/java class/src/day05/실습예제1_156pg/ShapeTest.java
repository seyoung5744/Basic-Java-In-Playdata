package day05.�ǽ�����1_156pg;

abstract class Shape{
	public abstract double calculateArea();
	
	public String toString() {
		return getClass().getName();
	}
}
	
class Circle extends Shape{
	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() {
		return radius * radius * 3.14;
	}
}

class Triangle extends Shape{
	private int width, height;
	
	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double calculateArea() {
		return width * height * 0.5;
	}
}

class Ractangle extends Shape{
	private int width, height;
	
	public Ractangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double calculateArea() {
		return width * height;
	}
}
public class ShapeTest {
	public static void main(String[] args) {
		Shape[] s = {new Circle(3), new Triangle(2, 4), new Ractangle(3, 4)};
		
		for(Shape ts : s) {
			System.out.println(ts.toString());
			System.out.println(ts.calculateArea());
		}
	}
}
