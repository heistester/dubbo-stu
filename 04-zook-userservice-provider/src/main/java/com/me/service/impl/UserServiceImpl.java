package com.me.service.impl;

import com.me.model.User;
import com.me.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User queryuserById(Integer id) {
        User user=new User();
        user.setName("xiaoming");
        user.setId(id);
        return user;
    }

    @Override
    public Integer queryAllUserCount() {
        return 52;
    }
}
