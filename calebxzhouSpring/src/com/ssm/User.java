package com.ssm;

public class User {
    private String userID;
    private String userName;

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "user [userID=" + userID + ", userName=" + userName + "]";
    }

}
