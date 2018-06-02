package com.imooc.spring.beanannotation.javabased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-beanannotation.xml");
		MyDriverManager manager=(MyDriverManager)context.getBean("myDriverManager");
		System.out.println(manager.getClass().getName());
	}

}
