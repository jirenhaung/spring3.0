package com.imooc.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.imooc.aop.api.BizLogic;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("aop_api.xml");
		BizLogic logic=(BizLogic)context.getBean("bizLogicImpl");
		logic.save();
		((ClassPathXmlApplicationContext)context).close();
	}

}
