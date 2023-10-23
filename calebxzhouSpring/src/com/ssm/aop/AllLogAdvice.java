package com.ssm.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class AllLogAdvice {
    @Pointcut("execution(* com.ssm.service.ProductService.*(..))")
    public void allMethod() {

    }

    //1.前置通知

    public void myBeforeAdvice(JoinPoint joinPoint) {
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        String logText = "前置通知："
                + new SimpleDateFormat("yyyy-MM-dd HH-mm:ss").format(new Date())
                + "  "
                + args.get(0).toString()
                + "浏览商品"
                + args.get(1).toString();

        System.out.println(logText);


    }

    public void myThrowingAdvice(JoinPoint joinPoint, Exception e) {
        //获取被调用的类名
        String targetClassName = joinPoint.getTarget().getClass().getName();
        //获取被调用的方法名
        String targetMethodName = joinPoint.getSignature().getName();
        //日志格式的字符串
        String logInfoText = "异常通知：执行"
                + targetClassName
                + "类中的"
                + targetMethodName
                + "方法时发生异常！";

        //将日志信息输出到控制台
        System.out.println(logInfoText);
        System.out.println("e的信息 " + e.getMessage());
        // 演示异常通知时，手动人为抛出异常
        throw new RuntimeException();
    }
    @Around("allMethod()")
    public void myAroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        long beginTime = System.currentTimeMillis();
        joinPoint.proceed();
        long endTime = System.currentTimeMillis();
        String targetMethodName = joinPoint.getSignature().getName();
        String logInfoText = "环绕通知:" + targetMethodName + "方法调用时间:" + beginTime + "毫秒," + "调用后的时间"
                + endTime + "毫秒,共执行了" + (endTime - beginTime) + "毫秒";
        System.out.println(logInfoText);
    }
}
