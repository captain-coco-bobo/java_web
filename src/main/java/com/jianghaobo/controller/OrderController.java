package com.jianghaobo.controller;

import com.jianghaobo.User.Commodity;
import com.jianghaobo.User.OrderDomin;
import com.jianghaobo.service.CommodityService;
import com.jianghaobo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class OrderController {
    @Autowired
    CommodityService commodityService;
    @Autowired
    OrderService orderService;
    @RequestMapping("/oreder")
    public String resultOrder(OrderDomin orderDomin, HttpServletRequest req) throws ParseException {
        HttpSession session = req.getSession();
        Commodity commodity = (Commodity) session.getAttribute("commodity");
        long id = (Long) session.getAttribute("logid");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String time = dateFormat.format(new Date());
        Date date = dateFormat.parse(time);
        orderDomin.setUserid(String.valueOf(id));
        orderDomin.setMerchantid(commodity.getMerchantid());
        orderDomin.setCommodityid(String .valueOf(commodity.getId()));
        orderDomin.setCtime(date.getTime());
        Long inventory = Long.parseLong(commodity.getInventory());
        Long buys = Long.parseLong(orderDomin.getCommoditynumber());
        String residual = String.valueOf(inventory-buys);
        commodityService.update(residual,commodity.getId());
        System.out.println(orderDomin+""+commodity+id+"------------"+residual);
        System.out.println(date.getTime());
        orderService.insertOrder(orderDomin);
        return null;
    }
}
