package com.jianghaobo.controller;

import com.jianghaobo.User.Commodity;
import com.jianghaobo.User.MerchantUser;
import com.jianghaobo.dao.CommodityDao;
import com.jianghaobo.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@Controller
public class CommodityController {
    @Autowired
    CommodityService commodityService;
    @RequestMapping("/CommodityController")
    public String resultCommodity(Long merchantUserId, HttpServletRequest request){
        String id = String.valueOf(merchantUserId);
        Commodity commodity = commodityService.getByMerchantId(id);
        if (commodity!= null) {
            request.setAttribute("commodity", commodity);
            HttpSession session = request.getSession();
            session.setAttribute("commodity",commodity);
            System.out.println("------------------------" + commodity);
            return "showcommodity";
        }
        return "failure";
    }
}
