package com.ssm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Controller;

/**
 * @author 韩德康~
 * @version 1.0
 * @time 2023/09/11/8:40
 */
@AllArgsConstructor
@Controller
@Data
public class Person {
    private User user;

    public void show() {
        System.out.println(user.toString());
    }

}
