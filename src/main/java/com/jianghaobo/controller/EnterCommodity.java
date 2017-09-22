package com.jianghaobo.controller;

import com.jianghaobo.User.Commodity;
import com.jianghaobo.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EnterCommodity {
    @Autowired
    CommodityService commodityService;
    @RequestMapping("/enteringCommodity")
    public String commodityResult(Commodity commodity){
        System.out.println("商品信息"+commodity);
        commodityService.InsertComodity(commodity);
        return "success";
    }
}
