package com.baizhi.service;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by Administrator on 2018/7/1.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService{
    @Resource
    private UserDao ud;
    @Override
    public void addUser(User u) {
        ud.insert(u);
    }
}
