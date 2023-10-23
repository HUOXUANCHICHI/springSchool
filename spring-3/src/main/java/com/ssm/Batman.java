package com.ssm;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Batman implements InitializingBean,DisposableBean{

	@Override
	public void destroy() throws Exception {
		
		System.out.println("destroy");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("born");
	}
	public void doAction() {
		System.out.println("the hero save the world");
	}
            
}
