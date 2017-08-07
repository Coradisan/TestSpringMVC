package com.test.testService;

import com.test.entity.User;
import com.test.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by Aaron on 2017/8/7 0007.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mvc.xml", "classpath:spring-context.xml"})
//@EnableAutoConfiguration
public class TestService {

    @Autowired
    private UserService userService;

    @Test
    public void testUserService() {
        System.out.println(userService);
        List<User> users = userService.getUserList();
        for (User user : users) {
            System.out.println(user);
        }
    }

}
