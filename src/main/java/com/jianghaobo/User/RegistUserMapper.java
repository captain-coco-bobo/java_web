package com.jianghaobo.User;


import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegistUserMapper implements RowMapper<RegistUser>{
        public RegistUser mapRow(ResultSet rs, int roownum) throws SQLException {
            RegistUser registUser = new RegistUser();
            registUser.setUsername(rs.getString("username"));
            registUser.setPassword(rs.getString("password"));
            return registUser;
        }
}
