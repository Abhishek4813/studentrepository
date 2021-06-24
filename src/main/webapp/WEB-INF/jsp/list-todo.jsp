<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="webjars/bootstrap/5.0.1/css/bootstrap.min.css">
</head>
<body>
<%@ include file="navigationbar.jspf"  %>
<div class="container">
<h1 class="text-danger text-center">Welcome Mr. ${name} </h1>
<br/><br/>
<table class="table">
<tr>
<th>Description</th>
<th>Date </th>
<th>IsDone</th>
<th></th>
<th></th>
</tr>
<c:forEach items="${todos}" var="todo">
<tr>
<td>${todo.desc}</td>
<td><fmt:formatDate value="${todo.targetDate}" pattern="dd/MM/yyyy"/></td>
<td>${todo.done}</td> <!-- isDone not works here because this is the getmethod name without get and () and starts with lower case. -->
<!--example: getDone() it will be done -->
<td><a class="btn btn-sm btn-warning" href="/delete?id=${todo.id}">Delete</a>
<td><a class="btn btn-sm btn-success" href="/update?id=${todo.id}">Update</a>
</tr>
</c:forEach>
</table>
<br/><br/>
<a class="btn btn-primary" href="/add-todos">ADD TODO</a>
</div>
<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
<script src="webjars/bootstrap/5.0.1/js/bootstrap.min.js"></script>
</body>
</html>