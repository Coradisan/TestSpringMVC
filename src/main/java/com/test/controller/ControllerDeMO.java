package com.test.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@org.springframework.stereotype.Controller
public class ControllerDeMO {
    @RequestMapping("/view")
    public ModelAndView handleRequest(@RequestParam String id) throws Exception {

        ModelAndView mv = new ModelAndView();
        mv.addObject("username", "123456");
        mv.addObject("id", id);
        mv.setViewName("hello");
        return mv;
    }
}
