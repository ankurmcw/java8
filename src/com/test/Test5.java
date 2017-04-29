package com.test;

import java.sql.*;

/**
 * Created by amarchattiwar on 9/1/16.
 */
public class Test5 {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/realdoc_5772256977a5640dc8cc9b79";
    static final String USER = "root";
    static final String PASS = "admin";

    public static void main(String[] args) {
        String query = "select TEMPLATE_ID, TEMPLATE_NAME from template";
        try (
                Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(query);
        )
        {
            while(rs.next())
            {
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}
