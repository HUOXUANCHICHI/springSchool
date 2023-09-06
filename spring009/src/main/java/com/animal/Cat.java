package com.animal;

/**
 * @author 韩德康~
 * @version 1.0
 * @time 2023/09/04/9:28
 */
public class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void work() {
        System.out.println("猫抓老鼠");
    }
}
