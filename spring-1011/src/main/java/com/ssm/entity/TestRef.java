package com.ssm.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		User user = (User)ctx.getBean("user");
		System.out.println(user.toString());
		
		System.out.println("***************************");
		Person person = (Person)ctx.getBean("person");
		person.show();
		
		
	}
}
