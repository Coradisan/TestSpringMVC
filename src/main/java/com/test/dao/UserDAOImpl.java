package com.test.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Admin on 2017/8/4 0004.
 */
@Component
public class UserDAOImpl {

    @Autowired
    private JdbcTemplate template;

    public JdbcTemplate getTemplate() {
        return template;
    }

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public List getList() {
        return template.queryForList("SELECT * FROM user");
    }


//    public static void main(String[] args) {
//        JdbcTemplate template = new UserDAOImpl().getTemplate();
//        System.out.println(template);
//        template.queryForList("SELECT * FROM user");
//    }
}
