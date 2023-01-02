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
public class AdminServlet extends HttpServlet {
    AdminWithDB adminWithDB;

    public void init() {
		adminWithDB = new AdminWithDB();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

    @Override 
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        response.setContentType("text/html;charset=UTF-8");

        if(request.getParameter("editUser") == null){   // getParameter("editUser") == null이면 회원조회 페이지
            if(request.getParameter("delete") == null){  
                System.out.println("userList 실행");
                try {
                    userList(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } else if(request.getParameter("delete").equals("t"))    {
                System.out.println("delete 실행");
                try {
                    deleteUser(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        } else if(request.getParameter("editUser").equals("t")){ // getParameter("editUser") != null 일때 Insert 또는 Update 페이지
            System.out.println("경로가 editUser와 일치합니다");
            if(request.getParameter("insert").equals("t")){ 
                System.out.println("insert 실행");
                try {
                    if(request.getParameter("USER_UID") == null) editUser(request, response);  // insert 내용을 입력하기 전
                    else if(request.getParameter("USER_UID") != null) insertUser(request, response); // insert 내용을 입력한 후
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } else if(request.getParameter("update").equals("t"))    {
                System.out.println("Update 실행");
                try {
                    if(request.getParameter("PHONE_NUMBER") == null) editUser(request, response);  // update 내용을 입력하기 전
                    else if(request.getParameter("USER_UID") != null) updateUser(request, response); // update 내용을 입력한 후
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } 
        } 
    }
    
    public void userList(HttpServletRequest request, HttpServletResponse response) 
    throws SQLException, IOException, ServletException{
        ArrayList<HashMap<String, Object>> getUserList = null;
            try {
                getUserList = adminWithDB.getUserList();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        request.setAttribute("getUserList", getUserList);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/adminUserList.jsp");
        requestDispatcher.forward(request, response);
    }

    public void editUser(HttpServletRequest request, HttpServletResponse response) 
    throws SQLException, IOException, ServletException{
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/adminInsertUpdate.jsp");
        requestDispatcher.forward(request, response);
    }

    public void insertUser(HttpServletRequest request, HttpServletResponse response) 
    throws SQLException, IOException{
        String USER_UID = request.getParameter("USER_UID");
        String NAME = request.getParameter("NAME");
        String ID = request.getParameter("ID");
        String PASSWORD = request.getParameter("PASSWORD");
        String PHONE_NUMBER = request.getParameter("PHONE_NUMBER");
        String BIRTHDAY = request.getParameter("BIRTHDAY");
        String EMAIL = request.getParameter("EMAIL");
        String SMS_AD = request.getParameter("SMS_AD");
        String EMAIL_AD = request.getParameter("EMAIL_AD");
        
        AdminWithDB adminWithDB = new AdminWithDB();
        adminWithDB.insertUser(USER_UID, NAME, ID, PASSWORD, PHONE_NUMBER, BIRTHDAY, EMAIL, SMS_AD, EMAIL_AD);
        response.sendRedirect("AdminServlet");
    }

    public void deleteUser(HttpServletRequest request, HttpServletResponse response) 
    throws SQLException, IOException{
        String USER_UID = request.getParameter("USER_UID");
        
        AdminWithDB adminWithDB = new AdminWithDB();
        adminWithDB.deleteUser(USER_UID);
        response.sendRedirect("AdminServlet");
    }

    public void updateUser(HttpServletRequest request, HttpServletResponse response) 
    throws SQLException, IOException{
        String PHONE_NUMBER = request.getParameter("PHONE_NUMBER");
        String BIRTHDAY = request.getParameter("BIRTHDAY");
        String EMAIL = request.getParameter("EMAIL");
        String SMS_AD = request.getParameter("SMS_AD");
        String EMAIL_AD = request.getParameter("EMAIL_AD");
        String USER_UID = request.getParameter("USER_UID");
        
        AdminWithDB adminWithDB = new AdminWithDB();
        adminWithDB.updateUser(PHONE_NUMBER, BIRTHDAY, EMAIL, SMS_AD, EMAIL_AD, USER_UID);
        response.sendRedirect("AdminServlet");
    }

}