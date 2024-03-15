package com.hana.jdbc;

import java.sql.*;

public class Jdbc2 {
    public static String url = "jdbc:mysql://localhost:3306/shopdb";
    public static String id = "user01";
    public static String pwd = "111111";
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        String sql = "SELECT * FROM db_cust";
        ResultSet rset = null;


        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("OK");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver Not Found...");
        }
        try {
            conn = DriverManager.getConnection(url, id, pwd);
            System.out.println("접속성공");
        } catch (SQLException e) {
            System.out.println("접속실패");
            e.printStackTrace();
        }
        try {
            pstmt = conn.prepareStatement(sql);
            rset = pstmt.executeQuery();
            while (rset.next()){
                String custId = rset.getString("id");
                String pwd = rset.getString("pwd");
                String custName = rset.getString("name");
                System.out.println(custId + " " + pwd + " " + custName);
            }
            System.out.println("Insert Data... ...");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                rset.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
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
