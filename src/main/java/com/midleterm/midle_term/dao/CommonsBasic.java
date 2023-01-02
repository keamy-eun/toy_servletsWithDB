package com.midleterm.midle_term.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CommonsBasic {
    public Connection getConnection(){
        String url = "jdbc:mysql://localhost:3306/toy_servletsWithDB";
        String user = "root";
        String password = "*khacademy!";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }  
}

