<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Demo JSP</title>
    <style>

  .blueviolet{
    width: 50px;
    height: 50px;
    background-color: blueviolet;
    display: inline-block;
  }

  .blue{
    width: 50px;
    height: 50px;
    background-color: blue;
    display: inline-block;
  }
    </style>
  </head>
  <body>


  <% String html = ""; %>
  <%  int width = Integer.parseInt(request.getParameter("width")); %>
  <%  int height = Integer.parseInt(request.getParameter("height")); %>
  <h1>Checkerboard: <%= width%>w X <%= height%>h</h1>
<% for(int i = 1; i<= height; i++){%>
<% for(int j = 1; j<=width; j++){%>
<% if( (i+j)%2 == 0){%>
<%  html += "<div class='blueviolet'></div>";%>
<%  }else{%>
<%  html += "<div class='blue'></div>";%>
<%  }%>
<%  }%>
<%   html +="<br>";%>
<%  } %>

<%=html%>

  </body>
</html>