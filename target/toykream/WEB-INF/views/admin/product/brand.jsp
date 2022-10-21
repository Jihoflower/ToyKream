<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: juhyun
  Date: 2022/10/20
  Time: 2:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
            crossorigin="anonymous"></script>
    <title>Title</title>
</head>
<body>
<jsp:include page="/fix/header.jsp"/>

<%--<form method="get" onsubmit="sendRequest();">--%>

<%--    <input type="text" name="brandName" placeholder="브랜드 추가 ajax">--%>
<%--    <button type="submit" id = "sendButton">ajax로 리스트 갱신하기</button>--%>
<%--</form>--%>
<button type="button" onclick="sendRequest()">테스트</button>
<p>ajax jsp</p>
<table class="table">
    <thead>
    <tr>
        <th scope="col">#</th>
        <th scope="col">BRAND-NAME</th>
    </tr>
    </thead>
    <tbody  id = "tableBox">


    </tbody>
</table>


<script>
    let sendRequest = () => {
        //xmlhttprequest 객체 생성
        let httpRequest = new XMLHttpRequest();
        //요청을 보낼 방식 , 주소, 비동기방식 여부 설정
        httpRequest.open("GET", "/product/ajax-brand", true)
        //요청 전송
        httpRequest.send();
        //통신 후 작업
        httpRequest.onload = () => {
            console.log(httpRequest.readyState);
            if (httpRequest.status == 200) {

                console.log(httpRequest.response);
                let jsonData = JSON.parse(httpRequest.response);
                console.log("length = "+jsonData.length);
                console.log("통신성공");
                let tableBox = document.getElementById("tableBox");
                let html = "";
                    for(let i = 0 ; i < jsonData.length;i++){


                          html +=  "<tr><td scope='row'>" + jsonData[i].brandId + "</td>"
                          html +=  "<td scope='row'>" + jsonData[i].brandName + "</td></tr>"


                    }
                    console.log(html)
                tableBox.innerHTML = html;
            } else {


                console.log(httpRequest.response);
                console.log("통신 실패")
            }
        }
    }
</script>

<p>original jsp</p>
<form action="/product/brand" method="post">
    <input type="text" name="brandName" placeholder="브랜드를 추가하세요">
    <button type="submit">등록하기</button>
</form>
<table class="table">
    <thead>
    <tr>
        <th scope="col">#</th>
        <th scope="col">BRAND-NAME</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="bList" items="${brandList}">
        <tr>
            <td scope="row">${bList.brandId}</td>
            <td>${bList.brandName}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
