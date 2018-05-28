package com.imooc.spring.beanannotation.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.imooc.spring.beanannotation.injection.service.InjectionService;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-beanannotation.xml");
		InjectionService service=(InjectionService)context.getBean("injectionServiceImpl");
		service.save("this is autowired.");
	}

}
