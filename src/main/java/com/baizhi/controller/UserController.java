package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;


/**
 * Created by Administrator on 2018/7/1.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService us;
    @RequestMapping("/regist")
    public String  regist(){
        us.addUser(new User(1,"lisi"));
        return "redirect:/index";
    }
}
