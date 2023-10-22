package com.ssm;

public class Person {
    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    public void show() {
        System.out.println(user.toString());
    }
}
