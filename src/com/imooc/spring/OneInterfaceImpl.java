package com.imooc.spring;

public class OneInterfaceImpl implements OneInterface {

	@Override
	public String hello(String word) {
		// TODO Auto-generated method stub
		return "Word from interface \"OneInterface\":"+word;
	}

}
