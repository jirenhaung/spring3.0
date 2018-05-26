package com.imooc.spring.beanannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-beanannotation.xml");
		BeanAnnotation beanAnnotation=(BeanAnnotation)context.getBean("bean");
//		beanAnnotation.say("this is test");
		beanAnnotation.myHashCode();
		
		beanAnnotation=(BeanAnnotation)context.getBean("bean");
		beanAnnotation.myHashCode();
	}
}
