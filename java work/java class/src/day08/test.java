package day08;

/*
	추상 클래스와 인터페이스는 추상 메소드 구현을 강제한다.
	
	이거 두개의 차이점이
	
	ex) 
	추상 클래스는
	
	동물(상위 클래스 - 추상 클래스) - 기능 : 먹기(아무기능도 없고), 놀기

	확장, 구체화를 시킨다.
	기능의 확장은...강제로 받아서 구현하는데
	하위 클래스 : 사자 - 먹기( 육식 ), 놀기
			   기린 - 먹기( 초식 ), 놀기
			  
	인터페이스는
	
	interface action{
		날기() // 추상 메소드, 같은 기능 (메소드가 기능을 하긴하니깐)
	}
	
	비행기 implements action - 날기 (엔진으로 날고) (강제 구현하는 거죠) - 기계
	새 implements action - 날기 (날개를 움직여서 날고) (강제 구현하는 거죠) - 동물
	
	차이점 
	추상 클래스 - 객체에 초점이 맞춰져 있다
	인터페이스 - 서로 다른 객체들의 공통된 기능
 */

class Student2{ // 눈에는 안보이지만 자바 지 혼자 object를 상속 받고 있는 거예요.
	
}
public class test {
	public static void main(String[] args) {
		// object 제일 상위 클래스
		String a = new String("string");
		Student2 s = new Student2();
		StringBuffer sb = new StringBuffer();
		
		Object[] ob = {a, s, sb}; 
		// 단점
		System.out.println(a);
		// 케스팅이 
		System.out.println( (String)a);
		System.out.println( (Student2) s);
		System.out.println( (StringBuffer)sb);
	}
}
