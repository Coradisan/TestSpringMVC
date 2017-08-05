package com.test.db;

import java.sql.*;

/**
 *
 */
public class DBUtils {

    private static String USERNAME = "root";
    private static String PASSWORD = "root";
    private static String URL = "jdbc:mysql://localhost:3306/test";
    private static String DRIVER = "com.mysql.jdbc.Driver";


    private static Connection connection = null;

    public static Connection getConnection() {
        try {
//            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }


    // 关闭连接
    public static void closeConnection(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    // 关闭连接
    public static void closeConnection(Connection conn, PreparedStatement preparedStatement, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }

            if (preparedStatement != null) {
                preparedStatement.close();
            }

            if (conn != null) {
                conn.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws Exception {
        Connection conn = DBUtils.getConnection();
        String sql = "select * from user";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString("id"));
            System.out.println(rs.getString("username"));
            System.out.println(rs.getString("password"));
        }
        DBUtils.closeConnection(conn, preparedStatement, rs);
    }
}
