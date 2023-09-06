package com.animal;

/**
 * @author 韩德康~
 * @version 1.0
 * @time 2023/09/04/9:30
 */
public class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void work() {
        System.out.println("狗看家");
    }
}
