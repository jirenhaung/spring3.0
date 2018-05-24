package com.imooc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.imooc.spring.aware.ImoocApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-imooc.xml");
		BeanScope beanScope=(BeanScope)context.getBean("beanScope");
		beanScope.say();

		BeanScope beanScope2=(BeanScope)context.getBean("beanScope");
		beanScope2.say();
		
		BeanLifeCycle beanLifeCycle=(BeanLifeCycle)context.getBean("beanLifeCycle");
		//((ClassPathXmlApplicationContext)context).destroy();
		ImoocApplicationContext imoocApplicationContext=(ImoocApplicationContext)context.getBean("moocApplicationContext");
		System.out.println("test:"+context.getBean("moocApplicationContext"));
	}
}
