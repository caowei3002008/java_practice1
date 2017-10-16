<%--
  Created by IntelliJ IDEA.
  User: weicao
  Date: 10/15/17
  Time: 17:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>New Person</title>
</head>
<body>
    <h1>New Person</h1>
    <form:form action="/add" method="post" modelAttribute="person">
        <p>
            <form:label path="firstName" for="firstName">First Name:
            <form:input path="firstName" type="text" name="firstName"/>
            </form:label>
        </p>
        <p>
            <form:label path="lastName" for="lastName">Last Name:
                <form:input path="lastName" type="text" name="lastName"/>
            </form:label>
        </p>
        <input type="submit" value="Create">
    </form:form>

</body>
</html>
