<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Hello.... Human</title>
</head>
<body>
<form method="POST" action="/result">
    <label>Your name: <input type="text" name="name"></label>
    <br>
    <label>Dojo Location:
        <select name = "location">
        <option value = "San Jose" >San Jose</option>
        <option value = "Chicago" >Chicago</option>
        <option value = "Burbank" >Burbank</option>
        <option value = "Seattle" >Seattle</option>
        <option value = "New York" >New York</option>
    </select>
    </label>
    <br>
    <label>Favorite Language:
        <select name = "language">
            <option value = "Java" >Java</option>
            <option value = "Python" >Python</option>
            <option value = "C++" >C++</option>
            <option value = "C#" >C#</option>
            <option value = "JavaScript" >JavaScript</option>
        </select>
    </label>
    <br>
    <label>Comment (optional):</label>
    <br>
    <textarea rows="10" cols="50" name="textarea"></textarea>
    <br>
    <button>Submit</button>

</form>
</body>
</html>