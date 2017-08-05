package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class TestController {
//    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
//
//    }

    //    @RequestMapping("/req")
    public String doRequest() {
        System.out.println("req");
        return "hello";
    }
}
