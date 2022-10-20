<%--
  Created by IntelliJ IDEA.
  User: juhyun
  Date: 2022/10/20
  Time: 10:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Md 페이지</title>
</head>
<body>
<jsp:include page="/fix/header.jsp"/>
    md 페이지
    <p>어서오세요 <%=session.getAttribute("userName")%> 님</p>
</body>
</html>
