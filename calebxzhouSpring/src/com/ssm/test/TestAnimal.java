package com.ssm.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnimal {

    public static void main(String[] args) {

        //初始化Spring容器，加载applicationContext.xml文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过容器获取配置中的实例
        Cat cat = (Cat) ctx.getBean("cat");
        cat.eat();
        cat.work();

        Dog dog = (Dog) ctx.getBean("dog");
        dog.eat();
        dog.work();

    }

}
