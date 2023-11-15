package com.ssm.dao;

import com.ssm.entity.User;

import java.util.List;

public interface ChenXuanHeDAO {
    boolean login(String loginName, String loginPwd);

    int addUser(User user);

    int update(User user);

    int deleteUser(int id);

    User findUserById(int id);

    List<User> findAllUser();
}
