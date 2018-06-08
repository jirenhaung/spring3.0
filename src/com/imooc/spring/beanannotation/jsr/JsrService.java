package com.imooc.spring.beanannotation.jsr;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service
public class JsrService {
	@Resource
	private JsrDAO jsrDAO;
	
	//@Resource
	public void setJsrDAO(JsrDAO jsrDAO) {
		this.jsrDAO = jsrDAO;
	}
	
	@PostConstruct
	public void init(){
		System.out.println("jsrService init");
	}
	
	@PreDestroy
	public void destory(){
		System.out.println("jsrService destroy");
	}
	public void save(){
		jsrDAO.save();
	}
}
