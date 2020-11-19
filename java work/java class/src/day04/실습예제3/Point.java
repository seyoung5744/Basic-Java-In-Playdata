package day04.실습예제3;

/*
	122pg 실습예제3
 */
public class Point {
	private int x, y;
	
	// 디폴트 생성자
	public Point() {
		this(0,0);
	}
	
	// x, y 초기화 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setX(int x) { this.x = x; }
	public int getX() { return x; }
	
	public void setY(int y) { this.y = y; }
	public int getY() { return y; }
	
	public void show() {
		System.out.println("좌표 [x=" + x + ",y=" + y + "]에 점을 그렸습니다.");
	}
	
	public void show(boolean visible) {
		if(visible) {
			this.show();
		}else {
			System.out.println("좌표 [x=" + x + ",y=" + y + "]에 점을 지웠습니다.");
			this.x = 0;
			this.y = 0;
		}
	}
}
