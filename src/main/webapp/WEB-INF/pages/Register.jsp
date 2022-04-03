<%--
  Created by IntelliJ IDEA.
  User: 21261
  Date: 23/02/2022
  Time: 19:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"  %>
<html>
<head>
    <title>Register | New Account</title>
</head>
<body>

<h5 class="text-danger">
    <%
        if(request.getAttribute("message") != null){
            out.print(request.getAttribute("message"));
        }
    %>
</h5>

    <form action="Register" method="POST">
        <div class="form-group col-4">
            <label for="inputFirstName">First name</label>
            <input name="firstName" type="text" class="form-control" id="inputFirstName" placeholder="First name">
        </div>
        <div class="form-group col-4">
            <label for="inputLastName">Last name</label>
            <input name="lastName" type="text" class="form-control" id="inputLastName" placeholder="Last name">
        </div>
        <div class="form-group col-4">
            <label for="userName">username</label>
            <input name="username" type="text" class="form-control" id="userName" placeholder="Username">
        </div>
        <div class="form-group col-4">
            <label for="inputPassword">Password</label>
            <input name="password" type="password" class="form-control" id="inputPassword" placeholder="Password">
        </div>
        <div class="form-group">
            <label class="form-check-label"><input type="checkbox"> Remember me</label>
        </div>
        <button type="submit" class="btn btn-primary">Sign in</button>
        <button type="reset" class="btn btn-secondary">Annuler</button>
</form>
</body>
</html>
