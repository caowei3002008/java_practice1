<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Languages</title>
    <link rel="stylesheet" href="/css/style.css" />
</head>
<body>
<p>${language.name}</p>
<p>${language.creator}</p>
<p>${language.version}</p>

<p><a href="/delete/${id}/">Delete</a> </p>
<p><a href="/update/${id}/">Update</a> </p>
</body>
</html>