package com.ssm;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Batman implements InitializingBean,DisposableBean{

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("destroy");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("born");
	}
	public void doAction() {
		System.out.println("the hero save the world");
	}
            
}
