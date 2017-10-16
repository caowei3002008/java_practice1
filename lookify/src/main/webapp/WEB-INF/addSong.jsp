<%--
  Created by IntelliJ IDEA.
  User: weicao
  Date: 10/15/17
  Time: 02:00
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
    <title>Add Song</title>
    <style>
        .error{
            color: red;
        }
    </style>
</head>
<body>
<div style="text-align:right">
    <a href="/dashboard/">Dashboard</a>
</div>
<div>
    <form:form action ="/songs/new/add/" method="POST" modelAttribute="lookify">
        <p>
            <form:label path="title" for="title">Title
            <p><form:errors path="title" class="error"/></p>
            <form:input path="title" type="text" name="title"/></form:label>
        </p>
        <p>
            <form:label path="name" for="name">Artist
                <p><form:errors path="name" class="error"/></p>
            <form:input path="name" type="text" name="name"/></form:label>
        </p>
        <p>
            <form:label path="rating" for="rating">Rating(1-10)</form:label>
            <form:select path="rating" name="rating">
                <form:option value="1" type="number">1</form:option>
                <form:option value="2" type="number">2</form:option>
                <form:option value="3" type="number">3</form:option>
                <form:option value="4" type="number">4</form:option>
                <form:option value="5" type="number">5</form:option>
                <form:option value="6" type="number">6</form:option>
                <form:option value="7" type="number">7</form:option>
                <form:option value="8" type="number">8</form:option>
                <form:option value="9" type="number">9</form:option>
                <form:option value="10" type="number">10</form:option>
            </form:select>
        </p>
        <input type="submit" value="Add Song">


    </form:form>
</div>

</body>
</html>
