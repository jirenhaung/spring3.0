package com.imooc.spring.autowiring;

public class AutoWiringService {
	private AutoWiringDAO autoWiringDAO;
	
	public AutoWiringService(AutoWiringDAO autoWiringDAO) {
		// TODO Auto-generated constructor stub
		System.out.println("setAutoWiringDAO");
		this.autoWiringDAO=autoWiringDAO;
	}

	public void setAutoWiringDAO11(AutoWiringDAO autoWiringDAO) {
		System.out.println("setAutoWiringDAO11");
		this.autoWiringDAO = autoWiringDAO;
	}
	public void say(String word){
		this.autoWiringDAO.say(word);
	}
}
