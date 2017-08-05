package com.test.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * Created by Admin on 2017/8/3 0003.
 */
public class BaseController {

    @ModelAttribute
    public void test() {
        System.out.println("----!!!!----test----!!!!----");
    }

    @ModelAttribute
    public void test1() {
        System.out.println("----!!!!----test1----!!!!----");
    }

    @Value("${web.view.prefix}")
    public void test2(String value, String a) {
        System.out.println(value + "----!!!!----test2----!!!!----" + a);
    }
}
