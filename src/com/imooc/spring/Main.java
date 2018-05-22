package com.imooc.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		//OneInterface oneInterface=new OneInterfaceImpl();
		//System.out.println(oneInterface.hello("word."));
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-idol.xml");
		/*OneInterface oneInterface=(OneInterfaceImpl)context.getBean("oneInterface");
		System.out.println(oneInterface.hello("我的输入信息："));
		*/
		InjectionService service=(InjectionServiceImpl)context.getBean("injectionService");
		service.save("这是要保存的数据");
	}
}
