package com.kangkang.util;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author ablaze
 * @Date: 2023/10/11/13:46
 */
public class HanDeKangAdvice {


    // 前置通知
    public void beforePrintLog() {
        System.out.println("前置通知MyLogger类中的beforePrintLog方法开始记录日志了。。。");
    }

    // 后置通知
    public void afterReturningPrintLog() {
        System.out.println("后置通知MyLogger类中的afterReturningPrintLog方法开始记录日志了。。。");
    }

    // 异常通知
    public void afterThrowingPrintLog() {
        System.out.println("异常通知MyLogger类中的afterThrowingPrintLog方法开始记录日志了。。。");
    }

    // 最终通知
    public void afterPrintLog() {
        System.out.println("最终通知MyLogger类中的afterPrintLog方法开始记录日志了。。。");
    }
    //环绕通知
    public Object aroundPrintLog(ProceedingJoinPoint pjp) {
        Object result = null;
        try {
            Object[] args = pjp.getArgs(); // 得到方法执行所需的参数
            System.out.println("handekang环绕通知记录日志前置");
            result = pjp.proceed(args); // 明确调用业务层方法（切入点方法）
            System.out.println("handekang环绕通知记录日志后置");
            return result;
        } catch (Throwable e) { // proceed方法抛出了Throwable
            System.out.println("handekang环绕通知记录日志异常");
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            System.out.println("handekang环绕通知记录日最终");
        } }
}
