package com.midleterm.midle_term.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Commons {
    public Statement getStatement(){
        String url = "jdbc:mysql://localhost:3306/toy_servletsWithDB";
        String user = "root";
        String password = "*khacademy!";
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return statement;
    }  
}

