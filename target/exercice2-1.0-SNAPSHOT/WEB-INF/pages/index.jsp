<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <title>Login | Register</title>
</head>
<body>
<h5 class="text-danger">
<%
if(request.getAttribute("message") != null){
    out.print(request.getAttribute("message"));
}
%>
</h5>
<h5 class="text-danger">
    <%
        if(request.getAttribute("errorMessage") != null){
            out.print(request.getAttribute("errorMessage"));
        }
    %>
</h5>
<form action="Login" method="POST">
    <div class="form-group col-4">
        <label for="inputUserName">Username</label>
        <input type="text" class="form-control" id="inputUserName" placeholder="Email">
    </div>
    <div class="form-group col-4">
        <label for="inputPassword">Password</label>
        <input type="password" class="form-control" id="inputPassword" placeholder="Password">
    </div>
    <div class="form-group">
        <label class="form-check-label"><input type="checkbox"> Remember me</label>
    </div>
    <button type="submit" class="btn btn-primary">Sign in</button>
    <button type="reset" class="btn btn-secondary">Annuler</button>
</form>
<a href="Register" class="btn btn-primary">New Account</a>
</body>
</html>