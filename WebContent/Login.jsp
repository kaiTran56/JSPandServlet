<%@page isELIgnored = "false" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body style="TimeNewRoman: center">
	<h1>Login</h1>
	<form action="login" method="post">
		User Name: <input type="text" value="" name="user"> Password:
		<input type="password" value="" name="password"> <br> <input
			type="submit" value="OK">
	</form>
</body>
</html>