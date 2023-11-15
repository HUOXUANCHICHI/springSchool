package com.kangkang;

import com.kangkang.service.ProductService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author kangkang
 * @Date: 2023/10/11/13:47
 */
public class Test01 {


    @Test
    public void test01() {

        // 1. 获取核心容器对象
        ApplicationContext context = new ClassPathXmlApplicationContext("handekangapplicationContext.xml");

        // 2. 根据id获取bean对象
        ProductService service = (ProductService) context.getBean("userServiceImpl");
        service.browse();

        // 3.关闭容器（如果不记得关闭容器，最典型的问题就是数据库连接不能释放）
        ((ClassPathXmlApplicationContext) context).close();

    }
}
