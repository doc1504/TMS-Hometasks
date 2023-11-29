
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sp" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<a href="/home?language=en">ENG</a>
<a href="/home?language=ru">RU</a>

<sp:message code="label.title"/>

<form action="/home" method="post">
    <input type="text" name="model" placeholder="model">${modelError}<br>
    <input type="number" name="value" placeholder="value">${valueError}<br>
    <input type="submit" value="create">
</form>
<ul>
    <c:forEach var="phone" items="${phones}">
        <li> ${phone.model} - ${phone.value}</li>
    </c:forEach>

</ul>
</body>
</html>
