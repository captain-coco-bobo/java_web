package com.jianghaobo.dao;

import com.jianghaobo.User.Commodity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface CommodityDao {
    @Select("select * from commodity")
    public List<CommodityDao> getAllCommodity();
    @Insert("insert into commodity(username,description,inventory,merchantid,picture) values(#{username},#{description},#{inventory},#{merchantid},#{picture})")
    public void insertCommodity(Commodity commodity);
    @Select("select * from commodity where merchantid =#{id}")
    public Commodity getByMerchantId(@Param("id") String id);
    @Update("update commodity set inventory=#{inventory} where id = #{id}")
    public  void  update(@Param("inventory")String inventory,@Param("id") long id);

}
