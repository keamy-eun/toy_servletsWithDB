package com.midleterm.midle_term.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

public class AdminWithDB {
    public ArrayList<HashMap<String, Object>> getUserList() throws SQLException{

        CommonsBasic commonsBasic = new CommonsBasic();
        Connection connection = commonsBasic.getConnection();
        
        String query = "SELECT * FROM USERDATA ;";
        ArrayList<HashMap<String, Object>> userList = new ArrayList<>();
        
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();
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
            userList.add(user_data);
            System.out.println("UserList 실행됨");
        }
        return userList;
    }

    public void insertUser(String USER_UID, String NAME, String ID, String PASSWORD, String PHONE_NUMBER, String BIRTHDAY, String EMAIL, String SMS_AD, String EMAIL_AD) throws SQLException{

        try{
        CommonsBasic commonsBasic = new CommonsBasic();
        Connection connection = commonsBasic.getConnection();
        
        String query = "INSERT INTO USERDATA" + "  (USER_UID, NAME, ID, PASSWORD, PHONE_NUMBER, BIRTHDAY, EMAIL, SMS_AD, EMAIL_AD) VALUES "
        + " (?, ?, ?, ?, ?, ?, ?, ?, ?);";
        Boolean smsBoolean = false;
        Boolean emailBoolean = false;
        if(SMS_AD.equals("true")) smsBoolean = true;
        if(EMAIL_AD.equals("true")) emailBoolean = true;

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, USER_UID);
        preparedStatement.setString(2, NAME);
        preparedStatement.setString(3, ID);
        preparedStatement.setString(4, PASSWORD);
        preparedStatement.setString(5, PHONE_NUMBER);
        preparedStatement.setString(6, BIRTHDAY);
        preparedStatement.setString(7, EMAIL);
        preparedStatement.setBoolean(8, smsBoolean);
        preparedStatement.setBoolean(9, emailBoolean);
        preparedStatement.executeUpdate();
        System.out.println("InsertUser 실행됨");
        } catch (SQLException e) {
			e.printStackTrace();
        }
    }

    public void deleteUser(String USER_UID) throws SQLException{

        try{
        CommonsBasic commonsBasic = new CommonsBasic();
        Connection connection = commonsBasic.getConnection();
        
        String query = "DELETE FROM USERDATA WHERE USER_UID = ?;";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, USER_UID);
        preparedStatement.executeUpdate();
        System.out.println("DeleteUser 실행됨");
        } catch (SQLException e) {
			e.printStackTrace();
        }
    }

    public void updateUser(String PHONE_NUMBER, String BIRTHDAY, String EMAIL, String SMS_AD, String EMAIL_AD, String USER_UID) throws SQLException{

        try{
        CommonsBasic commonsBasic = new CommonsBasic();
        Connection connection = commonsBasic.getConnection();
        
        String query = "UPDATE USERDATA SET PHONE_NUMBER = ?, BIRTHDAY = ?, EMAIL = ?, SMS_AD = ?, EMAIL_AD = ? "
        + " WHERE USER_UID = ?";
        Boolean smsBoolean = false;
        Boolean emailBoolean = false;
        if(SMS_AD.equals("true")) smsBoolean = true;
        if(EMAIL_AD.equals("true")) emailBoolean = true;

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, PHONE_NUMBER);
        preparedStatement.setString(2, BIRTHDAY);
        preparedStatement.setString(3, EMAIL);
        preparedStatement.setBoolean(4, smsBoolean);
        preparedStatement.setBoolean(5, emailBoolean);
        preparedStatement.setString(6, USER_UID);
        preparedStatement.executeUpdate();
        System.out.println("UpdateUser 실행됨");
        } catch (SQLException e) {
			e.printStackTrace();
        }
    }

    
    public ArrayList<HashMap> getQues() throws SQLException{
        Commons commons = new Commons();
        Statement statement = commons.getStatement();

        String query = "SELECT * FROM QUESTION_LIST;";  
        ResultSet resultSet = statement.executeQuery(query);

        ArrayList<HashMap> question_list = new ArrayList<>();
        HashMap<String, Object> question = null;

        while(resultSet.next()){
            question = new HashMap<>();
            question.put("QUESTION_UID", resultSet.getString("QUESTION_UID"));
            question.put("QUESTION", resultSet.getString("QUESTION"));
            question.put("ORDERS", resultSet.getString("ORDERS"));

            question_list.add(question);
            // 여기까지 question을 번들로 담아서 question_list에 리스트로 추가
        }

        return question_list;
    }

    public ArrayList<HashMap> getAns() throws SQLException{
        Commons commons = new Commons();
        Statement statement = commons.getStatement();

        String query = "SELECT * FROM ANSWER_LIST;";  
        ResultSet resultSet = statement.executeQuery(query);
        ArrayList<HashMap> answer_list = new ArrayList<>();
        HashMap<String, Object> answer = null;
        
        while(resultSet.next()) {
            answer = new HashMap<>();
            answer.put("ANSWER_UID", resultSet.getString("ANSWER_UID"));
            answer.put("ANSWER", resultSet.getString("ANSWER"));
            answer.put("ORDERS", resultSet.getString("ORDERS"));
            
            answer_list.add(answer);
        }
        
        return answer_list;
    }
}
