package com.imooc.spring.beanannotation.multibean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-beanannotation.xml");
		BeanInvoker invoker=(BeanInvoker)context.getBean("beanInvoker");
//		beanAnnotation.say("this is test");
		invoker.say();
	}
}
