package com.test;

import com.ssm.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringDI {

//    public static void main(String[] args) {
//        
//
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserService userService = (UserService) ctx.getBean("userService");
//        boolean flag = userService.login("admin", "123456");
//        if (flag) {
//            System.out.println("登陆成功！");
//        } else {
//            System.out.println("登陆失败！");
//        }
//
//    }

    @Test
    public void test01() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) ctx.getBean("wuhanhuiService");
        boolean flag = userService.login("吴晗辉", "");
        if(flag) {
            System.out.println("登陆成功！");
        }else {
            System.out.println("登陆失败！");
        }
    }
}
