package com.jianghaobo.controller;

import com.jianghaobo.User.RegistUser;
import com.jianghaobo.dao.DbDriver;
import com.jianghaobo.service.RegistSevice;
import javafx.application.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.awt.AppContext;

import java.sql.SQLException;

@Controller
public class RegistUserController {
    @Autowired
    RegistSevice registSevice;

    @RequestMapping("/RegistUserController")
    public String registResult(RegistUser registUser ) throws SQLException {
        System.out.println(registUser);
        String username = registUser.getUsername();
        String password = registUser.getPassword();
        String repassword = registUser.getRepassword();
        if (password.equals(repassword)){
            if (registSevice.getByUsername(username)!=null){
                System.out.println("数据库中有相同的账号");
                return "failure";
            }else {
               registSevice.insertRegist(registUser);
                System.out.println("插入成功");
               return "registsuccess";
            }
        }else {
            return "failure";
        }


    }
}
