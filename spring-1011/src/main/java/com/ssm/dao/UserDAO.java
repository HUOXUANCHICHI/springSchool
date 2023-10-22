package com.ssm.dao;

import com.ssm.entity.User;

public interface UserDAO {
    boolean login(String loginName, String loginPwd);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);
}
