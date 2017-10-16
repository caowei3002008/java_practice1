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
    <title>New License</title>
</head>
<body>
<form:form action="/addLicense" method="POST" modelAttribute="license">
    <p>
        <h1><form:label path="person" for="person">Person:
            <form:select path="person" name="person">
                <c:forEach var="name" items="${personFullName}">
                    <form:option value="${name.id}">${name.fullName}</form:option>
                </c:forEach>
            </form:select>
        </form:label></h1>
    </p>
    <p>
        <h1><form:label path="state" for="state">State:
        <form:input path="state" name="state" type="text" />
        </form:label></h1>
    </p>
    <p>
        <h1><form:label path="expiration_date" for="expiration_date">Expiration Date:
            <form:input path="expiration_date" name="expiration_date" type="date" />
        </form:label></h1>
    </p>
        <input type="submit" value="Create">
</form:form>

</body>
</html>

<%--expiration_date--%>
