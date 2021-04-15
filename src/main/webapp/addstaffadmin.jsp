<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="./style.css" />
<script src="https://code.jquery.com/jquery-3.2.1.js"></script>
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
	<form name="myForm" id="myForm" action="RegisterStaffFromAdmin"
		method="post">
		<ul class="main-nav">
			<li class="active"><a href="adminHome.html">Back</a></li>
		</ul>

		<h1>Add Staff</h1>
		<div>
			<label><b>Name:</b></label> <input type="text"
				placeholder="Enter Name" name="name" id="names"> <span
				class="error_form" id="namecheck"></span>
		</div>
		<div>
			<label><b>Age:</b></label> <input type="text" placeholder="Enter age"
				name="age" id="age"> <span class="error_form" id="ageC"></span>


		</div>
		<div>
			<label><b>Address:</b></label> <input type="text"
				placeholder="Enter your address" name="address" id="address">
			<span class="error_form" id="addressC"></span>
		</div>
		<div>
			<label><b>City:</b></label> <input type="text"
				placeholder="Enter your city" name="city" id="city"> <span
				class="error_form" id="cityC"></span>
		</div>
		<div>
			<label><b>State:</b></label> <input type="text"
				placeholder="Enter your state" name="state" id="state"> <span
				class="error_form" id="stateC"></span>
		</div>
		<div>
			<label><b>Country:</b></label> <input type="text"
				placeholder="Enter your Country" name="country" id="country">
			<span class="error_form" id="countryC"></span>
		</div>
		<div>
			<label><b>Pincode:</b></label> <input type="text"
				placeholder="Enter your pincode" name="pincode" id="pincode">
			<span class="error_form" id="pincodeC"></span>
		</div>
		<div>
			<label><b>Email:</b></label> <input type="text"
				placeholder="Enter your email" name="email" id="email"> <span
				class="error_form" id="emailC"></span>
		</div>
		<div>
			<label><b>Username:</b></label> <input type="text"
				placeholder="Enter username" name="username" id="username">
			<span class="error_form" id="usernameC"></span>
		</div>

		<div>
			<label><b>Password:</b></label> <input type="password"
				placeholder="Enter Password" name="password" id="password">
			<span class="error_form" id="passC"></span>
		</div>

		<div>
			<input type="submit" id="submit" value="Submit" />

		</div>

	</form>
	<script type="text/javascript">
		$(function() {

			$("#namecheck").hide();
			$("#ageC").hide();
			$("#addressC").hide();
			$("#cityC").hide();
			$("#stateC").hide();
			$("#countryC").hide();
			$("#emailC").hide();

			var errorName = false;
			var errorAge = false;
			var errorAddress = false;
			var errorCity = false;
			var errorState = false;
			var errorCountry = false;
			var errorEmail = false;

			$("#names").focusout(function() {
				nameCheck();
			});
			function nameCheck() {

				var name = $("#names").val();
				if (name !== '') {
					$("#namecheck").hide();
					$("#names").css("border-bottom", "2px solid #34F458");
				} else {
					$("#namecheck").html("Name cant be blank");
					$("#namecheck").show();
					$("#names").css("border-bottom", "2px solid #F90A0A");
					errorName = true;
				}
			}

			$("#age").focusout(function() {
				ageC();
			});
			function ageC() {
				var ages = $("#age").val();
				if (ages !== '') {
					$("#ageC").hide();
					$("#age").css("border-bottom", "2px solid #34F458");
				} else {
					$("#ageC").html("Enter the Age");
					$("#ageC").show();
					$("#age").css("border-bottom", "2px solid #F90A0A");
					errorAge = true;
				}
			}

			$("#address").focusout(function() {
				addressC();
			});
			function addressC() {
				var addresss = $("#address").val();
				if (addresss !== '') {
					$("#addressC").hide();
					$("#address").css("border-bottom", "2px solid #34F458");
				} else {
					$("#addressC").html("Address can't be blank");
					$("#addressC").show();
					$("#address").css("border-bottom", "2px solid #F90A0A");
					errorAddress = true;
				}
			}

			$("#city").focusout(function() {
				cityC();
			});
			function cityC() {
				var cities = $("#city").val();
				if (cities !== '') {
					$("#cityC").hide();
					$("#city").css("border-bottom", "2px solid #34F458");
				} else {
					$("#cityC").html("Enter the City");
					$("#cityC").show();
					$("#city").css("border-bottom", "2px solid #F90A0A");
					errorCity = true;
				}
			}

			$("#state").focusout(function() {
				stateC();
			});
			function stateC() {
				var states = $("#state").val();
				if (states !== '') {
					$("#stateC").hide();
					$("#state").css("border-bottom", "2px solid #34F458");
				} else {
					$("#stateC").html("State can't be blank");
					$("#stateC").show();
					$("#state").css("border-bottom", "2px solid #F90A0A");
					errorCity = true;
				}
			}

			$("#country").focusout(function() {
				countryC();
			});
			function countryC() {
				var countries = $("#country").val();
				if (countries !== '') {
					$("#countryC").hide();
					$("#country").css("border-bottom", "2px solid #34F458");
				} else {
					$("#countryC").html("Enter the country name");
					$("#countryC").show();
					$("#country").css("border-bottom", "2px solid #F90A0A");
					errorCountry = true;
				}
			}

			$("#email").focusout(function() {
				emailC();
			});
			function emailC() {
				var emails = $("#email").val();
				if (emails !== '') {
					$("#emailC").hide();
					$("#email").css("border-bottom", "2px solid #34F458");
				} else {
					$("#emailC").html("Email should be filled");
					$("#emailC").show();
					$("#email").css("border-bottom", "2px solid #F90A0A");
					errorEmail = true;
				}
			}

			$("#myForm").submit(
					function() {
						errorName = false;
						errorAge = false;
						errorAddress = false;
						errorCity = false;
						errorState = false;
						errorCountry = false;
						errorEmail = false;

						nameCheck();
						ageC();
						addressC();
						cityC();
						stateC();
						countryC();
						emailC();
						if (name == false && ages == false && addresss == false
								&& cities == false && states == false
								&& countries == false && emails == false) {
							alert("Registration Successfull");
							return true;
						} else {
							alert("Please Fill the form Correctly");
							return false;
						}

					});
		});
	</script>


</body>
</html>