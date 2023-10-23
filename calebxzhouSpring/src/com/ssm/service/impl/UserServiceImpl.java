package com.ssm.service.impl;

import com.ssm.dao.UserDAO;
import com.ssm.dao.WuhanhuiDAO;
import com.ssm.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    //成员变量

	private UserDAO userDAO;
	private WuhanhuiDAO wuhanhuiDAO;
	//成员变量的setter方法

	/*
	 * public WuhanhuiDAO wuhanhuiDAO; public void setWuhanhuiDAO(WuhanhuiDAO
	 * wuhanhuiDAO) { this.wuhanhuiDAO = wuhanhuiDAO; }
	 */
	@Override
	public boolean login(String loginName, String loginPwd) {
		
		//调用数据访问层的login()方法
		return userDAO.login(loginName, loginPwd);
//		return wuhanhuiDAO.login(loginName, loginPwd);
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public WuhanhuiDAO getWuhanhuiDAO() {
		return wuhanhuiDAO;
	}

	public void setWuhanhuiDAO(WuhanhuiDAO wuhanhuiDAO) {
		this.wuhanhuiDAO = wuhanhuiDAO;
	}
}
