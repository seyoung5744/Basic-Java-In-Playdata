package day04.�ǽ�����3;

/*
	122pg �ǽ�����3
 */
public class Point {
	private int x, y;
	
	// ����Ʈ ������
	public Point() {
		this(0,0);
	}
	
	// x, y �ʱ�ȭ ������
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setX(int x) { this.x = x; }
	public int getX() { return x; }
	
	public void setY(int y) { this.y = y; }
	public int getY() { return y; }
	
	public void show() {
		System.out.println("��ǥ [x=" + x + ",y=" + y + "]�� ���� �׷Ƚ��ϴ�.");
	}
	
	public void show(boolean visible) {
		if(visible) {
			this.show();
		}else {
			System.out.println("��ǥ [x=" + x + ",y=" + y + "]�� ���� �������ϴ�.");
			this.x = 0;
			this.y = 0;
		}
	}
}
