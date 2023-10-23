package com.ssm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestScopeLife {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Batman batman = (Batman)ctx.getBean("batman");
		batman.doAction();
		
		((ClassPathXmlApplicationContext)ctx).close();
	}

}
