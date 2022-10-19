<%--
  Created by IntelliJ IDEA.
  User: juhyun
  Date: 2022/10/18
  Time: 5:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">

    <h1>로그인</h1>
    <form class="w-25" action="/user/signin" method="post">
        <div class="mb-3">
            <label class="form-label">이메일 </label>
            <input type="email" class="form-control" name="userEmail" placeholder="email을 입력해주세요">
        </div>
        <div class="mb-3">
            <label class="form-label">비밀번호</label>
            <input type="password" class="form-control" name="userPassword">
        </div>
        <div class="mb-3">
            <button type="submit" class="btn btn-primary">로그인하기</button>
        </div>
    </form>
</div>
</div>
</body>
</html>
