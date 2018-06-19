package com.imooc.aop.schema.advice;

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
}
