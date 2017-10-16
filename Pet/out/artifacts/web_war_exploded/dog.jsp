<%--
  Created by IntelliJ IDEA.
  User: weicao
  Date: 10/9/17
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html>
<head>
    <title>Dog</title>
</head>
<body>
<h1>You created a <c:out value="${dog.getBreed()}"/></h1>
<h1><c:out value="${dog.showAffection()}"/></h1>



</body>
</html>
