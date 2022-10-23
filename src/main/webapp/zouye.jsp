<%--
  Created by IntelliJ IDEA.
  User: god
  Date: 2022/10/23
  Time: 15:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1px">
    <tr>
        <th>头像</th>
        <th>姓名</th>
        <th>年龄</th>
        <th>性别</th>
    </tr>
    <c:forEach items="${list}" var="user">
        <tr>
            <td><img src="images/${user.url}" height="50px" width="auto"></td>
            <td>${user.name   } </td>
            <td>${user.age    } </td>
            <td>${user.gender } </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
