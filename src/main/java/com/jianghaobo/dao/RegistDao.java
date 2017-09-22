package com.jianghaobo.dao;

import com.jianghaobo.User.LoginUser;
import com.jianghaobo.User.ModifyUser;
import com.jianghaobo.User.RegistUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface RegistDao {
    @Select("select * from malluser where username = #{username}")
    public RegistUser getByUsername(@Param("username") String username);
    @Insert("insert into malluser(username, password) values (#{username},#{password})")
    public void Insert(RegistUser registUser);
    @Update("update malluser set password=#{newpassword} where username = #{username}")
    public void update(ModifyUser modifyUser);
}
