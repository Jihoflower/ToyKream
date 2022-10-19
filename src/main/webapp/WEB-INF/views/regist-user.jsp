<%--
  Created by IntelliJ IDEA.
  User: juhyun
  Date: 2022/10/18
  Time: 4:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
    <title>Title</title>
</head>
<body>

<div class="container-fluid">
    <form class="w-25" action="/user/signup" method="post">
<%--        mb : m 마진 b 바텀--%>
        <div class="mb-3">
            <label class="form-label">이메일 </label>
            <input type="email" class="form-control" name="userEmail" placeholder="email을 입력해주세요">
        </div>
        <div class="mb-3">
            <label class="form-label">비밀번호</label>
            <input type="password" class="form-control" name="userPassword">
        </div>
        <div class="mb-3">
            <label class="form-label">이름 </label>
            <input type="text" class="form-control" name="userName" placeholder="이름">
        </div>
        <div class="mb-3">
            <label class="form-label">전화번호 </label>
            <input type="number" class="form-control" name="userNum" placeholder="휴대전화 번호">
        </div>
        <div class="mb-3">
            <label class="form-label">사이즈 </label>
            <select class="form-select w-50" name="userSize">
                <option selected>신발 사이즈(mm)</option>
                <option value="1">230</option>
                <option value="2">235</option>
                <option value="3">240</option>
                <option value="4">245</option>
                <option value="5">250</option>
                <option value="6">255</option>
                <option value="7">260</option>
                <option value="8">265</option>
                <option value="9">270</option>
                <option value="10">275</option>
                <option value="11">280</option>
                <option value="12">285</option>
            </select>
        </div>
        <div class="mb-3">
            <button type="submit" class="btn btn-primary">Submit</button>
        </div>
    </form>

</div>
</body>
</html>
