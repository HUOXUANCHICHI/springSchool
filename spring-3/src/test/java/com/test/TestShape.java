package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestShape {
    public static void main(String[] args) {
    	
//    	Shape shape = new Circle();
//    	shape.draw();
    	
//    	Shape shape0 = new Square();
//    	shape0.draw();
    	//1.初始化容器，加载配置文件
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    	//2.获取实例化对象
    	Circle circle = (Circle) ctx.getBean("circle");
    	//3.业务逻辑
    	circle.draw();
    	
    	Square square = (Square) ctx.getBean("square");
    	
    	square.draw();
    	
    }
}
