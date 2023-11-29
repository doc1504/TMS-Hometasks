<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>\
<%@taglib prefix="ma" uri="http://www.springframework.org/tags/form" %>


<html>
<head>
    <title>Title</title>
</head>
<body>

Create new phone
<ma:form action="/home" method="post" modelAttribute="phone">
    <ma:input path="model"/><ma:errors path="model"/><br>
    <ma:input path="value"/><ma:errors path="value"/><br>
    <ma:button>CREATE</ma:button>

</ma:form>


<ul>
    <c:forEach var="phone" items="${phones}">
        <li>${phone.model} - ${phone.value}</li>

    </c:forEach>

</ul>

</body>
</html>
