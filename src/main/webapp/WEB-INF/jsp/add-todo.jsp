 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
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
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="webjars/bootstrap/5.0.1/css/bootstrap.min.css">
</head>
<body>
<%@ include file="navigationbar.jspf"  %>
<!--<form method="POST" action="add-todos">
Description : <textarea rows="5" cols="30" name="desc" placeholder="Enter Here"></textarea>

<br/><br/>
<input type="submit" name="submit" id="submit"/>
</form>-->
<div class="container">
<form:form method="post" modelAttribute="todo"><!-- if action is not specified in form jstl then by default it will submit the form to the same url as in right now with post method. -->
<div class="form-group">				
<form:label path="desc">Description</form:label>
<form:textarea path="desc" class="form-control" rows="5" cols="40" required="required"></form:textarea>
<form:errors path="desc" style="color:red"/>
</div>
<div class="form-group">
<form:label path="targetDate">Date</form:label>
<form:input path="targetDate" class="form-control" type="text" required="required"></form:input>
<form:errors path="targetDate" style="color:red"/>
</div>
<div class="form-group">
<br/><br/>
<input type="submit"  class="btn btn-primary"/>
</div>
</form:form>
</div>
<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
<script src="webjars/bootstrap/5.0.1/js/bootstrap.min.js"></script>
</body>
</html>