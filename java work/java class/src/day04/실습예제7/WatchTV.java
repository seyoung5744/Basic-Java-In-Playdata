package day04.실습예제7;

/*
 * 	133pg 실습예제7
 */

public class WatchTV {
	public static void main(String[] args) {
		TV tv = new TV();
		
		tv.show();
		
		tv.channelUp();
		tv.volumeDown();
		tv.powerOn();
		
		tv.channelUp();
		tv.volumeDown();
	}
}
