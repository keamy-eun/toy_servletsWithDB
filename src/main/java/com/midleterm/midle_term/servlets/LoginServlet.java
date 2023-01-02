package com.midleterm.midle_term.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.HashMap;

import com.midleterm.midle_term.dao.LoginDB;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(urlPatterns = "/Login")
public class LoginServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // declaration
        String userIDParam = "";
        String userPWParam = "";
        HashMap<String,Object> DBStoredIDPW = new HashMap<>();
        String DBStoredID = "";
        String DBStoredPW = "";
        String DBStoredNAME = "";
        HttpSession httpSession = null;
        String path = "/login.jsp";

        // receive param
        userIDParam = request.getParameter("memberId");
        userPWParam = request.getParameter("memberPW");

        // getParameter에 데이터가 들어온다면
        if (userIDParam != null){
            LoginDB loginDB = new LoginDB();
            try {
                DBStoredIDPW = loginDB.getUserIDPW(userIDParam);
                DBStoredID = (String) DBStoredIDPW.get("ID");
                DBStoredPW = (String) DBStoredIDPW.get("PASSWORD");
                DBStoredNAME = (String) DBStoredIDPW.get("NAME");
            } catch (SQLException e) {
                e.printStackTrace();
            }

            // DB 데이터와 입력한 ID와 PW가 맞는지 조사
            if (userIDParam.equals(DBStoredID) && userPWParam.equals(DBStoredPW)){
                //session 생성
                httpSession = request.getSession();
                httpSession.setAttribute("ID", userIDParam);
                httpSession.setAttribute("PASSWORD", userPWParam);
                httpSession.setAttribute("NAME", DBStoredNAME);

                System.out.println("로그인 정보가 맞습니다");
                path = "/main.jsp";
                
            } else {
                response.setContentType("text/html; charset=utf-8");
                PrintWriter printWriter = response.getWriter();
                printWriter.print("<script language='javascript'>");
                printWriter.print("alert('없는 유저입니다 비밀번호를 확인하시거나 매뉴에서 회원가입하세요!');");
                printWriter.print("location.href='/Login';");
                printWriter.print("</script>");
                printWriter.flush();
                printWriter.close();
                System.out.println("회원 정보가 없습니다");
                path = "/login.jsp";
            }
        
        }
        // getparameter에 아무 값도 안들어온다면
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(path);
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);

        String userIDParam = "";
        String userPWParam = "";
        HashMap<String,Object> DBStoredIDPW = new HashMap<>();
        String DBStoredID = "";
        String DBStoredPW = "";
        String DBStoredNAME = "";
        HttpSession httpSession = null;
        String path = "/login.jsp";

        // receive param
        userIDParam = request.getParameter("memberId");
        userPWParam = request.getParameter("memberPW");

        // getParameter에 데이터가 들어온다면
        if (userIDParam != null){
            LoginDB loginDB = new LoginDB();
            try {
                DBStoredIDPW = loginDB.getUserIDPW(userIDParam);
                DBStoredID = (String) DBStoredIDPW.get("ID");
                DBStoredPW = (String) DBStoredIDPW.get("PASSWORD");
                DBStoredNAME = (String) DBStoredIDPW.get("NAME");
            } catch (SQLException e) {
                e.printStackTrace();
            }

            // DB 데이터와 입력한 ID와 PW가 맞는지 조사
            if (userIDParam.equals(DBStoredID) && userPWParam.equals(DBStoredPW)){
                //session 생성
                httpSession = request.getSession();
                httpSession.setAttribute("ID", userIDParam);
                httpSession.setAttribute("PASSWORD", userPWParam);
                httpSession.setAttribute("NAME", DBStoredNAME);

                System.out.println("로그인 정보가 맞습니다");
                path = "/main.jsp";
                
            } else {
                response.setContentType("text/html; charset=utf-8");
                PrintWriter printWriter = response.getWriter();
                printWriter.print("<script language='javascript'>");
                printWriter.print("alert('없는 유저입니다 비밀번호를 확인하시거나 매뉴에서 회원가입하세요!');");
                printWriter.print("location.href='/Login';");
                printWriter.print("</script>");
                printWriter.flush();
                printWriter.close();
                System.out.println("회원 정보가 없습니다");
                path = "/login.jsp";
            }
        
        }
        
    }
}
