package com.example.test;

import com.example.test.bean.userBean;
import com.example.test.service.userService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestApplicationTests {

    @Autowired
    userService userService;

    @Test
    public void contextLoads() {
        userBean userBean = userService.loginIn("a","a");
//        userBean userBean = userService.selUser(1);
        System.out.println("该用户为：");
        System.out.println(userBean);

//        userService.setUser("b","b");
    }

}
