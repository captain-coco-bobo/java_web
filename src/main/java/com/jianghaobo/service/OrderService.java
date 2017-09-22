package com.jianghaobo.service;

import com.jianghaobo.User.OrderDomin;
import com.jianghaobo.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    OrderDao orderDao;
    public void insertOrder(OrderDomin orderDomin){
        orderDao.insertOrder(orderDomin);
    }
}
