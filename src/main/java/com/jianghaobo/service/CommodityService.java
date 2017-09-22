package com.jianghaobo.service;

import com.jianghaobo.User.Commodity;
import com.jianghaobo.dao.CommodityDao;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommodityService {
    @Autowired
    CommodityDao commodityDao;
    public List<CommodityDao> getAllCommodity(){
        return commodityDao.getAllCommodity();
    }
    public void InsertComodity(Commodity commodity){
        commodityDao.insertCommodity(commodity);
    }
    public Commodity getByMerchantId(String id){
        return (Commodity) commodityDao.getByMerchantId(id);
    }
    public void update(String inventory, long id){
        commodityDao.update(inventory,id);
    }
}
