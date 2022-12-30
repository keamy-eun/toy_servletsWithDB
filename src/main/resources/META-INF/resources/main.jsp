<%@ page contentType="text/html;charset=UTF-8" language="java" %>

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
    <link rel="stylesheet" href="./css/commons.css" />
  </head>
  <body>
    <div class="container-fluid p-4">
      <%@ include file= "header.jsp" %>

      <!-- main -->
      <div class="contain p-4">
        <img
          class="rounded w-100"
          src="https://newsroom-prd-data.s3.ap-northeast-2.amazonaws.com/wp-content/uploads/2019/10/%EC%99%84%EC%A0%84%EB%AC%B4%EC%84%A0_%EC%9D%B4%EC%96%B4%ED%8F%B0_%EB%B2%84%EC%A6%88_%EC%97%90%EC%96%B4%ED%8C%9F_1.jpg"
          alt=""
        />
      </div>
      
      <!-- footer -->
      <%@ include file= "footer.jsp" %>

      </div>

    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
