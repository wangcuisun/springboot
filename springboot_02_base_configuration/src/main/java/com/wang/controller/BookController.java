package com.wang.controller;

import com.wang.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Rest模式
@RestController
@RequestMapping("/books")
public class BookController {

    @Value("${country}")
    private String country1;

    @Value("${user.name}")
    private String userName;

    @Value("${likes[2]}")
    private String likes;

    @Autowired
    private User user;

    @GetMapping
    public String getById() {
        System.out.println(country1);
        System.out.println(userName);
        System.out.println(likes);
        System.out.println(user);
        return "";
    }
}
