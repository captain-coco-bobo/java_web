package com.jianghaobo.service;

import com.jianghaobo.User.ModifyUser;
import com.jianghaobo.User.RegistUser;
import com.jianghaobo.dao.RegistDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistSevice {
    @Autowired
    RegistDao registDao;

    public RegistUser getByUsername(String username) {
        return registDao.getByUsername(username);
    }
    public void insertRegist(RegistUser registUser){
        registDao.Insert(registUser);
    }
    public void update(ModifyUser modifyUser){
        registDao.update(modifyUser);
    }
}
