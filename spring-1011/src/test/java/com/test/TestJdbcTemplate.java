package com.test;


import com.ssm.dao.UserDAO;
import com.ssm.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class TestJdbcTemplate {


    @Test
    public void test01() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");
        String sql = "create table scott.userT("
                + "id int primary key auto_increment,"
                + "userName varchar(20),"
                + "password varchar(32)"
                + ")";
        try {
            jdbcTemplate.execute(sql);
            System.out.println("create table success");
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void test02() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");
        String sql = "drop table scott.userT";
        try {
            jdbcTemplate.execute(sql);
            System.out.println("drop table success");
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void addUserTest1() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDAO userDao = (UserDAO) ctx.getBean("userDao");
        User user = new User();
        user.setUserName("admin");
        user.setPassword("123");
        int result = 0;
        try {
            result = userDao.addUser(user);
            if (result > 0) {
                System.out.println("插入了" + result + "条数据");
            } else {
                System.out.println("失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void updateUserTest() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDAO userDAO = (UserDAO) ctx.getBean("userDao");
        User user = new User();
        user.setId(2);
        user.setUserName("admin");
        user.setPassword("123");
        int result = 0;

        try {
            result = userDAO.updateUser(user);
            if (result > 0) {
                System.out.println("修改了" + result + "条数据");
            } else {
                System.out.println("失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void deleteUserTest() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDAO userDAO = (UserDAO) ctx.getBean("userDao");
        int result = 0;

        try {
            result = userDAO.deleteUser(2);
            if (result > 0) {
                System.out.println("删除了" + result + "条数据");
            } else {
                System.out.println("失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void findUserByIdTest0() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDAO userDAO = (UserDAO) ctx.getBean("userDao");

        User user = userDAO.findUserById(1);
        System.out.println(user);

    }

    @Test
    public void findAllUserTest0() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDAO userDAO = (UserDAO) ctx.getBean("userDao");

        List<User> user = userDAO.findAllUser();
        user.forEach(System.out::println);

    }


}
