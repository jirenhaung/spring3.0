package com.springinaction.springidol;

public class Guitar implements Instrument {
	public Guitar() {
	}
	@Override
	public void play() {
		System.out.println("DING DING DING!");
	}

}
