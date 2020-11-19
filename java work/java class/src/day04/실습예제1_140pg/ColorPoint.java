package day04.실습예제1_140pg;
import day04.실습예제3.Point;

public class ColorPoint extends Point{
	private String color;
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;		
	}
	
	public void show() {
		// 혹은 protected로 수정해서 x, y값 가져오기.
		System.out.println("좌표 [x=" + getX() + ",y=" + getY() + ",color=" + color + "]에 점을 그렸습니다.");
	}
}
