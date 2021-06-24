<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="webjars/bootstrap/5.0.1/css/bootstrap.min.css">
<style>
form{
width:700px;
margin:auto;
margin-top:100px;
}
label{
font-weight:bold;
font-size:16px;
}

label, input{
margin:5px 0px;
}

input[type="submit"]{
margin-left:45%;
}

</style>
</head>
<body>
<%@ include file="navigationbar.jspf"  %>
<div class="container">
<h2 style="color:red"> ${msg} </h2>
<form name="form" method="POST" action="/login">
<div class="form-group">
<label>Username: </label>
<input type="text" class="form-control" name="username" id="username"/>
</div>
<div class="form-group">
<label>Password : </label>
<input type="password" class="form-control" name="password" id="password"/>
</div>
<div class="form-group">
<input type="submit" class="btn btn-primary" id="submit" value="Submit"/>
</div>
</form>
</div>
<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
<script src="webjars/bootstrap/5.0.1/js/bootstrap.min.js"></script>
</body>
</html>