package day08;

final class FinalParent{  //Ŭ������ final�̸� ������� �ʰڴ�....  
	final public void method1() { //������ �ϴ� ���� ���� �Ѵ�!! 
		
	}
}

public class FinalExam /* extends FinalParent */{ //final�� Ŭ������ ��� �Ұ�!! 
	final int OIL_PRICE=10;//���.  �����տ� final �̶�� Ű���尡 ������ ����� �ȴ�.   ����� �ĺ��ڸ� ��� ����ڷ� ����ϴ°��� ����.
	
	
	//�θ� ���� �޼ҵ带 �������̵� �Ѵ�!!! 
	//�θ��� �޼ҵ尡 final�̸� �������̵� �Ұ�!!! 
//	@Override
//	public void method1() {
//		// TODO Auto-generated method stub
//		super.method1();
//	}



	public static void main(String[] args) {
		FinalExam f = new FinalExam();
		
		
	}
}
