<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
    <link rel="stylesheet" href="../CSS/statics_menu1.css" />
        <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
      crossorigin="anonymous"
    />
  </head>
  <body>
    <%@ include file= "header.jsp" %>

    <div class="div1">
      <table border="1" class="main-align">
        <div>
          <tr>
            <th colspan="3">유/무선 이어폰 사용량 증감 추이</th>
          </tr>
          <tr>
            <td></td>
            <td>2019</td>
            <td>2022</td>
          </tr>
          <tr>
            <td>유선이어폰</td>
            <td>45.26%</td>
            <td>36.69%</td>
          </tr>
          <tr>
            <td>무선이어폰</td>
            <td>54.48%</td>
            <td>62.86%</td>
          </tr>
        </div>
      </table>
      <aside>
        <ul>
          <li>
            <a href="./statics_menu1.jsp" target="_self"
              >유/무선 이어폰 점유율
            </a>
          </li>
          <li>
            <a href="./statics_menu2.jsp" target="_self"
              >무선이어폰 업체별 점유율
            </a>
          </li>
        </ul>
      </aside>
    </div>
    <%@ include file= "footer.jsp" %>
     <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
