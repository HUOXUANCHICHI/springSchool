package com.ssm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssm.service.UserService;

public class TestSpringDI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserService) ctx.getBean("userService");
		boolean flag = userService.login("admin", "123456");
		if(flag) {
			System.out.println("登陆成功！");
		}else {
			System.out.println("登陆失败！");
		}
			
	}

}
