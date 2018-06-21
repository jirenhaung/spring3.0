package com.imooc.aop.api.introduction;

import org.aopalliance.aop.Advice;
import org.springframework.aop.support.DefaultIntroductionAdvisor;

public class LockMixinAdivsor extends DefaultIntroductionAdvisor {
	private static final long serialVersionUID = -171332350782163120L;
	
	public LockMixinAdivsor() {
		super(new LockMixin(),Lockable.class);
		// TODO Auto-generated constructor stub
	}
	
}
