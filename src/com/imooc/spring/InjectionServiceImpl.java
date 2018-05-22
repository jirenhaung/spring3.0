package com.imooc.spring;

public class InjectionServiceImpl implements InjectionService {
	private InjectionDAO injectionDAO;
	//构造注入
	public InjectionServiceImpl(InjectionDAO injectionDAO){
		this.injectionDAO=injectionDAO;
	}
	//设值注入
	public void setInjectionDAO(InjectionDAO injectionDAO) {
		this.injectionDAO = injectionDAO;
	}

	@Override
	public void save(String arg) {
		System.out.println("Service接收参数: "+arg);
		arg=arg+";"+this.hashCode();
		injectionDAO.save(arg);
	}

}
