<%--
  Created by IntelliJ IDEA.
  User: weicao
  Date: 10/15/17
  Time: 04:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Search</title>
</head>
<body>
<h3>Top Ten Songs: <div style="text-align: right"><a href="/dashboard/">Dashboard</a></div></h3>

<div style="border: solid 2px; width: 250px; height: 400px;">
    <c:forEach var="song" items="${topTen}">
    <p><c:out value="${song.rating}"/> - <a href="/songs/${song.id}/"><c:out value="${song.title}"/></a> - <c:out value="${song.name}"/></p>
    </c:forEach>
</div>

</body>
</html>



