<%--
  Created by IntelliJ IDEA.
  User: 1
  Date: 2023/4/27
  Time: 15:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<html>
<head>
    <title>Title</title>
</head>
<body>
<hr>
<h1>Pending Users</h1>
<table>
    <tr>
        <th>User ID</th>
        <th>Username</th>
        <th>password</th>
<%--        <th>Action</th>--%>
    </tr>

    <c:forEach items="${User}" var="user">
        <tr>
            <td>${user.userId}</td>
            <td>${user.username}</td>
            <td>${user.password}</td>
<%--            <td>${user.phoneNumber}</td>--%>
<%--            <td>--%>
<%--                <form method="post" action="/admin/approveUser">--%>
<%--                    <input type="hidden" name="userId" value="${user.userId}">--%>
<%--                    <button type="submit">Approve</button>--%>
<%--                </form>--%>
<%--                <form method="post" action="/admin/rejectUser">--%>
<%--                    <input type="hidden" name="userId" value="${user.userId}">--%>
<%--                    <button type="submit">Reject</button>--%>
<%--                </form>--%>
<%--            </td>--%>
        </tr>
    </c:forEach>
</table>

</body>
</html>
