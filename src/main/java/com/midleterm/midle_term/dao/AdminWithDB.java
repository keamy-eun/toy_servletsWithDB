package com.midleterm.midle_term.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

public class AdminWithDB {
    public ArrayList<HashMap<String, Object>> getUserData() throws SQLException{

        Commons commons = new Commons();
        Statement statement = commons.getStatement();
        
        String query1 = "SELECT * FROM USERDATA;";
                        
        ArrayList<HashMap<String, Object>> user_data_list = new ArrayList<>();
        
        ResultSet resultSet = statement.executeQuery(query1);
        while(resultSet.next()){
            HashMap<String, Object> user_data = new HashMap<>();
            user_data.put("USER_UID",resultSet.getString("USER_UID"));
            user_data.put("NAME",resultSet.getString("NAME"));
            user_data.put("ID",resultSet.getString("ID"));
            user_data.put("PASSWORD",resultSet.getString("PASSWORD"));
            user_data.put("PHONE_NUMBER",resultSet.getString("PHONE_NUMBER"));
            user_data.put("BIRTHDAY",resultSet.getString("BIRTHDAY"));
            user_data.put("EMAIL",resultSet.getString("EMAIL"));
            user_data.put("SMS_AD",resultSet.getBoolean("SMS_AD"));
            user_data.put("EMAIL_AD",resultSet.getBoolean("EMAIL_AD"));
            user_data_list.add(user_data);
        }
        
        resultSet.close();
        statement.close();
        return user_data_list;
    }
}
