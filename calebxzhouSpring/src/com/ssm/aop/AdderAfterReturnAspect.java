package com.ssm.aop;

public class AdderAfterReturnAspect {
    public void afterReturn(Object returnValue) throws Throwable {
        System.out.println("Return Value is "+returnValue);
    }
}
