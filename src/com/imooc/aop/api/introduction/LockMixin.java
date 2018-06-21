package com.imooc.aop.api.introduction;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

public class LockMixin extends DelegatingIntroductionInterceptor implements Lockable {
	private static final long serialVersionalUID=694316381992660450L;
	
	private boolean locked;
	
	@Override
	public void lock() {
		// TODO Auto-generated method stub
		this.locked=true;
	}

	@Override
	public void unlock() {
		// TODO Auto-generated method stub
		this.locked=false;
	}

	@Override
	public boolean locked() {
		// TODO Auto-generated method stub
		return this.locked;
	}
	
	public Object invoke(MethodInvocation invocation)throws Throwable{
		if(locked&&invocation.getMethod().getName().indexOf("set")==0){
			throw new RuntimeException();
		}
		return super.invoke(invocation);
	}
}
