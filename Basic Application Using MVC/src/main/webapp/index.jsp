<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
This is Home Page
<br>
<a href="<%= request.getContextPath() %>/Controller?page=login">Login</a><br>
<a href="Signuo.jsp">Sign Up</a><br>
<a href="About.jsp">About</a>
</body>
</html>