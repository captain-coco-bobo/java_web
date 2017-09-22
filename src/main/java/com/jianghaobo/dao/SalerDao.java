package com.jianghaobo.dao;

import com.jianghaobo.User.MerchantUser;
import com.jianghaobo.User.ModifyUser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SalerDao {
    @Select("select * from shangjia")
    public List<MerchantUser> getAll();
    @Select("select * from shangjia where id = #{id}")
    public MerchantUser getById(@Param("id") long id);
}
