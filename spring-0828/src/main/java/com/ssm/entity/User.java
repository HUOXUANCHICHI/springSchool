package com.ssm.entity;

import lombok.Data;

/**
 * @author 韩德康~
 * @version 1.0
 * @time 2023/09/11/8:25
 */
@Data
public class User {
    private String userID;
    private String username;
    private String password;

    public User() {
    }

    public User(String userID, String username, String password) {
        this.userID = userID;
        this.username = username;
        this.password = password;
    }

    public User(String userID, String password) {
        this.userID = userID;
        this.password = password;
    }

}
