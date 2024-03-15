package com.hana.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//update
public class Jdbc4 {
    public static String url = "jdbc:mysql://localhost:3306/shopdb";
    public static String id = "user01";
    public static String pwd = "111111";
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("OK");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver Not Found...");
        }
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, id, pwd);
            System.out.println("접속성공");
        } catch (SQLException e) {
            System.out.println("접속실패");
            e.printStackTrace();
        }
        PreparedStatement pstmt = null;
        String sql = "update db_cust set name = ?, pwq = ? where id = ?";
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "id03");
            pstmt.setString(2, "pw03");
            pstmt.setString(3, "한노아");
            pstmt.executeUpdate();
            System.out.println("Insert Data... ...");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                pstmt.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
