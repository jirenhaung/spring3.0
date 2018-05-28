package com.imooc.spring.beanannotation.injection.dao;

import org.springframework.stereotype.Repository;

@Repository
public class InjectionDAOImpl implements InjectionDAO {

	@Override
	public void save(String arg) {
		System.out.println("保存数据："+arg);
	}

}
