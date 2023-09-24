
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/search" method="post">
   Model: <input type="text" name="model"><br>
    <input type="submit" value="Search">

</form>

<form action="/add" method="post">
    Model: <input type="text" name="model"><br>
    Color: <input type="text" name="color"><br>
    Price: <input type="number" name="price"><br>
    <input type="submit" value="Add">
</form>
New phones
<ul>
<c:forEach items="${phones}" var="phone">
    <form action="/delete" method="post">
        <li>
            ${phone.model} - ${phone.color}
            ${phone.price}
            <input type="hidden" name="deleteId" value="${phone.id}">
            <input type="submit" value="delete">
        </li>
    </form>
</c:forEach>
</ul>

</body>
</html>
