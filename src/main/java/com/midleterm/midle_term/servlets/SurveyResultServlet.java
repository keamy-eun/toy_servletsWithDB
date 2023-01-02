package com.midleterm.midle_term.servlets;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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
        
        
      
  // getParameter로 받은 값들을 list에 입력
  ArrayList<String> survey_result = new ArrayList<>();
  survey_result.add(request.getParameter("Q1"));
  survey_result.add(request.getParameter("Q2"));
  survey_result.add(request.getParameter("Q3"));
  survey_result.add(request.getParameter("Q4"));
  survey_result.add(request.getParameter("Q5"));

  String query = "";
  String result;

//   question_uid 받아오기
ArrayList<String> question_uid_arrayList = new ArrayList<>();
String q_uid;
for(int i=1; i<=survey_result.size(); i++){
    // 리스트에 q1 2345 넣어두고 나중에 뽑아 씀.
q_uid = "Q" + i;
question_uid_arrayList.add(q_uid);
}

// User_uid받아오기
String u_uid;
u_uid = request.getParameter("");  //파라미터로 받은 키값넣어서 value 받아오기

 for(int i=0; i<survey_result.size(); i++){
  result = survey_result.get(i);
                                                        // 키값을 건드리는건 좋지 않다고 들었지만 어떻게 해야할지 기억이 안남..  
                                                                  // user의 값은 어떻게 해야했더라....      
                                                      //   지금 인서트가 현재 로그인중인 유저의 설문결과를 넣는 것.                                                         
  query = "INSERT INTO SURVEY_DATA(QUESTION_UID, ANSWER_UID, USER_UID) VALUES('"+question_uid_arrayList.get(i)+"', '"+result+"', '"+u_uid+"');";
  query += query;  
  
}

// // 설문결과 가져오는 query

// ResultSet resultSet = statement.executeQuery(query);
// // 설문결과 uid 넣어둘 변수
// String question_uid = resultSet.getString("QUESTION_UID");
// String answer_uid = resultSet.getString("ANSWER_UID");
// String user_uid =resultSet.getString("USER_UID");
// // 설문답변결과 카운팅할 변수
// int count_a1 = 0;
// int count_a2 = 0;
// int count_a3 = 0;
// int count_a4 = 0;
// int count_a5 = 0;
// // 반복문 돌릴 uid 변수 지정
// String compare_Quid="";
// String compare_Auid="";
// // 변수에 담아 하나씩 꺼내본다
// while(resultSet.next()){

// if(question_uid.equals("Q1") | answer_uid.equals("A1")){
// count_a1++;
// }
// }   query를 가져오지말고 그냥 parameter 받아서 숫자만 올리면 같은 결과일 것 같다.
ArrayList<String> survey_ansList = new ArrayList<>();
// 파라미터로 받은 응답결과를 리스트에 넣고
survey_ansList.add(request.getParameter("Q1"));    // A1
survey_ansList.add(request.getParameter("Q2"));    //A3
survey_ansList.add(request.getParameter("Q3"));   //A2
survey_ansList.add(request.getParameter("Q4"));   //A4
survey_ansList.add(request.getParameter("Q5"));   //A5

String a_value = "";
int a1_count=0;
int a2_count=0;
int a3_count=0;
int a4_count=0;
int a5_count=0;

for(int i=0; i<survey_result.size(); i++){

    a_value = survey_ansList.get(i);
   switch(a_value) {
    case "A1" : a1_count++;
                break;
    case "A2" : a2_count++;
                break;
    case "A3" : a3_count++;
                break;
    case "A4" : a4_count++;
                break;
    case "A5" : a5_count++;
                break;
    default : break;    // 1번질문의 답변 A6 7 8 의 경우 여기서 분기할 수 있도록.. 코드 추가하자  
   }

}






        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/surveyResult.jsp");
        requestDispatcher.forward(request, response);

    }
  

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        this.doGet(req, resp);
    }

    
}

