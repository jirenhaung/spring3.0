package com.imooc.spring.beanannotation.jsr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-beanannotation.xml");
		JsrService service=(JsrService)context.getBean("jsrService");
		service.save();
		((ClassPathXmlApplicationContext)context).close();
	}

}
