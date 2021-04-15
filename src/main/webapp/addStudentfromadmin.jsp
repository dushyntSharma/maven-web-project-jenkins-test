<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="./style.css" />
<style>
form {
	display: inline-block;
	margin-left: 25%;
	margin-right: 25%;
	width: 50%;
}
</style>
</head>
<body>
	<form name="myForm" action="RegisterFromAdmin" onsubmit="required();"
		method="post">
		<ul class="main-nav">
			<li class="active"><a href="adminHome.html">Back</a></li>
		</ul>
		<h1>Add Students</h1>
		<div>
			<label><b>Name:</b></label> <input type="text"
				placeholder="Enter Name" name="name" id="name">
		</div>
		<div>
			<label><b>Age:</b></label> <input type="text"
				placeholder="Enter agee" name="age" id="age">
		</div>
		<div>
			<label><b>Address:</b></label> <input type="text"
				placeholder="Enter your address" name="address" id="address">
		</div>
		<div>
			<label><b>City:</b></label> <input type="text"
				placeholder="Enter your city" name="city" id="city">
		</div>
		<div>
			<label><b>State:</b></label> <input type="text"
				placeholder="Enter your state" name="state" id="state">
		</div>
		<div>
			<label><b>Country:</b></label> <input type="text"
				placeholder="Enter your Country" name="country" id="country">
		</div>
		<div>
			<label><b>Pincode:</b></label> <input type="text"
				placeholder="Enter your pincode" name="pincode" id="pincode">
		</div>
		<div>
			<label><b>Email:</b></label> <input type="text"
				placeholder="Enter your email" name="email" id="email">
		</div>
		<div>
			<label><b>Username:</b></label> <input type="text"
				placeholder="Enter username" name="username" id="username">
		</div>

		<div>
			<label><b>Password:</b></label> <input type="password"
				placeholder="Enter Password" name="password" id="password">
		</div>

		<div>
			<input type="submit" value="Submit" />

		</div>

	</form>
	<script src="script.js"></script>

</body>
</html>