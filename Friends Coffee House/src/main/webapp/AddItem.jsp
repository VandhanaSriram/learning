<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>F.R.I.E.N.D.S</title>
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
			<h1 id="caption"> Coffee and friends make the perfect blend!</h1>
			<form action="<%= request.getContextPath() %>/operationController" method="post">
				Item Name   <input type="text" name="item" required><br>
				
				Category   
				<select name="category">
					<option value="coffee">Coffee</option>
					<option value="sandwiches">Sandwiches</option>
					<option value="drinks">Refreshing Drinks</option>
					<option value="sides">Sides</option>
				</select><br>
				
				Price <input type="text" name="price" required><br>
				<input type="hidden" name="form" value="addItem">
				<input type="submit" value="submit">
				
		
			</form>
		</div>
	
		
	</div>
	
	
</body>
</html>