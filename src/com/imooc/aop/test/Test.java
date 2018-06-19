package com.imooc.aop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.imooc.aop.schema.advice.Fit;
import com.imooc.aop.schema.advice.biz.AspectBiz;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("aop_advice.xml");
		/*AspectBiz biz=(AspectBiz)context.getBean("aspectBiz");
		biz.init("moocService", 3);*/
		Fit fit=(Fit)context.getBean("aspectBiz");
		fit.filter();
		((ClassPathXmlApplicationContext)context).close();

	}
}
