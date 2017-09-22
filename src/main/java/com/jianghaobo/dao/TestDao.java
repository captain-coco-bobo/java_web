package com.jianghaobo.dao;

import com.jianghaobo.User.RegistUser;
import com.jianghaobo.User.RegistUserMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class TestDao {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    public void setDataSource(DataSource ds){
            this.dataSource = ds;
            this.jdbcTemplate = new JdbcTemplate(dataSource);

    }
    public List<RegistUser> showUser(){
        List<RegistUser> registUsers = null;
        String sql = "select * from malluser";
        registUsers = jdbcTemplate.query(sql,new RegistUserMapper());
        return registUsers;
    }
    public void addUser(RegistUser registUser){

    }
}
