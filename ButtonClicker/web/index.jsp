<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>Clicker</title>
  </head>
  <body>
    <form method="get">
      <input type="submit" value="Click Me!"><br>
      <h1>You have clicked this button <%= session.getAttribute("clicks") %> times</h1>
    </form>
  </body>
</html>