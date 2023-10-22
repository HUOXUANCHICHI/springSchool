package com.ssm.aop;


import com.ssm.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aop.xml");
		ProductService productService = (ProductService)ctx.getBean("productService");
		productService.browse("admin","xiaomi");
	}

}
