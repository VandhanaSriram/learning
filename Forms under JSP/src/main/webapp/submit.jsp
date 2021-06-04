<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Submit</title>
</head>
<body>
Name: <%= request.getParameter("name") %><br>
Gender: <%= request.getParameter("gender") %><br>


<%
String[] languages = request.getParameterValues("lang");
if(languages != null){
	out.print("Language:");
	for(int i=0;i<languages.length;i++){
		out.println("<br>");
		out.print(languages[i]);
	}
}
else{
	out.print("No language selected");
	out.println("<br>");
}
out.println("<br>");
%>
Country: <%= request.getParameter("country") %><br>

</body>
</html>