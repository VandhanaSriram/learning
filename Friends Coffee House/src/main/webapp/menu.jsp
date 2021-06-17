<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page language="java" import="java.util.*,java.lang.*" %>
<%@ page import="learning.entity.Menu" %>  
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Friends Coffee House - Menu</title>
	<link rel="stylesheet" href="css/style.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	<base href="http://localhost:8080/Friends_Coffee_House/" target="_blank">
</head>
<body>
	<div class="header">
		<div class ="header-left">
			<i class="fas fa-mug-hot" style="font-size:48px;"></i> <p>F.R.I.E.N.D.S Coffee House</p>
		</div>
		<div class="header-right">
			<p>
				<a href="displayController?page=home">Home</a>
				<a href="operationController?page=menu">Menu</a>
				<a href="#">Log In</a>
				<a href="operationController?page=additem">Create new item</a>
			</p>
		</div>
	</div>
	<div class="container">
		<video autoplay muted loop>
				<source src="Resource/coffee.mp4" type="video/mp4">
		</video>
		<div class="content">
			<h1 id="caption"> MENU </h1>
			<table>
				<tr>
					<td>COFFEE</td>
					<td>PRICE</td>
				</tr>
				
				<%
				List<Menu> menu = (List<Menu>)request.getAttribute("menuList");
				for(int i=0;i<menu.size();i++){
					out.print("<tr>");
					out.print("<td>"+ menu.get(i).getItem_name()+"</td>");
					out.print("<td>"+ menu.get(i).getPrice()+"</td>");
					out.print("/<tr>");
				}
				%>
			</table>
		</div>	
	</div>
</body>
</html>