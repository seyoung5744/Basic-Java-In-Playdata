package day04.실습예제4;

/*
	126pg 실습문제 4.
 */
public class ArrayUtils {
	// int배열을 double배열로 변환
	static double [] intToDouble(int[] source) {
		double[] tempDouble = new double[source.length];
		for(int i = 0; i < source.length; i++) {
			tempDouble[i] = source[i];
		}
		
		return tempDouble;		
	}
	
	// double 배열을 int 배열로 변환
	static int[] doubleToInt(double[] source) {
		int[] tempInt = new int[source.length];
		for(int i = 0; i < source.length; i++) {
			tempInt[i] = (int)source[i];
		}
		
		return tempInt;
	}
	
	// int 배열 두개를 연결한 새로운 배열 리턴
	static int[] concat(int [] s1, int[] s2) {
		int[] tempConcatArray = new int[s1.length + s2.length];
		
		// 전체 인덱스 관리
		int index = 0;
		
		for(int i = 0; i < s1.length; i++) { // 9
			tempConcatArray[index++] = s1[i];
		}
		for(int i = 0; i < s2.length; i++) {
			tempConcatArray[index++] = s2[i];
		}
		
		return tempConcatArray;
	}
}
