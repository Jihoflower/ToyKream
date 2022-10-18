<%--
  Created by IntelliJ IDEA.
  User: juhyun
  Date: 2022/10/18
  Time: 2:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Kream SignIn</title>
</head>
<body>
<form action="/user/signin" method="post">
    <div class="mb-3">
        <label class="form-label">Email address</label>
        <input type="email" class="form-control" id="user_email" aria-describedby="emailHelp">
        <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
    </div>
    <div class="mb-3">
        <labe class="form-label">Email address</labe>
        <input type="text" class="form-control" id="user_name" aria-describedby="emailHelp">
        <div id="username" class="form-text">We'll never share your email with anyone else.</div>
    </div>
    <div class="mb-3">
        <label class="form-label">Email address</label>
        <input type="number" class="form-control" id="user_shoe_size" aria-describedby="emailHelp">
        <div id="shoesize" class="form-text">신발크기</div>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
</body>
</html>
