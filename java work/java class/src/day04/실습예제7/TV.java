package day04.실습예제7;

/*
 * 	133pg 실습예제7
 */
public class TV {
	private int channel;
	private int volume;
	private boolean power;

	public TV() {
		this(7, 20, false);
	}

	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	public void channelUp() {
		if (power) {
			this.channel++;
			this.showChannel();
		} else {
			pleaseTVOn();
		}
	}

	public void channelDown() {
		if (power) {
			this.channel--;
			this.showChannel();
		} else {
			pleaseTVOn();
		}
	}

	public void volumeUp() {
		if (power) {
			this.volume++;
			this.showVolume();
		} else {
			pleaseTVOn();
		}
	}

	public void volumeDown() {
		if (power) {
			this.volume--;
			this.showVolume();
		} else {
			pleaseTVOn();
		}
	}

	public void powerOn() {
		this.power = true;
		this.showPower();
	}

	public void powerOff() {
		this.power = false;
		this.showPower();
	}

	public void setChannel(int channel) {this.channel = channel;}

	public int getChannel() {return this.channel;}

	public boolean isPower() {return this.power;}

	public int getVolume() {return this.volume;}

	public void showChannel() {
		System.out.println("채널 : " + channel);
	}

	public void showVolume() {
		System.out.println("소리 : " + this.volume);
	}

	public void showPower() {
		if (this.power)
			System.out.println("티기가 켜졌습니다.");
		else
			System.out.println("티비가 꺼졌습니다");
	}
	
	public void pleaseTVOn() {
		System.out.println("티비를 켜주세요");
	}
	
	public void show() {
		this.showChannel();
		this.showVolume();
		this.showPower();
	}
}
