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
    <%@ include file= "header.jsp" %>

    <div class="container pt-5 pb-5 -primary">
      <!-- card -->
      <div class="card">
        <div class="d-flex justify-content-center">
          <img
            class="card-img-top w-50"
            src="https://www.logoyogo.com/web/wp-content/uploads/edd/2021/02/logoyogo-1-223.jpg"
            alt=""
          />
        </div>
        <div class="card-body">
          <form action="" method="post">
            <!-- login menu title -->
            <div class="text-center fs-1">LOGIN</div>
            <!-- input group -->
            <div class="input-group d-flex flex-column">
              <label for="id" class="form-label"
                >아이디
                <input
                  name="memberId"
                  id="id"
                  type="text"
                  class="form-control"
                />
              </label>
              <label for="pw" class="form-label"
                >비밀번호
                <input
                  name="memberPW"
                  id="pw"
                  type="text"
                  class="form-control"
                />
              </label>
              <label for="">
                <button type="submit" class="btn btn-primary w-100 mt-3">
                  Sign in
                </button>
              </label>
            </div>
          </form>
        </div>
      </div>
    </div>

    <%@ include file= "footer.jsp" %>

    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
