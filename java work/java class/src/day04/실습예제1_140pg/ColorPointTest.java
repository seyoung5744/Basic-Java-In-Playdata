package day04.실습예제1_140pg;
import day04.실습예제3.Point;

public class ColorPointTest {
	public static void main(String[] args) {
		Point a, b;
		a = new Point(2, 3);
		b = new ColorPoint(3, 4, "red");
		a.show();
		b.show();
	}
}
