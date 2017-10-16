<%--
  Created by IntelliJ IDEA.
  User: weicao
  Date: 10/12/17
  Time: 23:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Languages</title>
    <style>
        table {
            border-collapse: collapse;
            width: 100%;
        }

        th, td {
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even){background-color: #f2f2f2}

        th {
            background-color: #4CAF50;
            color: white;
        }
    </style>
</head>
<body>
    <table>
        <tr>
            <th>Name</th>
            <th>Creator</th>
            <th>Version</th>
            <th>action</th>
        </tr>
        <c:forEach items="${Languages}" var="item">
            <tr>
                <td><a href="/languages/${item.id}/">${item.name}</a></td>
                <td>${item.creator}</td>
                <td>${item.version}</td>
                <td><a href="/delete/${item.id}/">Delete</a>|<a href="/update/${item.id}/">Update</a></td>
            </tr>
        </c:forEach>
    </table>



    <p><form:form method="POST" action="/add" modelAttribute="language">
        <form:label path="name">Name:
            <form:errors path="name"/>
            <form:input path="name"/></form:label><br>

        <form:label path="creator">Creator:
            <form:errors path="creator"/>
            <form:input path="creator"/></form:label><br>

        <form:label path="version">Version
            <form:errors path="version"/>
            <form:input path="version"/></form:label><br>



        <input type="submit" value="Submit"/>
    </form:form></p>
</body>
</html>
