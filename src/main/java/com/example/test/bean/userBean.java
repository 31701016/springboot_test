package com.example.test.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//new
@Data
@AllArgsConstructor
@NoArgsConstructor
public class userBean {
    private int id;
    private String name;
    private String password;

}
