<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/8/7
  Time: 16:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>First Page</title>
  </head>
  <style type="text/css">
    a {
      text-decoration: none;
      color: black;
      font-size: 18px;
    }
    h3 {
      width: 180px;
      height: 38px;
      margin: 100px auto;
      text-align: center;
      line-height: 38px;
      background: deepskyblue;
      border-radius: 4px;
    }
  </style>
  <body>
  <a href="${pageContext.request.contextPath}/book/allbook">click to find all book</a>
  </body>
</html>
