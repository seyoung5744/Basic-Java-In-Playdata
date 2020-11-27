package day09;

import java.util.Map;

class 방석{
	
}

public class GenericBoxUser {

	public static void main(String[] args) {
		GenericBox<옷걸이> box = new GenericBox<옷걸이>();
		box.setObj(new 옷걸이());
//		box.setObj(new 방석());
		
		GenericBox<방석> box2 = new GenericBox<방석>();
		box2.setObj(new 방석());
		
		
		Map<String, 방석> m;
	}

}
