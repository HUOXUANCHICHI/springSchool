package com.test;

import com.ssm.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestAOP {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aop.xml");
		ProductService productService = (ProductService)ctx.getBean("productService");
		productService.browse("admin","xiaomi");
	}

}
