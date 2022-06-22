<%--
  Created by IntelliJ IDEA.
  User: Fatemeh
  Date: 6/22/2022
  Time: 5:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="assets/bootstrap.min.css" rel="stylesheet">
    <title>register</title>
</head>
<body>
<div>
    <header class="font-italic h2">register</header>
    <hr>
</div>
<div>

</div>
<form>
    <div class="form-row">
        <div class="form-group col-md-6">
            <label for="name">Name</label>
            <input class="form-control" id="name" placeholder="Enter your name..">
        </div>
        <div class="form-group col-md-6">
            <label for="family">Family</label>
            <input class="form-control" id="family" placeholder="Enter your family..">
        </div>
    </div>
    <div class="form-row">
        <div class="form-group col-md-6">
            <label for="code">Employee code</label>
            <input class="form-control" id="code" placeholder="Enter your name..">
        </div>
        <div class="form-group col-md-6">
            <label for="pass">Password</label>
            <input class="form-control" id="pass" placeholder="Enter your family..">
        </div>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
</body>
</html>
