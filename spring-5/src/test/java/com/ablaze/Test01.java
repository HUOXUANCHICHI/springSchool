package com.ablaze;

import com.ablaze.service.ProductService;
import com.ablaze.service.impl.ProductServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * @author ablaze
 * @Date: 2023/10/11/13:47
 */
public class Test01 {


    @Test
    public void test01() {

        // 1. ��ȡ������������
        ApplicationContext context = new ClassPathXmlApplicationContext("chenxuanheapplicationContext.xml");

        // 2. ����id��ȡbean����
        ProductService service = (ProductService) context.getBean("userServiceImpl");
        service.browse();

        // 3.�ر�������������ǵùر�����������͵�����������ݿ����Ӳ����ͷţ�
        ((ClassPathXmlApplicationContext) context).close();

    }

    @Test
    public void test02() {
        ProductService productService = new ProductServiceImpl();
        String encryption = productService.encryption("12345");
        System.out.println(encryption);
    }
}
