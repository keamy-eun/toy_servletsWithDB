package com.midleterm.midle_term.servlets;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/Statics_menu2Servlet")  
public class Statics_menu2Servlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{


    RequestDispatcher requestDispatcher = request.getRequestDispatcher("/statics_menu2.jsp");
    requestDispatcher.forward(request, response);
        
    }
}