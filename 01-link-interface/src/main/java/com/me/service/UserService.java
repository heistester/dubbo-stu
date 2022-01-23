package com.me.service;

import com.me.model.User;

public interface UserService {
    User queryuserById(Integer id);

    Integer queryAllUserCount();
}
