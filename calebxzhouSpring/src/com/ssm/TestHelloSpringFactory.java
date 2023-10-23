package com.ssm;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestHelloSpringFactory {

    public static void main(String[] args) {


        Resource res = new ClassPathResource("hellobean.xml");
        BeanFactory factory = new XmlBeanFactory(res);

        HelloSpring hello = (HelloSpring) factory.getBean("helloSpring");
        hello.show();


    }

}
