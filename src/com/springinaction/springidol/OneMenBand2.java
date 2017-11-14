package com.springinaction.springidol;

import java.util.Map;

public class OneMenBand2 implements Perfomer {
	public OneMenBand2() {
	}
	@Override
	public void perform() {
		for (String key : instruments.keySet()) {
			System.out.print(key+" : ");
			Instrument instrument=instruments.get(key);
			instrument.play();
		}
	}
	private Map<String, Instrument>instruments;
	public void setInstruments(Map<String, Instrument>instruments){
		this.instruments=instruments;
	}

}
