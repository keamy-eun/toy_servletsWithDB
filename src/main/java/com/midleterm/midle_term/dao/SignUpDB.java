package com.midleterm.midle_term.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;


public class SignUpDB {
    public void setUserData(HashMap<String,Object> userData) throws SQLException{

        // DB연결
        Commons commons = new Commons();
        Statement statement = commons.getStatement();

        HashMap<String,Object> userDataWithQuery = new HashMap<>();
        
        if (userData.get("NAME")!= null){
            userDataWithQuery.put("USER_UID", (String)userData.get("USER_UID"));
            userDataWithQuery.put("NAME", (String)userData.get("NAME"));
            userDataWithQuery.put("ID", (String)userData.get("ID"));
            userDataWithQuery.put("PASSWORD", (String)userData.get("PASSWORD"));
            userDataWithQuery.put("PHONE_NUMBER", (String)userData.get("PHONE_NUMBER"));
            userDataWithQuery.put("BIRTHDAY", (String)userData.get("BIRTHDAY"));
            userDataWithQuery.put("EMAIL", (String)userData.get("EMAIL"));
            userDataWithQuery.put("SMS_AD", (String)userData.get("SMS_AD"));
            userDataWithQuery.put("EMAIL_AD", (String)userData.get("EMAIL_AD"));
    
            String query = "INSERT INTO USERDATA (USER_UID, NAME, ID, PASSWORD, PHONE_NUMBER, BIRTHDAY, EMAIL, SMS_AD, EMAIL_AD) VALUES ('"+userDataWithQuery.get("USER_UID")+"', '"+userDataWithQuery.get("NAME")+"', '"+userDataWithQuery.get("ID")+"', '"+userDataWithQuery.get("PASSWORD")+"', '"+userDataWithQuery.get("PHONE_NUMBER")+"', '"+userDataWithQuery.get("BIRTHDAY")+"', '"+userDataWithQuery.get("EMAIL")+"', "+userDataWithQuery.get("SMS_AD")+", "+userDataWithQuery.get("EMAIL_AD")+");";
            statement.executeUpdate(query);
        }
    }
    public int getUserQuantity() throws SQLException{
        Commons commons = new Commons();
        Statement statement = commons.getStatement();
        String query = "select count(*) from userdata;";
        String userQuantity = "";
        
        ResultSet resultSet = statement.executeQuery(query);
        while(resultSet.next()){
            userQuantity = resultSet.getString("count(*)");
        }
        return Integer.parseInt(userQuantity);
    }

}
