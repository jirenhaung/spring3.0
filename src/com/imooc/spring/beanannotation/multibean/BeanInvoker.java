package com.imooc.spring.beanannotation.multibean;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BeanInvoker {
	@Autowired
	private List<BeanInterface> list;
	
	@Autowired
	private Map<String, BeanInterface>map;
	
	@Autowired
	@Qualifier("beanImplTwo")
	private BeanInterface beanInterface;
	
	public void say(){
		if(null!=list){
			System.out.println("this is list");
			for(BeanInterface bean:list){
				System.out.println(bean.getClass().getName());
			}
		}else {
			System.out.println("List<BeanInterface>list is null!!!!!!");
		}
		System.out.println();
		if (null!=map) {
			System.out.println("this is map");
			for(Map.Entry<String, BeanInterface>entry:map.entrySet()){
				System.out.println(entry.getKey()+"   "+
						entry.getValue().getClass().getName());
			}
		}else {
			System.out.println("Map<String,BeanInterface>map is null!!!!!!");
		}
		
		System.out.println();
		if (null!=beanInterface) {
			System.out.println(beanInterface.getClass().getName());
		}else {
			System.out.println("beanInterface is null");
		}
	}
}
