<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Make a pet!</title>
  </head>
  <body>
  <div>
    <h1>Make a Dog!</h1>
    <form action="dog" method="get">
      <p>
        <label>Name</label>
        <input type="text" name="name">
      </p>
      <p>
        <label>Breed</label>
        <input type="text" name="breed">
      </p>
      <p>
        <label>Weight(lb)</label>
        <input type="number" name="weight">
      </p>
      <input type="submit" value="submit">
    </form>
  </div>

  <div>
    <h1>Make a Cat!</h1>
    <form action="cat" method="get">
      <p>
        <label>Name</label>
        <input type="text" name="name">
      </p>
      <p>
        <label>Breed</label>
        <input type="text" name="breed">
      </p>
      <p>
        <label>Weight(lb)</label>
        <input type="number" name="weight">
      </p>
      <input type="submit" value="submit">
    </form>
  </div>

  </body>
</html>