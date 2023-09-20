package com.ssm.dao;

/**
 * @author 韩德康~
 * @version 1.0
 * @time 2023/09/13/11:00
 */
public interface UserDAO {
    boolean login(String loginName,String loginPwd);
}
