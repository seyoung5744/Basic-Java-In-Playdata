package day02;

public class ArrayUtil {
	// �迭�� ���ϴ� �޼ҵ�
	public boolean equals(int[] a, int[] b) {
		if(a.length != b.length) {
			return false;
		}else {
			for(int i = 0; i < a.length; i++) {
				if(a[i] != b[i]) {
					return false;
				}
			}
		}
		
		return true;
	}
}