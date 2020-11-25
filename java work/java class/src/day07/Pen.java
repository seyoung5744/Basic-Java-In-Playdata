package day07;

public class Pen {
	private String color;
	private String company;
	
	public Pen(String color, String company) {
		this.color = color;
		this.company = company;
	}
	
	@Override
	public int hashCode() { // 본래 hasCode와 같이 equals를  이용하여 더 빠르게 객체 검색
		final int prime = 31;
		int result = 1;
//		result = prime
		return super.hashCode();
	}
	
	public static void main(String[] args) {
		Pen p1 = new Pen("파랑","모나미");
		Pen p2 = new Pen("파랑","모나미");
		Pen p3 = new Pen("파랑","모나미");
		
		if(p1 == p2) {
			System.out.println("같아요~~");
		}else {
			System.out.println("달라요~~");
		}
		
		
		
	}
}
