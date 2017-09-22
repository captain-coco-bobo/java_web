package com.jianghaobo.controller;

import com.jianghaobo.User.LoginUser;
import com.jianghaobo.User.ModifyUser;
import com.jianghaobo.User.RegistUser;
import com.jianghaobo.dao.DbDriver;
import com.jianghaobo.service.RegistSevice;
import com.jianghaobo.service.SalerSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.util.List;

@Controller
public class LoginUserController {


    private RegistUser registUser;
    @Autowired
    private RegistSevice registSevice;

    @RequestMapping("/loginUserController")
    public String loginResult(LoginUser user , HttpServletRequest req, HttpServletResponse resp) throws SQLException {


        String username = user.getUsername();
       registUser = registSevice.getByUsername(username);
       //将用户登录id放入session
       long id = registUser.getId();
        HttpSession session = req.getSession();
        session.setAttribute("logid",id);
        if (registUser != null && registUser.getPassword().equals(user.getPassword())){
            // 获取存放在session中的验证码
            String code = (String) req.getSession().getAttribute("code");
            // 获取页面提交的验证码
            String inputCode = req.getParameter("code");
            if(code.toLowerCase().equals(inputCode.toLowerCase())) { // 验证码不区分大小写
                // 验证成功，跳转到成功页面
                return "LoginSuccess";
            } else { // 验证失败
                return "failure";
            }
        }else {
            System.out.println(user);
            return "failure";
        }

    }
}
