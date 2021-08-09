package com.example.test.dao;

import com.example.test.bean.userBean;

public interface  userDao {
    userBean getInfo(String name, String password);
    userBean selUser(int id);
    void setUser(String name, String password);
}
