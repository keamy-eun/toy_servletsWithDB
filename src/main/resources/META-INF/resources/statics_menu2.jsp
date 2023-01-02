<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
    <link rel="stylesheet" href="../CSS/statics_menu2.css" />
  </head>
  <body>
    <%@ include file= "header.jsp" %>

    <div class="div1">
      <table border="1" class="main-align">
        <tr>
          <th colspan="2">2021 업체별 이어폰 시장 점유율</th>
        </tr>
        <tr>
          <td>애플</td>
          <td>26%</td>
        </tr>
        <tr>
          <td>삼성</td>
          <td>7%</td>
        </tr>
        <tr>
          <td>UBL</td>
          <td>4%</td>
        </tr>
        <tr>
          <td>Skullcandy</td>
          <td>4%</td>
        </tr>
        <tr>
          <td>QCY</td>
          <td>3%</td>
        </tr>
        <tr>
          <td>boat</td>
          <td>3%</td>
        </tr>
        <tr>
          <td>기타</td>
          <td>53%</td>
        </tr>
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
