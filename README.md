# 이어폰 관련 설문조사 및 통계 사이트

<img src="https://github.com/keamy-eun/html_ToyTermProject/blob/master/docs/img/project_img.PNG?raw=true">

# 3차 프로잭트 내용: JSP & DB 활용 UI구현

#### 프로젝트 기간

#### 2022.12.28 ~ 2022.01.02

<hr>
toy_servletsWithDB

- [Github Pages](https://github.com/keamy-eun/toy_servletsWithDB)
- [Video]()

<hr>

## 업무분담(Servlet)

- 메인, 로그인&로그아웃, 회원가입: 이찬우

  - [main](../toy_servletsWithDB/src/main/java/com/midleterm/midle_term/servlets/MainServlet.java)
  - [login](../toy_servletsWithDB/src/main/java/com/midleterm/midle_term/servlets/LoginServlet.java)
  - [logout](../toy_servletsWithDB/src/main/java/com/midleterm/midle_term/servlets/Logout.java)
  - [signup](../toy_servletsWithDB/src/main/java/com/midleterm/midle_term/servlets/SignUpServlet.java)

- 통계메인, 통계메뉴1~2, 설문: 이정훈

  - [statics](../toy_servletsWithDB/src/main/java/com/midleterm/midle_term/servlets/StaticsServlet.java)
  - [statics_menu1](../toy_servletsWithDB/src/main/java/com/midleterm/midle_term/servlets/Statics_menu1Servlet.java)
  - [statics_menu2](../toy_servletsWithDB/src/main/java/com/midleterm/midle_term/servlets/Statics_menu2Servlet.java)
  - [survey](../toy_servletsWithDB/src/main/java/com/midleterm/midle_term/servlets/SurveyServlet.java)

- 관리자페이지 CRUD: 은원기
  - [admin](../toy_servletsWithDB/src/main/java/com/midleterm/midle_term/servlets/AdminServlet.java)

## 업무분담(jsp)

- 메인, 로그인&로그아웃, 회원가입: 이찬우

  - [main](../toy_servletsWithDB/src/main/resources/META-INF/resources/main.jsp)
  - [login](../toy_servletsWithDB/src/main/resources/META-INF/resources/login.jsp)
  - [signup](../toy_servletsWithDB/src/main/resources/META-INF/resources/signUp.jsp)

- 통계메인, 통계메뉴1~2, 설문: 이정훈

  - [statics](../toy_servletsWithDB/src/main/resources/META-INF/resources/statics.jsp)
  - [statics_menu1](../toy_servletsWithDB/src/main/resources/META-INF/resources/statics_menu1.jsp)
  - [statics_menu2](../toy_servletsWithDB/src/main/resources/META-INF/resources/statics_menu2.jsp)
  - [survey](../toy_servletsWithDB/src/main/resources/META-INF/resources/survey.jsp)

- 관리자페이지 CRUD: 은원기
  - [admin(user_list)](../toy_servletsWithDB/src/main/resources/META-INF/resources/adminUserList.jsp)
  - [admin(user_insert_update)](../toy_servletsWithDB/src/main/resources/META-INF/resources/adminInsertUpdate.jsp)
