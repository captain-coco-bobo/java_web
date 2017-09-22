package com.jianghaobo.User;

import org.springframework.stereotype.Controller;


public class ModifyUser {
    private  String username;

    private  String newpassword;

    private  String renewpassword;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }



    public String getNewpassword() {
        return newpassword;
    }

    public void setNewpassword(String newpassword) {
        this.newpassword = newpassword;
    }

    public String getRenewpassword() {
        return renewpassword;
    }

    public void setRenewpassword(String renewpassword) {
        this.renewpassword = renewpassword;
    }

    @Override
    public String toString() {
        return "ModifyUser{" +
                "username='" + username + '\'' +
                ", newpassword='" + newpassword + '\'' +
                ", renewpassword='" + renewpassword + '\'' +
                '}';
    }
}
