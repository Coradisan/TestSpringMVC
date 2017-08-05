package com.test.controller;

import com.test.entity.User;
import com.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Admin on 2017/8/1 0001.
 */
@Controller
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/saveUser{userId}", method = RequestMethod.GET)
    public String saveUser(User user, Model model, @PathVariable(value = "userId") String userId) {

        System.out.println(user);
        userService.save();
        model.addAttribute("User", user);
        return "hello";
    }


    @ResponseBody
    @RequestMapping(value = "/json")
    public Map saveUser(User user, Model model) {
        System.out.println(user);
        userService.save();
        model.addAttribute("User", user);
        Map map = new HashMap();
        map.put("username", "liujiachen");
        map.put("password", "1234567");
        map.put("age", "17");
        return map;
    }


    @RequestMapping(value = "/json1")
    public String saveUser(@RequestBody @ModelAttribute User user) {
        System.out.println(user);
        userService.save();
        Map map = new HashMap();
        map.put("username", "liujiachen");
        map.put("password", "1234567");
        map.put("age", "17");
        return map.toString();
    }

    @RequestMapping(value = "/getUsers")
    public String getUsers() {
        System.out.println(userService.getUserList());
        return "";
    }

}
