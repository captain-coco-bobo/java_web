package com.jianghaobo.controller;

import com.jianghaobo.User.MerchantUser;
import com.jianghaobo.dao.DbDriver;
import com.jianghaobo.service.SalerSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/9/6.
 */
@Controller
public class ShowMerchantController {
    @Autowired
    SalerSevice salerSevice;
    @RequestMapping("/showMerchant")
    public String merchantSet(HttpServletRequest request) throws SQLException {
        System.out.println("测试环境");
       List merchants = salerSevice.getAllSaler();

        request.setAttribute("merchantName", merchants);
        System.out.println("商家名都有"+merchants);
        return "MerchantName";
    }
}
