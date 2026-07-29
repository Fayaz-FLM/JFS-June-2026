package com;

public class TVRemote extends Remote{
	
	int volume;
	
	public void increaseVolume() {
		this.volume++;
		System.out.println("Current volume : " + volume);
	}
	
	public void increaseVolume(int volume) {
		this.volume += volume;
		System.out.println("Current volume : "+ this.volume);
	}
	
	public int increaseVolume(String name) {
		return 1;
	}
	
	@Override
	public void turnOn() {
		System.out.println("Turning On Samsung TV...");
	}
	
}
