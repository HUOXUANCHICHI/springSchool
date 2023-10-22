package com.ssm.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAdminInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		AdminInfo admin = (AdminInfo) ctx.getBean("adminInfo");
		admin.print();
		System.out.println(admin.toString());
		AdminInfo admin1 = (AdminInfo) ctx.getBean("adminInfo");
		System.out.println(admin);
		System.out.println(admin1);
		System.out.println(admin == admin1);
		
		
		
		AdminInfo adminp = (AdminInfo) ctx.getBean("admin");
		adminp.print();
	}
}
