package com.example.demo.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.User;

@RestController
@RequestMapping("/user")
public class DemoController {

    @Autowired
    private IUserService userServiceImpl;

    @GetMapping("/test")
    public Page<User> test() {
        return userServiceImpl.selectPage(new Page<User>(0, 12));
    }
}
