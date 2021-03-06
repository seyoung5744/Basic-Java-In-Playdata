package day07;

public class Point {
	private int x, y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	@Override
	public String toString() {
		return "Point(" + x + "," + y + ")"; // Point 클래스 만의 toString()
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Point))
			return false;
		
		Point p = (Point)obj;
		return (this.x == p.x) && (this.y == p.y);
		
	}
	
	
	public static void main(String[] args) {
		Point p1 = new Point(2,3);
		Point p2 = new Point(2,3);
		
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
	}
}

