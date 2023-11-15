package com.test;

import com.ssm.dao.ChenXuanHeDAO;
import com.ssm.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ablaze
 * @Date: 2023/11/14/16:54
 */
public class TestChenXuanHeJdbcTemplate {

    @Test
    public void updateTest() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ChenXuanHeDAO chenXuanHeDAO = (ChenXuanHeDAO) ctx.getBean("chenxuanheDao");
        User user = new User();
        user.setId(3);
        user.setUserName("陈煊赫");
        user.setPassword("2031030176");
        int result = 0;

        try {
            result = chenXuanHeDAO.update(user);
            if (result > 0) {
                System.out.println("修改了" + result + "条数据");
            } else {
                System.out.println("失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
