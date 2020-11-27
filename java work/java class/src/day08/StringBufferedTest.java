package day08;

public class StringBufferedTest {
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("test");
		sb.append("dfdfdf");
	
		return sb.toString();
	}

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb);
		sb.append(" test hahah");
		System.out.println(sb);
	}

}
