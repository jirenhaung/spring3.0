package com.imooc.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycle implements InitializingBean,DisposableBean {

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("after");
	}
	
//	public void start(){
//		System.out.println("Bean Start!");
//	}
//	
//	public void stop(){
//		System.out.println();
//	}
}
