package com.midleterm.midle_term.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;

import com.midleterm.midle_term.dao.SignUpDB;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/SignUp")
public class SignUpServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HashMap<String,Object> userData = new HashMap<>();
        SignUpDB signUpDB = new SignUpDB();
        String path = "/signUp.jsp";
        
        try {
            userData.put("USER_UID", "U"+Integer.toString(signUpDB.getUserQuantity()+1));
            userData.put("NAME", request.getParameter("userName"));
            userData.put("ID", request.getParameter("userID"));
            userData.put("PASSWORD", request.getParameter("userPW"));
            userData.put("PHONE_NUMBER", request.getParameter("userPhoneNumber"));
            userData.put("BIRTHDAY", request.getParameter("birthdayYear")+"-"+request.getParameter("birthdayMonth")+"-"+request.getParameter("birthdayDay"));
            userData.put("EMAIL", request.getParameter("emailAddress")+"@"+request.getParameter("domain"));
            
            // sms receive option (Trans bool type)
            if ( "on".equals((String) request.getParameter("smsAd"))){
                userData.put("SMS_AD", "true");
            } else{
                userData.put("SMS_AD", "false");
            }
            if ( "on".equals((String) request.getParameter("emailAd"))){
                userData.put("EMAIL_AD", "true");
            } else{
                userData.put("EMAIL_AD", "false");
            }
            
            // whenever User finish signUP, insert userDate to DB
            signUpDB.setUserData(userData);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
        if(request.getParameter("userName") != null){
            path = "/Logout";
        }
        // http://localhost:8080/SignUp?userName=chan&userID=abc123&userPW=1q2w3e4r&userPWcheck=1q2w3e4r&
        // birthdayYear=1994&birthdayMonth=8&birthdayDay=17&emailAddress=abc123&domain=naver.com&
        // userPhoneNumber=010-2324-8746&smsAd=on

        RequestDispatcher requestDispatcher = request.getRequestDispatcher(path);
        requestDispatcher.forward(request, response);
    }
    
    // POST
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
        
    }
}
