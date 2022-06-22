<%--
  Created by IntelliJ IDEA.
  User: Fatemeh
  Date: 6/22/2022
  Time: 3:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="assets/bootstrap.min.css" rel="stylesheet">
    <title>welcome!</title>
</head>
<body>
<div class="text-center">
    <header class="h2 font-italic">login</header>
    <hr>
</div>
<div class="border col-4 p-3 rounded mt-5 m-auto">
    <form action="/login.do">
        <div class="form-group">
            <label for="username">Employee code</label>
            <input class="form-control" id="username" placeholder="emp code...">
        </div>
        <div class="form-group">
            <label for="password">password</label>
            <input class="form-control" type="password" id="password" placeholder="password...">
        </div>
        <div>
            <button type="submit" class="btn btn-primary">Submit</button>
            <p>Don't have account?<a href="register.jsp"> register!</a></p>
        </div>

    </form>
</div>
</body>
</html>
