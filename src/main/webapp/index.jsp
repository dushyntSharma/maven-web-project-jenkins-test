<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Virtual Class</title>
<link rel="stylesheet" type="text/css" href="./style.css" />
<style type="text/css">
form {
	display: inline-block;
}

.nav {
	display: inline-block;
	margin-left: 25%;
	margin-right: 25%;
	width: 50%;
}

label {
	text-align: right;
	width: 75px;
	padding-right: 20px;
}

br {
	clear: left;
}
</style>
</head>

<body>


	<ul class="main-nav">
		<li class="active"><a href="contactus.html">Contact Us</a></li>
	</ul>
	<ul class="main-nav">
		<li class="active"><a href="aboutus.html">About Us</a></li>
	</ul>

	<ul class="main-nav">
		<li class="active"><a href="index.jsp">Home</a></li>
	</ul>

	<div class="nav">
		<form>
			<h1>Welcome to Virtual Classroom</h1>
			<div>
				<label><b>LOGIN</b></label> <select
					onchange="window.open(this.options[this.selectedIndex].value,'_top')">
					<option value="-1">Select</option>
					<option value="./loginStudent.jsp">Student</option>
					<option value="./loginStaff.jsp">Staff</option>
					<option value="./adminLogin.jsp">Admin</option>

				</select>
			</div>
			<div>
				<label><b>SIGN UP</b></label> <select
					onchange="window.open(this.options[this.selectedIndex].value,'_top')">
					<option value="-1">Select</option>
					<option value="./registerStudent.jsp">Student</option>
					<option value="./registerStaff.jsp">Staff</option>

				</select>
			</div>


		</form>
	</div>


</body>

</html>