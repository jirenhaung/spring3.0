package com.imooc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-imooc.xml");
		BeanScope beanScope=(BeanScope)context.getBean("beanScope");
		beanScope.say();

		BeanScope beanScope2=(BeanScope)context.getBean("beanScope");
		beanScope2.say();
	}
}
