package com.test.service;

import com.test.dao.UserDAOImpl;
import com.test.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public class UserService {

    @Autowired
    private UserDAOImpl userDAO;


    public void save() {
        System.out.println("save it");
    }


    public List<User> getUserList() {
        return userDAO.getList();
    }
}
