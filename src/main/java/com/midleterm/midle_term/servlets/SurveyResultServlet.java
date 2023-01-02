package com.midleterm.midle_term.servlets;
import java.io.IOException;

import java.sql.Statement;


import com.midleterm.midle_term.dao.Commons;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/surveyResultServlet")
public class SurveyResultServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        Commons commons = new Commons();
        Statement statement = commons.getStatement();
        
        
      
//   // getParameter로 받은 값들을 list에 입력
//   ArrayList<String> survey_result = new ArrayList<>();
//   survey_result.add(request.getParameter("Q1"));
//   survey_result.add(request.getParameter("Q2"));
//   survey_result.add(request.getParameter("Q3"));
//   survey_result.add(request.getParameter("Q4"));
//   survey_result.add(request.getParameter("Q5"));

//   String query = "";
//   String result;

// //   question_uid 받아오기
// ArrayList<String> question_uid_arrayList = new ArrayList<>();
// String q_uid;
// for(int i=1; i<=survey_result.size(); i++){
//     // 리스트에 q1 2345 넣어두고 나중에 뽑아 씀.
// q_uid = "Q" + i;
// question_uid_arrayList.add(q_uid);
// }

// // User_uid받아오기
// String u_uid;
// u_uid = request.getParameter("");  //파라미터로 받은 키값넣어서 value 받아오기

//  for(int i=0; i<survey_result.size(); i++){
//   result = survey_result.get(i);
//                                                         // 키값을 건드리는건 좋지 않다고 들었지만 어떻게 해야할지 기억이 안남..  
//                                                                   // user의 값은 어떻게 해야했더라....      
//                                                       //   지금 인서트가 현재 로그인중인 유저의 설문결과를 넣는 것.                                                         
//   query = "INSERT INTO SURVEY_DATA(QUESTION_UID, ANSWER_UID, USER_UID) VALUES('"+question_uid_arrayList.get(i)+"', '"+result+"', '"+u_uid+"');";
//   query += query;  
  
// }


        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/surveyResult.jsp");
        requestDispatcher.forward(request, response);

    }
  

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        this.doGet(req, resp);
    }

    
}

