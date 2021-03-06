package day04.실습예제1;

/*
	120pg 실습예제1
 */
public class Goods {
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	
	public Goods() {
		this("",0,0,0);
	}
	public Goods(String name) { 
//		this.name = name;
		this(name, 0, 0, 0);
	}
	public Goods(String name, int price) {
//		this.name = name;
		this(name); // this method를 사용하여 이미 생성된 생성자를 재사용
		this.price = price;
	}
	public Goods(String name, int price, int countStock, int countSold) {
		this.name = name;
		this.price = price;
//		this(name, price);
		this.countStock = countStock;
		this.countSold = countSold;
	}
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	public int getPrice() { return this.price; }
	public void setPrice(int price) { this.price = price; }
	
	public int getCountStock() { return this.countStock; }
	public void setCountStock(int countStock) { this.countStock = countStock; }
	
	public int getCountSold() { return this.countSold; }
	public void setCountSold(int countSold) { this.countSold = countSold; }
	
	public void printGoods() {
		System.out.println("상품이름: " + this.name);
		System.out.println("상품가격: " + this.price);
		System.out.println("재고수량: " + this.countStock);
		System.out.println("팔린수량: " + this.countSold);
		
	}
	
}
