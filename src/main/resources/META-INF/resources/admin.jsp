<%@ page import="java.util.HashMap, java.util.ArrayList, com.midleterm.midle_term.dao.Commons, java.sql.Statement, java.sql.ResultSet" %> <%@ page
language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
    <link
    href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
    rel="stylesheet"
    integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
    crossorigin="anonymous"
  />
  </head>
  <body>
    <div class="text-primary display-5 text-center pt-5">회원 목록 보기</div>
    <hr>
    <% 
        ArrayList<HashMap<String, Object>> user_data_list = (ArrayList<HashMap<String, Object>>)request.getAttribute("getUserData"); 
        %>
      <div class="container-fluid">
      <table class="table table-bordered table-primary table-hover">
        <thead>
          <tr>
            <th></th>
            <th>유저고유값</th>
            <th>이름</th>
            <th>아이디</th>
            <th>비밀번호</th>
            <th>전화번호</th>
            <th>생년월일</th>
            <th>이메일</th>
            <th>문자수신여부</th>
            <th>이메일수신여부</th>
            <th>회원정보수정</th>
            <th>회원삭제</th>
          </tr>
        </thead>
        <tbody>
          <!-- NULL은 변수에 담을 수 없으니 getpram함수 그냥 사용 -->

          <!-- Pram이 Null일때 : 회원 조회 화면-->
          <% if( request.getParameter("UPDATE") == null) { %> 
          <% for (int i =0; i<user_data_list.size(); i++){ %>
            <tr>
              <th><%= i+1%></th>
              <td><%= user_data_list.get(i).get("USER_UID")  %></td>
              <td><%= user_data_list.get(i).get("NAME")  %></td>
              <td><%= user_data_list.get(i).get("ID")  %></td>
              <td><%= user_data_list.get(i).get("PASSWORD")  %></td>
              <td><%= user_data_list.get(i).get("PHONE_NUMBER")  %></td>
              <td><%= user_data_list.get(i).get("BIRTHDAY")  %></td>
              <td><%= user_data_list.get(i).get("EMAIL")  %></td>
              <td><%= user_data_list.get(i).get("SMS_AD")  %></td>
              <td><%= user_data_list.get(i).get("EMAIL_AD") %></td>
              <td>
                <button type="submit" onclick="location='/AdminServlet?UPDATE=t&DELETE=f'" class="btn btn-dark container-fluid" value="Update">
              Update</button>
              </td>
              <td>
                <button type="submit" onclick="location='/AdminServlet?UPDATE=f&DELETE=t&D_USER_UID=<%= user_data_list.get(i).get("USER_UID") %>'" class="btn btn-danger container-fluid" value="Update">
                  Delete</button>
              </td>
              </tr>
              <% } %>
              <!-- Pram이 UPDATE=t이고 USER_UID값이 없을때 : UPDATE 화면 -->
              <!-- Pram이 UPDATE=t이고 USER_UID값이 있을때 : UPDATE 후 UPDATE 화면 -->
            <% } else if(request.getParameter("UPDATE").equals("t")){ %>
              <!-- DB UPDATE -->



              <%= "This is update page" %>
              <% for (int i =0; i<user_data_list.size(); i++){ %>
                <tr>
                  <th><%= i+1%></th>
                  <td><%= user_data_list.get(i).get("USER_UID")  %></td>
                  <td><%= user_data_list.get(i).get("NAME")  %></td>
                  <td><%= user_data_list.get(i).get("ID")  %></td>
                  <td><%= user_data_list.get(i).get("PASSWORD")  %></td>
                  <form action="">
                    <td>     
                      <div>
                        <!-- UPDATE와 DELETE 파라메터를 유지하기 위해 hidden 사용 -->
                        <input type="hidden" name="UPDATE" id="" value="t"/>
                        <input type="hidden" name="DELETE" id="" value="f"/>
                        <input type="text" name="password" id="" value="<%= user_data_list.get(i).get("PHONE_NUMBER")  %> "/>
                      </div>
                    </td>
                    <td>
                      <div>
                        <input type="text" name="BIRTHDAY" id="" value="<%= user_data_list.get(i).get("BIRTHDAY")  %> "/>
                      </div>
                    </td>
                    <td>
                      <div>
                        <input type="text" name="EMAIL" id="" value="<%= user_data_list.get(i).get("EMAIL")  %> "/>
                      </div>
                    </td>
                    <td>
                      <div>
                        <input type="text" name="SMS_AD" id="" value="<%= user_data_list.get(i).get("SMS_AD")  %> "/>
                      </div>
                    </td>
                    <td>
                      <div>
                        <input type="text" name="EMAIL_AD" id="" value="<%= user_data_list.get(i).get("EMAIL_AD") %> "/>
                      </div>
                    </td>
                    <td>
                      <button type="submit" class="btn btn-dark container-fluid" value="Update">Update</button>
                    </td>
                    <td>
                      <button type="submit" class="btn btn-danger container-fluid" value="Update">
                        <a href="/AdminServlet?UPDATE=f&DELETE=t&D_USER_UID=<%= user_data_list.get(i).get("USER_UID") %>" style="text-decoration:none ">Delete</a></button></td>
                    </tr>
                  </form>
                  <% } %>
                  <tr>
                    <td colspan="10"></td>
                    <td colspan="2"><button type="submit" class="btn btn-info container-fluid" value="Back">
                      <a href="/AdminServlet?" style="text-decoration:none">Back</a></button></td>
                  </tr>
              <% } %>



              <% if(request.getParameter("UPDATE") == null) { %>
              <%= "It's NULL" %>
              <% }else if(request.getParameter("UPDATE").equals("t")){ %>
                <%= "It's UPDATE" %>
                <%= request.getParameter("UPDATE")%>
                <a href="/AdminServlet?">back</a>
    
              <% } else if(request.getParameter("DELETE").equals("t")){ %>
                <%= "It's DELETE" %>
                <%= request.getParameter("DELETE")%>
                <a href="/AdminServlet?">back</a>
    
              <%} else { %>
                <%= "?" %>
                <% } %>
      </tbody>
    </table>
  </body>
</html>
