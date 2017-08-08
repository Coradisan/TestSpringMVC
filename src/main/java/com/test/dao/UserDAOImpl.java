package com.test.dao;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.test.db.DBUtils;
import com.test.entity.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.*;
import org.junit.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * Created by Admin on 2017/8/4 0004.
 */
@Component
public class UserDAOImpl {

    @Autowired
    private JdbcTemplate template;
    private Connection connection = null;

//    public JdbcTemplate getTemplate() {
//        return template;
//
//    public void setTemplate(JdbcTemplate template) {
//        this.template = template;
//    }

    //    }
    public List getList() {
        return template.queryForList("SELECT * FROM user");
    }


//    public static void main(String[] args) {
//        JdbcTemplate template = new UserDAOImpl().getTemplate();
//        System.out.println(template);
//        template.queryForList("SELECT * FROM user");
//    }


    @Test
    public void getListT() {

        QueryRunner run = new QueryRunner();
        connection = DBUtils.getConnection();
        ResultSetHandler<List<User>> h = new BeanListHandler<>(User.class);
        try {
//            Map<String, Object> resultMap = run.query(connection, "select * from user", new MapHandler());
            List<User> arr = run.query(connection, "select * from user", h);

            System.out.println(arr.toString());

        } catch (SQLException sqle) {
            // Handle it
        }
    }


}
