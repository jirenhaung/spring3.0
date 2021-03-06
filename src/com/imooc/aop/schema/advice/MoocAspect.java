package com.imooc.aop.schema.advice;

import org.aspectj.lang.ProceedingJoinPoint;

public class MoocAspect {
	public void before(){
		System.out.println("MoocAspect before");
	}
	public void afterReturning(){
		System.out.println("MoocAspect afterReturning");
	}
	public void afterThrowing(){
		System.out.println("MoocAspect afterThrowing");
	}
	public void after(){
		System.out.println("MoocAspect after");
	}
	public Object around(ProceedingJoinPoint pjp){
		Object object=null;
		try {
			System.out.println("MoocAspect around 1");
			object = pjp.proceed();
			System.out.println("MoocAspect around 2");

		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return object;
	}
	
	public Object aroundInit(ProceedingJoinPoint pjp,String bizName,int times){
		System.out.println(bizName+" "+times);
		Object object=null;
		try {
			System.out.println("MoocAspect aroundInit 1");
			object = pjp.proceed();
			System.out.println("MoocAspect aroundInit 2");

		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return object;
	}
}
