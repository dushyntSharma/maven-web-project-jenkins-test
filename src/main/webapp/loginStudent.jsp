<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Student</title>
<link rel="stylesheet" type="text/css" href="./style.css" />
<style>
form {
	display: inline-block;
	margin-left: 25%;
	margin-right: 25%;
	width: 50%;
}

.nav {
	display: inline-block;
	margin-left: 25%;
	margin-right: 25%;
	width: 50%;
}
</style>
</head>
<body>

	<form name="myForm" action="loginStudent" onsubmit="required();"
		method="post">
		<ul class="main-nav">
			<li class="active"><a href="index.jsp">Home</a></li>
		</ul>
		<div class="nav">
			<h1>Student Login</h1>
			<div>
				<label><b>Enter Email:</b></label> <input type="text"
					placeholder="Enter your Email" name="email" id="email">
			</div>
			<div>
				<label><b>Password:</b></label> <input type="password"
					placeholder="Enter password" name="password" id="password">
			</div>
			<input type="submit" value="Login">
		</div>
	</form>

</body>
</html>