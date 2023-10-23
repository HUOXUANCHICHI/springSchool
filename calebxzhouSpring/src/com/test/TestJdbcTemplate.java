package com.test;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestJdbcTemplate {


    @Test
    public void test01() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");
        String sql = "drop table userT";
        try {
            jdbcTemplate.execute(sql);
            System.out.println("drop table success");
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test033() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");
        String sql = "create table userT("
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
}
