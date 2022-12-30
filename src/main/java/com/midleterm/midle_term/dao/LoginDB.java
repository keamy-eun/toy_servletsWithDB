package com.midleterm.midle_term.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;


public class LoginDB {
    public HashMap<String,Object> getUserIDPW(String userID) throws SQLException{

        HashMap<String,Object> DBStoredIDPW = new HashMap<>();
        String query = "select NAME, ID, PASSWORD from userdata where ID ='" +userID+ "';";
        
        Commons commons = new Commons();
        Statement statement = commons.getStatement();
        ResultSet resultSet = statement.executeQuery(query);
        
        while(resultSet.next()){
            DBStoredIDPW.put("NAME",  resultSet.getString("NAME"));
            DBStoredIDPW.put("ID", resultSet.getString("ID"));
            DBStoredIDPW.put("PASSWORD",  resultSet.getString("PASSWORD"));
        }

        return DBStoredIDPW;
    }
}
