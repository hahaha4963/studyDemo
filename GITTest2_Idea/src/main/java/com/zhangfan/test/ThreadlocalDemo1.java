package com.zhangfan.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ThreadlocalDemo1 {
    private static Connection conn = null;

    public static Connection openConn() {
        if(conn == null){
            try {
                conn = DriverManager.getConnection("url");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return conn;
    }

    public static void closeConn(){
        if (conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
