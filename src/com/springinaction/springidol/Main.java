package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-idol.xml");
		Perfomer perfomer=(Perfomer) context.getBean("poeticDuke");
		perfomer.perform();
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-idol.xml");
		Perfomer perfomer2=(Perfomer) context.getBean("kenny2");
		perfomer2.perform();
	}

}
