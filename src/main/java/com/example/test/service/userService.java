package com.example.test.service;

import com.example.test.bean.userBean;
import org.springframework.stereotype.Service;

public interface userService {
    userBean loginIn(String name, String password);
    userBean selUser(int id);
    void setUser(String name, String password);
}
