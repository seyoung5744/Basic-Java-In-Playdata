package day10;

public class Phone {
	private String name;
	private String phoneNum;
	
	public Phone(String name, String phoneNum) {
		this.name = name;
		this.phoneNum = phoneNum;
	}
	
	@Override
	public String toString() {
		return name + " : " + phoneNum;
	}
}