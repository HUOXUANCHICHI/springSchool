package com.ssm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHelloSpringApplicationMulti {

    public static void main(String[] args) {

        // 初始化Spring容器，加载applicationContext.xml文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext("hellobean.xml", "hellobean1.xml");
        // 通过容器获取配置中的helloSpring的实例
        System.out.println(ctx.getBean("helloSpring"));
        HelloSpring helloSpring = (HelloSpring) ctx.getBean("helloSpring");
        System.out.println(helloSpring);
        helloSpring.show();


        HelloSpring helloSpring1 = (HelloSpring) ctx.getBean("helloSpring1");
        System.out.println(helloSpring1);
        helloSpring1.show();

    }

}
