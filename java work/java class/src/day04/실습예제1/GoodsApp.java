package day04.�ǽ�����1;
/*
 	120pg �ǽ�����1 
 */
public class GoodsApp {
	public static void main(String[] args) {
		Goods camera = new Goods(); // �ش� ��ü�� ������ �� ������ ����.
		
		camera.setName("Nikon");
		camera.setPrice(40000);
		camera.setCountStock(30);
		camera.setCountSold(50);
		
		camera.printGoods();
		
		Goods phone = new Goods("������");
		
		Goods camera2 = new Goods("samsung",200000, 20, 40);
	}
}
