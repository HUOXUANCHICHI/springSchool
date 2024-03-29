package com.ssm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssm.service.UserService;

public class TestSpringDI {

    public static void main(String[] args) {
        

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) ctx.getBean("userService");
        boolean flag = userService.login("admin", "123456");
        if (flag) {
            System.out.println("success");
        } else {
            System.out.println("failed");
        }
    }

}
