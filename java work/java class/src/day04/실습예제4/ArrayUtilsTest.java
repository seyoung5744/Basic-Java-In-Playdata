package day04.실습예제4;

/*
	126pg 실습문제 4.
 */
public class ArrayUtilsTest {
	public static void main(String[] args) {
		int[] iarr = new int[] {1,2,3,4,5,6,7,8,9,10};
		int[] iarr2 = new int[] {7,7,7,7,7};
		
		
		System.out.println("int -> double");
		// int -> double
		double[] darr = ArrayUtils.intToDouble(iarr);
		for(int i = 0; i < darr.length; i++) {
			System.out.print(darr[i] + " ");
		}
		
		System.out.println();
		System.out.println("double -> int");
		
		double[] testDouble = new double[] {1.1,2.2,3.3,4.4,5.5};
		//double -> int
		int[] iarr3 = ArrayUtils.doubleToInt(testDouble);
		for(int i = 0; i < iarr3.length; i++) {
			System.out.print(iarr3[i] + " ");
		}
		
		System.out.println();
		System.out.println("int형 배열 합치기");
		// int형 배열 2개 합치기.
		int[] arrSum = ArrayUtils.concat(iarr, iarr2);
		
		for(int i = 0; i < arrSum.length; i++) {
			System.out.print(arrSum[i] + " ");
		}
	}
}
