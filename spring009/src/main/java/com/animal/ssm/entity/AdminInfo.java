package com.animal.ssm.entity;

/**
 * @author 韩德康~
 * @version 1.0
 * @time 2023/09/06/11:03
 */
public class AdminInfo {
    private int id;
    private String name;
    private String pwd;

    public AdminInfo(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    public AdminInfo() {
    }

    @Override
    public String toString() {
        return "AdminInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
