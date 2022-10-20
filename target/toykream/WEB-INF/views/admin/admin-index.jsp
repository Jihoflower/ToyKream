<%--
  Created by IntelliJ IDEA.
  User: juhyun
  Date: 2022/10/20
  Time: 9:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>관리자페이지</title>
</head>
<body>
<jsp:include page="/fix/header.jsp"/>
    관리자페이지
<a href="/product/brand">브랜드</a>
<a href="/product/color">색상</a>
<a href="/product/size">사이즈</a>
<a href="/product/category">카테고리</a>

    <a href="/user/logOut">로그아웃</a>
</body>
</html>
