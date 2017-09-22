package com.jianghaobo.dao;

import com.jianghaobo.User.LoginUser;
import com.jianghaobo.User.MerchantUser;
import com.jianghaobo.User.ModifyUser;
import com.jianghaobo.User.RegistUser;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.reflect.generics.tree.VoidDescriptor;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by Administrator on 2017/9/4.
 */
@Service
public class DbDriver {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/mall";
    static final String USER = "test";
    static final String PASS = "root";
    Connection conn = null;
    PreparedStatement stmt = null;

    LoginUser loginUser;

    MerchantUser merchantUser;

    static {
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    //查询
    public LoginUser query(String username) throws SQLException {
        conn = DriverManager.getConnection(DB_URL,USER,PASS);
        stmt = conn.prepareStatement("select * from malluser where username = ?");

        String newUsername = username;
        stmt.setString(1,newUsername);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()){
            String name = rs.getString("username");
            String word = rs.getString("password");
            loginUser.setUsername(name);
            loginUser.setPassword(word);
            rs.close();
            stmt.close();
            conn.close();
            return loginUser;
        }
        rs.close();
        stmt.close();
        conn.close();
        System.out.println("数据库中没有该名称");
        return null;
    }
    //增加数据到数据库
    public int insert(RegistUser user) throws SQLException {
        conn = DriverManager.getConnection(DB_URL,USER,PASS);
        stmt = conn.prepareStatement("insert into malluser (username ,password) values (?,?)");
        String username = user.getUsername();
        String password = user.getPassword();
        stmt.setString(1,username);
        stmt.setString(2,password);
        int result = stmt.executeUpdate();
        stmt.close();
        conn.close();
        System.out.println("插入表的函数打印结果为"+ result);
        return result;
    }
    public int update(ModifyUser user) throws SQLException {
        String username = user.getUsername();
        String newpassword = user.getNewpassword();
        conn = DriverManager.getConnection(DB_URL,USER,PASS);
        stmt = conn.prepareStatement("update malluser set password=? where username = ?");
        stmt.setString(1,newpassword);
        stmt.setString(2,username);
        int result = stmt.executeUpdate();//查询是否成功
        stmt.close();
        conn.close();
        System.out.println("修改表的函数打印结果为"+result+"   user是" + user);

        return result;

    }
    public ArrayList showMerchant() throws SQLException {
        conn = DriverManager.getConnection(DB_URL,USER,PASS);
        stmt = conn.prepareStatement("select * from shangjia");
        ResultSet rs = stmt.executeQuery();
        ArrayList arrayList =new ArrayList();
        //取出所有商家
        while (rs.next()){
            String username = rs.getString("username");
            System.out.println(username);
            arrayList.add(username);

        }
        return arrayList;
    }
}
