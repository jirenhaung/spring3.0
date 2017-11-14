package com.springinaction.springidol;

public class Sonnet29 implements Poem {
	private static String[] LINES={
			"When i was young i'd listen to the radio you",
			"waiting for my favorite song"
	};
	public Sonnet29() {
	}
	@Override
	public void recite() {
		for (int i = 0; i < LINES.length; i++) {
			System.out.println(LINES[i]);
		}
	}

}
