<%@page import="model.Student"%>
<%@page import="dao.EditValues"%>
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
	<%
	String email = request.getParameter("email");
	EditValues edit = new EditValues();

	Student s = edit.getValues(email);
	%>
	<form action="editandupdt.jsp" >
		<ul class="main-nav">
			<li class="active"><a href="adminHome.html">Back</a></li>
		</ul>

		<h1>Student Register</h1>
		<div>
			<label><b>Name:</b></label> <input type="text"
				placeholder="Enter Name" name="name" id="name"
				value="<%=s.getName()%>">
		</div>
		<div>
			<label><b>Age:</b></label> <input type="text"
				placeholder="Enter agee" name="age" id="age" value="<%=s.getAge()%>">
		</div>
		<div>
			<label><b>Address:</b></label> <input type="text"
				placeholder="Enter your address" name="address" id="address"
				value="<%=s.getAddress()%>">
		</div>
		<div>
			<label><b>City:</b></label> <input type="text"
				placeholder="Enter your city" name="city" id="city"
				value="<%=s.getCity()%>">
		</div>
		<div>
			<label><b>State:</b></label> <input type="text"
				placeholder="Enter your state" name="state" id="state"
				value="<%=s.getState()%>">
		</div>
		<div>
			<label><b>Country:</b></label> <input type="text"
				placeholder="Enter your Country" name="country" id="country"
				value="<%=s.getCountry()%>">
		</div>
		<div>
			<label><b>Pincode:</b></label> <input type="text"
				placeholder="Enter your pincode" name="pincode" id="pincode"
				value="<%=s.getPincode()%>">
		</div>
		<div>
			<label><b>Email:</b></label> <input type="text"
				placeholder="Enter your email" name="email" id="email"
				value="<%=email%>">
		</div>
		<div>
			<label><b>Username:</b></label> <input type="text"
				placeholder="Enter username" name="username" id="username"
				value="<%=s.getUsername()%>">
		</div>

		<div>
			<label><b>Password:</b></label> <input type="password"
				placeholder="Enter Password" name="password" id="password"
				value="<%=s.getPassword()%>">
		</div>

		<div>
			<input type="submit" value="Update" />

		</div>

	</form>

</body>
</html>