package com.ssm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestScopeLife {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Batman batman = (Batman)ctx.getBean("batman");
		batman.doAction();
		
		((ClassPathXmlApplicationContext)ctx).close();
	}

}
