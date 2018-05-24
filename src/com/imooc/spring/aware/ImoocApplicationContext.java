package com.imooc.spring.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ImoocApplicationContext implements ApplicationContextAware {

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println(arg0.getBean("moocApplicationContext"));
	}

}
