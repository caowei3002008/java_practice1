<%--
  Created by IntelliJ IDEA.
  User: weicao
  Date: 10/16/17
  Time: 01:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Home</title>
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
<p><a href="/persons/new">Add Person</a></p>
<p><a href="/licenses/new">Create License</a></p>
<h1>Information</h1>
<table>
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>License#</th>
        <th>State</th>
        <th>Expiration Date</th>
    </tr>

    <c:forEach items="${details}" var="row">
        <tr>
        <td>${row[1].firstName}</td>
        <td>${row[1].lastName}</td>
        <td>${row[0].number}</td>
        <td>${row[0].state}</td>
        <td>${row[0].expiration_date}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
