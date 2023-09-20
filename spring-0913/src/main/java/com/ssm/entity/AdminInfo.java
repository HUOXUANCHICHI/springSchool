package com.ssm.entity;

import lombok.Data;

/**
 * @author 韩德康~
 * @version 1.0
 * @time 2023/09/06/11:03
 */
@Data
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

    public AdminInfo(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "AdminInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }

    public void print() {
        System.out.print(id + "--" + name + "--" + pwd);

    }
}
