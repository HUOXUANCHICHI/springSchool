package com.ssm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringRef {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //初始化Spring容器，加载applicationContext.xml文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = (Person) ctx.getBean("person");
        person.show();

    }

}
