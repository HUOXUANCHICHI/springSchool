package com.animal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestAnimal {
     public static void main(String[] args) {
    	//1.初始化容器，加载配置文件
     	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
     	//2.获取实例化对象
     	Cat cat = (Cat) ctx.getBean("cat");
     	//3.业务逻辑
     	cat.eat();
     	cat.work();
     	
     	Dog dog = (Dog) ctx.getBean("dog");
     	
     	dog.eat();
     	dog.work();
     }
}

