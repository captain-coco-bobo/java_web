package com.jianghaobo.controller;

import com.jianghaobo.User.RegistUser;
import com.jianghaobo.dao.TestDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("appcation.xml");
        TestDao testDao = (TestDao) context.getBean("TestDao");
        List<RegistUser> registUsers = testDao.showUser();
        System.out.println(registUsers);

    }
}
