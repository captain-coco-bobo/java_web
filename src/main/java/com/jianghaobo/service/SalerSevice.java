package com.jianghaobo.service;

import com.jianghaobo.User.MerchantUser;
import com.jianghaobo.User.ModifyUser;
import com.jianghaobo.dao.SalerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalerSevice {
    @Autowired
    private SalerDao salerDao;
    public List<MerchantUser> getAllSaler(){
        return salerDao.getAll();
    }
    public MerchantUser getSalerById(long id){
        return salerDao.getById(id);
    }
}
