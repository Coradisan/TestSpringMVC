package com.test.hehe;

import org.aspectj.apache.bcel.util.ClassPath;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Aaron on 2017/8/7 0007.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml"})
public class TestOne {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    public void main() {
        System.out.println(jdbcTemplate);
        jdbcTemplate.queryForList("SELECT * FROM user").stream().forEach(System.out::println);
    }
}
