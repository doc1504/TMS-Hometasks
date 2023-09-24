<%@ page import="java.util.List" %>
<%@ page import="org.example.domain.Phone" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/search" method="post">
    Model: <input type="text" name="model"><br>
    <input type="submit" value="Search">
</form>
<hr>
<form action="/add" method="post">
    Model: <input type="text" name="model"><br>
    Color: <input type="text" name="color"><br>
    Price: <input type="number" name="price"><br>
    <input type="submit" value="Add">
<hr>
New phones
    <table>
        <tr>
            <th>Model</th>
            <th>Color</th>
            <th>Price</th>
        </tr>
        <hr>
    <%
        Object phonesOpt = request.getAttribute("phones");
        if (phonesOpt != null) {
            List<Phone> phones = (List<Phone>) request.getAttribute("phones");
            for (Phone phone: phones) {
                out.print ("<form action = '/delete' method = 'post'>");
                out.print ("<tr><td>" + phone.getModel() + "</td>");
                out.print ("<td>" + phone.getColor() + "</td>");
                out.print ("<td>" + phone.getPrice() + "</td>");
                out.print ("<td><input type = 'hidden' name = 'deleteId' value = '" + phone.getId() + "'>");
                out.print ("<input type = 'submit' value = 'delete'></td>");
                out.print ("</tr>");
                out.print ("</form>");

            }
        }

    %>
    </table>

</body>
</html>
