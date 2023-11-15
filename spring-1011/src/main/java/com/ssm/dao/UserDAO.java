package com.ssm.dao;

import com.ssm.entity.User;

import java.util.List;

public interface UserDAO {
    boolean login(String loginName, String loginPwd);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);

    User findUserById(int id);

    List<User> findAllUser();
}
