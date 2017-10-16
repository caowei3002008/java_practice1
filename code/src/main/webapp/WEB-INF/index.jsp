<%--
  Created by IntelliJ IDEA.
  User: weicao
  Date: 10/12/17
  Time: 18:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Secret Code</title>
</head>
<body>
<h1 style="text-align: center">What is the code?</h1>
<h4 style="color: red; text-align: center"><c:out value="${errors}"/></h4>
<form method="post" action="/code" style="position: absolute; left: 420px;">
    <input type="text" name="secret"><br>
    <button>Try Code</button>
</form>

</body>
</html>
