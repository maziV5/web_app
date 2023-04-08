package com.maziv5.domain;
/*
 * @author maziV5
 * @version 1.0
 */


import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class User {
    private Integer user_id;
    private String user_name;
    private String password;
    private String name;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date regtime = new Date();
    private String user_gender;
    private String user_phone;
    private String user_qq;
    private String user_email;
    private String user_address;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date lasttime;
    private String checkCode;

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", regtime=" + regtime +
                ", user_gender='" + user_gender + '\'' +
                ", user_phone='" + user_phone + '\'' +
                ", user_qq='" + user_qq + '\'' +
                ", user_email='" + user_email + '\'' +
                ", user_address='" + user_address + '\'' +
                ", lasttime=" + lasttime +
                ", checkCode='" + checkCode + '\'' +
                '}';
    }

    public String getCheckCode() {
        return checkCode;
    }

    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getRegtime() {
        return regtime;
    }

    public void setRegtime(Date regtime) {
        this.regtime = regtime;
    }

    public String getUser_gender() {
        return user_gender;
    }

    public void setUser_gender(String user_gender) {
        this.user_gender = user_gender;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getUser_qq() {
        return user_qq;
    }

    public void setUser_qq(String user_qq) {
        this.user_qq = user_qq;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_address() {
        return user_address;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }

    public Date getLasttime() {
        return lasttime;
    }

    public void setLasttime(Date lasttime) {
        this.lasttime = lasttime;
    }
}
