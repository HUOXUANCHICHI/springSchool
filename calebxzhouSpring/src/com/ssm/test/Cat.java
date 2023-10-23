package com.ssm.test;

public class Cat implements Animal {

    @Override
    public void eat() {

        System.out.println("猫吃鱼");
    }

    @Override
    public void work() {

        System.out.println("猫抓老鼠");
    }

}
