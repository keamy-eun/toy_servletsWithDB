<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>statics</title>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
      crossorigin="anonymous"
    />
    <link rel="stylesheet" href="./css/commons.css" />
  </head>
  <body>
    <%@ include file= "header.jsp" %> <%-- login과 signup는 Webservlet 별칭이
    없어 일단 jsp로 바로 연결되게 해둠--%>

    <div class="row">
      <div class="col-9 text-center container">
        <div class="fs-2 mt-5">통계자료 화면입니다</div>
        <div class="fs-4 mt-5 mb-5">우측 메뉴 선택</div>
        <img
          src="https://img.freepik.com/free-vector/illustration-graphs_53876-28520.jpg?w=360"
          alt=""
        />
      </div>
      <nav
        class="col col-md-2 col-lg-2 navbar bg-primary navbar-primary h-50 fs-5 rounded me-5"
      >
        <div class="navbar-nav">
          <ul>
            <li>
              <a href="./Statics_menu1Servlet" class="nav-link"
                >유/무선 이어폰 점유율</a
              >
            </li>
            <li>
              <a href="./Statics_menu2Servlet" class="nav-link"
                >무선이어폰 업체별 점유율</a
              >
            </li>
          </ul>
        </div>
      </nav>
    </div>
    <div class="container-fluid p-4">
      <footer class="mt-5 opacity-75">
        <div>
          Git address :
          <a href="https://github.com/keamy-eun/html_ToyTermProject.git"
            >github.com/keamy-eun/html_ToyTermProject.git</a
          >
        </div>
        <div>Email address : anxi0015@gmail.com / eun.wonki014@gmail.com</div>
      </footer>
    </div>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
      crossorigin="anonymous"
    ></script>
    <hr />
    <a href="./index.html" class="fs-5" target="_self">Index</a>
    <%@ include file= "footer.jsp" %>
  </body>
</html>
