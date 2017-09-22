package com.jianghaobo.dao;

import com.jianghaobo.User.OrderDomin;
import org.apache.ibatis.annotations.Insert;

public interface OrderDao {
    @Insert("insert into myorder(userid,merchantid,commodityid,commoditynumber,ctime,price) valuse(#{userid},#{merchantid},#{commodityid},#{commoditynumber},#{ctime},#{price})")
    public  void  insertOrder(OrderDomin orderDomin);

}
