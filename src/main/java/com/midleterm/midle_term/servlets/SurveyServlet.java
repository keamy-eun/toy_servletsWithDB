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

@WebServlet(urlPatterns = "/surveyServlet")
public class SurveyServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");


        AdminWithDB adminWithDB = new AdminWithDB();
  
        // 퀘스천 리스트에 리스트 형태로 담겨있는 맵들. question qiestion_uid orders
        try {
        ArrayList<HashMap<String, Object>> question_list = new ArrayList<>();
        ArrayList<HashMap<String, Object>> answer_list = new ArrayList<>();
            question_list = adminWithDB.getQues();
            answer_list = adminWithDB.getAns();
            // ArrayList<String> q_list = new ArrayList<>();


            // --------------------------
      



    
        // for(int i=0; i<question_list.size(); i++){
        //     HashMap<String, Object> question_bundle = question_list.get(i);
        //     // HashMap<String, Object> question = (HashMap<String, Object>) question_bundle.get("QUESTION");
        //     String question = (String) question_bundle.get("QUESTION");
        //     // String quesetions = (String) question.get("QUESTIONS");
        //     // 여기까지 string에 질문 리스트 담아서 각각 출력가능.

          
        // }


        // request에 담아서 보낸다.
        request.setAttribute("question_list", question_list);
        request.setAttribute("answer_list", answer_list);
     
     RequestDispatcher requestDispatcher = request.getRequestDispatcher("/survey.jsp");
     requestDispatcher.forward(request, response);


} catch (SQLException e) {
 
    e.printStackTrace();
}


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     
        this.doGet(req, resp);
    }
}
