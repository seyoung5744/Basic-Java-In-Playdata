package day08;

public class WrapperTest {
	public static void m1(Integer ii) {
		System.out.println(ii);
	}

	public static void main(String[] args) {
		int i = 10;
		WrapperTest.m1(i); //����ڽ�    �ڹٰ� ������ �ö󰡸鼭 �ڵ����� �������ش�.  
		
		Integer i2 = 10;
		
		int i3 = i2;   //���� ��ڽ�..  (�ڵ����� ����... )  
		i3 = i2.intValue();
		
		Integer i4 = i3;   //����ڽ�.. 
		i4 = new Integer(i3);
		
		System.out.println(i);
		
		System.out.println(i2.toString());
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		String s = "123";
		
		int i5 = Integer.parseInt(s);
		System.out.println(i5);
		
		System.out.println(Integer.toHexString(28));
		
		Character.getNumericValue('a');
		
		
	}

}
