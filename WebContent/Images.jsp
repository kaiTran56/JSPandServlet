<%@page isELIgnored="false"%>
<%@page import = "java.util.Date" %>
<%@ page import="com.Servlet.Image"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Images</title>
</head>
<body>
	Time: <%= new Date()%>
	<br>
	<%@include file="Headers.jsp"%>
	<br> Name:
	<%=application.getInitParameter("member")%>
	<br> Class:
	<%=application.getInitParameter("name")%>
	<br> Name:
	<%=((Image) request.getAttribute("imageName")).getName()%>
	<br>
	<img alt="This is me!" src="images/2.jpg">
	<br>
	<%
		pageContext.setAttribute("scop", "SCOPE_QUYET");
	%>
	Scope_Quyet: ${pageScope.scop}
	<br> Scope_Friend: ${pageScope.scop}
	<br> Scope_Request: ${requestScope.othe}
	<br> Scope_Session: ${sessionScope.ses}
	<br> Scope_Application: ${applicationScope.application }
	<br> Expression Language for Casting Object to String:
	${requestScope.student.name}

	<br> EL with the initialization parameter: ${initParam.friend}
	<br> EL with the ArrayList: ${requestScope.languages[1]}
	<br> Use jsp:bean:
	<jsp:useBean id="bean1" class="com.Servlet.Student" >
		<jsp:setProperty property="name" name="bean1" value = "Quyet_Ngan" />
	</jsp:useBean>

	<jsp:getProperty property="name" name="bean1" />


</body>
</html>