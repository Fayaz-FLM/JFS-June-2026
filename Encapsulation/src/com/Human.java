package com;

public class Human extends Omnivores {

	@Override
	void sound() {
		System.out.println("Talk...");
	}

	@Override
	void food() {
		System.out.println("Rice...");
	}

}
