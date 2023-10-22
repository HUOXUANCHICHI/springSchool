package com.ssm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringSet {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //初始化Spring容器，加载applicationContext.xml文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 通过容器获取配置中的adminInfo的实例
        AdminInfo admin = (AdminInfo) ctx.getBean("adminInfoSet");
        System.out.println(admin);
        admin.print();

    }

}
