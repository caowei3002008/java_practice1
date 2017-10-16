<%--
  Created by IntelliJ IDEA.
  User: weicao
  Date: 10/15/17
  Time: 01:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Lookify!</title>
</head>
<body>
    <div class="topBar">
        <a href="/songs/new/" class="topBarInside">Add New</a>
        <a href="/search/topTen/" class="topBarInside">Top Songs</a>
        <form method="POST" action="/dashboard/search/">
            <input type="text" name="search">
            <input type="submit" value="Search Artists">
        </form>
    </div>

<table>
    <tr>
        <th>Name</th>
        <th>rating</th>
        <th>actions</th>
    </tr>
    <c:forEach var="song" items="${lookify}">
        <tr>
            <td><a href="/songs/${song.id}/"><c:out value="${song.title}"/></a></td>
            <td><c:out value="${song.rating}"/></td>
            <td><a href="/delete/${song.id}/">delete</a></td>
        </tr>
    </c:forEach>
</table>



</body>
</html>
