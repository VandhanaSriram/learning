<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form demo</title>
</head>
<body>
<form action="submit.jsp" method="get">
	Full name: <input type="text" name="name"><br>
	Gender: <input type="radio" name="gender" value="male">Male
			<input type="radio" name="gender" value="female">Female<br>
	Languages known: <input type="checkbox" name="lang" value="english">English
					 <input type="checkbox" name="lang" value="hindi">Hindi
					 <input type="checkbox" name="lang" value="french">French <br>
	Country:
	<select name="country">
		<option value="india">India</option>
		<option value="usa">United States of America</option>
		<option value="china">China</option>	
	</select><br>

	<input type="submit" value="submit">



</form>
</body>
</html>