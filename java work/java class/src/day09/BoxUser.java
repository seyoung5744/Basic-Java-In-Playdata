package day09;
class �ʰ���{
	
}
public class BoxUser {

	public static void main(String[] args) {
		Box box = new Box();
		�ʰ��� aa = new �ʰ���();
		box.setObj(aa);
		
		Box box2 = new Box();
		box2.setObj(new �漮());
		
		Object bb = box.getObj();
		aa = (�ʰ���)bb;
		
		
		Object ob = box2.getObj();
	}

}
