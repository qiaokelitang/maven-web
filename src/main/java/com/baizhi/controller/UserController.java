package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 * Created by Administrator on 2018/7/1.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService us;
    @RequestMapping("/regist")
    public String  regist(){
        us.addUser(new User(1,"lisi"));
        return "redirect:/index";
    }
    @RequestMapping("/login")
    public void  login(){
        System.out.println("这是分支!");
    }
}
