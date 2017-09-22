package com.jianghaobo.controller;

import com.jianghaobo.User.ModifyUser;
import com.jianghaobo.dao.DbDriver;
import com.jianghaobo.service.RegistSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLException;

@Controller
public class ModifyUserController {

    @Autowired
    RegistSevice registSevice;
    @RequestMapping("ModifyUserController")
    public String ModifyResult(ModifyUser user) throws SQLException {
        String usname = user.getUsername();
        String newpassword = user.getNewpassword();
        String renewpassword = user.getRenewpassword();
        if (registSevice.getByUsername(usname)!= null && newpassword.equals(renewpassword)){
               registSevice.update(user);
                    return "modifysuccess";

        }else {
            return "failure";
        }
    }
}
