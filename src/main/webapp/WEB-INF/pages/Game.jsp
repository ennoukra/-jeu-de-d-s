<%@ page import="com.example.exercice2.bo.User" %><%--
  Created by IntelliJ IDEA.
  User: 21261
  Date: 23/02/2022
  Time: 21:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Game | </title>
</head>
<body>
<%--TODO: complet game.jsp file --%>
<h1>
    <%
        if(request.getAttribute("user") != null){
            User user = (User) request.getAttribute("user");

            out.print(user.getFirstName());
        } else {
            out.print("You are not login");
        }

    %>
</h1>
</body>
</html>
