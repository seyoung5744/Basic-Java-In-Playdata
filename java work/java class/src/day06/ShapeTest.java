package day06;

abstract class Shape implements Drawable{
	public abstract double calculateArea();
	
	@Override
	public void draw() {
		System.out.println(getClass().getName() + "�׷���~");
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

interface Drawable{
	public void draw();
}
public class ShapeTest {
	public static void main(String[] args) {
		Shape[] s = {new Circle(3), new Triangle(2, 4), new Ractangle(3, 4)};
		
		for(Shape ts : s) {
			System.out.println(ts.calculateArea());
			ts.draw();
		}
	}
}