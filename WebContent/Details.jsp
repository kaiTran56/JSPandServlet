<%@page isELIgnored = "false" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Student: ${param.name}
	<br>
	Region: ${param.region}
	<br>
	<jsp:include page="/Headers.jsp"></jsp:include>
	
	<br>
	
	Use jsp:Bean: 
	<jsp:useBean id = "bean1" class = "com.Servlet.Student" scope ="page">
		<jsp:setProperty property = "name" name = "bean1" param = "name"/>
	</jsp:useBean>
	<jsp:getProperty property="name" name="bean1"/>
</body>
</html>