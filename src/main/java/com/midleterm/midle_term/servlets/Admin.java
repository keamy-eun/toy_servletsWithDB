package com.midleterm.midle_term.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import com.midleterm.midle_term.dao.AdminWithDB;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/AdminServlet")  
public class Admin extends HttpServlet {
    @Override 
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        response.setContentType("text/html;charset=UTF-8");

        AdminWithDB adminWithDB = new AdminWithDB();
        ArrayList<HashMap<String, Object>> getUserData = null;
        try {
            getUserData = adminWithDB.getUserData();
            for(int i=0; i<getUserData.size(); i++)
            System.out.println("1"+getUserData.get(i).get("ID")); //check
            HashMap<String, Object> user1 = getUserData.get(0);  
            System.out.println("2"+user1.get("ID"));
            for (int i =0; i<getUserData.size(); i++){
                System.out.println(getUserData.get(i).get("USER_UID"));  
                System.out.println(getUserData.get(i).get("NAME"));  
                System.out.println(getUserData.get(i).get("ID"));  
                System.out.println(getUserData.get(i).get("PASSWORD"));  
                System.out.println(getUserData.get(i).get("PHONE_NUMBER"));  
                System.out.println(getUserData.get(i).get("BIRTHDAY"));  
                System.out.println(getUserData.get(i).get("EMAIL"));  
                System.out.println(getUserData.get(i).get("SMS_AD"));  
                System.out.println(getUserData.get(i).get("EMAIL_AD")); 
            } 
        } catch (SQLException e) {
            e.printStackTrace();
        }

        request.setAttribute("getUserData", getUserData);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/admin.jsp");
        requestDispatcher.forward(request, response);
        

    }
}