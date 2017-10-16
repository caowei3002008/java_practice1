<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Ninja Gold Game</title>
</head>
<body>
<label>Total Earn:</label>
<input type="text" name="totalEarn" value="<c:out value="${totalEarn}"/>">
<form action="/gold" method = 'post'>
    <h1>Farm</h1>
    <p>(earns 10-20 golds)</p>
    <input type="hidden" name="building" value="farm">
    <input type="submit" value="Find Gold!">
</form>

<form action="/gold" method = 'post'>
    <h1>Cave</h1>
    <p>(earns 5-10 golds)</p>
    <input type="hidden" name="building" value="cave">
    <input type="submit" value="Find Gold!">

</form>

<form action="/gold" method = 'post'>
    <h1>House</h1>
    <p>(earns 2-5 golds)</p>
    <input type="hidden" name="building" value="house">
    <input type="submit" value="Find Gold!">

</form>

<form action="/gold" method = 'post'>
    <h1>Casino</h1>
    <p>(earns/takes 0-50 golds)</p>
    <input type="hidden" name="building" value="casino">
    <input type="submit" value="Find Gold!">
</form>


<form action="/gold" method = 'post'>

    <input type="hidden" name="building" value="reset">
    <input type="submit" value="reset">
</form>

<div>

<c:forEach items="${activities}" var="item">
    <c:choose>
    <c:when test = "${fn:contains(item, 'Ouch')}">

        <p style="color: red;"><c:out value="${item}" /></p>
    </c:when>
        <c:otherwise>
            <p style="color: blue;"><c:out value="${item}" /></p>
        </c:otherwise>
</c:choose>
</c:forEach>

</div>

</body>
</html>
