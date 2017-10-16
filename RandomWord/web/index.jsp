<%@ page import="java.util.Date" %><%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Random Word Generator</title>
  </head>
  <body>
    <h1>You have generated a word <%= session.getAttribute("clicks") %> times</h1>
    <div style="border: solid 2px; width: 350px; height: 60px;">
      <h2><%= session.getAttribute("random") %></h2>
    </div>
      <form method="get">
        <input type="submit" value="Generate"><br>
      </form>

    <h1>The last time you generated a word was:</h1>
    <div style="border: solid 2px; width: 400px; height: 80px;">
      <h2><%= new Date() %></h2>
    </div>

  </body>
</html>

