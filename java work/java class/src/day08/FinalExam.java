package day08;

final class FinalParent{  //클래스가 final이면 상속하지 않겠다....  
	final public void method1() { //재정의 하는 것을 불허 한다!! 
		
	}
}

public class FinalExam /* extends FinalParent */{ //final한 클래스는 상속 불가!! 
	final int OIL_PRICE=10;//상수.  변수앞에 final 이라는 키워드가 붙으면 상수가 된다.   상수는 식별자를 모두 대분자로 사용하는것이 관례.
	
	
	//부모가 가진 메소드를 오버라이드 한다!!! 
	//부모의 메소드가 final이면 오버라이드 불가!!! 
//	@Override
//	public void method1() {
//		// TODO Auto-generated method stub
//		super.method1();
//	}



	public static void main(String[] args) {
		FinalExam f = new FinalExam();
		
		
	}
}
