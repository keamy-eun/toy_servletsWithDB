<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
    <link rel="stylesheet" href="../CSS/statics_menu1.css" />
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
            <a href="./statics_menu1.html" target="_self"
              >유/무선 이어폰 점유율
            </a>
          </li>
          <li>
            <a href="./statics_menu2.html" target="_self"
              >무선이어폰 업체별 점유율
            </a>
          </li>
        </ul>
      </aside>
    </div>
    <div class="padding-address">
      <div>
        Git address :
        <a href="https://github.com/keamy-eun/html_ToyTermProject.git"
          >https://github.com/keamy-eun/html_ToyTermProject.git</a
        >
      </div>
      <div>Email address : anxi0015@gmail.com / eun.wonki014@gmail.com</div>
    </div>
    <%@ include file= "footer.jsp" %>
  </body>
</html>
