# 3차 프로잭트 내용: JSP & DB 활용 UI구현

<img src="https://user-images.githubusercontent.com/115060986/210193461-26ea107b-26f6-49c8-ba2b-5130b6c2d6b0.PNG">

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

## 구현기능

- 메인, 로그인&로그아웃, 회원가입: 이찬우
  구현기능
  1. 아이디와 비밀번호를 치면 DB의 데이터와 대조하여 로그인. DB 유저의 정보가 일치하지 않을시 안내문. 사용자의 데이터가 들어나지 않도록 Post 사용
  2. DB 유저정보와 일치할 경우 유저 데이터가 일부 담긴session 생성, 우측 상단에 세션에서 Attribute를 받아와 유저의 이름과 환영메세지, 로그아웃 출력. 로그아웃은 세션 expired() 사용
  3. 회원가입정보 입력시 각 parameter를 servlet에서 수신하여 회원가입이 되면 DB에 이름, 비밀번호, 생일, 전화번호등의 유저 데이터를 DB에 String으로 저장
  4. 정보를 Post로 전송 후 회원가입시 로그인이 되어있다면 세션만료 후 메인화면으로 이동.
