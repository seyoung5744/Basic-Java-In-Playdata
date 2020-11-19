package day04.실습예제1;
/*
 	120pg 실습예제1 
 */
public class GoodsApp {
	public static void main(String[] args) {
		Goods camera = new Goods(); // 해당 객체가 생성될 때 생성자 실행.
		
		camera.setName("Nikon");
		camera.setPrice(40000);
		camera.setCountStock(30);
		camera.setCountSold(50);
		
		camera.printGoods();
		
		Goods phone = new Goods("아이폰");
		
		Goods camera2 = new Goods("samsung",200000, 20, 40);
	}
}
