package com.animal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestAnimal {
     public static void main(String[] args) {
    	//1.��ʼ�����������������ļ�
     	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
     	//2.��ȡʵ��������
     	Cat cat = (Cat) ctx.getBean("cat");
     	//3.ҵ���߼�
     	cat.eat();
     	cat.work();
     	
     	Dog dog = (Dog) ctx.getBean("dog");
     	
     	dog.eat();
     	dog.work();
     }
}

