package com.test.dao;

import com.test.entity.User;

import java.util.List;

/**
 * Created by Admin on 2017/8/4 0004.
 */
public interface UserDao {
    User get(String id);

    List<User> getUserlist();
}
