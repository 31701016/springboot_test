package com.example.test.serviceImpl;

import com.example.test.bean.userBean;
import com.example.test.dao.userDao;
import com.example.test.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl implements userService {
    //将DAO注入Service层
    @Autowired
    private userDao userDao;

    @Override
    public userBean loginIn(String name, String password){
        return userDao.getInfo(name,password);
    }

    @Override
    public userBean selUser(int id) {
        return userDao.selUser(id);
    }

    @Override
    public void setUser(String name, String password) {
        userDao.setUser(name,password);
    }
}
