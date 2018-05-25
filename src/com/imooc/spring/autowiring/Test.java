package com.imooc.spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-autowiring.xml");
		AutoWiringService service=(AutoWiringService)context.getBean("autoWiringService");
		service.say("this is wired by name");
	}
}
