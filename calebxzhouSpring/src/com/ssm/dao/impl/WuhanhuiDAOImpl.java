package com.ssm.dao.impl;

import com.ssm.dao.WuhanhuiDAO;
import com.ssm.entity.Wuhanhui;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WuhanhuiDAOImpl implements WuhanhuiDAO {


    public boolean login(String loginName, String loginPwd) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Wuhanhui wuhanhui = (Wuhanhui) ctx.getBean("wuhanhui");

        return loginName.equals(wuhanhui.getName()) && loginPwd.equals(wuhanhui.getPwd());
    }
}
