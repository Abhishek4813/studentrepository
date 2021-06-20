<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body class="bg-light">
	<div class="container">
		<br><h2 class="text-center text-success">Fill Details to Login</h2>
		<form:form method="post" action="./validatelogin" modelAttribute="newlogin">
			<br>
			<br>

			<div class="form-group row">
				<form:label path="id" class="col-sm-2 offset-sm-3">Enter Id</form:label>
				<div class="col-sm-5">
					<form:input path="id" class="form-control" />
				</div>
			</div>
			<div class="form-group row">
				<form:label path="name" class="col-sm-2 offset-sm-3">Name</form:label>
				<div class="col-sm-5">
					<form:input path="name" class="form-control" />
				</div>
			</div>
			<div class="form-group row">
				<form:label path="password" class="col-sm-2 offset-sm-3">Password</form:label>
				<div class="col-sm-5">
					<form:password path="password" class="form-control" />
				</div>
			</div>
			<div class="row">
				<div class="col-sm-2 offset-sm-6">
					<input type="submit" value="Login" class="btn btn-success" />
				</div>
				<div class="col-sm-2">
					<a href="./reg"><input type="button" value="Register"
						class="btn btn-primary"></a>
				</div>
			</div>
		</form:form>
	</div>

</body>
</html>