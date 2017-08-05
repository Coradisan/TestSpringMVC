package com.test.hehe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 */
@Component
public class QueryRunnerCRUDTest {

    @Autowired
    static JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
        System.out.println(jdbcTemplate);
        jdbcTemplate.execute("SELECT * FROM user");
    }
}
