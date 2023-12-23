<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<H2> SAVE MOVIE </H2>
<form action="/save" method="post">
    <input type="text" name="name" placeholder="movie_name"><br>
    <br>
    <c:forEach items="${genres}" var="genre">
        ${genre.name()} <input type="radio" name="genre" value="${genre.name()}"><br>
    </c:forEach>
    <br>
    <br>
    <input type="text" name="date" placeholder="movie_date"><br>
    <input type="number" name="rating" placeholder="rating"><br>
    <input type="submit" value="SAVE MOVIE">

    <ul>
        <c:forEach items="${movies}" var="movie" >
            <li> ${movie.name} ${movie.genre} ${movie.date} ${movie.rating}</li>

        </c:forEach>

    </ul>
</form>

</body>
</html>
