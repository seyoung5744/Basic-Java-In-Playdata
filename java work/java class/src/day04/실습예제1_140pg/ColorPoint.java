package day04.�ǽ�����1_140pg;
import day04.�ǽ�����3.Point;

public class ColorPoint extends Point{
	private String color;
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;		
	}
	
	public void show() {
		// Ȥ�� protected�� �����ؼ� x, y�� ��������.
		System.out.println("��ǥ [x=" + getX() + ",y=" + getY() + ",color=" + color + "]�� ���� �׷Ƚ��ϴ�.");
	}
}
