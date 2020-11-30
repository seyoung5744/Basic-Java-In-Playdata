package day10;

import java.io.Serializable;

public class Phone implements Serializable{
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
