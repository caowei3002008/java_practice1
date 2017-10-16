<%--
  Created by IntelliJ IDEA.
  User: weicao
  Date: 10/15/17
  Time: 02:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Details</title>
</head>
<body>
<div style="text-align:right">
    <a href="/dashboard/">Dashboard</a>
</div>
    <div>
        <p>Title: ${song.title}</p>
        <p>Artist: ${song.name}</p>
        <p>Rating(1-10): ${song.rating}</p>
        <p><a href="/delete/${song.id}/">delete</a></p>
    </div>

</body>
</html>
