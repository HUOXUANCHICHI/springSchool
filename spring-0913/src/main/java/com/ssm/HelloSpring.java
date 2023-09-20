package com.ssm;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

/**
 * @author 韩德康~
 * @version 1.0
 * @time 2023/08/28/9:11
 */
@Data

@Repository
public class HelloSpring {
    @Value("hhh")
    private String userName;


    public void show() {
        System.out.println("123" + userName);
    }
}