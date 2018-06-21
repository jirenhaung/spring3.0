package com.imooc.aop.api;

public class BizlogicImpl implements BizLogic {

	@Override
	public String save() {
		// TODO Auto-generated method stub
		System.out.println("BizLogicImpl:Logic save");
		return "BizLogicImpl save";
		//throw new RuntimeException();
	}

}
