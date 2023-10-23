package com.test;

import com.ssm.aop.SampleAdder;
import com.ssm.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestAOP {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ctx.getBean("sampleAdder", SampleAdder.class).add(1,2);
        /*ApplicationContext ctx = new ClassPathXmlApplicationContext("aop.xml");
        ProductService productService = (ProductService) ctx.getBean("productService");
        productService.browse("admin", "xiaomi");*/
    }

}
