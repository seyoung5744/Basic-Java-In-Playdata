package day07;

public class Pen {
	private String color;
	private String company;
	
	public Pen(String color, String company) {
		this.color = color;
		this.company = company;
	}
	
	@Override
	public int hashCode() { // ���� hasCode�� ���� equals��  �̿��Ͽ� �� ������ ��ü �˻�
		final int prime = 31;
		int result = 1;
//		result = prime
		return super.hashCode();
	}
	
	public static void main(String[] args) {
		Pen p1 = new Pen("�Ķ�","�𳪹�");
		Pen p2 = new Pen("�Ķ�","�𳪹�");
		Pen p3 = new Pen("�Ķ�","�𳪹�");
		
		if(p1 == p2) {
			System.out.println("���ƿ�~~");
		}else {
			System.out.println("�޶��~~");
		}
		
		
		
	}
}
