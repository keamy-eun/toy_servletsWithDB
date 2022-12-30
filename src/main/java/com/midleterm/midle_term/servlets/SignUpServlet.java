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

        // uid는 하드코딩. db에서 받아와서 추가하는것은 나중에 구현
        Object objUID = "U6";
        // sms수신여부도 우선 하드코딩
        Object objSmsAD = "true";
        Object objEmailAD = "false";
        
        
        userData.put("USER_UID", objUID);
        userData.put("NAME", request.getParameter("userName"));
        userData.put("ID", request.getParameter("userID"));
        userData.put("PASSWORD", request.getParameter("userPW"));
        userData.put("PHONE_NUMBER", request.getParameter("userPhoneNumber"));
        userData.put("BIRTHDAY", request.getParameter("birthdayYear")+"-"+request.getParameter("birthdayMonth")+"-"+request.getParameter("birthdayDay"));
        userData.put("EMAIL", request.getParameter("emailAddress")+"@"+request.getParameter("domain"));
        userData.put("SMS_AD", objSmsAD);
        userData.put("EMAIL_AD", objEmailAD);
        SignUpDB signUpDB = new SignUpDB();

        try {
            signUpDB.setUserData(userData);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        

        // // http://localhost:8080/SignUp?userName=chan&userID=abc123&userPW=1q2w3e4r&userPWcheck=1q2w3e4r&
        // birthdayYear=1994&birthdayMonth=8&birthdayDay=17&emailAddress=abc123&domain=naver.com&
        // userPhoneNumber=010-2324-8746&smsAd=on


        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/signUp.jsp");
        requestDispatcher.forward(request, response);
    }
}
