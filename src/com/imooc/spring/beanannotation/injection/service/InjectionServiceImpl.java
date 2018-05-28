package com.imooc.spring.beanannotation.injection.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imooc.spring.beanannotation.injection.dao.InjectionDAO;
@Service
public class InjectionServiceImpl implements InjectionService {
	//@Autowired
	private InjectionDAO injectionDAO;
	//构造注入
	@Autowired
	public InjectionServiceImpl(InjectionDAO injectionDAO){
		this.injectionDAO=injectionDAO;
	}
//	//设值注入
	//@Autowired
	public void setInjectionDAO(InjectionDAO injectionDAO) {
		this.injectionDAO = injectionDAO;
	}

	@Override
	public void save(String arg) {
		System.out.println("Service接收参数: "+arg);
		arg=arg+":"+this.hashCode();
		injectionDAO.save(arg);
	}

}
